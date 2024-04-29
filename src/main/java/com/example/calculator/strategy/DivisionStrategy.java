package com.example.calculator.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DivisionStrategy implements MathStrategy{
    @Override
    public BigDecimal executeStrategy(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.divide(number2,4, RoundingMode.UP);
        return result;
    }
}
