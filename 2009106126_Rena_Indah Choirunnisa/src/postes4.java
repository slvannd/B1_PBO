import java.io.IOException;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rena Indah C
 */
public class postes4 {
    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    String inputuser;
    boolean lanjut= true;

    while (lanjut) {
    System.out.println("Persediaan Benih Sayuran Koperasi UD Jaya");
    System.out.println("1. Lihat Persediaan Benih Sayuran");
    System.out.println("2. Tambah Data Persediaan Benih Sayuran");
    System.out.println("3. Ubah Data Persediaan Benih Sayuran");
    System.out.println("4. Hapus Data Persediaan Benih Sayuran");

    System.out.print("Masukkan Pilihan Anda : ");
    inputuser = input.next();

    switch (inputuser) {
        case "1":
            System.out.println("Data Seluruh Benih Sayuran");
            break;
        case "2":
            System.out.println("Tambah Data");
            break;

        case "3":
            System.out.println("Ubah Data");
            break;
        case "4":
            System.out.println("Hapus Data");
            break;
        default:
            System.out.println("Pilihan Tidak Ditemukan");
    }

}
        
}
}
