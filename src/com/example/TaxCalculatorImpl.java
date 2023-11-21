package com.example;

public class TaxCalculatorImpl implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculatorImpl(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome*0.31;
    }
}
