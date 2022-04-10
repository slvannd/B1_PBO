/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpraktikum3;

/**
 *
 * @author MSI Gaming
 */
public class Laptop {
    private String merk;
    private String warna;
    private String bentuk;
    private int harga;
    private double berat;

    Laptop(String merk, String warna, String bentuk, int harga, double berat){
        this.merk = merk;
        this.warna = warna;
        this.bentuk = bentuk;
        this.harga = harga;
        this.berat = berat;
        
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

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
}
