package com.example.calculator.singleton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private static Calculator calculatorInstance;
    private Calculator(){}

    public static Calculator getCalculatorInstance()
    {
        if(calculatorInstance==null)
        {
            calculatorInstance= new Calculator();
        }
        return calculatorInstance;
    }



    public BigDecimal add(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.add(number2);
        return result;
    }

    public BigDecimal substract(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.subtract(number2);
        return result;
    }

    public BigDecimal multiply(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.multiply(number2);
        return result;
    }

    public BigDecimal divide(BigDecimal number1, BigDecimal number2) {
        BigDecimal result;
        result = number1.divide(number2,4, RoundingMode.UP);
        return result;
    }


}
