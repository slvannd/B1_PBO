/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSi-GAMING
 */
public class data {
    String a;
    String b;
    String c;
    int d;
    
    data(String artikel, String warna, String harga , int total_brg) {
        this.a = artikel;
        this.b = warna;
        this.c = harga;
        this.d = total_brg;
    }
    
    data(String jawab){
        this.a = jawab;
    }
    
    void dataDitambah(){
        System.out.println("Data Telah Ditambahkan !");
    }
    
    void dataDihapus(){
        System.out.println("Data Telah Dihapus !");
    }
    
    void dataDiubah(){
        System.out.println("Data Telah Diubah !");
    }
    
    void dataKosong(){
        System.out.println("Tidak Ada Data !");
    }
}
