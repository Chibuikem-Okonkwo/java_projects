package Beans;

public class BranchBean {

    private int branchCode;
    private int bankCode;
    private String branch;
    private String location;

    public BranchBean() {
    }

    public BranchBean(int branchCode, int bankCode, String branch, String location) {
        this.branchCode = branchCode;
        this.bankCode = bankCode;
        this.branch = branch;
        this.location = location;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "BranchBean{" + "branchCode=" + branchCode + ", bankCode=" + bankCode + ", branch=" + branch + ", location=" + location + '}';
    }
    
}
