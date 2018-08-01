package com.study.interpreter.expr;

/**
 * <p>Desp: 乘法</p>
 */
public class Mul extends NTExpr {
    public Mul(String symbol) {
        super(symbol, 2);
    }

    @Override
    public double interpret() {
        return l.interpret() * r.interpret();
    }
}
