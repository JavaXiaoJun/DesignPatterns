package com.study.interpreter.expr;

/**
 * Created by lf52 on 2018/8/1.
 *
 * 抽象表达式
 */
public abstract class Expr {
    //符号
    protected final String symbol;

    public Expr(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract double interpret();
}
