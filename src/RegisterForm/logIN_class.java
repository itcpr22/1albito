/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegisterForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class logIN_class {
    connection con = new connection();
    String username = "";
     String password = "";
    
    
    public int login(String Username, String Password){
         
        int x = 0;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url,con.Username,con.Password);
            
            String sql = "SELECT * FROM `regtbl` WHERE Username = ? AND Password = MD5(?);";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            
            pstmt.setString(1, Username);
            pstmt.setString(2, Password);
            
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                username = rs.getString("username");
                x = 1;
            }else{
                x = 0;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(logIN_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(logIN_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
    } 
    
}
