/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pindah;

/**
 *
 * @author RIRI-CHAN
 */
public class BendaSatu {
    private int jumlah;
    private int harga;
    private double berat;
    
    public BendaSatu(int jumlah, int harga, double berat){
        this.jumlah = jumlah;
        this.harga = harga;
        this.berat = berat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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
