/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST5;

/**
 *
 * @author MSi-GAMING
 */
public class Sepatu extends Kickkers{
    private String Artikel;
    private String Warna;
    private String Harga;
    private int Total_brg;

    public Sepatu(String Artikel, String Warna, String Harga, int Total_brg) {
//        super(Artikel, Warna, Harga, Total_brg);
        this.Artikel = Artikel;
        this.Warna = Warna;
        this.Harga = Harga;
        this.Total_brg = Total_brg;
    }
    
    public Sepatu(){
        this.Artikel = "";
        this.Warna = "";
        this.Harga = "";
        this.Total_brg = 0;
    }
    
    @Override
    void tambahData(){
        System.out.println("Data Berhasil Ditambahkan di Sepatu Kickkers !");
    }
    
    @Override
    void ubahData(){
        System.out.println("Data Berhasil Diubah di Sepatu Kickkers !");
    }
    
    @Override
    void hapusData(){
        System.out.println("Data Berhasil Dihapus di Sepatu Kickkers !");
    }
    
    @Override
    protected void lihatData(){
        System.out.println("Lihat Data Berhasil di Sepatu Kickkers !");
    }

    @Override
    protected String getArtikel() {
        return Artikel;
    }

    @Override
    protected void setArtikel(String Artikel) {
        this.Artikel = Artikel;
    }

    @Override
    protected String getWarna() {
        return Warna;
    }

    @Override
    protected void setWarna(String Warna) {
        this.Warna = Warna;
    }

    @Override
    protected String getHarga() {
        return Harga;
    }
    
    @Override
    protected void setHarga(String Harga) {
        this.Harga = Harga;
    }

    @Override
    protected int getTotal_brg() {
        return Total_brg;
    }

    @Override
    protected void setTotal_brg(int Total_brg) {
        this.Total_brg = Total_brg;
    }
}
