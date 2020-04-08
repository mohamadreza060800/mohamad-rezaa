/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm052;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class koneksiRumahSakit {
    public static Connection connection ;
    static {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName  ("127.0.0.1");
        ds.setDatabaseName ("jdbc:mysql://localhost:3306/rumahsakit?");
        ds.setUser ("root");
        ds.setPassword ("");
        String drive = "com.mysql.jdbc.Driver";
        
        try {
            connection = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(koneksiRumahSakit.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public static Connection getConnection(){
        return connection ;
    }}

    

