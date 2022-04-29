/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest2;

import Postest3.*;

/**
 *
 * @author D I D I
 */
public class Keyboard {
    public String merk;
    public String warna;
    public int stok;
    public int harga;
    
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
}
