package com.melodia;
public class ArithmeticProgression {

    public ArithmeticProgression(){
    }
    
    public double getApSum(double first, double numberOfTerms, double commonDifference ){
    
        double apSum = first+(numberOfTerms-1)*commonDifference;
        return apSum;
    }
    
    public static void main(String[] args) {

        ArithmeticProgression ap = new ArithmeticProgression();
        
        double apSum = ap.getApSum(3, 20, 5);
        System.out.println("Sum of AP: "+apSum);
    }    
}
