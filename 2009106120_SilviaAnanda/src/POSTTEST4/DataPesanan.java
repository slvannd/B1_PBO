/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

/**
 *
 * @author MSI Gaming
 */
public class DataPesanan extends Jasajahit {
    public String id_pesanan;
    public String jenis_jahitan;
    public String ukuran;
    public String jenis_kain;
    public String jumlah;

    public DataPesanan(String id_pesanan, String jenis_jahitan, String ukuran, String jenis_kain, String jumlah) {
        this.id_pesanan = id_pesanan;
        this.jenis_jahitan = jenis_jahitan;
        this.ukuran = ukuran;
        this.jenis_kain = jenis_kain;
        this.jumlah = jumlah;
    }

    public String getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(String id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public String getJenis_jahitan() {
        return jenis_jahitan;
    }

    public void setJenis_jahitan(String jenis_jahitan) {
        this.jenis_jahitan = jenis_jahitan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getJenis_kain() {
        return jenis_kain;
    }

    public void setJenis_kain(String jenis_kain) {
        this.jenis_kain = jenis_kain;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
}
