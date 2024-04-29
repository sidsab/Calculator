package com.example.calculator.builder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculation {
    private BigDecimal firstInput;
    private BigDecimal secondInput;

    public void setFirstInput(BigDecimal firstInput)
    {
        this.firstInput= firstInput;
    }

    public void setSecondInput(BigDecimal secondInput)
    {
        this.secondInput= secondInput;
    }

    public BigDecimal add() {
        BigDecimal result;
        result = firstInput.add(secondInput);
        return result;
    }

    public BigDecimal substract() {
        BigDecimal result;
        result = firstInput.subtract(secondInput);
        return result;
    }

    public BigDecimal multiply() {
        BigDecimal result;
        result = firstInput.multiply(secondInput);
        return result;
    }

    public BigDecimal divide() {
        BigDecimal result;
        result = firstInput.divide(secondInput,4, RoundingMode.UP);
        return result;
    }

}
