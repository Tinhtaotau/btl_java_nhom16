/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdtt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 *
 * @author bvc
 */
public class ConnectDB {
    Connection cn=null;
     public Connection getConnectDB(){
        
        String url="jdbc:sqlserver://localhost;databaseName=QuanLyTTTDTT";
        
        String user="sa";
        String pass="123456789";
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             cn = DriverManager.getConnection(url,user,pass);
             System.out.println("ket noi thanh cong");
        }catch(Exception ex)
        {
             System.out.println("không thể kết nối đến database"+ex.toString());
        }
        return cn;
    }
}
