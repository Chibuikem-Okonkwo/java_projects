package com.melodia;

public class Arithmetic {

    public Arithmetic(){
    
    }
    
    public double getSum(double a, double b){
    
        double sum = a+b;
        return sum;
    }
    
    public double getDifference(double a, double b){
    
        double diff = a-b;
        return diff;
    }
    
    public double getProduct(double a, double b){
    
        double product = a*b;
        return product;
    }
    
    public double getQuotient(double a, double b){
    
        double quotient = a/b;
        return quotient;
    }
    
    public static void main(String[] args) {
        
        Arithmetic a = new Arithmetic();
        
        double sum = a.getSum(10, 5);
        System.out.println("Sum: " +sum);
        
        double diff = a.getDifference(10, 5);
        System.out.println("Difference: " +diff);
        
        double product = a.getProduct(10, 5);
        System.out.println("Product: " +product);
        
        double quotient = a.getQuotient(10, 5);
        System.out.println("Quotient: " +quotient);
        
    }
    
}
