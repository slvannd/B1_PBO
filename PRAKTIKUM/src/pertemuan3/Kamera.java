/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author MSI Gaming
 */
public class Kamera {
    private String merk;
    private String warna;
    private double berat;
    private int harga;
    private int jumlahTombol;
    private int ukuranLensa;
    
    Kamera(String merk, String warna, double berat, int harga, int jumlahTombol, int ukuranLensa){
        this.merk = merk;
        this.warna = warna;
        this.berat = berat;
        this.harga = harga;
        this.jumlahTombol = jumlahTombol;
        this.ukuranLensa = ukuranLensa;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahTombol() {
        return jumlahTombol;
    }

    public void setJumlahTombol(int jumlahTombol) {
        this.jumlahTombol = jumlahTombol;
    }

    public int getUkuranLensa() {
        return ukuranLensa;
    }

    public void setUkuranLensa(int ukuranLensa) {
        this.ukuranLensa = ukuranLensa;
    }
    
}