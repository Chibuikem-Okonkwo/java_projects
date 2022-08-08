package com.melodia.CustomerBean;

public class CustomerBean {
    
    private String customerId;
    private String firstName;
    private String LastName;
    private String age;
    private String gender;
    
    public CustomerBean() {
    }

    public CustomerBean(String customerId, String firstName, String LastName, String age, String gender) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.LastName = LastName;
        this.age = age;
        this.gender = gender;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerRecord{" + "customerId=" + customerId + ", firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
}
