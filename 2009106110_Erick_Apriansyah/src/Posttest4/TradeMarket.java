/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Asus
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TradeMarket {

    Scanner Masukkan = new Scanner(System.in);
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(input);

    public void tambahData(ArrayList<Sell> sl) throws IOException {
        clearScreen();

        int nobar;
        String nabar;
        String jebar;
        int habar;
        String asbar;
        int jubar;

        System.out.print("No.Barang         : ");
        nobar = Integer.parseInt(br.readLine());
        System.out.print("Nama Barang        : ");
        nabar = br.readLine();
        System.out.print("Jenis Barang       : ");
        jebar = br.readLine();
        System.out.print("Harga Barang       : ");
        habar = Masukkan.nextInt();
        System.out.print("Asal Game          : ");
        asbar = br.readLine();
        System.out.print("Jumlah Barang      : ");
        jubar = Masukkan.nextInt();

        Sell sell = new Sell();
        sell.setQuantity(jubar);
        sell.setNo(nobar);
        sell.setNamaBarang(nabar);
        sell.setJenisBarang(jebar);
        sell.setHarga(habar);
        sell.setJenisGame(asbar);

        sl.add(sell);
        sell.barangSukes();
    }

    public void tambahData2(ArrayList<Buy> by) throws IOException {
        clearScreen();

        int nobar;
        String nabar;
        String jebar;
        int habar;
        String asbar;
        int jubar;

        System.out.print("No.Barang         : ");
        nobar = Integer.parseInt(br.readLine());
        System.out.print("Nama Barang        : ");
        nabar = br.readLine();
        System.out.print("Jenis Barang       : ");
        jebar = br.readLine();
        System.out.print("Harga Barang       : ");
        habar = Masukkan.nextInt();
        System.out.print("Asal Game          : ");
        asbar = br.readLine();
        System.out.print("Jumlah Barang      : ");
        jubar = Masukkan.nextInt();

        Buy buy = new Buy();
        buy.setQuantity(jubar);
        buy.setNo(nobar);
        buy.setNamaBarang(nabar);
        buy.setJenisBarang(jebar);
        buy.setHarga(habar);
        buy.setJenisGame(asbar);

        by.add(buy);
        buy.barangSukes();
    }

    public void ubahData(ArrayList<Sell> sl) throws IOException {
        clearScreen();

        int nobar;
        String nabar;
        String jebar;
        int habar;
        String asbar;
        int jubar;
        System.out.print("Pilih Indeks Barang yang ingin diubah : ");
        int pilihan = Masukkan.nextInt();
        System.out.println("====Data Sebelumnya====");
        System.out.println("No.Barang     : " + sl.get(pilihan).getNo());
        System.out.println("Nama Barang   : " + sl.get(pilihan).getNama());
        System.out.println("Jenis Barang  : " + sl.get(pilihan).getJenis());
        System.out.println("Harga Barang  : " + sl.get(pilihan).getPrice());
        System.out.println("Asal Game     : " + sl.get(pilihan).getGame());
        System.out.println("Jumlah Barang : " + sl.get(pilihan).getQuantity());
        System.out.println("");
        System.out.println("====Data Baru====");
        System.out.print("No.Barang         : ");
        nobar = Integer.parseInt(br.readLine());
        System.out.print("Nama Barang        : ");
        nabar = br.readLine();
        System.out.print("Jenis Barang       : ");
        jebar = br.readLine();
        System.out.print("Harga Barang       : ");
        habar = Masukkan.nextInt();
        System.out.print("Asal Game          : ");
        asbar = br.readLine();
        System.out.print("Jumlah Barang      : ");
        jubar = Masukkan.nextInt();

        sl.get(pilihan).setNo(nobar);
        sl.get(pilihan).setNamaBarang(nabar);
        sl.get(pilihan).setJenisBarang(jebar);
        sl.get(pilihan).setHarga(habar);
        sl.get(pilihan).setJenisGame(asbar);
        sl.get(pilihan).setQuantity(jubar);
        Sell sell = new Sell();
        sell.barangDiubah();
    }

    public void ubahData2(ArrayList<Buy> by) throws IOException {
        clearScreen();

        int nobar;
        String nabar;
        String jebar;
        int habar;
        String asbar;
        int jubar;
        System.out.print("Pilih Indeks Barang yang ingin diubah : ");
        int pilihan = Masukkan.nextInt();
        System.out.println("====Data Sebelumnya====");
        System.out.println("No.Barang     : " + by.get(pilihan).getNo());
        System.out.println("Nama Barang   : " + by.get(pilihan).getNama());
        System.out.println("Jenis Barang  : " + by.get(pilihan).getJenis());
        System.out.println("Harga Barang  : " + by.get(pilihan).getPrice());
        System.out.println("Asal Game     : " + by.get(pilihan).getGame());
        System.out.println("Jumlah Barang : " + by.get(pilihan).getQuantity());
        System.out.println("");
        System.out.println("====Data Baru====");
        System.out.print("No.Barang         : ");
        nobar = Integer.parseInt(br.readLine());
        System.out.print("Nama Barang        : ");
        nabar = br.readLine();
        System.out.print("Jenis Barang       : ");
        jebar = br.readLine();
        System.out.print("Harga Barang       : ");
        habar = Masukkan.nextInt();
        System.out.print("Asal Game          : ");
        asbar = br.readLine();
        System.out.print("Jumlah Barang      : ");
        jubar = Masukkan.nextInt();

        by.get(pilihan).setNo(nobar);
        by.get(pilihan).setNamaBarang(nabar);
        by.get(pilihan).setJenisBarang(jebar);
        by.get(pilihan).setHarga(habar);
        by.get(pilihan).setJenisGame(asbar);
        by.get(pilihan).setQuantity(jubar);
        Buy buy = new Buy();
        buy.barangDiubah();
    }

    public void hapusData(ArrayList<Sell> sl) {
        clearScreen();

        String hapus;
        System.out.print("Masukkan Indeks Barang yang ingin dihapus : ");
        hapus = Masukkan.next();
        sl.remove((int) Integer.valueOf(hapus));
        Sell sell = new Sell();
        sell.barangGagal();
    }

    public void hapusData2(ArrayList<Buy> by) {
        clearScreen();

        String hapus;
        System.out.print("Masukkan Indeks Barang yang ingin dihapus : ");
        hapus = Masukkan.next();
        by.remove((int) Integer.valueOf(hapus));
        Buy buy = new Buy();
        buy.barangGagal();
    }

    public void showData(ArrayList<Sell> sl) {
        clearScreen();

        for (int i = 0; i < sl.size(); i++) {
            System.out.println("|==================================|");
            System.out.println("Indeks Barang = " + i);
            System.out.println("No.Barang     = " + sl.get(i).getNo());
            System.out.println("Nama Barang   = " + sl.get(i).getNama());
            System.out.println("Jenis Barang  = " + sl.get(i).getJenis());
            System.out.println("Harga         = " + sl.get(i).getPrice());
            System.out.println("Asal Game     = " + sl.get(i).getGame());
            System.out.println("Jumlah Barang = " + sl.get(i).getQuantity());
            System.out.println("|==================================|");
        }
    }

    public void showData2(ArrayList<Buy> by) {
        clearScreen();
        for (int i = 0; i < by.size(); i++) {
            System.out.println("|==================================|");
            System.out.println("Indeks Barang = " + i);
            System.out.println("No.Barang     = " + by.get(i).getNo());
            System.out.println("Nama Barang   = " + by.get(i).getNama());
            System.out.println("Jenis Barang  = " + by.get(i).getJenis());
            System.out.println("Harga         = " + by.get(i).getPrice());
            System.out.println("Asal Game     = " + by.get(i).getGame());
            System.out.println("Jumlah Barang = " + by.get(i).getQuantity());
            System.out.println("|==================================|");
        }
    }

    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }
}
