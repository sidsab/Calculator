package com.example.calculator.strategy;

import java.math.BigDecimal;

public class MultiplicationStrategy implements MathStrategy{
    @Override
    public BigDecimal executeStrategy(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.multiply(number2);
        return result;
    }
}
