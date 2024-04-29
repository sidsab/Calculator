package com.example.calculator.strategy;

import java.math.BigDecimal;

public class AdditionStrategy implements MathStrategy {
    @Override
    public BigDecimal executeStrategy(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.add(number2);
        return result;
    }
}
