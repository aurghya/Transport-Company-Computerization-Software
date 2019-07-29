/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aurghya Maity
 */
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/TransportCompany","manager","admin");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
