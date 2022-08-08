package com.melodia;

import com.melodia.CustomerBean.CustomerBean;

public class CustomerRecord {

    public CustomerRecord() {
    }

    public void showCustomerRecord(CustomerBean bean){
        
        System.out.println("Customer Record");
        System.out.println("*******************");
        
        System.out.println("Customer ID: "+bean.getCustomerId());
        System.out.println("First Name: "+bean.getFirstName());
        System.out.println("Last Name: "+bean.getLastName());
        System.out.println("Gender: "+bean.getGender());
        System.out.println("Age: "+bean.getAge());
    }
    public static void main(String[] args) {
        
        CustomerRecord cr = new CustomerRecord();
        
        CustomerBean cb = new CustomerBean();
        cb.setCustomerId("c01");
        cb.setFirstName("Herb");
        cb.setLastName("Holt");
        cb.setAge("29");
        cb.setGender("Male");
        
        cr.showCustomerRecord(cb);
    }
    
}
