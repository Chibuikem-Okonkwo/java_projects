package com.melodia;

import java.util.Scanner;

public class JCircle {

    private double radius;
    
    Scanner scan = new Scanner(System.in);
    
    public JCircle(){
        
        System.out.println("You can use this program to calculate area of a circle or the perimeter ");
        System.out.println("");
        
        System.out.print("Please enter the radius of the circle in cm: ");
        radius = Double.parseDouble(scan.nextLine());
        
        int choice;
        System.out.println("");
        System.out.println("Enter 1 to calculate Circle Area ");
        System.out.println("Enter 2 to calculate Circle Perimeter ");
        choice = Integer.parseInt(scan.nextLine());
        
        selectOption(choice);
    }
   
    public void showCircleArea(){
        
        double area = 3.142*radius*radius;
        System.out.println("Circle Area: "+area);
    }
    
    public void showCirclePerimeter(){
        
        double perimeter = 2*3.142*radius;
        System.out.println("Circle Perimeter: "+perimeter);
    }
    
    public void selectOption(int option){
        
        if (option == 1) {
            
            showCircleArea();
        }
        
        else if (option == 2) {
            
            showCirclePerimeter();
        }
    }
    
    public static void main(String[] args) {
        
        JCircle jc = new JCircle();
    }
    
}
