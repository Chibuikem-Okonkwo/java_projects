package com.melodia;

public class InheritanceExample extends Arithmetic {

    double firstNumber;
    double secondNumber;
    
    public InheritanceExample(){
        
        firstNumber = 10;
        secondNumber = 5;
    }
    
    public void addition(){
        
        double result = getSum(firstNumber, secondNumber);
        System.out.println("SUM: "+result);
    }
    
    public void difference(){
        
        double result = getDifference(firstNumber, secondNumber);
        System.out.println("Difference: "+result);
    }
    
    public static void main(String[] args) {
        
        InheritanceExample i = new InheritanceExample();
        i.addition();
        i.difference();
    }
    
}
