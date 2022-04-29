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
public class pengiriman {
    public int no_kirim;
    public String nama_barang;
    public String ekspedisi;
    public String status_kirim;
    public Double berat_barang;
    public String tgl_kirim;
    
    public pengiriman(int no_kirim,String nama_barang, String ekspedisi, String status_kirim, double berat_barang, String tgl_kirim){
        this.no_kirim = no_kirim;
        this.nama_barang = nama_barang;
        this.ekspedisi = ekspedisi;
        this.status_kirim = status_kirim;
        this.berat_barang = berat_barang;
        this.tgl_kirim = tgl_kirim;
    }
    public pengiriman(){
        this.no_kirim = 0;
        this.nama_barang= "";
        this.ekspedisi = "";
        this.status_kirim = "";
        this.berat_barang = 0.0;
        this.tgl_kirim = "";
    }

    public int getNo_kirim() {
        return no_kirim;
    }

    public void setNo_kirim(int no_kirim) {
        this.no_kirim = no_kirim;
    }
    
    public String getEkspedisi() {
        return ekspedisi;
    }

    public void setEkspedisi(String ekspedisi) {
        this.ekspedisi = ekspedisi;
    }

    public String getStatus_kirim() {
        return status_kirim;
    }

    public void setStatus_kirim(String status_kirim) {
        this.status_kirim = status_kirim;
    }

    public Double getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(Double berat_barang) {
        this.berat_barang = berat_barang;
    }

    public String getTgl_kirim() {
        return tgl_kirim;
    }

    public void setTgl_kirim(String tgl_kirim) {
        this.tgl_kirim = tgl_kirim;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
}
