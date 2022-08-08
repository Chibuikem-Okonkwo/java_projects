package com.melodia.Beans;

public class StudentBean {

    private String studentId;
    private String firstName;
    private String lastName;
    private String gender;

    public StudentBean() {  //Zero argument constructor
        
    }

    public StudentBean(String studentId, String firstName, String lastName, String gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "StudentBean{" + "studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + '}';
    }
    
}
