package com.example.calculator.strategy;

import java.math.BigDecimal;

public interface MathStrategy {

    public BigDecimal executeStrategy(BigDecimal number1, BigDecimal number2);
}
