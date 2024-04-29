package com.example.calculator.facade;

import com.example.calculator.factory.AdditonCalculation;
import com.example.calculator.factory.Calculation;
import com.example.calculator.factory.DivisionCalculation;
import com.example.calculator.factory.MultiplicationCalculation;
import com.example.calculator.factory.SubstractionCalculation;
import java.math.BigDecimal;

public class Calculator {
    private Calculation addition;
    private Calculation substraction;
    private Calculation multiplication;
    private Calculation division;

    public Calculator() {
        addition = new AdditonCalculation();
        substraction = new SubstractionCalculation();
        multiplication = new MultiplicationCalculation();
        division = new DivisionCalculation();
    }

    public BigDecimal performAddition(BigDecimal number1,BigDecimal number2){
        BigDecimal result;
        result= addition.calculate(number1,number2);
        return result;
    }
    public BigDecimal performSubstraction(BigDecimal number1,BigDecimal number2){
        BigDecimal result;
        result= substraction.calculate(number1,number2);
        return result;
    }
    public BigDecimal performMultiplication(BigDecimal number1,BigDecimal number2){
        BigDecimal result;
        result= multiplication.calculate(number1,number2);
        return result;
    }

    public BigDecimal performDivision(BigDecimal number1,BigDecimal number2){
        BigDecimal result;
        result= division.calculate(number1,number2);
        return result;
    }
}
