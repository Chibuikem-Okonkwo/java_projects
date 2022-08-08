package com.melodia;

public class SimultaneousEquation {

    public SimultaneousEquation(){    
    }
    
    public double getDetA(double x1, double x2, double y1, double y2){
        
        double detA = (x1*y2) - (y1 * x2);
        return detA;
    }
    public double getDetX(double y1, double y2, double c1, double c2){
        
        double detX = (y2*c1) - (y1 * c2);
        return detX;
    }
    
    public double getDetY(double x1, double x2, double c1, double c2){
    
        double detY = (x1 * c2) - (x2*c1);
        return detY;
    }
    public static void main(String[] args) {
    
        SimultaneousEquation se = new SimultaneousEquation();
        double detA = se.getDetA(1, 1, 1, 2);
        double detX = se.getDetX(1, 2, 2, 0);
        double detY = se.getDetY(1, 1, 2, 0);
        
        double x = detX/detA;
        System.out.println("x: "+x);
        
        double y = detY/detA;
        System.out.println("y: "+y);
    }
    
}
