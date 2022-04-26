/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

/**
 *
 * @author LENOVO
 */
public class GudangMSI {

    private String nama;
    private String warna;
    private String stok;
    private String harga;

    public GudangMSI(String nama, String warna, String stok, String harga) {
        this.nama = nama;
        this.warna = warna;
        this.stok = stok;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void cabang() {
        System.out.println("\n\t\tDistributor Pusat\n");
        System.out.println("=======================================");
    }
}
