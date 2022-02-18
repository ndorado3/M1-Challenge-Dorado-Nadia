package com.company;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("******* Calculations of Two Int parameters ******");

        cal.addTwoInt(1, 1);
        cal.subTwoInt(23, 52);
        cal.multiTwoInt(34, 2);
        cal.divTwoInt(12,3);
        cal.divTwoInt(12,7);

        System.out.println("******* Calculations of Two Double parameters ******");

        cal.addDouble(3.4, 2.3);
        cal.multiDouble(6.7,4.4);
        cal.subDouble(5.5, 0.5);
        cal.divDouble(10.8,2.2);

    }
}
