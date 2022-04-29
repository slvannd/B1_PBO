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
public class Keyboard {
    private String merk;
    private String warna;
    private int stok;
    private int harga;
    
    //Constructor
    public Keyboard(String merk, String warna, int stok, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.stok = stok;
        this.harga = harga;
    }
    
    //Method
    void isiKeyboard(){
        System.out.println("Data Keyboard berhasil di Input");
    }
    void editKeyboard(){
        System.out.println("Data Keyboard berhasil di Ubah");
    }
    void hapusKeyboard(){
        System.out.println("Data Keyboard berhasil di Hapus");
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

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
