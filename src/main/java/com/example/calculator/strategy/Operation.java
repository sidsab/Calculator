package com.example.calculator.strategy;

import java.math.BigDecimal;

public class Operation {
    private final MathStrategy mathStrategy;
    public Operation(MathStrategy mathStrategy)
    {
        this.mathStrategy=mathStrategy;
    }
    public BigDecimal performOperation(BigDecimal number1, BigDecimal number2)
    {
        BigDecimal result;
        result=mathStrategy.executeStrategy(number1,number2);
        return result;
    }
}
