package Beans;

public class RecoveryBankCoveragesBean {
    
    private String bankCode;
    private String bankCatId;
    private String bank;
    private String entryDate;

    public RecoveryBankCoveragesBean() {
    }

    public RecoveryBankCoveragesBean(String bankCode, String bankCatId, String bank, String entryDate) {
        this.bankCode = bankCode;
        this.bankCatId = bankCatId;
        this.bank = bank;
        this.entryDate = entryDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCatId() {
        return bankCatId;
    }

    public void setBankCatId(String bankCatId) {
        this.bankCatId = bankCatId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "RecoveryBankCoveragesBean{" + "bankCode=" + bankCode + ", bankCatId=" + bankCatId + ", bank=" + bank + ", entryDate=" + entryDate + '}';
    }
}
