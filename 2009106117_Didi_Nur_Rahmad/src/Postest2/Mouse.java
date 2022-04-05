/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest2;

/**
 *
 * @author D I D I
 */
public class Mouse {
    public String merk;
    public String warna;
    public int stok;
    public int harga;

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
}
