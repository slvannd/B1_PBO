/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author MSi-Modern
 */
public class informasi {
    String namainfo;
    String penyelenggara;
    int tanggal_pendaftaran;
    int tangga_penutupan;
    
    informasi(String namainfo, String penyelenggara, int tanggal_pendaftaran, int tanggal_penutupan){
     this.namainfo = namainfo;
     this.penyelenggara = penyelenggara;
     this.tanggal_pendaftaran = tanggal_pendaftaran;
     this.tangga_penutupan = tanggal_penutupan;
    }
    
    void display(){
        System.out.println("Nama Informasi: " + this.namainfo + "\nPenyelenggara: " + this.penyelenggara + "Tanggal Pendaftaran: " + this.tanggal_pendaftaran + "Tanggal Penutupan: " + this.tangga_penutupan);
    }
    
}
