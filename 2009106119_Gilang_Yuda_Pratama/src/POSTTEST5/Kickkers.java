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
abstract public class Kickkers { // agar class ini tidak bisa dijadikan objek
    protected final String Artikel; // keyword Final untuk mencegah variabel ini di ubah
    protected final String Warna; // keyword Final untuk mencegah variabel ini di ubah
    protected final String Harga; // keyword Final untuk mencegah variabel ini di ubah
    protected final int Total_brg; // keyword Final untuk mencegah variabel ini di ubah
    
//    public Kickkers(String Artikel, String Warna, String Harga, int Total_brg){
//        this.Artikel = Artikel;
//        this.Warna = Warna;
//        this.Harga = Harga;
//        this.Total_brg = Total_brg;
//    }
    
    public Kickkers(){
        this.Artikel = "";
        this.Warna = "";
        this.Harga = "";
        this.Total_brg = 0;
    }
    
    void tambahData(){
        System.out.println("Data Berhasil Ditambahkan di Kickkers !");
    }
    
    void ubahData(){
        System.out.println("Data Berhasil Diubah di Kickkers !");
    }
    
    void hapusData(){
        System.out.println("Data Berhasil Dihapus di Kickkers !");
    }
    
    protected void lihatData(){
        System.out.println("Lihat Data Berhasil di Kickkers !");
    }

    /**
     * @return the Artikel
     */
    protected abstract String getArtikel();

    /**
     * @param Artikel the Artikel to set
     */
    protected abstract void setArtikel(String Artikel);

    /**
     * @return the Warna
     */
    protected abstract String getWarna();

    /**
     * @param Warna the Warna to set
     */
    protected abstract void setWarna(String Warna);

    /**
     * @return the Harga
     */
    protected abstract String getHarga();

    /**
     * @param Harga the Harga to set
     */
    protected abstract void setHarga(String Harga);

    /**
     * @return the Total_brg
     */
    protected abstract int getTotal_brg();

    /**
     * @param Total_brg the Total_brg to set
     */
    protected abstract void setTotal_brg(int Total_brg);
}
