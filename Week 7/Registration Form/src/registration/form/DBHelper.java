/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.form;

import java.sql.Connection;
import java.sql.DriverManager;
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
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/dtTaskManager", "kaye", "kaye");
        System.out.println("Connected to the database");
    }

    public boolean insertRecord(int idnum, String fname, String lname, String mname, String email, String uname, String pword, int birthdate)
    {
        boolean flag = false;
        
        try {
            stmt = con.createStatement();
            String sql = "Insert into tblStudentInfo values ("+idnum+",'"+fname+"', '"+lname+"', '"+mname+"', '"+email+"', '"+uname+"', '"+pword+"', "+birthdate+")";
        
            if(stmt.executeUpdate(sql) == 1);
                flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
}
