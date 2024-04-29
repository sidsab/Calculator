package com.example.calculator.command;

import java.math.BigDecimal;

public class SubstarctionCommand implements Command{

    private final Input input;

    public SubstarctionCommand(Input input)
    {
        this.input= input;
    }
    @Override
    public BigDecimal execute() {
        BigDecimal result;
        result= input.firstInput.subtract(input.secondInput);
        return result;
    }
}
