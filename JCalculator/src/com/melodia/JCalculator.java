package com.melodia;

import java.util.Scanner;

public class JCalculator {

    private double firstNumber;
    private double secondNumber;
    
    Scanner scan = new Scanner(System.in);
    
    public JCalculator(){
    
        System.out.println("Enter First Number: ");
        firstNumber = Double.parseDouble(scan.nextLine());
        
        System.out.println("Enter Second Number: ");
        secondNumber = Double.parseDouble(scan.nextLine());
        
        System.out.println("");
        System.out.println("Operation Selection");
        System.out.println("*************************");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Circle Area");
        
        System.out.println("");
        
        int choice = Integer.parseInt(scan.nextLine());
        selectOperation(choice);
    }
    
    public void circleArea(){
    
        double radius = 0.0;
        System.out.print("Enter Circle Radius: ");
        radius = Double.parseDouble(scan.nextLine());
        
        double area = 3.142*radius*radius;
        System.out.println("Area: "+area);
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
    
    public void selectOperation(int option){
    
        if (option == 1) {
            
            addition();
        }
        else if (option == 2) {
            
            subtraction();
        }
        else if(option == 3){
        
            multiplication();
        }
        else if(option == 4){
        
            division();
        }
        else if(option == 5){
        
            circleArea();
        }
    }
    
    public static void main(String[] args) {
        
        JCalculator c = new JCalculator();
       
    }
    
}

