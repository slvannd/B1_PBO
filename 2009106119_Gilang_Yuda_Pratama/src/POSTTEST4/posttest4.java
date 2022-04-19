package POSTTEST4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class posttest4 {

    ArrayList<SepatuKickkers> data;
    boolean isEditing = false;
    Scanner input = new Scanner(System.in);

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

    public void showMenu(ArrayList<SepatuKickkers> dt) {
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
                lihatdata(dt);
                break;
            case "2":
                tambahdata(dt);
                break;
            case "3":
                editdata(dt);
                break;
            case "4":
                hapusdata(dt);
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Kamu salah pilih menu!");
                kembali();
                break;
        }
    }

    public void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    public void lihatdata(ArrayList<SepatuKickkers> dt) {
        clearScreen();
        if (dt.size() > 0) {
            System.out.println("\n=============================================================");
            System.out.println("NO\tARTIKEL\t\tWARNA\t\tHARGA\t\tTOTAL");
            System.out.println("=============================================================");
            int index = 0;
            for (POSTTEST4.SepatuKickkers dt1 : dt) {
                String a = dt.get(index).getA();
                String b = dt.get(index).getB();
                String c = dt.get(index).getC();
                Integer d = dt.get(index).getD();
                System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s", index, a, b, c, d));
                System.out.println("-------------------------------------------------------------");
                index++;
            }
        } else {
            System.out.println("\nTidak ada data!");
        }

        if (!isEditing) {
            kembali();
        }
    }

    public void tambahdata(ArrayList<SepatuKickkers> dt) {
        clearScreen();
        
        System.out.print("\nMasukkan Artikel      : ");
        String a = input.nextLine();
        System.out.print("Masukkan Warna        : ");
        String b = input.nextLine();
        System.out.print("Masukkan Harga        : ");
        String c = input.nextLine();
        System.out.print("Masukkan Total Barang : ");
        int d = input.nextInt();

        SepatuKickkers dataSatu = new SepatuKickkers(a, b, c, d);
        System.out.println(" ");
        dataSatu.dataDitambah();
        dataSatu.setA(a);
        dataSatu.setB(b);
        dataSatu.setC(c);
        dataSatu.setD(d);
        dt.add(dataSatu);
        System.out.println("DITAMBAHKAN DENGAN GETTER");
        System.out.println("1. Artikel      : " + dataSatu.getA());
        System.out.println("2. Warna        : " + dataSatu.getB());
        System.out.println("3. Harga        : " + dataSatu.getC());
        System.out.println("4. Total Barang : " + dataSatu.getD());

        isEditing = false;
        kembali();
    }

    public void editdata(ArrayList<SepatuKickkers> dt) {
        isEditing = true;
        lihatdata(dt);

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > dt.size()) {
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

                SepatuKickkers dataDua = new SepatuKickkers(newa, newb, newc, newd);
                System.out.println(" ");
                dataDua.dataDiubah();
                dt.get(index).setA(newa);
                dt.get(index).setB(newb);
                dt.get(index).setC(newc);
                dt.get(index).setD(newd);
                System.out.println("DI UPDATE DENGAN SETTER");
                System.out.println("1. Artikel      : " + dataDua.getA());
                System.out.println("2. Warna        : " + dataDua.getB());
                System.out.println("3. Harga        : " + dataDua.getC());
                System.out.println("4. Total Barang : " + dataDua.getD());
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        kembali();
    }

    public void hapusdata(ArrayList<SepatuKickkers> dt) {
        
        isEditing = true;
        lihatdata(dt);

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > dt.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus Index ke " + index);
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    dt.remove(index);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        kembali();
    }

}