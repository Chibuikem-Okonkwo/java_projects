package Beans;

public class BankBean {
    
    private String bankCode;
    private String bank;

    public BankBean() {
    }

    public BankBean(String bankCode, String bank) {
        this.bankCode = bankCode;
        this.bank = bank;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
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
