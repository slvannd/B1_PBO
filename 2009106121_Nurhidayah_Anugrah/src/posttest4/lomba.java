/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author MSi-Modern
 */
public class lomba extends informasi {
    private int biayapendaftaran;
    
    public lomba(informasi informasi, int biayapendaftaran){
        super(informasi.getNamainfo(), informasi.getPenyelenggara(), informasi.getTanggal_pendaftaran(), informasi.getTanggal_penutupan());
        this.biayapendaftaran = biayapendaftaran;
    }

    
//    public lomba(){
//        this.biayapendaftaran = 0 ;
//    }

    public int getBiayapendaftaran() {
        return biayapendaftaran;
    }

    public void setBiayapendaftaran(int biayapendaftaran) {
        this.biayapendaftaran = biayapendaftaran;
    }
   
    
}