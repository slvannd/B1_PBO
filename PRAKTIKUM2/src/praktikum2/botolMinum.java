/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author MSI Gaming
 */
public class botolMinum {
    String merk;
    String warna;
    String bentuk;
    double berat;
    
    public botolMinum(String merk,String warna,String bentuk,double berat){
        this.merk = merk;
        this.warna = warna;
        this.bentuk = bentuk;
        this.berat = berat;
    }
    void menampungAir(){
        System.out.println("Menampung Air");
    }
    void menumpahkanAir(){
        System.out.println("Menumpahkan Air");
    }
    void meminumAir(){
        System.out.println("Meminum Air");
    }
}

