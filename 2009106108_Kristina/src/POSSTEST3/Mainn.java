/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSSTEST3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mainn {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Karyawan> ListKaryawan = new ArrayList<>();

    static void tambahdata() {
        Karyawan karyawan = new Karyawan("Neti", "Samarinda", 2013, 2019, 2000000);
        System.out.println("Masukkan nama Anda : ");
        karyawan.setNama(input.nextLine());
        System.out.println("Masukkan alamat Anda : ");
        karyawan.setAlamat(input.nextLine());
        System.out.println("Masukkan tahunlahir : ");
        karyawan.setTahunlahir(input.nextInt());
        System.out.println("Masukkan tahunmasuk : ");
        karyawan.setTahunmasuk(input.nextInt());
        System.out.println("Masukkan gajipokok : ");
        karyawan.setGajipokok(input.nextInt());
        ListKaryawan.add(karyawan);

    }

    static void lihatdata() {
        System.out.println("Nama\t alamat\t tahunlahir\t tahunmasuk\t gajipokok");
        for (int i = 0; i < ListKaryawan.size(); i++) {
            System.out.println("" + ListKaryawan.get(i).getNama() + "\t" + ListKaryawan.get(i).getAlamat() + "\t" + ListKaryawan.get(i).getTahunlahir() + "\t" + ListKaryawan.get(i).getTahunmasuk() + "\t" + ListKaryawan.get(i).getGajipokok());

        }

    }

    static void ubahdata() {
        System.out.println("Masukkan index nama pencarian =");
        String cari = input.nextLine();
        for (Karyawan karyawan : ListKaryawan) {
            if (karyawan.getNama().equals(cari)) {
                System.out.print("Masukkan Nama = ");
                karyawan.setNama(input.nextLine());
                System.out.print("Masukkan Alamat = ");
                karyawan.setAlamat(input.nextLine());
                System.out.print("Masukkan Tahunlahir = ");
                karyawan.setTahunlahir(input.nextInt());
                System.out.print("Masukkan Tahunmasuk = ");
                karyawan.setTahunmasuk(input.nextInt());
                System.out.print("Masukkan Gajipokok = ");
                karyawan.setGajipokok(input.nextInt());
                break;
            }
        }
    }

    static void keluar() {
        System.exit(0);

    }

    static void hapusdata() {

        System.out.print("Masukkan Nama karyawan yang ingin dihapus = ");
        String nama = input.nextLine();
        for (int i = 0; i < ListKaryawan.size(); i++) {
            if (ListKaryawan.get(i).getNama().equals(nama)) {
                ListKaryawan.remove(i);
                break;
            }

        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("Tampilan Menu Awal :\n");
            System.out.print("1.Menambahkan\n2.Menampilkan\n3.Mengubah\n4.Menghapus\n5.exit\n ");
            System.out.print("Pilih Menu : ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                tambahdata();
            } else if (pilihan == 2) {
                lihatdata();
            } else if (pilihan == 3) {
                ubahdata();
            } else if (pilihan == 4) {
                hapusdata();
            } else if (pilihan == 5) {
                keluar();
            }

        }
    }

}
