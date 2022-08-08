package practicetask;

import java.util.Scanner;

public class  PracticeTask {

    public PracticeTask(){
   
    }
    
    public void getFibonnaci(){
    
        int firstNum = 0;
        int secondNum = 1;
        int i;
        int nextNum;
        
        for(i = 0; i<10; i++){
            
            System.out.println(firstNum + ", ");

            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
    
    public static void main(String[] args) {

        PracticeTask p = new PracticeTask();
        p.getFibonnaci();
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        double num = s.nextDouble();
    }
    
}
