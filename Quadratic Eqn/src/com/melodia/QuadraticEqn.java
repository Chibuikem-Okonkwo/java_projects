package com.melodia;
import java.lang.Math;

public class QuadraticEqn {
    
    public QuadraticEqn(){
    }

    public double getRoot1(double a, double b, double c){
    
        double root1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return root1;
    }
    
    public double getRoot2(double a, double b, double c){
    
        double root2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return root2;
    }
    
    public static void main(String[] args) {
        
        QuadraticEqn qe = new QuadraticEqn();
        
        double root1 = qe.getRoot1(3, 2, -5);
        System.out.println("Root 1: "+root1);
        
        double root2 = qe.getRoot2(3, 2, -5);
        System.out.println("Root 2: "+root2);
    }
}
