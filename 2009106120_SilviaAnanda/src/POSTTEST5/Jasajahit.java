/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST5;

/**
 *
 * @author MSI Gaming
 */
public abstract class Jasajahit {
    protected String nama_pelanggan,jenis_kelamin,alamat_pelanggan,nohp,jenis_jahitan,ukuran,jenis_kain,jumlah;
    protected final int jumlahJahitan = 1;
    //abstract method
    public abstract void menjahit();

    public Jasajahit(String nama_pelanggan, String jenis_kelamin, String alamat_pelanggan, String nohp, String jenis_jahitan, String ukuran, String jenis_kain, String jumlah) {
        this.nama_pelanggan = nama_pelanggan;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat_pelanggan = alamat_pelanggan;
        this.nohp = nohp;
        this.jenis_jahitan = jenis_jahitan;
        this.ukuran = ukuran;
        this.jenis_kain = jenis_kain;
        this.jumlah = jumlah;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat_pelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamat_pelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
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


