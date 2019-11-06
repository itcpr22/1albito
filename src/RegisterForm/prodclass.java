/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegisterForm;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Home
 */
public class prodclass {
connection con = new connection();
    public int addProduct(String product_name, int quantity, Object price){
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url,con.Username,con.Password);
            
            String sql = "insert into product values(null,?,?,?);";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            
            String np = price.toString();
            float newprice = Float.parseFloat(np);
                    
            pstmt.setString(1, product_name);
            pstmt.setInt(2, quantity);
            pstmt.setFloat(3, newprice);
            
            r = pstmt.executeUpdate();
            //System.out.println(pstmt);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    int addQuantity(Object id, Object qty) {
        throw new UnsupportedOperationException("Not supported yet.");
}
    }

