package com.example.calculator.facade;
import java.math.BigDecimal;
public class AdditonCalculation implements Calculation {
    @Override
    public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.add(number2);
        return result;
    }
}
