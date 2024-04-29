package com.example.calculator.factory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DivisionCalculation implements Calculation {
    @Override
    public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.divide(number2,4, RoundingMode.UP);
        return result;
    }
}
