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
public class main {
    public static void main(String[] args) throws Exception {
     // Buat Object dari Class Spidol (instansiasi)  
    spidol spidolDidi = new spidol("hitam", "Snowman", 3.2, "Rp.10000");
    spidol spidolOliv = new spidol("pink", "Pilot", 2.1, "Rp.12000");
    
    //menampilkan property object spidol
    System.out.println(spidolDidi.Warna);
    System.out.println(spidolDidi.Merk);
    System.out.println(spidolDidi.Berat);
    System.out.println(spidolDidi.Harga);
    System.out.println("========================");
    System.out.println(spidolOliv.Warna);
    System.out.println(spidolOliv.Merk);
    System.out.println(spidolOliv.Berat);
    System.out.println(spidolOliv.Harga);
    
    //tampilkan hasil method object spidol
    spidolDidi.menggambarRumah();
    spidolDidi.MenulisKalimat();
    }
}
