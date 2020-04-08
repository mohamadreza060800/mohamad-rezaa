/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm052;

/**
 *
 * @author user
 */
public class ConnectMysql {
    rumahsakitDataSource datasource = new rumahsakitDataSource();
    public static void main(String[] args) {
        rumahsakitDataSource datasource = new rumahsakitDataSource();
        rumahsakit Rs =  new rumahsakit();
        Rs.setIdDokter("43A870081680082");
        Rs.setNama("Mughni Adinurhafiid");
        Rs.setSpesialis("Jantung");
        Rs.setAlamat("Cibitung, Bekasi");
        Rs.setumur("20");
        boolean sukses = datasource.insert(Rs);
        if(sukses){
            System.out.println("insert berhasil!");
        }else{
            System.out.println("insert gagal");
        }
    }

    private static class rumahsakitDatasource {

        public rumahsakitDatasource() {
        }
    }

    }

    

