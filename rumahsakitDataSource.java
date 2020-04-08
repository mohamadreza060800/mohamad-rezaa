/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm052;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.xml.transform.Result;
import java.util.ArrayList;

public class  rumahsakitDataSource{
    private Connection connection ;

public rumahsakitDataSource() {
    connection = koneksiRumahSakit.getConnection(); 
}
 
public List<rumahsakit> getALL(){
    List<rumahsakit> list = new ArrayList<>();
    String sql = "Select*FROM rumahsakit ";
    try {
        PreparedStatement statment = connection.prepareStatement(sql);
        ResultSet rs  = statment.executeQuery();
        rumahsakit Rs;
        while (rs.next()){
            Rs = new rumahsakit ();
            Rs.setIdDokter(rs.getString("iddokter"));
            Rs.setNama(rs.getString("nama"));
            Rs.setSpesialis(rs.getString("spesialis"));
            Rs.setAlamat(rs.getString("alamat"));
            Rs.setumur(rs.getString("umur"));
            list.add(Rs);
            
        } 
    } catch (Exception e) {
        System.out.println("Error get All "+ e.getMessage());
    }
    return list ;
}

public rumahsakit getByID(String nim){
    String sql = "SELECT * FROM  rumahsakit WHERE iddokter =?";
    rumahsakit Rs = null ;
    try {
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nim);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            Rs = new rumahsakit ();
            statement.setString(1, Rs.getIdDokter());
            statement.setString(2, Rs.getNama());
            statement.setString(3, Rs.getSpesialis());
            statement.setString(4, Rs.getAlamat());
            statement.setInt(6, Rs.getUmur());
            int result = statement.executeUpdate();
        }
    } catch (Exception e) {
    }
    return Rs ;
    
}

    public boolean insert (rumahsakit Rs){
        boolean status = false ;
        String sql = " INSERT INTO  rumahsakit Values(?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Rs.getIdDokter());
            statement.setString(2, Rs.getNama());
            statement.setString(3, Rs.getSpesialis());
            statement.setString(4, Rs.getAlamat());
            statement.setInt(6, Rs.getUmur());
            int result = statement.executeUpdate();
            status = result > 0 ;
        } catch (Exception e) {
        }
        return status;
    }
    public boolean update (rumahsakit Rs){
        boolean status = false ;
        String sql = " UPDATE rumahsakit SET nama=?,spesialis=?,alamat=?,umur=?"
                +"WHERE iddokter =?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Rs.getIdDokter());
            statement.setString(2, Rs.getNama());
            statement.setString(3, Rs.getSpesialis());
            statement.setString(4, Rs.getAlamat());
            statement.setInt(6, Rs.getUmur());
            int result = statement.executeUpdate();
            status = result > 0 ;
        } catch (Exception e) {
        }
        return status;
    }
    public boolean delete (rumahsakit Rs){
        boolean status = false ;
        String sql = " DELETE FROM rumahsakit WHERE nim =?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);            
            statement.setString(1, Rs.getIdDokter());
            int result = statement.executeUpdate();
            status = result > 0 ;
        } catch (Exception e) {
        }
        return status;
    }}
    

