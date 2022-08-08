/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melodia;

/**
 *
 * @author Tony
 */
public class Customer {
    
    private String customerId;
    private String firstName;
    private String lastName;

    public Customer() {
        
        customerId = "c01";
        firstName = "Camila";
        lastName = "Mendes";
        
    }
    
    public void showCustomerRecord(){
    
        System.out.println("Customer ID: "+customerId);
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer c = new Customer();   
        c.showCustomerRecord();
        
    }
    
}
