package DAO;

import beans.BankBean;
import Conn.PConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankDAO {

    PConnect pc = new PConnect();
    Connection connect = null;
    PreparedStatement ps = null;

    public int addBank(BankBean Bean) {

        int status = -1;
        String query = "INSERT INTO bank VALUES(?, ?)";
        connect = pc.getNewConnection();

        try {
            
            ps = connect.prepareStatement(query);

            ps.setInt(1, Bean.getBankCode());
            ps.setString(2, Bean.getBank());

            status = ps.executeUpdate();
            if (status == 1) {
                status = 0;

            } else {
                status = 1;
            }
        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return status;
    }

    public int deleteBank(String bankCode) {

        int status = -1;
        String query = "DELETE FROM bank WHERE Bank_Code = ?";
        connect = pc.getNewConnection();

        try {
           
            ps = connect.prepareStatement(query);

            ps.setString(1, bankCode);

            status = ps.executeUpdate();
            if (status == 1) {
                status = 0;

            } else {
                status = 1;
            }
        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return status;

    }

    public int updateBank(BankBean Bean) {

        int status = -1;
        String query = "UPDATE Bank SET Bank = ? WHERE Bank_Code = ?  ";
        connect = pc.getNewConnection();

        try {
            
            ps = connect.prepareStatement(query);

            ps.setString(1, Bean.getBank());
            ps.setInt(2, Bean.getBankCode());

            status = ps.executeUpdate();
            if (status == 1) {
                status = 0;

            } else {
                status = 1;
            }
        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return status;
    }

    public BankBean getBank(int BankCode) {

        BankBean bankBean = new BankBean();
        String query = "SELECT * FROM Banks WHERE Bank_Code = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        connect = pc.getNewConnection();

        try {
            
            ps = connect.prepareStatement(query);

            ps.setInt(1, BankCode);
            rs = ps.executeQuery();
            if (rs.next()) {

                bankBean.setBankCode(rs.getInt("Bank_Code"));
                bankBean.setBank(rs.getString("Bank"));

            }

        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return bankBean;

    }

    public List<BankBean> getBanks() {

        List<BankBean> banks = new ArrayList<>();
        
        
        String query = "SELECT * FROM Banks";
        Statement s = null;
        ResultSet rs = null;
        connect = pc.getNewConnection();

        try {
            
            s = connect.createStatement();

            rs = s.executeQuery(query);
            while (rs.next()) {

                BankBean bankBean = new BankBean();
                bankBean.setBankCode(rs.getInt("Bank_Code"));
                bankBean.setBank(rs.getString("Bank"));
                banks.add(bankBean);

            }
        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return banks;
    }
    
    public List<String> getBankCodes() {

        List<String> bankcodes = new ArrayList<>();
        
        String query = "SELECT * FROM bank";
        Statement s = null;
        ResultSet rs = null;
        connect = pc.getNewConnection();

        try {
            
            s = connect.createStatement();

            rs = s.executeQuery(query);
            while (rs.next()) {
                
                String bankCode = String.valueOf(rs.getInt("bankcode"));
                String bank = rs.getString("bank");
                String bankData = bankCode+":"+bank;
                bankcodes.add(bankData);

            }
        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return bankcodes;
    }

    public static void main(String[] args) {

        BankDAO bankdao = new BankDAO();
        //BankBean bb = new BankBean();

        // bb.setBankCode("2692634");
        //bb.setBank("First Bank");
        //int status = bdao.addBank(bb);
        //System.out.println("Status: " + status);
        //int status = bdao.deleteBank(bb);
        //System.out.println("Status: " + status);
        //int status = bdao.updateBank(bb);
        //System.out.println("Status: " + status);
//        BankBean bb = bdao.getBank("0124756");
//        System.out.println("Bank Code: " + bb.getBankCode());
//        System.out.println("Bank: " + bb.getBank());
//        List<BankBean> bbean = bankdao.getBanks();
//        for (BankBean bankBean : bbean) {
//
//            System.out.println("Bank Code: " + bankBean.getBankCode());
//            System.out.println("Bank: " + bankBean.getBank());
//
//            System.out.println("********************************************");
//        }
        
        List<String> codes = bankdao.getBankCodes();
        for (String code : codes) {

            System.out.println("Bank Code: " + code);

//            System.out.println("********************************************");
        }
    }
}
