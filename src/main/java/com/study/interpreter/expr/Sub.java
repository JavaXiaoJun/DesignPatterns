package com.study.interpreter.expr;

/**
 * <p>Desp: 减法</p>
 */
public class Sub extends NTExpr {
    public Sub(String symbol) {
        super(symbol, 1);
    }

    @Override
    public double interpret() {
        return l.interpret() - r.interpret();
    }
}
