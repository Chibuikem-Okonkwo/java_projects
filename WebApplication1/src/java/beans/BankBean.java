package beans;

public class BankBean {

    private int bankCode;
    private String bank;

    public BankBean() {
    }

    public BankBean(int bankCode, String bank) {
        this.bankCode = bankCode;
        this.bank = bank;
    }
    
    

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "BankBean{" + "bankCode=" + bankCode + ", bank=" + bank + '}';
    }

   
}
