package com.melodia;

import java.util.Arrays;

public class Employee {
    
    private String [] names = {"Okonatus", "Donatus"};
    private String employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String mobileNumber;
    private String address;

    public Employee() {
        
        employeeId = "e01";
        firstName = "Daniel";
        lastName = "James";
        gender = "Male";
        mobileNumber = "09020867386";
        address = "20 Oakwood street";
        
    }

    public void showEmployeeRecord(){
    
        System.out.println("Employee Details"); 
        System.out.println("******************************");
        System.out.println("Employee ID: "+employeeId);
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Gender: "+gender);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("Address: "+address);
        System.out.println("Name: "+Arrays.toString(names));
        
    };
    
    public static void main(String[] args) {
        
        Employee e = new Employee();
        e.showEmployeeRecord();
        
    }
    
}
