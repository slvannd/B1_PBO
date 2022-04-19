/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

/**
 *
 * @author D I D I
 */
public class Laptop extends GudangMSI {

    //Constructor
    public Laptop(String nama, String warna, String stok, String harga) {
        super(nama, warna, stok, harga);
    }

    @Override
    public void cabang() {
        System.out.println("\nData Laptop Dari Distributor Pusat");
        System.out.println("----------------------------------------\n");
    }

    //Method
    void isiLaptop() {
        System.out.println("Data Laptop berhasil di Input");
    }

    void editLaptop() {
        System.out.println("Data Laptop berhasil di Ubah");
    }

    void hapusLaptop() {
        System.out.println("Data Laptop berhasil di Hapus");
    }

}
