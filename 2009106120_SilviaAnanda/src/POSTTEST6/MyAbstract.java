/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

import java.util.Scanner;

/**
 *
 * @author MSI Gaming
 */
public abstract class MyAbstract {
    public abstract void labelData();
    public int menuData(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Silahkan pilih menu dibawah ini :");
        System.out.println("[1] Tampil Data\t\t[4] Hapus Data\t\t[0] Kembali");
        System.out.println("[2] Tambah Data\t\t");
        System.out.println("[3] Edit Data\t\t");
        System.out.println();
        System.out.print("Masukkan Pilihan Menu : ");
        return myInput.nextInt();
    }
    public int menuAksi(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Silahkan pilih aksi dibawah ini :");
        System.out.println("[1] Simpan Data & Tambah Lagi\t[3] Kembali");
        System.out.println("[2] Simpan Data & Kembali\t[4] Kembali Ke Menu Utama");
        System.out.println();
        System.out.print("Masukkan Pilihan Aksi : ");
        return myInput.nextInt();
    }
    public void aksiKosong(){
        System.out.println("Pilihan Tidak Tersedia");
        System.out.println();
    }
    public int aksiKembali(){
        Scanner myInput = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan angka nol (0) untuk kembali atau 1 untuk kembali ke menu utama : ");
        return myInput.nextInt();
    }
    public int aksiMengulang(){
        Scanner myInput = new Scanner(System.in);
        System.out.println();
        System.out.print("Data tidak ditemukan. Masukkan angka nol (0) untuk kembali atau 1 untuk mengulang : ");
        return myInput.nextInt();
    }
    public int aksiSimpanKembali(){
        Scanner myInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Silahkan pilih aksi dibawah ini :");
        System.out.println("[1] Simpan Data & Kembali\t[2] Ulangi");
        System.out.println();
        System.out.print("Masukkan Pilihan Aksi : ");
        return myInput.nextInt();
    }
    public int aksiHapusKembali(){
        Scanner myInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Silahkan pilih aksi dibawah ini :");
        System.out.println("[1] Hapus Data & Kembali\t[2] Ulangi");
        System.out.println();
        System.out.print("Masukkan Pilihan Aksi : ");
        return myInput.nextInt();
    }
    public abstract void showData();
    public abstract void addData();
    public abstract void editData();
    public abstract void deleteData();
}
