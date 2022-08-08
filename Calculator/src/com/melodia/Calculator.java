package com.melodia;

import java.util.Scanner;

public class Calculator {

    private double firstNumber;
    private double secondNumber;
    
    Scanner scan = new Scanner(System.in);
    
    public Calculator(){
    
        System.out.println("Enter First Number: ");
        firstNumber = Double.parseDouble(scan.nextLine());
        
        System.out.println("Enter Second Number: ");
        secondNumber = Double.parseDouble(scan.nextLine());
    }
    
    public void addition(){
    
        double sum = firstNumber + secondNumber;
        System.out.println("Sum = "+sum);
    }
    
    public void subtraction(){
    
        double diff = firstNumber - secondNumber;
        System.out.println("Difference = "+diff);
    }
    
    public void multiplication(){
    
        double product = firstNumber * secondNumber;
        System.out.println("Product = "+product);
    }
    
    public void division(){
    
        double division = firstNumber/secondNumber;
        System.out.println("Division = "+division);
    }
    
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        c.addition();
        c.subtraction();
        c.division();
        c.multiplication();
    }
    
}
