/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Mercy Nwamannah
 */
public class RecoveryBankCategoriesBean {
    
    private String bankCatId;
    private String bankCategory;
    private String entryDate;

    public RecoveryBankCategoriesBean() {
    }

    public RecoveryBankCategoriesBean(String bankCatId, String bankCategory, String entryDate) {
        this.bankCatId = bankCatId;
        this.bankCategory = bankCategory;
        this.entryDate = entryDate;
    }

    public String getBankCatId() {
        return bankCatId;
    }

    public void setBankCatId(String bankCatId) {
        this.bankCatId = bankCatId;
    }

    public String getBankCategory() {
        return bankCategory;
    }

    public void setBankCategory(String bankCategory) {
        this.bankCategory = bankCategory;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "RecoveryBankCategoriesBean{" + "bankCatId=" + bankCatId + ", bankCategory=" + bankCategory + ", entryDate=" + entryDate + '}';
    }
    
}
