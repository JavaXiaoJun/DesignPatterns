package com.study.interpreter.expr;

/**
 * <p>Desp: 终结符表达式</p>
 */
public class TExpr extends Expr {
    //数值
    private final double value;

    public TExpr(String symbol) {
        super(symbol);
        this.value = Double.valueOf(symbol);
    }

    @Override
    public double interpret() {
        return value;
    }
}
