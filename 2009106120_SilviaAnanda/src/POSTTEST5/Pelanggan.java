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
public class Pelanggan extends Jasajahit {
    protected String id_pelanggan;

    public Pelanggan(String id_pelanggan, String nama_pelanggan, String jenis_kelamin, String alamat_pelanggan, String nohp, String jenis_jahitan, String ukuran, String jenis_kain, String jumlah) {
        super(nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp, jenis_jahitan, ukuran, jenis_kain, jumlah);
        this.id_pelanggan = id_pelanggan;
    }
    

    

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }
    public void display(){
        System.out.println("ID pelanggan           : " + this.id_pelanggan);
        System.out.println("Jenis Kelamin          : " + this.jenis_kelamin);
        System.out.println("Nama Pelanggan         : " + this.nama_pelanggan);
        System.out.println("Alamat                 : " + this.alamat_pelanggan);
        System.out.println("No HP Pelanggan        : " + this.nohp);
    }
    @Override
    public void menjahit(){
        System.out.println("Pelanggan   : " + this.nama_pelanggan + "Sedang Proses Dijahit");
    }       
}
