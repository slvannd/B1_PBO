/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {

        TradeMarket tm = new TradeMarket();
        ArrayList<Market> data = new ArrayList<>();
        Scanner Masukkan = new Scanner(System.in);

        int Ngulang = 1;
        while (Ngulang == 1) {
            System.out.println("/======================\\");
            System.out.println(" Market Trade Community");
            System.out.println("\\======================/");
            System.out.println(" 1. Tambah Data");
            System.out.println(" 2. Hapus Data ");
            System.out.println(" 3. Ubah Data ");
            System.out.println(" 4. Lihat Data ");
            System.out.println(" 5. Keluar");
            System.out.println("\\=====================/");
            int pilih;
            System.out.print("Masukkan Pilihanmu : ");
            pilih = Masukkan.nextInt();
            if (pilih == 1) {
                tm.TambahData(data);
            } else if (pilih == 2) {
                tm.HapusData(data);
            } else if (pilih == 3) {
                tm.UbahData(data);
            } else if (pilih == 4) {
                tm.ShowData(data);
            } else if (pilih == 5) {
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                System.exit(0);
            }

        }
    }
}
