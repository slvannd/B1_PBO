/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Asus
 */
class Sell extends Market {

    //subu-class jual dari kelas market 
    private int quantity;

    public Sell(int quantity, int no, String nama, String jenis, int price, String game) {
        super(no, nama, jenis, price, game);
        this.quantity = quantity;
    }

    public Sell() {
        this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void barangSukes() {
        System.out.println("Barang ditambahkan ke dalam Daftar Penjualan");
    }

    @Override
    public void barangGagal() {
        System.out.println("Barang dihapus dari Daftar Penjualan");
    }

    @Override
    public void barangDiubah() {
        System.out.println("Barang dalam daftar penjualan telah diupdate ");
    }
}
