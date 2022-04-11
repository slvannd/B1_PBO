/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST3;

/**
 *
 * @author MSI Gaming
 */
public class DataPelanggan {

    private String id_pelanggan;
    private String nama_pelanggan;
    private String jenis_kelamin;
    private String alamat_pelanggan;
    private String nohp;
    DataPelanggan(String id_pelanggan, String nama_pelanggan, String jenis_kelamin, String alamat_pelanggan, String nohp){
        this.id_pelanggan = id_pelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat_pelanggan = alamat_pelanggan;
        this.nohp = nohp;
        
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
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
}


