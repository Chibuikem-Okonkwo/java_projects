package com.melodia;

public class CompositionExample {

    double firstNumber;
    double secondNumber;

    double radius;

    Arithmetic a = new Arithmetic();    //Using Composition Principle
    Circle c = new Circle();

    public CompositionExample() {

        firstNumber = 10;
        secondNumber = 5;

        radius = 7;
    }

    public void addition() {

        double sum = a.getSum(firstNumber, secondNumber);
        System.out.println("Sum: " + sum);
    }
    
    public void subtraction(){
    
        double diff = a.getDifference(firstNumber, secondNumber);
        System.out.println("Difference: "+diff);
    }
    
    public void circleArea(){
    
        double area = c.getCircleArea(radius);
        System.out.println("Area: "+area);
    }

    public void circlePerimeter(){
    
        double perimeter = c.getCirclePerimeter(radius);
        System.out.println("Perimeter "+perimeter);
    }

    public static void main(String[] args) {
    
        CompositionExample ce = new CompositionExample();
        ce.addition();
        ce.subtraction();
        ce.circleArea();
        ce.circlePerimeter();
    }
}
