package com.study.interpreter.expr;

/**
 * <p>Desp: 除法</p>
 */
public class Dev extends NTExpr {
    public Dev(String symbol) {
        super(symbol, 2);
    }

    @Override
    public double interpret() {
        return l.interpret() / r.interpret();
    }
}
