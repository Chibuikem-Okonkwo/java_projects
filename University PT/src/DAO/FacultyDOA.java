/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.FacultyBean;
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
 * @author Tony
 */
public class FacultyDOA {

    JConnect jc = new JConnect();
    Connection conn = null;
    PreparedStatement ps = null;

    public FacultyDOA() {
    }

    public int addFaculty(FacultyBean fbean) {

        int status = -1;
        String query = "INSERT INTO faculties values (?,?,?,?)";
        conn = jc.getNewConnection();

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, fbean.getFacultyId());
            ps.setString(2, fbean.getFacultyName());
            ps.setString(3, fbean.getFacultyDesc());
            ps.setString(4, fbean.getEntryDate());

            status = ps.executeUpdate();

            if (status == 1) {
                status = 0;
            } else {
                status = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FacultyDOA.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int updateFaculty(FacultyBean fbean) {

        int status = -1;
        //faculty_id = ?,
        String query = "UPDATE faculties SET faculty_name =?, faculty_desc =?, entry_date = ? WHERE faculty_id = ?";
        conn = jc.getNewConnection();

        try {
            ps = conn.prepareStatement(query);
//          ps.setString(1,fbean.getFacultyId());
            ps.setString(1, fbean.getFacultyName());
            ps.setString(2, fbean.getFacultyDesc());
            ps.setString(3, fbean.getEntryDate());
            ps.setString(4, fbean.getFacultyId());

            status = ps.executeUpdate();

            if (status == 1) {
                status = 0;
            } else {
                status = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FacultyDOA.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int deleteFaculty(FacultyBean fbean) {

        int status = -1;
        String query = "DELETE FROM faculties where faculty_id = ? ";
        conn = jc.getNewConnection();

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, fbean.getFacultyId());

            status = ps.executeUpdate();

            if (status == 1) {
                status = 0;
            } else {
                status = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FacultyDOA.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public FacultyBean getFacultyRecord(String facultyId) {

        FacultyBean fbean = new FacultyBean();
        //int status = -1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connect = null;
        
        String query = "SELECT * FROM faculties WHERE faculty_id = ?";
        connect = jc.getNewConnection();

        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, facultyId);

            rs = ps.executeQuery();
            if (rs.next()) {
                fbean.setFacultyId(rs.getString("faculty_id"));
                fbean.setFacultyName(rs.getString("faculty_name"));
                fbean.setFacultyDesc(rs.getString("faculty_desc"));
                fbean.setEntryDate(rs.getString("entry_date"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FacultyDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fbean;
    }
    
    public List<FacultyBean> getFacultiesRecords(){
        
        List<FacultyBean> faculties = new ArrayList<>();
        
        Statement smt = null;
        Connection conn = null;
        ResultSet rs = null;
        
        String query = "Select * from faculties";
        conn = jc.getNewConnection();
        
        try {
            smt = conn.createStatement();
            rs = smt.executeQuery(query);
            
            while (rs.next()) {
                FacultyBean fbean = new FacultyBean();
                fbean.setFacultyId(rs.getString("faculty_id"));
                fbean.setFacultyName(rs.getString("faculty_name"));
                fbean.setFacultyDesc(rs.getString("faculty_desc"));
                fbean.setEntryDate(rs.getString("entry_date"));
                
                faculties.add(fbean);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FacultyDOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return faculties;
    }

    public static void main(String[] args) {
        FacultyDOA fdoa = new FacultyDOA();
        FacultyBean fbean = new FacultyBean();

//      fbean.setFacultyId("f007");
//      fbean.setFacultyName("Art");
//      fbean.setFacultyDesc("Faculty of Art");
//      fbean.setEntryDate("2018-02-22");
//      
//      int status = fdoa.addFaculty(fbean);
//      System.out.println("status: " + status);
        //fbean.setFacultyId("f005");
//      fbean.setFacultyName("Education");
//      fbean.setFacultyDesc("Faculty of Education");
//      fbean.setEntryDate("2020-07-24");
//      fbean.setFacultyId("f009");
//      
//      int status = fdoa.updateFaculty(fbean);
//      System.out.println("status: " + status);
//      fbean.setFacultyId("f008");
//      
//      int status = fdoa.deleteFaculty(fbean);
//      System.out.println("status: " + status);
//        FacultyBean fb = fdoa.getFacultyRecord("F009");
//        System.out.println("Faculty Id: " + fb.getFacultyId());
//        System.out.println("Faculty Name: " + fb.getFacultyName());
//        System.out.println("Faculty Desc: " + fb.getFacultyDesc());
//        System.out.println("Entry Date: " + fb.getEntryDate());

        List<FacultyBean> faculties = fdoa.getFacultiesRecords();
        for(FacultyBean faculty : faculties)
        {
            System.out.println("");
            System.out.println("Faculty Id: " + faculty.getFacultyId());
            System.out.println("Faculty Name: " + faculty.getFacultyName());
            System.out.println("Faculty Desc: " + faculty.getFacultyDesc());
            System.out.println("Entry Date: " + faculty.getEntryDate());
        }
    }

}
