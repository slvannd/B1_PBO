/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Asus
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) throws IOException {

        TradeMarket tm = new TradeMarket();
        ArrayList<Sell> sl = new ArrayList<>();
        ArrayList<Buy> by = new ArrayList<>();
        Scanner Masukkan = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        while (true) {
            System.out.println("/======================\\");
            System.out.println(" Market Trade Community");
            System.out.println("\\======================/");
            System.out.println(" 1. Tambah Data");
            System.out.println(" 2. Hapus Data ");
            System.out.println(" 3. Ubah Data ");
            System.out.println(" 4. Lihat Data ");
            System.out.println(" 5. Keluar");
            System.out.println("\\=====================/");
            System.out.print("Masukkan Pilihanmu : ");
            int pilihan = Masukkan.nextInt();

            if (pilihan == 1) {
                System.out.println("/======================\\");
                System.out.println(" Market Trade Community");
                System.out.println("\\======================/");
                System.out.println(" 1. Tambah Data Penjualan");
                System.out.println(" 2. Tambah Data Pembelian");
                System.out.println("\\=====================/");
                System.out.print("Masukkan Pilihanmu : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    tm.tambahData(sl);
                } else if (pilih == 2) {
                    tm.tambahData2(by);
                }
            } else if (pilihan == 2) {
                System.out.println("/======================\\");
                System.out.println(" Market Trade Community");
                System.out.println("\\======================/");
                System.out.println(" 1. Hapus Data Penjualan");
                System.out.println(" 2. Hapus Data Pembelian");
                System.out.println("\\=====================/");
                System.out.print("Masukkan Pilihanmu : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    tm.hapusData(sl);
                } else if (pilih == 2) {
                    tm.hapusData2(by);
                }
            } else if (pilihan == 3) {
                System.out.println("/======================\\");
                System.out.println(" Market Trade Community");
                System.out.println("\\======================/");
                System.out.println(" 1. Ubah Data Penjualan");
                System.out.println(" 2. Ubah Data Pembelian");
                System.out.println("\\=====================/");
                System.out.print("Masukkan Pilihanmu : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    tm.ubahData(sl);
                } else if (pilih == 2) {
                    tm.ubahData2(by);
                }
            } else if (pilihan == 4) {
                System.out.println("/======================\\");
                System.out.println(" Market Trade Community");
                System.out.println("\\======================/");
                System.out.println(" 1. Lihat Data Penjualan");
                System.out.println(" 2. Lihat Data Pembelian");
                System.out.println("\\=====================/");
                System.out.print("Masukkan Pilihanmu : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    tm.showData(sl);
                } else if (pilih == 2) {
                    tm.showData2(by);
                }
            } else if (pilihan == 5) {
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                System.exit(0);
            }
        }
    }
}

