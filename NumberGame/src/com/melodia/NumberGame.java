package com.melodia;

import java.util.Scanner;

public class NumberGame {
    
    public NumberGame(){}
    
    public int getCompNumber(){
    
        int compNumber = (int)(Math.random()*10+1);
        return compNumber;
    }
    
    public int getBothNumbers(){
    
        int compNumber = getCompNumber();
        int count = 1;
        
        int userNumber = -1;
        while (compNumber != userNumber){
            
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter your number");
            userNumber = s.nextInt();
            
            if(compNumber == userNumber){
                
                System.out.println("You guessed right! "+compNumber);
            }
            
            else{
            
                System.out.println("Wrong. Try again!");
                count++;
        }}
        System.out.println("The number is "+compNumber);
        return count;
    }
    
    public static void main(String[] args) {
        
        NumberGame ng = new NumberGame();
        int compNumber = ng.getCompNumber();
        
        int count = ng.getBothNumbers();
        
        System.out.println("You have used "+count+" tries");
    }
    
}
