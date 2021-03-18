/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaye P. Engbino
 * $Date 11 Mar 21
 * @Version 1.0
 * 
 */
public class DBHelper {
    Connection con = null;
    Statement stmt = null;
    
    public void connectDB() throws Exception
    {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/dbTaskManager", "kaye", "kaye");
        System.out.println("Connected to the database");
    }

    public boolean insertRecordStudent(int idnum, String fname, String lname, String mname, String pword, int age, String uname, String email)
    {
        boolean flag = false;
        
        try {
            stmt = con.createStatement();
            String sql = "Insert into tblStudentInfo values ("+idnum+",'"+fname+"', '"+lname+"', '"+mname+"', '"+pword+"', "+age+", '"+uname+"', '"+email+"')";
        
            if(stmt.executeUpdate(sql) == 1);
                flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public boolean insertRecordTeacher(int idnum, String fname, String lname, String email, String uname, String pword, int age, String mname)
    {
        boolean flag = false;
        
        try {
            stmt = con.createStatement();
            String sql = "Insert into tblTeacherInfo values ("+idnum+",'"+fname+"', '"+lname+"', '"+email+"', '"+uname+"', '"+pword+"', "+age+", '"+mname+"')";
        
            if(stmt.executeUpdate(sql) == 1);
                flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet displayAllRecords()
    {
        ResultSet rs = null;
        
        try {
            stmt = con.createStatement();
            String sql = "Select * from tblStudentInfo";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public ResultSet displayByLastName(String lastname)
    {
        ResultSet rs = null;
        
        try {
            stmt = con.createStatement();
            String sql = "Select * from tblStudentInfo where lastname = '"+lastname+"'";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public void disconnectDB()
    {
        try {
            if (con != null)
                 con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
