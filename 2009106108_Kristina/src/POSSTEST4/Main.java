package POSSTEST4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Manager> ListKaryawan = new ArrayList<>();

    static void tambahdata() {
        Manager manager = new Manager("Neti", "Samarinda", "Staff", "Keuangan", 2002, 2019, 15, 2000000, 1000, 50000, 5000000);
        System.out.println("Masukkan Nama Anda                  : ");
        manager.setNama(input.nextLine());
        System.out.println("Masukkan Alamat Anda                : ");
        manager.setAlamat(input.nextLine());
        System.out.println("Masukkan Golongan Anda              : ");
        manager.setGolongan(input.nextLine());
        System.out.println("Masukkan Bagian Anda                : ");
        manager.setBagian(input.nextLine());
        System.out.println("Masukkan Tahun Lahir                : ");
        manager.setTahunLahir(input.nextInt());
        System.out.println("Masukkan Tahun Masuk                : ");
        manager.setTahunMasuk(input.nextInt());
        System.out.println("Masukkan Kehadiran Anda             : ");
        manager.setKehadiran(input.nextInt());
        System.out.println("Masukkan Tunjangan Jabatan Anda     : ");
        manager.setTunjanganJabatan(input.nextInt());
        System.out.println("Masukkan Tunjangan Kehadiran Anda   : ");
        manager.setTunjanganKehadiran(input.nextInt());
        System.out.println("Masukkan Tunjangan Golongan Anda    : ");
        manager.setTunjanganGolongan(input.nextInt());
        System.out.println("Masukkan Gaji Anda                  : ");
        manager.setGaji(input.nextInt());
        ListKaryawan.add(manager);

    }

    static void lihatdata() {
        System.out.println("Nama\t Alamat\t Golongan\t Bagian\t Tahun Lahir\t Tahun Masuk\t Kehadiran\t Tunjangan Jabatan\t Tunjangan Kehadiran\t Tunjangan Golongan\t Gaji");
        for (int i = 0; i < ListKaryawan.size(); i++) {
            System.out.println("" + ListKaryawan.get(i).getNama() + "\t" + ListKaryawan.get(i).getAlamat() + "\t" + ListKaryawan.get(i).getGolongan() + "\t" + ListKaryawan.get(i).getBagian() + "\t" ListKaryawan.get(i).getTahunLahir() + "\t" + ListKaryawan.get(i).getTahunMasuk() + "\t" + ListKaryawan.get(i).getKehadiran() + "\t" ListKaryawan.get(i).getTunjanganJabatan() + "\t" ListKaryawan.get(i).getTunjanganKehadiran() + "\t" + ListKaryawan.get(i).getTunjanganGolongan() + "\t" + ListKaryawan.get(i).getGaji()
        
    

    );

        }

    }

    static void ubahdata() {
        System.out.println("Masukkan index nama pencarian =");
        String cari = input.nextLine();
        for (Manager manager : ListKaryawan) {
            if (manager.getNama().equals(cari)) {
                System.out.println("Masukkan Nama Anda                  : ");
                manager.setNama(input.nextLine());
                System.out.println("Masukkan Alamat Anda                : ");
                manager.setAlamat(input.nextLine());
                System.out.println("Masukkan Golongan Anda              : ");
                manager.setGolongan(input.nextLine());
                System.out.println("Masukkan Bagian Anda                : ");
                manager.setBagian(input.nextLine());
                System.out.println("Masukkan Tahun Lahir                : ");
                manager.setTahunLahir(input.nextInt());
                System.out.println("Masukkan Tahun Masuk                : ");
                manager.setTahunMasuk(input.nextInt());
                System.out.println("Masukkan Kehadiran Anda             : ");
                manager.setKehadiran(input.nextInt());
                System.out.println("Masukkan Tunjangan Jabatan Anda     : ");
                manager.setTunjanganJabatan(input.nextInt());
                System.out.println("Masukkan Tunjangan Kehadiran Anda   : ");
                manager.setTunjanganKehadiran(input.nextInt());
                System.out.println("Masukkan Tunjangan Golongan Anda    : ");
                manager.setTunjanganGolongan(input.nextInt());
                System.out.println("Masukkan Gaji Anda                  : ");
                manager.setGaji(input.nextInt());
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
