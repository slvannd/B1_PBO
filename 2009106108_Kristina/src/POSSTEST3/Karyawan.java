/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSSTEST3;

/**
 *
 * @author ASUS
 */
public class Karyawan {
    private String nama;
    private String alamat;
    private int tahunlahir;
    private int tahunmasuk;
    private int gajipokok;
    
    
    public Karyawan(String Nama, String Alamat, int Tahunlahir, int Tahunmasuk, int Gajipokok){
        this.nama = Nama;
        this.alamat = Alamat;
        this.tahunlahir = Tahunlahir;
        this.tahunmasuk = Tahunmasuk;
        this.gajipokok = Gajipokok;
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTahunlahir() {
        return tahunlahir;
    }

    public void setTahunlahir(int tahunlahir) {
        this.tahunlahir = tahunlahir;
    }

    public int getTahunmasuk() {
        return tahunmasuk;
    }

    public void setTahunmasuk(int tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }
}
