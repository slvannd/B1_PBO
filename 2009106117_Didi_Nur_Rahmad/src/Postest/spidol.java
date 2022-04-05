/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest;

/**
 *
 * @author D I D I
 */
class spidol {
    //property
    String Warna;
    String Merk;
    double Berat;
    String Harga;
    
    //method khusus
    public spidol(String Warna, String Merk, double Berat, String Harga){
        this.Warna = Warna;
        this.Merk = Merk;
        this.Berat = Berat;
        this.Harga = Harga;
    }
   //method
    void menggambarRumah(){
        System.out.println("Spidol Membuat Gambar Rumah");
        
    }
    //method
    void MenulisKalimat(){
        System.out.println("Spidol Menuliskan Sebuah Kalimat");
    }
}
 
