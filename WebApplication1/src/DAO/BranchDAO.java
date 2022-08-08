package DAO;

import Beans.BranchBean;
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

public class BranchDAO {
    
    JConnect jc = new JConnect();
    
    public int addBranch(BranchBean bean) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "INSERT into branch values (?, ?, ?, ?)";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setInt(1, bean.getBranchCode());
            ps.setInt(2, bean.getBankCode());
            ps.setString(3, bean.getBranch());
            ps.setString(4, bean.getLocation());
            

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

    public int updateBranch(BranchBean bean) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "UPDATE branch set bankcode = ?, branch = ?, location = ? where branchcode = ?";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            
            ps.setInt(1, bean.getBankCode());
            ps.setString(2, bean.getBranch());
            ps.setString(3, bean.getLocation());
            ps.setInt(4, bean.getBranchCode());

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

    public int deleteBranch(int branchCode) {

        int status = -1;
        PreparedStatement ps = null;
        Connection connect = null;
        String query = "DELETE from branch where branchcode = ?";

        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setInt(1, branchCode);

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
    
    public BranchBean getBranch(int branchCode){
        
        BranchBean bean = new BranchBean();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connect = null;
        String query = "SELECT * from branch where branchcode = ?";
        
        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setInt(1, branchCode);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setBranchCode(rs.getInt("branchcode"));
                bean.setBankCode(rs.getInt("bankcode"));
                bean.setBranch(rs.getString("branch"));
                bean.setLocation(rs.getString("location"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bean;
    }
    
    public List<BranchBean> getBranches(){
        
        List<BranchBean> branches = new ArrayList<>();
        
        Statement stmt = null;
        ResultSet rs = null;
        Connection connect = null;
        String query = "SELECT * from branch";
        
        connect = jc.getNewConnection();
        try {
            stmt = connect.createStatement();
            
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                BranchBean bean = new BranchBean();
                
                bean.setBankCode(rs.getInt("bankcode"));
                bean.setBranchCode(rs.getInt("branchcode"));
                bean.setBranch(rs.getString("branch"));
                bean.setLocation(rs.getString("location"));
                
                branches.add(bean);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return branches;
    }

    public static void main(String[] args) {

        BranchDAO bdao = new BranchDAO();

//        BranchBean bean = new BranchBean();
//        
//        bean.setBankCode(22);
//        bean.setBranchCode(10002);
//        bean.setBranch("Illupeju Branch");
//        bean.setLocation("Illupeju");
//        
//        int status = bdao.addBranch(bean);
//        System.out.println("Status: "+status);
        
//        
//        int status = bdao.addBank(bean);
//        System.out.println("Status: "+status);
        

//        bean.setBankCode(22);
//        bean.setBranchCode(10001);
//        bean.setBranch("Illupeju Branch");
//        bean.setLocation("Illupeju");
//
//        int status = bdao.updateBranch(bean);
//        System.out.println("Status: "+status);
//        int status = bdao.deleteBranch(10001);
//        System.out.println("Status: " + status);

//        BranchBean bean = bdao.getBranch(10001);
//        if (bean != null) {
//            System.out.println("Bank Code: "+bean.getBankCode());
//            System.out.println("Branch Code: "+bean.getBranchCode());
//            System.out.println("Branch: "+bean.getBranch());
//            System.out.println("Location: "+bean.getLocation());
//        }
        
        List<BranchBean> branches = bdao.getBranches();
        for (BranchBean branch : branches) {
            System.out.println("");
            System.out.println("Bank Code: "+branch.getBankCode());
            System.out.println("Branch code: "+branch.getBranchCode());
        }
    }
} 
