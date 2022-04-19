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
public class Keyboard extends GudangMSI {

    //Constructor
    public Keyboard(String nama, String warna, String stok, String harga) {
        super(nama, warna, stok, harga);
    }

    //Method
    @Override
    public void cabang(){
        System.out.println("\nData Keyboard Dari Distributor Pusat");
        System.out.println("----------------------------------------\n");
    }
    
    void isiKeyboard() {
        System.out.println("Data Keyboard berhasil di Input");
    }

    void editKeyboard() {
        System.out.println("Data Keyboard berhasil di Ubah");
    }

    void hapusKeyboard() {
        System.out.println("Data Keyboard berhasil di Hapus");
    }

}
