/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.RecoveryBankCategoriesBean;
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

/**
 *
 * @author Mercy Nwamannah
 */
public class RecoveryBankCategoriesDAO {

    JConnect jc = new JConnect();
    Connection connect = null;
    PreparedStatement ps = null;

    public int addRecoveryBankCategory(RecoveryBankCategoriesBean bean) {

        int status = -1;

        String query = "INSERT INTO recovery_bank_categories VALUES (?, ?, ?)";
        connect = jc.getNewConnection();

        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getBankCatId());
            ps.setString(2, bean.getBankCategory());
            ps.setString(3, bean.getEntryDate());

            status = ps.executeUpdate();

            if (status == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(RecoveryBankCategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int updateRecoveryBankCategory(RecoveryBankCategoriesBean bean) {

        int status = -1;

        String query = "UPDATE recovery_bank_categories SET bank_category = ? WHERE bank_cat_id = ?";
        connect = jc.getNewConnection();

        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getBankCategory());
            ps.setString(2, bean.getBankCatId());
            status = ps.executeUpdate();

            if (status == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(RecoveryBankCategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int deleteRecoveryBankCategory(String bankCatId) {

        int status = -1;

        String query = "DELETE FROM recovery_bank_categories WHERE bank_cat_id = ?";
        connect = jc.getNewConnection();

        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bankCatId);
            status = ps.executeUpdate();

            if (status == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(RecoveryBankCategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public RecoveryBankCategoriesBean getRecoveryBankCategory(String bankCatId) {

        RecoveryBankCategoriesBean rb = new RecoveryBankCategoriesBean();
        String query = ("SELECT * FROM recovery_bank_categories WHERE bank_cat_id=?");
        PreparedStatement ps = null;
        ResultSet rs = null;
        connect = jc.getNewConnection();

        try {

            ps = connect.prepareStatement(query);
            ps.setString(1, bankCatId);
            rs = ps.executeQuery();
            if (rs.next()) {

                rb.setBankCatId(rs.getString("bank_cat_id"));
                rb.setBankCategory(rs.getString("bank_category"));
                rb.setEntryDate(rs.getString("entry_date"));
            }
        } catch (Exception e) {
            Logger.getLogger(RecoveryBankCategoriesDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return rb;
    }

    public List<RecoveryBankCategoriesBean> getRecoveryBankCategories() {

        List<RecoveryBankCategoriesBean> rb = new ArrayList<>();
        String query = ("SELECT * FROM recovery_bank_categories");
        Statement st = null;
        ResultSet rs = null;
        connect = jc.getNewConnection();

        try {

            st = connect.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                RecoveryBankCategoriesBean rbean = new RecoveryBankCategoriesBean();
                rbean.setBankCatId(rs.getString("bank_cat_id"));
                rbean.setBankCategory(rs.getString("bank_category"));
                rbean.setEntryDate(rs.getString("entry_date"));
                rb.add(rbean);
            }
        } catch (Exception e) {
            Logger.getLogger(RecoveryBankCategoriesDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return rb;
    }

    public static void main(String[] args) {

        RecoveryBankCategoriesDAO dao = new RecoveryBankCategoriesDAO();

        RecoveryBankCategoriesBean rb = new RecoveryBankCategoriesBean();
        rb.setBankCatId("Bc02");
        rb.setBankCategory("Category 1");
        rb.setEntryDate("2021-07-29");

        int status = dao.addRecoveryBankCategory(rb);
        System.out.println("Status is: " + status);

//           rb.setBankCategory("Category 2");
//           rb.setBankCatId("Bc02");
//           
//        int status = dao.updateRecoveryBankCategory(rb);
//        System.out.println("Status is:" + status);
//
//      int status = dao.deleteRecoveryBankCategory("Bc03");
//       System.out.println("Status is:" + status);
//      
//       RecoveryBankCategoriesBean rb = dao.getRecoveryBankCategory("Bc02");
//        System.out.println("Bank Cat Id: " + rb.getBankCatId());
//        System.out.println("Bank Category: " + rb.getBankCategory());
//        System.out.println("Entry Date: " + rb.getEntryDate());

//        List<RecoveryBankCategoriesBean> bean = dao.getRecoveryBankCategories();
//        for (RecoveryBankCategoriesBean rb : bean) {
//            System.out.println("Bank Cat Id: " + rb.getBankCatId());
//        System.out.println("Bank Category: " + rb.getBankCategory());
//        System.out.println("Entry Date: " + rb.getEntryDate());
//            
//            System.out.println("---------------------------------");
//        }
    }
    }
