package com.melodia;    

import java.util.Scanner;

public class StudentMgr {

    private String studentId;
    private String firstName;
    private String lastName;
    private String gender;
    
    Scanner scan = new Scanner(System.in);
    
    public StudentMgr() {
        
        System.out.print("\t Enter Student ID: ");
        studentId = scan.nextLine();
            
        System.out.print("\t Enter First Name: ");
        firstName = scan.nextLine();
        
        System.out.print("\t Enter Last Name: ");
        lastName = scan.nextLine();
        
        System.out.print("\t Enter Gender: ");
        gender = scan.nextLine();
    }

    public void showStudentRecord(){
        
        System.out.println(" ");
        System.out.println("\t Student ID: "+studentId);
        System.out.println("\t First Name: "+firstName);
        System.out.println("\t Last Name: "+lastName);
        System.out.println("\t Gender: "+gender);
    }
    
    public static void main(String[] args) {
        
        StudentMgr sm = new StudentMgr();
        sm.showStudentRecord();
    }
    
}
