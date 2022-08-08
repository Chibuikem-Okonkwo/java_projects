package com.melodia;

import java.util.Scanner;

public class SwitchExample {

    private double firstNumber;
    private double secondNumber;
    
    Scanner scan = new Scanner(System.in);
    
    public SwitchExample() {
        
        System.out.println("Welcome to the Calculator");
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
        System.out.println("");
        
        int choice = Integer.parseInt(scan.nextLine());
        selectOperation(choice);
        
    }

    public void addition(){
    
        double sum = firstNumber+secondNumber;
        System.out.println("The Sum is "+sum);
    }

    public void subtraction(){
    
       double difference = firstNumber-secondNumber;
       System.out.println("The Difference is "+difference); 
    }

    public void multiplication(){
    
        double product = firstNumber*secondNumber;
        System.out.println("The Product is "+product);
    }

    public void division(){
    
        double quotient = firstNumber/secondNumber;
        System.out.println("The quotient is "+quotient);    
    }
    
    public void selectOperation(int option){
    
        switch (option) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    
    public static void main(String[] args) {
    
        SwitchExample se = new SwitchExample();
    }
    
}
