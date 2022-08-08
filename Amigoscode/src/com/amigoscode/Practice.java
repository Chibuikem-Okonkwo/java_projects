package com.amigoscode;
import java.util.Scanner;

public class Practice {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scanner.nextLine();
        System.out.println("Hello "+username);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Age: "+age);
        
        char [] letters = {'A', 'A', 'B', 'C', 'D','D', 'D'};
        int count = countOccurences(letters,'A');
        System.out.println(count);
        
    }
    
    public static int countOccurences(char [] letters, char searchLetter){
        
        int count = 0;
        for(char letter:letters){
        
        if (letter == searchLetter){
        
        count++;
        }
       }

        return count;
    }
    
}
