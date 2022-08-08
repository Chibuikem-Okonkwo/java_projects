package com.melodia;

public class PolymorphismExample {

    public PolymorphismExample(){
    }
    
    public double getSum(double a, double b){
        
        System.out.println("Calling Method with (double, double)");
        double sum = a+b;
        return sum;
    }

    public double getSum(double a, double b, double c){
        
        System.out.println("Calling Method with (double, double, double)");
        double sum = a+b+c;
        return sum;
    }
    
    public double getSum(int a, int b){
        
        System.out.println("Calling Method with (int, int)");
        double sum = a+b;
        return sum;
    }
    
    public double getSum(double a, int b){
        
        System.out.println("Calling Method with (double, int)");
        double sum = a+b;
        return sum;
    }
    
    public double getSum(int a, double b){
        
        System.out.println("Calling Method with (int, double)");
        double sum = a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        
        PolymorphismExample p = new PolymorphismExample();
        
        double sum = p.getSum(66.0, 3.5, 4.6);
        System.out.println("Sum: "+sum);
    }
    
}
