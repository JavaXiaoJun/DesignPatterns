package com.study.interpreter.expr;

/**
 * <p>Desp: 加法</p>
 */
public class Add extends NTExpr {
    public Add(String symbol) {
        super(symbol, 1);
    }

    @Override
    public double interpret() {
        return l.interpret() + r.interpret();
    }
}
