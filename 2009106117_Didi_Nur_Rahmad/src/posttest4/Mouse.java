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
public class Mouse extends GudangMSI {

    //Constructor
    public Mouse(String nama, String warna, String stok, String harga) {
        super(nama, warna, stok, harga);

    }

    //Method
    @Override
    public void cabang() {
        System.out.println("\nData Mouse Dari Distributor Pusat");
        System.out.println("----------------------------------------\n");
    }

    void isiMouse() {
        System.out.println("Data Mouse berhasil di Input");
    }

    void editMouse() {
        System.out.println("Data Mouse berhasil di Ubah");
    }

    void hapusMouse() {
        System.out.println("Data Mouse berhasil di Hapus");
    }

}
