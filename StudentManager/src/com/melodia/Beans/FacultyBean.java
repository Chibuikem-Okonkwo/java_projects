package com.melodia.Beans;

public class FacultyBean {

    private String facultyName;
    private String facultyId;
    private String facultySize;

    public FacultyBean() {
    }

    public FacultyBean(String facultyName, String facultyId, String facultySize) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
        this.facultySize = facultySize;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultySize() {
        return facultySize;
    }

    public void setFacultySize(String facultySize) {
        this.facultySize = facultySize;
    }

    @Override
    public String toString() {
        return "FacultyBean{" + "facultyName=" + facultyName + ", facultyId=" + facultyId + ", facultySize=" + facultySize + '}';
    }

    
}
