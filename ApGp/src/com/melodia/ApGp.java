package com.melodia;

import java.util.Scanner;

public class ApGp {
    
    Scanner scan = new Scanner(System.in);
    
    public ApGp(){
        
        System.out.println("This Program can calculate the nth term of an Arithmetic Progression and a Geometric Progression");
        System.out.println("Enter 1 to solve for AP nth Term");
        System.out.println("Enter 2 to solve for GP nth Term");
        
        int choice;
        choice = Integer.parseInt(scan.nextLine());
        selectOption(choice);
    }
    
    public void showApNthTerm(){
    
        double a = 0.0;
        double n = 0.0;
        double d = 0.0;
        
        System.out.print("Please enter the first term a: ");
        a = Double.parseDouble(scan.nextLine());
        System.out.println("");
        
        System.out.print("Please enter the common difference d: ");
        d = Double.parseDouble(scan.nextLine());
        System.out.println("");
        
        System.out.print("Please enter the position in the series n: ");
        n = Double.parseDouble(scan.nextLine());
        System.out.println("");
        
        double nthTerm = a +(n-1)*d;
        System.out.println("The "+n+"th term of the Arithmetic Progression is "+nthTerm);
    }
    
    public void showGpNthTerm(){
    
        double a = 0.0;
        double r = 0.0;
        double n = 0.0;
        
        System.out.print("Please enter the first term a: ");
        a = Double.parseDouble(scan.nextLine());
        System.out.println("");
        
        System.out.print("Please enter the common ratio r: ");
        r = Double.parseDouble(scan.nextLine());
        System.out.println("");
        
        System.out.print("Please enter the position in the GP series n: ");
        n = Double.parseDouble(scan.nextLine());
        System.out.println("");
        
        double nthTerm = a*Math.pow(r, n-1);
        System.out.println("The "+n+"th term of the Geometric progression is "+nthTerm);
    }
    
    public void selectOption(int option){
    
        if (option == 1) {
            
            showApNthTerm();
        }
        
        else if (option == 2) {
            
            showGpNthTerm();
        }
    }
    
    public static void main(String[] args) {

        ApGp pg = new ApGp();
    }
    
}
