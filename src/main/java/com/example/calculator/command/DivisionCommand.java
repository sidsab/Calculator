package com.example.calculator.command;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DivisionCommand implements Command{

    private final Input input;

    public DivisionCommand(Input input)
    {
        this.input= input;
    }
    @Override
    public BigDecimal execute() {
        BigDecimal result;
        result= input.firstInput.divide(input.secondInput,4, RoundingMode.UP);
        return result;
    }
}
