package com.melodia;

import com.melodia.Beans.StudentBean;

public class StudentRecord {

//    public void showStudentRecord(String studentId, String firstName, String lastName, String gender) {
//
//        System.out.println("Student ID: " + studentId);
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Gender: " + gender);
//    }
//    
    public void showStudentRecord(StudentBean bean) {

        //StudentBean sb = new StudentBean();

//        sb.setStudentId("s01");
//        sb.setFirstName("Chibs");
//        sb.setLastName("Okonkwo");
//        sb.setGender("Male");
        System.out.println("Student ID: " + bean.getStudentId());   //Populating the Student Object
        System.out.println("First Name: " + bean.getFirstName());
        System.out.println("Last Name: " + bean.getLastName());
        System.out.println("Gender: " + bean.getGender());
        
        
    }
}
