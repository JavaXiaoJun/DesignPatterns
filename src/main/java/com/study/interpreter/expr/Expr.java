package com.study.interpreter.expr;

/**
 * Created by lf52 on 2018/8/1.
 *
 * ������ʽ
 */
public abstract class Expr {
    //����
    protected final String symbol;

    public Expr(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract double interpret();
}
