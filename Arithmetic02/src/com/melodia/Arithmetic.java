package com.melodia;

public class Arithmetic {

    private double firstNumber;
    private double secondNumber;
    
    public Arithmetic(){
        
        firstNumber = 10;
        secondNumber = 5;
    }
    
    public double getSum(){
        
        double sum = firstNumber + secondNumber;
        return sum;
    }
    public double getDifference(){
        
        double diff = firstNumber - secondNumber;
        return diff;
    }
    public double getProduct(){
        
        double product = firstNumber * secondNumber;
        return product;
    }
    public double getQuotient(){
        
        double quotient = firstNumber / secondNumber;
        return quotient;
    }
    public static void main(String[] args) {
   
        Arithmetic a = new Arithmetic();
        
        double sum = a.getSum();
        System.out.println("Sum: "+sum);
        
        double diff = a.getDifference();
        System.out.println("Difference: "+diff);
        
        double product = a.getProduct();
        System.out.println("Product: "+product);
        
        double quotient = a.getQuotient();
        System.out.println("Quotient: "+quotient);
    }
    
}
