package com.example.calculator.command;

import java.math.BigDecimal;

public class Input {
    public BigDecimal firstInput;

    public BigDecimal secondInput;

    public Input(BigDecimal firstInput,BigDecimal secondInput)
    {
        this.firstInput= firstInput;
        this.secondInput= secondInput;
    }
}
