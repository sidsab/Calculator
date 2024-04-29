package com.example.calculator.factory;

import java.util.Optional;

public class CalculationFactory {

    public Optional<Calculation> GetCalculation(CalculationType calculationType)
    {
        if(calculationType.equals(CalculationType.ADDITION))
            return Optional.of(new AdditonCalculation());
        else if(calculationType.equals(CalculationType.SUBSTARCTION))
            return Optional.of(new SubstractionCalculation());
        else if(calculationType.equals(CalculationType.MULTIPLICATION))
            return Optional.of(new MultiplicationCalculation());
        else if(calculationType.equals(CalculationType.DIVISION))
            return Optional.of(new DivisionCalculation());
        else
            return Optional.empty();
    }

    public enum CalculationType {
        ADDITION,
        SUBSTARCTION,
        DIVISION,
        MULTIPLICATION
    }
}