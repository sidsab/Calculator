package com.example.calculator.builder;

import com.example.calculator.singleton.Calculator;

import java.math.BigDecimal;

public class ConcreteCalculationBuilder implements FirstInputBuilder, SecondInputBuilder, CalculationBuilder{

    private Calculation calculation;

    public ConcreteCalculationBuilder()
    {
        calculation= new Calculation();
    }

    @Override
    public SecondInputBuilder setFirstInput(BigDecimal firstInput) {
        calculation.setFirstInput(firstInput);
        return this;
    }
    public Calculation build()
    {
        return calculation;
    }
    @Override
    public CalculationBuilder SetSecondInput(BigDecimal secondInput) {
        calculation.setSecondInput(secondInput);
        return this;
    }
}
