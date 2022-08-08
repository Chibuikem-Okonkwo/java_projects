package com.melodia;

public class SimultaneousEquations {
    
    private double detA;
    double x1;
    double x2;
    double y1;
    double y2;
    double c1;
    double c2;

    public SimultaneousEquations(){ 
               
        x1 = 1;
        x2 = 1;
        y1 = 1;
        y2 = 2;
        c1 = 2;
        c2 = 0;
        detA =  (x1*y2) - (y1 * x2);
    }
    
    public double getDetX(){
        
        double detX = (y2*c1) - (y1 * c2);
        double x = detX/detA;
        return x;
    }
    
    public double getDetY(){
    
        double detY = (x1 * c2) - (x2*c1);
        double y = detY/detA;
        return y;
    }
    public static void main(String[] args) {
    
        SimultaneousEquations se = new SimultaneousEquations();
        
        double x = se.getDetX();
        double y = se.getDetY();
        
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
    
}
