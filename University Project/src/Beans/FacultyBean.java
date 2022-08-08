package Beans;

public class FacultyBean {

    private String facultyId;
    private String facultyName;
    private String facultyDesc;
    private String entryDate;

    public FacultyBean() {
    }

    public FacultyBean(String facultyId, String facultyName, String facultyDesc, String entryDate) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyDesc = facultyDesc;
        this.entryDate = entryDate;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyDesc() {
        return facultyDesc;
    }

    public void setFacultyDesc(String facultyDesc) {
        this.facultyDesc = facultyDesc;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "FacultyBean{" + "facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyDesc=" + facultyDesc + ", entryDate=" + entryDate + '}';
    }
    
}
