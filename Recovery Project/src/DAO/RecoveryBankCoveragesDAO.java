package DAO;

import Beans.RecoveryBankCoveragesBean;
import CONN.JConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecoveryBankCoveragesDAO {
    
    JConnect jc = new JConnect();
    public int addRecoveryBankCoverages(RecoveryBankCoveragesBean bean) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "INSERT into recovery_bank_coverages values (?, ?, ?, ?)";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getBankCode());
            ps.setString(2, bean.getBankCatId());
            ps.setString(3, bean.getBank());
            ps.setString(4, bean.getEntryDate());

            int rowAffected = ps.executeUpdate();

            if (rowAffected == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecoveryBankCoveragesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    
    public int updateRecoveryBankCoverages(RecoveryBankCoveragesBean bean) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "UPDATE recovery_bank_coverages SET bank_cat_id = ?, bank = ?, entry_date = ? where bank_code = ?";

        connect = jc.getNewConnection();
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getBankCatId());
            ps.setString(2, bean.getBank());
            ps.setString(3, bean.getEntryDate());
            ps.setString(4, bean.getBankCode());

            int rowAffected = ps.executeUpdate();

            if (rowAffected == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecoveryBankCoveragesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int deleteRecoveryBankCoverages(String bankCode) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "DELETE from recovery_bank_coverages where bank_code = ?";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bankCode);

            int rowAffected = ps.executeUpdate();

            if (rowAffected == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecoveryBankCoveragesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    
    public RecoveryBankCoveragesBean getRecoveryBankCoverage(String bankCode){
        
        RecoveryBankCoveragesBean bean = new RecoveryBankCoveragesBean();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connect = null;
        String query = "SELECT * from recovery_bank_coverages where bank_code = ?";
        
        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bankCode);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setBankCode(rs.getString("bank_code"));
                bean.setBankCatId(rs.getString("bank_cat_id"));
                bean.setBank(rs.getString("bank"));
                bean.setEntryDate(rs.getString("entry_date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecoveryBankCoveragesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bean;
    }
    
    public List<RecoveryBankCoveragesBean> getRecoveryBankCoverages(){
        
        List<RecoveryBankCoveragesBean> recoveryBankCoverages = new ArrayList<>();
        
        Statement stmt = null;
        ResultSet rs = null;
        Connection connect = null;
        String query = "SELECT * from recovery_bank_coverages";
        
        connect = jc.getNewConnection();
        try {
            stmt = connect.createStatement();
            
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                RecoveryBankCoveragesBean bean = new RecoveryBankCoveragesBean();
                
                bean.setBankCode(rs.getString("bank_code"));
                bean.setBankCatId(rs.getString("bank_cat_id"));
                bean.setBank(rs.getString("bank"));
                bean.setEntryDate(rs.getString("entry_date"));
                
                recoveryBankCoverages.add(bean);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecoveryBankCoveragesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return recoveryBankCoverages;
    }
    
    public static void main(String[] args) {

        RecoveryBankCoveragesDAO rdao = new RecoveryBankCoveragesDAO();
        //RecoveryBankCoveragesBean bean = new RecoveryBankCoveragesBean();
        
//        bean.setBankCode("022");
//        bean.setBankCatId("Bc02");
//        bean.setBank("GTB");
//        bean.setEntryDate("2021-08-31");
//        int status = rdao.addRecoveryBankCoverages(bean);
//        System.out.println("Status: "+status);
        
//        bean.setBankCode("011");
//        bean.setBankCatId("Bc01");
//        bean.setBank("GTBank");
//        bean.setEntryDate("2021-09-06");
//        
//        int status = rdao.updateRecoveryBankCoverages(bean);
//        System.out.println("Status: "+status);
        
//        int status = rdao.deleteRecoveryBankCoverages("011");
//        System.out.println("Status: "+status);

//        RecoveryBankCoveragesBean bean = rdao.getRecoveryBankCoverage("022");
//            if (bean != null) {
//                
//                System.out.println("Bank Code: "+bean.getBankCode());
//                System.out.println("Bank: "+bean.getBank());
//            }
            List<RecoveryBankCoveragesBean> recoveryBankCoverages = rdao.getRecoveryBankCoverages();
            
            for (RecoveryBankCoveragesBean recoveryBank : recoveryBankCoverages) {
                System.out.println("");
                System.out.println("Bank Code: "+recoveryBank.getBankCode());
                System.out.println("Bank Category ID: "+recoveryBank.getBank());
                System.out.println("Bank: "+recoveryBank.getBank());
                System.out.println("Entry Date: "+recoveryBank.getBank());
        }
    }
}