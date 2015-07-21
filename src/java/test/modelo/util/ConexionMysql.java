/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TOSHIBA
 */
public class ConexionMysql {
    public static Connection conectar(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testprueba?zeroDateTimeBehavior=convertToNull","root","johann");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return conn;
    }
}
