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
public class Mouse {
    private String merk;
    private String warna;
    private int stok;
    private int harga;

    //Constructor
    public Mouse(String merk, String warna, int stok, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.stok = stok; 
        this.harga = harga;
    }
    
    //Method
    void isiMouse(){
        System.out.println("Data Mouse berhasil di Input");
    }
    void editMouse(){
        System.out.println("Data Mouse berhasil di Ubah");
    }
    void hapusMouse(){
        System.out.println("Data Mouse berhasil di Hapus");
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
