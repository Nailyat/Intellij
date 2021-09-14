package com.syntax.class23;


public class CalculatorTester {
    public static void main(String[] args) {

      /*  Calculator calculator=new Calculator();
        calculator.addDouble(15.2, 12.5); */

       ImproveCalculator improveCalculator=new ImproveCalculator();

       improveCalculator.add(15.0, 14.5);

        improveCalculator.add(15, 14);

        int [] arr={10, 20, 30};
        improveCalculator.add(arr);

        improveCalculator.add(15, 14, 6);
        improveCalculator.add(15, 14, 6, 4);
        improveCalculator.add(15, 14, 6, 5, 9);
    }
}
