package POSTTEST4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) throws IOException {

        HelmetShop hs = new HelmetShop();
        HelmetShopcl hsCL = new HelmetShopcl();
        ArrayList<HelmSport> helmsport = new ArrayList<>();
        ArrayList<HelmClassic> helmclassic = new ArrayList<>();

        Scanner Masukkan = new Scanner(System.in);

        int ulang = 1;
        while (ulang == 1) {
            System.out.println("\n|-----------------------------|");
            System.out.println("|       HELMET GALLERY        |");
            System.out.println("|--|--------------------------|");
            System.out.println("|1.| Tambah Data Helm         |");
            System.out.println("|2.| Lihat Data Helm          |");
            System.out.println("|3.| Ubah Data Helm           |");
            System.out.println("|4.| Hapus Data Helm          |");
            System.out.println("|5.| Exit                     |");
            System.out.println("|--|--------------------------|");
            int pilih;
            System.out.print("Masukan Pilihan : ");
            pilih = Masukkan.nextInt();
            if (pilih == 1) {
                System.out.println("\n|-----------------------------|");
                System.out.println("|       Tambah Data           |");
                System.out.println("|--|--------------------------|");
                System.out.println("|1.| Tambah Data Helm Sport   |");
                System.out.println("|2.| Tambah Data Helm Classic |");
                System.out.println("|--|--------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hs.tambahData(helmsport);
                } else if (pilih == 2) {
                    hsCL.tambahData(helmclassic);
                }

            } else if (pilih == 2) {
                System.out.println("\n|-----------------------------|");
                System.out.println("|         Lihat Data          |");
                System.out.println("|--|--------------------------|");
                System.out.println("|1.| Lihat Data Helm Sport    |");
                System.out.println("|2.| Lihat Data Helm Classic  |");
                System.out.println("|--|--------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hs.lihatData(helmsport);
                } else if (pilih == 2) {
                    hsCL.lihatData(helmclassic);
                }

            } else if (pilih == 3) {
                System.out.println("\n|-----------------------------|");
                System.out.println("|          Ubah Data        |");
                System.out.println("|--|------------------------|");
                System.out.println("|1.| Ubah Data Helm Sport   |");
                System.out.println("|2.| Ubah Data Helm Classic |");
                System.out.println("|--|------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hs.ubahData(helmsport);
                } else if (pilih == 2) {
                    hsCL.ubahData(helmclassic);
                }

            } else if (pilih == 4) {
                System.out.println("\n|-----------------------------|");
                System.out.println("|          Hapus Data        |");
                System.out.println("|--|-------------------------|");
                System.out.println("|1.| Hapus Data Helm Sport   |");
                System.out.println("|2.| Hapus Data Helm Classic |");
                System.out.println("|--|-------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hs.hapusData(helmsport);
                } else if (pilih == 2) {
                    hsCL.hapusData(helmclassic);
                }
                
            } else if (pilih == 5) {
                System.out.println("GOOD BYE");
                System.exit(0);
            } else {
                System.out.println("Inputan Yang Anda Masukan Salah !");
            }
        }
    }
}
