package DAO;

import Beans.BankBean;
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

public class BankDAO {

    JConnect jc = new JConnect();

    public int addBank(BankBean bean) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "INSERT into bank values (?, ?)";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getBankCode());
            ps.setString(2, bean.getBank());

            int rowAffected = ps.executeUpdate();

            if (rowAffected == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int updateBank(BankBean bean) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "UPDATE bank set bank = ? where bankcode = ?";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getBank());
            ps.setString(2, bean.getBankCode());

            int rowAffected = ps.executeUpdate();

            if (rowAffected == 1) {
                status = 0;
            } else {
                status = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int deleteBank(String bankCode) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "DELETE from bank where bankcode = ?";

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
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    
    public BankBean getBank(String bankCode){
        
        BankBean bean = new BankBean();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connect = null;
        String query = "SELECT * from bank where bankcode = ?";
        
        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bankCode);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setBankCode(rs.getString("bankcode"));
                bean.setBank(rs.getString("bank"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bean;
    }
    
    public List<BankBean> getBanks(){
        
        List<BankBean> banks = new ArrayList<>();
        
        Statement stmt = null;
        ResultSet rs = null;
        Connection connect = null;
        String query = "SELECT * from bank";
        
        connect = jc.getNewConnection();
        try {
            stmt = connect.createStatement();
            
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                BankBean bean = new BankBean();
                
                bean.setBankCode(rs.getString("bankcode"));
                bean.setBank(rs.getString("bank"));
                
                banks.add(bean);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return banks;
    }

    public static void main(String[] args) {

        BankDAO bdao = new BankDAO();

        BankBean bean = new BankBean();
//        bean.setBankCode("022");
//        bean.setBank("Union Bank");
//        
//        int status = bdao.addBank(bean);
//        System.out.println("Status: "+status);

        bean.setBank("UBA");
        bean.setBankCode("011");
        int status = bdao.updateBank(bean);
        System.out.println("Status: "+status);

//        int status = bdao.deleteBank("011");
//        System.out.println("Status: " + status);

//        BankBean bean = bdao.getBank("22");
//        if (bean != null) {
//            System.out.println("Bank Code: "+bean.getBankCode());
//            System.out.println("Bank: "+bean.getBank());
//        }
        
//        List<BankBean> banks = bdao.getBanks();
//        for (BankBean bank : banks) {
//            System.out.println("");
//            System.out.println("Bank Code: "+bank.getBankCode());
//            System.out.println("Bank: "+bank.getBank());
//        }
    }
}