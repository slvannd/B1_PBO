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
public class Pesanan extends Jasajahit{
    protected String id_pesanan;

    public Pesanan(String id_pesanan, String nama_pelanggan, String jenis_kelamin, String alamat_pelanggan, String nohp, String jenis_jahitan, String ukuran, String jenis_kain, String jumlah) {
        super(nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp, jenis_jahitan, ukuran, jenis_kain, jumlah);
        this.id_pesanan = id_pesanan;
    }
    
    final public String getId_pesanan(){
        return id_pesanan;
    }
    public void setId_pesanan(String id_pesanan){
        this.id_pesanan = id_pesanan;
    }
    public void display(){
        System.out.println("ID Pesanan      :" + this.id_pesanan);
        System.out.println("Jenis Jahitan   :" + this.jenis_jahitan);
        System.out.println("Ukuran          :" + this.ukuran);
        System.out.println("Jenis Kain      :" + this.jenis_kain);
        System.out.println("Jumlah Jahitan  :" + this.jumlah);
        this.menjahit();
    }
    @Override
    public void menjahit(){
        System.out.println("Pesanan : " + this.id_pesanan + "Sedang Proses Dijahit");
    }
}

