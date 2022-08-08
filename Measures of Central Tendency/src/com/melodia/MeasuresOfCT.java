package com.melodia;

import java.util.Arrays;

public class MeasuresOfCT {

    private double [] numbers;
    
    public MeasuresOfCT(){
    
       numbers = new double []{3, 3, 3, 3, 6, 5, 6, 6, 2, 2, 1, 4, 3, 5};
    }
    
    public double Mean(){
        
       double sum = 0;
       for(int i = 0; i<numbers.length; i++)
       {

           sum = sum + numbers[i];
       }
       
       double frequency = numbers.length;
       double mean = sum/frequency;
       
       return mean;
    }
    
    public double Median(){
    
        Arrays.sort(numbers);
        
        if(numbers.length%2 == 1){
        
            int midposition = (numbers.length-1)/2;
            double median = numbers[midposition];

            return median;
        }
        else{
        
            int mid1 = (numbers.length)/2;
            int mid2 = (numbers.length-2)/2;
            
            double median = (numbers[mid1]+numbers[mid2])/2;
            return median;
        }
        
    }
   
    public double Mode(){
    
        double mode = 0;
        int maxCount = 0;
        for(int i = 0; i<numbers.length; i++){
            int count = 0;
            for(int j = 0; j<numbers.length; j++)
            {
                if(numbers[i] == numbers[j]) {
                    
                    count = count +1;
                }
            }
                if(count>maxCount){
                
                    maxCount = count;
                    mode = numbers[i];
                }
        }
        return mode;
    }
    
    public double Range(){
    
        Arrays.sort(numbers);
        
        double range = numbers[numbers.length-1] - numbers[0];
        return range;
    }
    
    public double Variance(){
        
        int i;
        double mean = Mean();
        double diffSum = 0;
        
        for(i= 0; i<numbers.length; i++){
        
            diffSum = diffSum + Math.pow(numbers[i]-mean, 2);
        }
        
        double freq = numbers.length-1;
        double variance = diffSum/freq;
        return variance;
    }
    
    public double StandardDev(){
    
        double variance = Variance();
        double standardDev = Math.sqrt(variance);
        
        return standardDev;
    }
    
    public static void main(String[] args) {
        
        MeasuresOfCT mct = new MeasuresOfCT();
        
        double mean = mct.Mean();
        System.out.println("Mean: "+mean);
        
        double median = mct.Median();
        System.out.println("Median: "+median);
        
        double mode = mct.Mode();
        System.out.println("Mode: "+mode);
        
        double range = mct.Range();
        System.out.println("Range: "+range);
        
        double variance = mct.Variance();
        System.out.println("Variance: "+variance);
    
        double standardDev = mct.StandardDev();
        System.out.println("Standard Deviation: "+standardDev);
    }
    
}
