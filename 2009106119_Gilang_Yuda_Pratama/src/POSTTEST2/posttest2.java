package POSTTEST2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class posttest2 {

    static ArrayList<String> artikel;
    static ArrayList<String> warna;
    static ArrayList<String> harga;
    static ArrayList<Integer> totalbrg;
    static boolean isEditing = false;
    static Scanner input;

    public static void main(String[] args) {
        // initialize
        artikel = new ArrayList<>();
        warna = new ArrayList<>();
        harga = new ArrayList<>();
        totalbrg = new ArrayList<>();
        input = new Scanner(System.in);

        // run the program
        while (true) {
            showMenu();
        }
    }

    static void clearScreen() {
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

    static void showMenu() {
        System.out.println("APLIKASI PENGELOLAAN DATA SEPATU BRAND KICKERS");
        System.out.println("      MATAHARI MALL LEMBUSWANA SAMARINDA      ");
        System.out.println("==============================================");
        System.out.println("[1] Lihat data barang");
        System.out.println("[2] Tambah data barang");
        System.out.println("[3] Edit data barang");
        System.out.println("[4] Hapus data baraang");
        System.out.println("[0] Keluar");
        System.out.println("----------------------------------------------");
        System.out.print("Pilih menu :  ");

        String pilih = input.nextLine();

        switch (pilih) {
            case "1":
                lihatdata();
                break;
            case "2":
                tambahdata();
                break;
            case "3":
                editdata();
                break;
            case "4":
                hapusdata();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Kamu salah pilih menu!");
                kembali();
                break;
        }
    }

    static void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void lihatdata() {
        clearScreen();
        if (artikel.size() > 0) {
            System.out.println("=============================================================");
            System.out.println("NO\tARTIKEL\t\tWARNA\t\tHARGA\t\tTOTAL");
            System.out.println("=============================================================");
            int index = 0;
            for (String a : artikel) {
                String b = warna.get(index);
                String c = harga.get(index);
                Integer d = totalbrg.get(index);
                System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s", index, a, b, c, d));
                System.out.println("-------------------------------------------------------------");
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            kembali();
        }
    }

    static void tambahdata() {
        clearScreen();

        System.out.print("\nMasukkan Artikel      : ");
        String a = input.nextLine();
        artikel.add(a);
        System.out.print("Masukkan Warna        : ");
        String b = input.nextLine();
        warna.add(b);
        System.out.print("Masukkan Harga        : ");
        String c = input.nextLine();
        harga.add(c);
        System.out.print("Masukkan Total Barang : ");
        int d = input.nextInt();
        totalbrg.add(d);
        
        data dataSatu = new data(a, b, c, d);
        dataSatu.dataDitambah();
        
        System.out.println("1. " + dataSatu.a);
        System.out.println("2. " + dataSatu.b);
        System.out.println("3. " + dataSatu.c);
        System.out.println("4. " + dataSatu.d);

        isEditing = false;
        kembali();
    }

    static void editdata() {
        isEditing = true;
        lihatdata();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > artikel.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.print("Data baru Artikel      : ");
                String newa = input.nextLine();
                System.out.print("Data baru Warna        : ");
                String newb = input.nextLine();
                System.out.print("Data baru Harga        : ");
                String newc = input.nextLine();
                System.out.print("Data baru Total Barang : ");
                int newd = input.nextInt();

                // update data
                artikel.set(index, newa);
                warna.set(index, newb);
                harga.set(index, newc);
                totalbrg.set(index, newd);
                
                data dataDua = new data(newa, newb, newc, newd);
                dataDua.dataDiubah();
                System.out.println("1. " + dataDua.a);
                System.out.println("2. " + dataDua.b);
                System.out.println("3. " + dataDua.c);
                System.out.println("4. " + dataDua.d);
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
        isEditing = false;
        kembali();
    }

    static void hapusdata() {
        isEditing = true;
        lihatdata();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > artikel.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus Index ke " + index);
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    artikel.remove(index);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        kembali();
    }

}