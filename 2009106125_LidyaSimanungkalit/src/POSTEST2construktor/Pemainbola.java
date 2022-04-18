/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST2construktor;

/**
 *
 * @author LENOVO
 */
public class Pemainbola {
     //atribut
    long no_punggung;
    String nama;
    String posisi;
    String status;
   
    //konstruktor
    public Pemainbola(long no_punggung, String nama, String posisi, String status){
        this.no_punggung = no_punggung;
        this.nama = nama;
        this.posisi = posisi;
        this.status = status;
    }

   
    //method
    void pemain1(){
        System.out.println("Bertugas Menjaga Gawang Agar Tidak Terbobol Oleh Musuh");
    }
    void pemain2(){
        System.out.println("Berperan Penting Saat Melakukan Serangan Ke Area Musuh");
    }
    
}
