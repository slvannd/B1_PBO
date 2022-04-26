/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSi-GAMING
 */
public final class Main {
    
    public static void main(String[] args) {
        PengelolaanKickkers obj = new PengelolaanKickkers();
        ArrayList<Kickkers> data = new ArrayList();
        ArrayList<Sepatu> dataSepatu = new ArrayList();
        ArrayList<Sandal> dataSandal = new ArrayList();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("    APLIKASI PENGELOLAAN DATA BRAND KICKERS   ");
            System.out.println("      MATAHARI MALL LEMBUSWANA SAMARINDA      ");
            System.out.println("==============================================");
            System.out.println("[1] Lihat data barang");
            System.out.println("[2] Tambah data barang");
            System.out.println("[3] Edit data barang");
            System.out.println("[4] Hapus data barang");
            System.out.println("[0] Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih menu :  ");

            String pilih = input.nextLine();

            switch (pilih) {
                case "1":
                    System.out.println("    APLIKASI PENGELOLAAN DATA BRAND KICKERS   ");
                    System.out.println("      MATAHARI MALL LEMBUSWANA SAMARINDA      ");
                    System.out.println("==============================================");
                    System.out.println("[1] Lihat data Sepatu");
                    System.out.println("[2] Lihat data Sandal");
                    System.out.println("[0] Kembali");
                    System.out.println("----------------------------------------------");
                    System.out.print("Pilih menu :  ");

                    String p1 = input.nextLine();

                    switch(p1){
                        case "1":
                            obj.lihatDataSepatu(dataSepatu);
                            obj.kembali();
                            break;
                        case "2":
                            obj.lihatDataSandal(dataSandal);
                            obj.kembali();
                            break;
                        case "0":
                            obj.kembali();
                            break;
                        default:
                            System.out.println("Kamu salah pilih menu!");
                            obj.kembali();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("    APLIKASI PENGELOLAAN DATA BRAND KICKERS   ");
                    System.out.println("      MATAHARI MALL LEMBUSWANA SAMARINDA      ");
                    System.out.println("==============================================");
                    System.out.println("[1] Tambah data Sepatu");
                    System.out.println("[2] Tambah data Sandal");
                    System.out.println("[0] Kembali");
                    System.out.println("----------------------------------------------");
                    System.out.print("Pilih menu :  ");

                    String p2 = input.nextLine();

                    switch(p2){
                        case "1":
                            obj.tambahDataSepatu(dataSepatu);
                            obj.kembali();
                            break;
                        case "2":
                            obj.tambahDataSandal(dataSandal);
                            obj.kembali();
                            break;
                        case "0":
                            obj.kembali();
                            break;
                        default:
                            System.out.println("Kamu salah pilih menu!");
                            obj.kembali();
                            break;
                    }
                    break;
                case "3":
                    System.out.println("    APLIKASI PENGELOLAAN DATA BRAND KICKERS   ");
                    System.out.println("      MATAHARI MALL LEMBUSWANA SAMARINDA      ");
                    System.out.println("==============================================");
                    System.out.println("[1] Ubah data Sepatu");
                    System.out.println("[2] Ubah data Sandal");
                    System.out.println("[0] Kembali");
                    System.out.println("----------------------------------------------");
                    System.out.print("Pilih menu :  ");

                    String p3 = input.nextLine();

                    switch(p3){
                        case "1":
                            obj.ubahDataSepatu(dataSepatu);
                            obj.kembali();
                            break;
                        case "2":
                            obj.ubahDataSandal(dataSandal);
                            obj.kembali();
                            break;
                        case "0":
                            obj.kembali();
                            break;
                        default:
                            System.out.println("Kamu salah pilih menu!");
                            obj.kembali();
                            break;
                    }
                    break;
                case "4":
                    System.out.println("    APLIKASI PENGELOLAAN DATA BRAND KICKERS   ");
                    System.out.println("      MATAHARI MALL LEMBUSWANA SAMARINDA      ");
                    System.out.println("==============================================");
                    System.out.println("[1] Hapus data Sepatu");
                    System.out.println("[2] Hapus data Sandal");
                    System.out.println("[0] Kembali");
                    System.out.println("----------------------------------------------");
                    System.out.print("Pilih menu :  ");

                    String p4 = input.nextLine();

                    switch(p4){
                        case "1":
                            obj.hapusDataSepatu(dataSepatu);
                            obj.kembali();
                            break;
                        case "2":
                            obj.hapusDataSandal(dataSandal);
                            obj.kembali();
                            break;
                        case "0":
                            obj.kembali();
                            break;
                        default:
                            System.out.println("Kamu salah pilih menu!");
                            obj.kembali();
                            break;
                    }
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Kamu salah pilih menu!");
                    obj.kembali();
                    break;
            }
        }
    }
}
