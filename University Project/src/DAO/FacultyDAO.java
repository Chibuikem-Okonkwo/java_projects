package DAO;

import Beans.FacultyBean;
import CONN.JConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class  FacultyDAO {

    JConnect jc = new JConnect();
    Connection connect = null;
    PreparedStatement ps = null;
    
    public int addFaculty(FacultyBean bean){
        
        int status = -1;
        String query = "INSERT into faculty values (?, ?, ?, ?)";
        connect = jc.getNewConnection();
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getFacultyId());
            ps.setString(2, bean.getFacultyName());
            ps.setString(3, bean.getFacultyDesc());
            ps.setString(4, bean.getEntryDate());
            
            
            status = ps.executeUpdate();
            if (status == 1) {
                status = 0;
            }
            else{
                status = 1;
            } 
        } catch (Exception e) {
            Logger.getLogger(FacultyDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }
    
    public int updateFaculty(FacultyBean bean){
        
        int status = -1;
        String query = "UPDATE faculty set faculty_name = ?, faculty_desc = ? where faculty_id = ?";
        connect = jc.getNewConnection();
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, bean.getFacultyName());
            ps.setString(2, bean.getFacultyDesc());
            ps.setString(3, bean.getFacultyId());
            
            status = ps.executeUpdate();
            if (status == 1) {
                status = 0;
            }
            else{
                status = 1;
            } 
        } catch (Exception e) {
            Logger.getLogger(FacultyDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }
    
    public int deleteFaculty(String facultyId){
        
        int status = -1;
        String query = "DELETE from faculty where faculty_id = ?";
        connect = jc.getNewConnection();
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, facultyId);
            
            status = ps.executeUpdate();
            if (status == 1) {
                status = 0;
            }
            else{
                status = 1;
            } 
        }
        catch (Exception e) {
            Logger.getLogger(FacultyDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }
    
    public FacultyBean getFacultyRecord(String facultyId){
        
        FacultyBean fb = new FacultyBean();
        String query = "SELECT * from faculty where faculty_id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        connect = jc.getNewConnection();
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, facultyId);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                fb.setFacultyId(rs.getString("faculty_id"));
                fb.setFacultyName(rs.getString("faculty_name"));
                fb.setFacultyDesc(rs.getString("faculty_dsc"));
                fb.setEntryDate(rs.getString("entry_date"));
            }
            
        } catch (Exception e) {
            Logger.getLogger(FacultyDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return fb;
    }
    
    public List<FacultyBean> getFaculties(){
        
        List <FacultyBean> fbean = new ArrayList <>();
        String query = "SELECT * from faculty";
        Statement s = null;
        ResultSet rs = null;
        connect = jc.getNewConnection();
        
        try {
            s = connect.createStatement();
            rs = s.executeQuery(query);
            
            while (rs.next()) {
                FacultyBean fb = new FacultyBean();
                fb.setFacultyId(rs.getString("faculty_id"));
                fb.setFacultyName(rs.getString("faculty_name"));
                fb.setFacultyDesc(rs.getString("faculty_dsc"));
                fb.setEntryDate(rs.getString("entry_date"));
                fbean.add(fb);
            }
            
        } catch (Exception e) {
            Logger.getLogger(FacultyDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return fbean;
    }
    
    public static void main(String [] args){
        
        FacultyDAO fdao = new FacultyDAO();
       // FacultyBean fb = new FacultyBean();
        
//        fb.setFacultyId("004");
//        fb.setFacultyName("Education");
//        fb.setFacultyDesc("Faculty of Education");
//        fb.setEntryDate("2021/07/26");
        
//        int status = fdao.addFaculty(fb);
//        System.out.println("Status: "+status);
        
//        int status = fdao.updateFaculty(fb);
//        System.out.println("Status: "+status);
        
//        int status = fdao.deleteFaculty("004");
//        System.out.println("Status: "+status);

//        FacultyBean fb = fdao.getFacultyRecord("001");
//        System.out.println("Faculty ID: "+fb.getFacultyId());
//        System.out.println("Faculty Name: "+fb.getFacultyName());
//        System.out.println("Faculty Description: "+fb.getFacultyDesc());
//        System.out.println("Entry Date: "+fb.getEntryDate());

        List<FacultyBean> bean = fdao.getFaculties();
        for (FacultyBean fb : bean) {
            
            System.out.println("Faculty ID: "+fb.getFacultyId());
            System.out.println("Faculty Name: "+fb.getFacultyName());
            System.out.println("Faculty Description: "+fb.getFacultyDesc());
            System.out.println("Entry Date: "+fb.getEntryDate());
            
            System.out.println("*********************************************");
        }
        
    } 
            
}
