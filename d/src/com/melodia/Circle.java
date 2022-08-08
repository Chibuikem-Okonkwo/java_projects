package com.melodia;

public class Circle {

    private double radius;
    
    public Circle(){    //Zero parameter constructor
    }
    
    public Circle(double radius){   //parameterized constructor
        
        this.radius = radius;
    }
    
    public void circleArea(){
        
        double area = 3.142*radius*radius;
        System.out.println("Circle Area: "+area);
    }
    
    public static void main(String[] args) {
        
        Circle c = new Circle(7);
        c.circleArea();
    }
    
}
