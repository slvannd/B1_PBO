/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

/**
 *
 * @author RIRI-CHAN
 */
public class tas {
    private int kode;
    private String tgl;
    private String namaTas;
    private String brand;
    private String tujuan;
    private String status;
    
//    metode khusus
    tas(int kode, String namaTas, String brand, String status, String tujuan, String tgl){
        this.kode = kode;
        this.namaTas = namaTas;
        this.brand = brand;
        this.tujuan = status;
        this.tujuan = tujuan;
        this.tgl = tgl;
    }
   
//    metode
    
    public String getnamaTas(String namaTas) {
        return namaTas;
    }
    
    public void setnamaTas(String namaTas) {
        this.namaTas = namaTas;
    }

    public String getbrand(String brand) {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public int getkode() {
        return kode;
    }

    public void sekode(int kode) {
        this.kode = kode;
    }

    public String gettujuan(String tujuan) {
        return tujuan;
    }

    public void settujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String gettgl(String tgl) {
        return tgl;
    }

    public void settgl(String tgl) {
        this.tgl = tgl;
    }
}
