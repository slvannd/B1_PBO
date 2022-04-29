/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Asus
 */
class Buy extends Market {

    //sub-class beli dari market
    private int quantity;

    public Buy(int quantity, int no, String nama, String jenis, int price, String game) {
        super(no, nama, jenis, price, game);
        this.quantity = quantity;
    }

    public Buy() {
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
        System.out.println("Barang ditambahkan ke dalam Daftar Pembelian");
    }

    @Override
    public void barangGagal() {
        System.out.println("Barang dihapus dari Daftar Pembelian ");
    }

    @Override
    public void barangDiubah() {
        System.out.println("Barang dalam daftar pembelian telah diupdate ");
    }
}
