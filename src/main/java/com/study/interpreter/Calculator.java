package com.study.interpreter;

import com.study.interpreter.expr.*;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * <p>Desp: ������</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; ֧�ֵĲ�������+,-,*,/(,)</p>
 */
public class Calculator {
    //�沨�����ʽջ
    private Stack<Expr> ips = new Stack<>();
    //������ջ
    private Stack<Expr> os = new Stack<>();
    //�﷨��ջ
    private Stack<Expr> gts = new Stack<>();
    //���ʽ���
    private String[] statement;

    public Calculator() {

    }

    /**
     * <p>Created by weicm on 2018/7/14 11:44</p>
     * <p>Desp: ����</p>
     * @param statement ���ʽ
     * @return ���
     */
    public double calculate(String statement) {
        this.statement = statement.replaceAll(" +", " ").split(" ");
        compile();
        parse();
        return gts.pop().interpret();
    }

    /**
     * <p>Created by weicm on 2018/7/14 11:44</p>
     * <p>Desp: �����ʽ����Ϊ�沨�����ʽ</p>
     */
    private void compile() {
        for (int i = 0; i < statement.length; i++) {
            String c = statement[i];
            Expr e = null;
            switch (c) {
                case "+":
                    e = new Add(c);
                    break;
                case "-":
                    e = new Sub(c);
                    break;
                case "*":
                    e = new Mul(c);
                    break;
                case "/":
                    e = new Dev(c);
                    break;
                case "(":
                case ")":
                    e = new Curves(c);
                    break;
                default:
                    e = new TExpr(c);
                    break;
            }

            if (e instanceof TExpr) {//������ֱ�����沨�����ʽջ
                ips.push(e);
            } else if (e instanceof NTExpr && !(e instanceof Curves)) {//��������Ҫ�Ƚ����ȼ�
                NTExpr nte = (NTExpr) e;
                //������ջջ���ǲ����������ҵ�ǰ���������ȼ���ջ�����������ȼ��͵ģ��ȵ���ջ��������������ջ���沨�����ʽջ
                if (!os.isEmpty() && !(os.peek() instanceof Curves) && nte.getPriority() < ((NTExpr) os.peek()).getPriority()) {
                    ips.push(os.pop());
                }
                //������ջΪ�գ�ջ�������ţ���ǰ���������ȼ���ջ��������ջ���ż��߻���ȣ���ֱ����ջ
                os.push(nte);
            } else {//������Ҫ�ж��������Ż���������
                Curves be = (Curves) e;
                //������ֱ���������ջ
                if (be.isLeft())
                    os.push(be);
                else {//�����ţ������ε���������ջ��Ԫ�أ�֪������������
                    while (!(os.peek() instanceof Curves)) {
                        ips.push(os.pop());
                    }
                    //�����������
                    os.pop();
                }
            }
        }
        //��������ջʣ��Ԫ�����ε���������ջ���沨�����ʽջ
        while (!os.isEmpty())
            ips.push(os.pop());
    }

    /**
     * <p>Created by weicm on 2018/7/14 11:45</p>
     * <p>Desp: �����﷨��</p>
     * <p>&nbsp;&nbsp;&nbsp;&nbsp; ������沨�����ʽ���ٰ��沨�����ʽ����Ϊ�﷨��</p>
     */
    private void parse() {
        //����沨�����ʽ
        List<Object> es = Arrays.asList(ips.toArray(new Expr[ips.size()])).stream().map(Expr::getSymbol).collect(Collectors.toList());
        System.out.println(String.format("Inverse Polish expression: %s", es));
        //�沨�����ʽ��ת���������ջ����ʱ������ջֻ������ʱջ
        while (!ips.isEmpty()) {
            os.push(ips.pop());
        }

        //����ȥ���㲻�����ʽԪ��
        while (!os.isEmpty()) {
            Expr e = os.pop();
            //����������������﷨��ջȥ������Ԫ�أ������ø�������
            if (e instanceof NTExpr) {
                NTExpr nte = (NTExpr) e;
                nte.setR(gts.pop());
                nte.setL(gts.pop());
            }
            //��������������ֱ����ջ���﷨��ջ
            gts.push(e);
        }
    }
}
