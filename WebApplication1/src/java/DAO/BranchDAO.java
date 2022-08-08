package DAO;

import beans.BranchBean;
import Conn.PConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BranchDAO {

    PConnect pc = new PConnect();
    Connection connect = null;
    PreparedStatement ps = null;

    public int addBranch(BranchBean bean) {

        int status = -1;
        String query = " INSERT INTO Branches VALUES(?, ?, ?, ?)";
        connect = pc.getNewConnection();

        try {

            ps = connect.prepareStatement(query);

            ps.setInt(1, bean.getBranchCode());
            ps.setInt(2, bean.getBankCode());
            ps.setString(3, bean.getBranch());
            ps.setString(4, bean.getLocation());

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

    public int deleteBranch(int branchCode) {

        int status = -1;
        String query = "DELETE FROM Branches WHERE Branch_Code = ?";
        PConnect pc = new PConnect();
        connect = pc.getNewConnection();

        try {

            ps = connect.prepareStatement(query);

            ps.setInt(1, branchCode);

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

    public int updateBranch(BranchBean bean) {

        int status = -1;
        String query = "UPDATE Branches SET Bank_Code = ?, Branch = ?, Location = ? WHERE Branch_Code = ?";
        PConnect pc = new PConnect();
        connect = pc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);

            ps.setInt(1, bean.getBankCode());
            ps.setString(2, bean.getBranch());
            ps.setString(3, bean.getLocation());
            ps.setInt(4, bean.getBranchCode());

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

    public BranchBean getBranch(int BranchCode) {

        BranchBean bb = new BranchBean();
        String query = "SELECT * FROM Branches WHERE Branch_Code = ? ";
        PreparedStatement ps = null;
        ResultSet rs = null;
        connect = pc.getNewConnection();

        try {

            ps = connect.prepareStatement(query);

            ps.setInt(1, BranchCode);
            rs = ps.executeQuery();

            if (rs.next()) {

                bb.setBranchCode(rs.getInt("Branch_Code"));
                bb.setBankCode(rs.getInt("Bank_Code"));
                bb.setBranch(rs.getString("Branch"));
                bb.setLocation(rs.getString("Location"));

            }

        } catch (Exception e) {
            Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return bb;
    }

    public List<BranchBean> getBranches() {

        List<BranchBean> branchBean = new ArrayList<>();

        String query = "SELECT * FROM Branches";
        Statement s = null;
        ResultSet rs = null;
        connect = pc.getNewConnection();

        try {

            s = connect.createStatement();

            rs = s.executeQuery(query);
            while (rs.next()) {

                BranchBean bbean = new BranchBean();
                bbean.setBranchCode(rs.getInt("Branch_Code"));
                bbean.setBankCode(rs.getInt("Bank_Code"));
                bbean.setBranch(rs.getString("Branch"));
                bbean.setLocation(rs.getString("Location"));
                branchBean.add(bbean);

            }

        } catch (Exception e) {
            Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return branchBean;
    }

    public List<String> getBranchCodes() {

        List<String> branchcodes = new ArrayList<>();

        String query = "SELECT * FROM Branches";
        Statement s = null;
        ResultSet rs = null;
        connect = pc.getNewConnection();

        try {

            s = connect.createStatement();

            rs = s.executeQuery(query);
            while (rs.next()) {

                String branchCode = String.valueOf(rs.getInt("Branch_Code"));
                String branch = rs.getString("Branch");
                String branchData = branchCode + ":" + branch;
                branchcodes.add(branchData);

            }
        } catch (Exception e) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return branchcodes;
    }

    public static void main(String[] args) {

        BranchDAO bdao = new BranchDAO();
//          BranchBean bb = new BranchBean();
//          
//          bb.setBranchCode("6283619");
//          bb.setBankCode("2692634");
//          bb.setBranch("Lagos");
//          bb.setLocation("Opebi");
//        
//          int status = bdao.addBranch(bb);
//          System.out.println("Status = " + status);
        //int status = bdao.deleteBranch(bb);
        //System.out.println("Status = " + status);
        //int status = bdao.updateBranch(bb);
        //System.out.println("Status = " + status);

//          BranchBean bb = bdao.getBranch("756124");
//        
//        System.out.println("Branch Code: " + bb.getBranchCode());
//        System.out.println("Bank Code: " + bb.getBankCode());
//        System.out.println("Branch: " + bb.getBranch());
//        System.out.println("Location: " + bb.getLocation());
//        List<BranchBean> bbean = bdao.getBranches();
//        for (BranchBean bb : bbean) {
//
//            System.out.println("Branch Code: " + bb.getBranchCode());
//            System.out.println("Bank Code: " + bb.getBankCode());
//            System.out.println("Branch: " + bb.getBranch());
//            System.out.println("Location: " + bb.getLocation());
//
//            System.out.println("********************************************");
//        }
        List<String> codes = bdao.getBranchCodes();
        for (String code : codes) {

            System.out.println("Branch Code: " + code);

//            System.out.println("********************************************");
        }
    }

}
