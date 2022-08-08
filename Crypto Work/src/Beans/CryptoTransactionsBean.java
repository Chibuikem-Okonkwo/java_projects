package Beans;

public class CryptoTransactionsBean {
    
    private int transactionId;
    private String userId;
    private int userWalletId;
    private String cryptoId;
    private String transactionTypeId;
    private double cryptoUnit;
    private double cryptoValue;
    private String transactionDate;
    private String entryDate;

    public CryptoTransactionsBean(int transactionId, String userId, int userWalletId, String cryptoId, String transactionTypeId, double cryptoUnit, double cryptoValue, String transactionDate, String entryDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.userWalletId = userWalletId;
        this.cryptoId = cryptoId;
        this.transactionTypeId = transactionTypeId;
        this.cryptoUnit = cryptoUnit;
        this.cryptoValue = cryptoValue;
        this.transactionDate = transactionDate;
        this.entryDate = entryDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserWalletId() {
        return userWalletId;
    }

    public void setUserWalletId(int userWalletId) {
        this.userWalletId = userWalletId;
    }

    public String getCryptoId() {
        return cryptoId;
    }

    public void setCryptoId(String cryptoId) {
        this.cryptoId = cryptoId;
    }

    public String getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(String transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public double getCryptoUnit() {
        return cryptoUnit;
    }

    public void setCryptoUnit(double cryptoUnit) {
        this.cryptoUnit = cryptoUnit;
    }

    public double getCryptoValue() {
        return cryptoValue;
    }

    public void setCryptoValue(double cryptoValue) {
        this.cryptoValue = cryptoValue;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "CryptoTransactionsBean{" + "transactionId=" + transactionId + ", userId=" + userId + ", userWalletId=" + userWalletId + ", cryptoId=" + cryptoId + ", transactionTypeId=" + transactionTypeId + ", cryptoUnit=" + cryptoUnit + ", cryptoValue=" + cryptoValue + ", transactionDate=" + transactionDate + ", entryDate=" + entryDate + '}';
    }
    
}
