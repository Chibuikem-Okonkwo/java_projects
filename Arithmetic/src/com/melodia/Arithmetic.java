package com.melodia;

public class Arithmetic {
    
    private double firstNumber;
    private double secondNumber;
     
    public Arithmetic(){
        
        firstNumber = 10;
        secondNumber = 5;
    }    
    
    public void addition(){
        
        double result = firstNumber + secondNumber;
        System.out.println("Result: " +result);
    }    
    
    public void subtraction(){
        
        double result = firstNumber - secondNumber;
        System.out.println("Result: " +result);
    } 
    
    public void division(){
        
        double result = firstNumber/secondNumber;
        System.out.println("Result: " +result);
    } 
    
    public void multiplication(){
        
        double result = firstNumber * secondNumber;
        System.out.println("Result: " +result);
    } 
    
    public static void main(String[] args) {
         
        Arithmetic a = new Arithmetic();
        a.addition();
        a.subtraction();
        a.multiplication();
        a.division();
    }
    
}
