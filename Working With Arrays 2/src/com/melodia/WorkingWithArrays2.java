package com.melodia;

public class WorkingWithArrays2 {
    
    public WorkingWithArrays2(){
    }

//    public double getFrequency (double [] numbers){
//    
//        int [] frequency = new int[numbers.length];
//        Arrays.sort(numbers);
//        
//        for(int i = 0; i<numbers.length; i++){
//        
//            int count = 0;
//            
//            for (int j = 0; j < numbers.length; j++) {
//                
//               if(numbers[i]==numbers[j]){
//               
//                   frequ
//               } 
//            }
//            
//            System.out.println(numbers[i] +" "+ count);
//        }
//        return 0.0;
//    }
    public double getMean(double[] numbers){
        
        double mean;
        double total = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            
            //total = total + numbers[i];
            total += numbers[i];
        }
        mean = total/numbers.length;
        
        return mean;
    }
    
    public double getVariance(double [] numbers){
        
        double variance;
        double cumVariance = 0.0;
        
        double mean = getMean(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            
            double pointVariance = numbers[i] - mean;
            double varianceSquare = pointVariance*pointVariance;
            
            //cumVariance = cumVariance + varianceSquare;   //Accumulation principle
            cumVariance += varianceSquare;
            System.out.println("| "+numbers[i]+"\t\t| "+pointVariance+"\t\t| "+cumVariance+"\t\t|");
        }
        
        variance = cumVariance/(numbers.length - 1);
        
        return variance;
    }
    
    public double getStandardDeviation(double[] numbers){
    
        double sD;
        double variance = getVariance(numbers);
        
        //sD = Math.sqrt(variance);
        sD = Math.pow(variance, 0.5);
        return sD;
    }
    
    public static void main(String[] args) {

        WorkingWithArrays2 w = new WorkingWithArrays2();
        
        double [] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        double frequency = w.getFrequency(data);
        System.out.println("-------------------------------------------------");
        System.out.println("|"+"Score\t"+"\t|Point Variance"+"\t|Cum Variance\t|");
        System.out.println("-------------------------------------------------");
        
        
       //double variance = w.getVariance(data);
        

       //System.out.println("Variance: "+variance);
        
        double sD = w.getStandardDeviation(data);
        System.out.println("-------------------------------------------------");
        System.out.println("Standrad Deviation: " +sD);
     }
    
}