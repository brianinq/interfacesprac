package com.example;

public class Main {
    public static void main(String[] args) {
        var calculator  = new TaxCalculatorImpl(900000);
        //constructor injection (DI)
        var report = new TaxReport(calculator);
        report.show();

        //setter injection (DI)
        report.setCalculator(new TaxCalculatorImpl2022());
        report.show();

        //method injection (DI)
        report.show(new TaxCalculatorImpl(70000));
    }
}