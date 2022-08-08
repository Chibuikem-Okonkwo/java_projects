package com.melodia;

public class Circle {
    
    private double pi;
    
    public Circle(){
    
        pi = 3.142;
    }
    
    public double getCircleArea(double r){
    
        double area = pi*r*r;
        return area;
    }
    
    public double getCirclePerimeter(double r){
    
        double perimeter = 2*pi*r;
        return perimeter;
    }
    public static void main(String[] args) {
        
       Circle c = new Circle();
      
       double area = c.getCircleArea(7.8);
       System.out.println("Area: "+area +" cm-squared");
       
       double perimeter = c.getCirclePerimeter(7.8);
       System.out.println("Perimeter: "+perimeter +" cm"); 
    }
    
}
