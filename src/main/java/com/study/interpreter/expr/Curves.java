package com.study.interpreter.expr;

/**
 * <p>Desp: 括号</p>
 */
public class Curves extends NTExpr {
    public Curves(String start) {
        super(start, null);
    }

    @Override
    public double interpret() {
        throw new RuntimeException("不支持该操作！");
    }

    public boolean isLeft() {
        return symbol.equals("(") ? true : false;
    }
}
