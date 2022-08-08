package com.melodia;

import com.melodia.Beans.StudentBean;

public class StudentManager {

    
    public StudentManager() {
    }

    public static void main(String[] args) {

        StudentRecord sr =new StudentRecord();
        //sr.showStudentRecord("s01", "Chibs", "Okonkwo", "Male");
        
        StudentBean sb = new StudentBean();
        sb.setStudentId("s01");
        sb.setFirstName("Chibs");
        sb.setLastName("Okonkwo");
        sb.setGender("Male");
        
        sr.showStudentRecord(sb);
    }
    
}
