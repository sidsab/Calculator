package com.example.calculator.command;

import java.math.BigDecimal;

public class MultiplicationCommand implements  Command{

    private final Input input;

    public MultiplicationCommand(Input input)
    {
        this.input= input;
    }
    @Override
    public BigDecimal execute() {
        BigDecimal result;
        result= input.firstInput.multiply(input.secondInput);
        return result;
    }
}
