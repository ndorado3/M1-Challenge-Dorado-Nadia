package com.company;

public class Calculator {
//  Set of methods that does addition, subtraction, multiplication, and division for two integer parameters

    public  static  int addTwoInt( int a, int b) {
        int r = a + b;
        System.out.println(a + " + " + b + " = " + r);
        return r;
    }

    public static int subTwoInt(int a, int b){
        int r = a - b;
        System.out.println(a + " - " + b + " = " + r);
        return r;
    }

    public static int multiTwoInt(int a, int b){
        int r = a * b;
        System.out.println(a + " * " + b + " = " + r);
        return r;
    }

    public static int divTwoInt(int a, int b){
         int r = a/b;
        System.out.println(a + " / " + b + " = " + r);
        return r;
    }


//        and a separate set of methods that does the same for two double parameters.

    public static double addDouble(double a, double b){
        double r = a + b;
        System.out.println(a + " + " + b + " = " + r);
        return r;
    }

    public static double subDouble(double a, double b){
        double r = a - b;
        System.out.println(a + " - " + b + " = " + r);
        return r;
    }

    public static double multiDouble(double a,double b){
        double r = a * b;
        System.out.println(a + " * " + b + " = " + r);
        return r;
    }

    public static double divDouble(double a, double b){
        double r = a / b;
        System.out.println(a + " / " + b + " = " + r);
        return r;
    }

}
