/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest1;

/**
 *
 * @author Asus
 */
public class Market {
    int no;
    String nama_barang;
    String jenis_barang;
    int harga;
    String jenis_game;

    Market(int no,String nama,String jenis,int price,String game){
        this.no = no;
        this.nama_barang = nama;
        this.jenis_barang=jenis;
        this.harga=price;
        this.jenis_game=game;
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

}
