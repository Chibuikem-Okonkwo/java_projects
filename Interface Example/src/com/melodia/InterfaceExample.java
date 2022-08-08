package com.melodia;

public class InterfaceExample implements IArithmetic {

    public static void main(String[] args) {

        InterfaceExample e = new InterfaceExample();

        double sum = e.getSum(10, 5);
        System.out.println("Sum: " + sum);

        double diff = e.getDiff(10, 5);
        System.out.println("Difference: " + diff);
        
        double product = e.getProduct(10, 5);
        System.out.println("Product: "+product);
        
        double quotient = e.getQuotient(10, 5);
        System.out.println("Quotient: "+quotient);
    }

    @Override
    public double getSum(double a, double b) {

        return a + b;
    }

    @Override
    public double getDiff(double a, double b) {

        return a - b;
    }

    @Override
    public double getProduct(double a, double b) {
        
        return a*b;
    }

    @Override
    public double getQuotient(double a, double b) {

        return a/b;
    }

}
