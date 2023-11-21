package com.example;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }
    public void show(){
        System.out.println(calculator.calculateTax());
    }

    public void show(TaxCalculator calc){
        System.out.println(calc.calculateTax());
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
