/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm052;


/**
 *
 * @author mughni
 */
public class rumahsakit {
        
    private String idDokter;
    private String nama;
    private String spesialis;
    private String alamat;
    private int umur;

    public rumahsakit() {
    }

    public rumahsakit(String idDokter, String nama, String spesialis, String alamat, int umur) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    void setumur(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
