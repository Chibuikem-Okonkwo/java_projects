package com.melodia.EmployeeBean;

public class EmployeeBean {

    private String employeeCode;
    private String firstName;
    private String lastName;
    private String gender;
    private String mobile;
    private String email;

    public EmployeeBean() {
    }

    public EmployeeBean(String employeeCode, String firstName, String lastName, String gender, String mobile, String email) {
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" + "employeeCode=" + employeeCode + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + '}';
    }
    
}
