package beans;

public class BranchBean {

    private int BranchCode;
    private int BankCode;
    private String Branch;
    private String Location;

    public BranchBean() {
    }
    
    public BranchBean(int BranchCode, int BankCode, String Branch, String Location) {
        this.BranchCode = BranchCode;
        this.BankCode = BankCode;
        this.Branch = Branch;
        this.Location = Location;
    }
    
    public int getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(int BranchCode) {
        this.BranchCode = BranchCode;
    }

    public int getBankCode() {
        return BankCode;
    }

    public void setBankCode(int BankCode) {
        this.BankCode = BankCode;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public String toString() {
        return "BranchBean{" + "BranchCode=" + BranchCode + ", BankCode=" + BankCode + ", Branch=" + Branch + ", Location=" + Location + '}';
    }

   
}
