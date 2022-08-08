package com.melodia;

public class GeometricProgression {

    public GeometricProgression(){
        
    }
    
    public double getGpSum(double first, double commonRatio, double numberOfTerms){
        
        double gpSum = first*(Math.pow(commonRatio, numberOfTerms) - 1)/(commonRatio - 1);
        return gpSum;
    }
    
    public static void main(String[] args) {
        
        GeometricProgression gp = new GeometricProgression();
        
        double gpSum = gp.getGpSum(3, 3, 3);
        System.out.println("Sum of GP: "+ gpSum);
    }
}
