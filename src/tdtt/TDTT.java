/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdtt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author bvc
 */
public class TDTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectDB db=new ConnectDB();
        Connection cn=db.getConnectDB();
        Statement stm=null;
        ResultSet rs=null;
    }
    
}
