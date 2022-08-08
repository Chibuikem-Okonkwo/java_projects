/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melodia;    //package declaration

/**
 *
 * @author Tony
 */
public class Student {  //class declaration
    
    private String studentId;   //data members declaration
    private String firstName;
    private String lastName;
    
    public Student() {  //constructor declaraton
    
        studentId = "s01";  //data members initialisaztion
        firstName = "Chibs";
        lastName = "Okonkwo";
    
    }
    
    public void showStudentRecord (){   //instance method declaration
    
       System.out.println("Student ID: " +studentId);
       System.out.println("First Name: " +firstName);
       System.out.println("Last Name: " +lastName);
      
    }
    
    public void showMedicalRecord(){
    
        System.out.println("Medical Record");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //main method declaration
        // TODO code application logic here
        Student s = new Student();  //instantiation
          //method invocation
        s.showMedicalRecord();
        s.showStudentRecord();
        
    }
    
}
