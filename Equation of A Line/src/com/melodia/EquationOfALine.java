package com.melodia;

import java.util.Scanner;

public class EquationOfALine {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    Scanner scan = new Scanner(System.in);
    
    public EquationOfALine(){
        
        System.out.println("Please enter the first coordinate (x1, y1)");
        x1 = Double.parseDouble(scan.nextLine());
        y1 = Double.parseDouble(scan.nextLine());
        
        System.out.println(" ");
        System.out.println("Please enter the second coordinate (x2, y2)");
        x2 = Double.parseDouble(scan.nextLine());
        y2 = Double.parseDouble(scan.nextLine());
        
        double slope = getSlopeM();
        System.out.println("");
        System.out.println("Slope M: "+slope);
        
        double c = getInterceptC();
        System.out.println("Intercept c on y axis: "+c);
    }
    
    public double getSlopeM(){
    
        double slope = (y2 - y1)/(x2 - x1);
        
        return slope;
    }
    
    public double getInterceptC(){
    
        double slope = getSlopeM();
        double c = y2 - (slope*x2);
        
        return c;
    }
    
    public static void main(String[] args) {

        EquationOfALine eq = new EquationOfALine();
    }
    
}