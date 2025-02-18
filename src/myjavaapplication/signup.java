/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavaapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class signup {
     public static Connection getConnection() throws ClassNotFoundException, SQLException{
        
        Connection con=null;
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
    
        
    
    }
        
         return con;
    }
    
    
    
    
    
}
