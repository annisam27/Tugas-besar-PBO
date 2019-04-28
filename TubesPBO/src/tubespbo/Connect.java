/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LATHNETBOOK
 */
public class Connect {
    private static Connection conn;
    public static Connection getConnect() {
        String host = "jdbc:mysql://localhost/login",
        user = "root",
         pass = "";
       try{
           conn = (Connection) DriverManager.getConnection(host, user, pass);
       } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
       }
       return conn;
    }
}
