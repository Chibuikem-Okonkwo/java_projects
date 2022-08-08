package com.melodia;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int [] numbers = {1, 3, 2, 6, 4, 5, 7, 9, 10, 8};
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i+=2) {
            
            System.out.println(numbers[i]);
        }
    }
    
}
