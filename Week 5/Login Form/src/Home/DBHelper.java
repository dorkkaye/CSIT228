/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Kaye P. Engbino
 * @version 1.0 
 * @Date 10 March 21
 */
public class DBHelper {
    Connection con = null;
    
    public void connectDB() throws Exception
    {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/dbTaskManager", "kaye", "database");
        
        System.out.println("Connected to the database");
    }
}
