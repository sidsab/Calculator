package com.example.calculator.command;

import java.math.BigDecimal;

public class AdditonCommand implements Command {

    private final Input input;

    public AdditonCommand(Input input) {
        this.input = input;
    }
    @Override
    public BigDecimal execute() {
        BigDecimal result;
        result= input.firstInput.add(input.secondInput);
        return result;
    }
}
