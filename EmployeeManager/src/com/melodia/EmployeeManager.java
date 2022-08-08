package com.melodia;

import com.melodia.EmployeeBean.EmployeeBean;

public class EmployeeManager {

    public EmployeeManager() {
    }

    public void showEmployeeRecord(EmployeeBean bean ){
        
        System.out.println("EMPLOYEE RECORD");
        System.out.println("*********************");
        
        System.out.println("Employee Code: "+bean.getEmployeeCode());
        System.out.println("First Name: "+bean.getFirstName());
        System.out.println("Last Name: "+bean.getLastName());
        System.out.println("Gender: "+bean.getGender());
        System.out.println("Phone Number: "+bean.getMobile());
        System.out.println("Email Address: "+bean.getEmail());
    }
    public static void main(String[] args) {
        
        EmployeeManager em = new EmployeeManager();
        
        
        EmployeeBean eb = new EmployeeBean();
        
        eb.setEmployeeCode("e01");
        eb.setFirstName("Boy");
        eb.setLastName("Wonder");
        eb.setGender("Male");
        eb.setMobile("09020292298");
        eb.setEmail("okon@gmail.com");
        System.out.println(eb);
        
        em.showEmployeeRecord(eb);
    }
    
}
