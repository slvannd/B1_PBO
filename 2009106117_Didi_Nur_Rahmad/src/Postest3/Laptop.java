/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest3;

/**
 *
 * @author D I D I
 */
public class Laptop {
    private String merk;
    private String warna;
    private int harga;
    private int stok;
    

    //Constructor
    public Laptop(String merk, String warna, int harga, int stok) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
        this.stok = stok;
    }
   
    //Method
    void isiLaptop(){
        System.out.println("Data Laptop berhasil di Input");
    }
    void editLaptop(){
        System.out.println("Data Laptop berhasil di Ubah");
    }
    void hapusLaptop(){
        System.out.println("Data Laptop berhasil di Hapus");
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
