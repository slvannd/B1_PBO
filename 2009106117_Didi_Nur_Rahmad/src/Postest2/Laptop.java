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
public class Laptop {
    public String merk;
    public String warna;
    public int harga;
    public int stok;
    

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
    
}
