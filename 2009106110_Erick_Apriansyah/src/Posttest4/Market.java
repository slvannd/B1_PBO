/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Asus
 */
public class Market {

    private int no;
    private String nama_barang;
    private String jenis_barang;
    private int harga;
    private String jenis_game;

    Market(int no, String nama, String jenis, int price, String game) {
        this.no = no;
        this.nama_barang = nama;
        this.jenis_barang = jenis;
        this.harga = price;
        this.jenis_game = game;
    }
    //Overloading
    Market() {
        this.no = 0;
        this.nama_barang = "";
        this.jenis_barang = "";
        this.harga = 0;
        this.jenis_game = "";
    }
    //Overloading
    Market(int no, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNo() {
        return no;
    }

    public String getNama() {
        return nama_barang;
    }

    public String getJenis() {
        return jenis_barang;
    }

    public int getPrice() {
        return harga;
    }

    public String getGame() {
        return jenis_game;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setJenisBarang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJenisGame(String jenis_game) {
        this.jenis_game = jenis_game;
    }

    public void barangSukes() {
        System.out.println("Barang ditambahkan ke dalam Daftar");
    }

    public void barangGagal() {
        System.out.println("Barang dihapus dari Daftar");
    }

    public void barangDiubah() {
        System.out.println("Barang dalam daftar telah diupdate ");
    }
}