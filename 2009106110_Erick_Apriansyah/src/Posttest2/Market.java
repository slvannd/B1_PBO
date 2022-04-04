/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest2;

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

    Market(int no,String nama,String jenis,int price,String game){
        this.no = no;
        this.nama_barang = nama;
        this.jenis_barang=jenis;
        this.harga=price;
        this.jenis_game=game;
    }
    Market(){
        this.no = 0;
        this.nama_barang = "";
        this.jenis_barang="";
        this.harga=0;
        this.jenis_game="";
    }

    Market(int no, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getno(){
        return no;
    }
    public String getnama(){
        return nama_barang;
    }

    public String getjenis(){
        return jenis_barang;
    }

    public int getprice(){
        return harga;
    }
    public String getgame(){
        return jenis_game;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJenis_game(String jenis_game) {
        this.jenis_game = jenis_game;
    }
    public void BarangSukes(){
        System.out.println("Barang ditambahkan ke dalam Daftar");
    }
    public void BarangGagal(){
        System.out.println("Barang dihapus dari Daftar");
    }
    public void BarangDiubah(){
        System.out.println("Barang dalam daftar telah diupdate ");
    }
}
