package posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean isRunning = true;
    // Menu Login 
    static void menuLogin() {
        int menu;
        Scanner pilih = new Scanner(System.in);    
        
        System.out.println("=============================");
        System.out.println("|      SELAMAT DATANG       |");
        System.out.println("|  di PERPUSTAKAAN SMA N 2  |");
        System.out.println("|        Tana Tidung        |");
        System.out.println("=============================");
        System.out.println("| Masuk sebagai :           |");
        System.out.println("| [1] Admin                 |");
        System.out.println("| [2] User / Siswa          |");
        System.out.println("| [0] Exit                  |");
        System.out.println("=============================");
        System.out.print("> Pilih Menu : ");
        menu = pilih.nextInt();
        
        switch(menu){
            case 1:
                loginAdmin();
                break;
            case 2:
                loginUser();
                break;
            case 0:
                System.out.println("\nTerimaKasih Telah Berkunjung");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Tidak Ada !!!");
                break;
        }
    }
    // Login Admin / Penjaga Perpustakaan
    static void loginAdmin() {
        System.out.println("\n=============================");
        System.out.println("| >>  MENU LOGIN ADMIN  <<  |");
        System.out.println("=============================");
        Scanner input1 = new Scanner(System.in);
        System.out.print(" Masukkan Username : ");
        String admin = input1.nextLine();
        System.out.print(" Masukkan Password : ");
        int ktsandi = input1.nextInt();
        if(admin.equals("admin123") && ktsandi == 101010){
            menuAdmin();
        } else {
            System.out.println("\nUsername & Password salah !!!");
            loginAdmin();
        }
    }
    // Login User / Siswa
    static void loginUser() {
        ArrayList uname = new ArrayList(); //uname = nama siswa 
        ArrayList pword = new ArrayList(); //pword = nomor induk siswa
        
        System.out.println("\n=============================");
        System.out.println("| >>  MENU LOGIN SISWA  <<  |");
        System.out.println("=============================");
        Scanner input2 = new Scanner(System.in);
        System.out.print("| Masukkan Nama : ");
        uname.add(input2.nextLine());
        System.out.print("| Masukkan NISN : ");
        pword.add(input2.nextInt());
        if(uname.equals(uname) && pword.equals(pword)){
            menuUser();
        } else {
            System.out.println("\nLogin Tidak Berhasil !!!");
            loginUser();
        }
    }
    // Menu Utama Admin
    static void menuAdmin() {
        int crudB;
        Scanner crudb = new Scanner(System.in);
        System.out.println("\n=============================");
        System.out.println("| >>  MENU UTAMA ADMIN  <<  |");
        System.out.println("=============================");
        System.out.println("| [1] CRUD Buku Kelas X     |");
        System.out.println("| [2] CRUD Buku Kelas XI    |");
        System.out.println("| [3] CRUD Buku Kelas XII   |");
        System.out.println("| [4] Daftar Pengunjung     |");
        System.out.println("| [0] Exit                  |");
        System.out.println("=============================");
        System.out.print("> Pilih Menu : ");
        crudB = crudb.nextInt();
        switch(crudB) {
            case 1:
                crudX();
                break;
            case 2:
                crudXI();
                break;
            case 3:
                crudXII();
                break;
            case 4: 
                siswa();
                break;
            case 0:
                System.out.println("\nTerimakasih Telah Berkunjung");
                System.exit(0);
                break;
            default:
                System.out.println("Menu Tidak Ada !!!");
                menuAdmin();
                break;
        }
    }
    // Menu Utama User
    static void menuUser() {
        int menu;
        Scanner siswa = new Scanner(System.in);
        System.out.println("\n=============================");
        System.out.println("| >>  MENU UTAMA SISWA  <<  |");
        System.out.println("=============================");
        System.out.println("| [1] Buku Kelas X          |");
        System.out.println("| [2] Buku Kelas XI         |");
        System.out.println("| [3] Buku Kelas XII        |");
        System.out.println("| [0] Exit                  |");
        System.out.println("=============================");
        System.out.print("> Pilih Menu : ");
        menu = siswa.nextInt();
        switch(menu) {
            case 1:
                kelasX();
                bacapinjam();
                break;
            case 2:
                kelasXI();
                bacapinjam();
                break;
            case 3:
                kelasXII();
                bacapinjam();
                break;
            case 0:
                System.out.println("\nTerimakasih Telah Berkunjung");
                System.exit(0);
                break;
            default:
                System.out.println("Menu Tidak Ada !!!");
                menuUser();
                break;
        }
    }
    // CRUD Buku Kelas X
    static void crudX() {
        int no1;
        ArrayList kelasX = new ArrayList();
        // Read Buku Kelas X
        System.out.println("\n=============================");
        System.out.println("| Daftar Buku Kelas X :     |");
        System.out.println("=============================");
        kelasX.add("Biologi");
        kelasX.add("Fisika");
        kelasX.add("Kimia");
        for(int i = 0; i < kelasX.size(); i++) {
            System.out.println(kelasX.get(i));
        } System.out.println("=============================");
        // Create Buku Kelas XS
        System.out.println("\nTambah Buku Baru");
        Scanner bukuX = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasX.add(bukuX.nextLine());
        // Update Buku Kelas X
        Buku edit = new Buku("", 0, 0, "");
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no1 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasX.set(no1, bukuX.nextLine());
        Scanner ubahKategori = new Scanner(System.in);
        System.out.print("Kategori Buku Baru  : ");
        edit.setKategoriBuku(ubahKategori.nextInt());
        Scanner ubahWarna = new Scanner(System.in);
        System.out.print("Warna Buku Baru     : ");
        edit.setWarnaBuku(ubahWarna.nextLine());
        // Hapus Buku Kelas X
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasX.remove(bukuX.nextLine());
        // Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        kelasX.forEach(buku -> {
            System.out.println(buku+" Kelas "+edit.getKategoriBuku()
                    +" ("+edit.getWarnaBuku()+")");
        });
        System.out.println("=============================");
        menuAdmin();
    }
    // CRUD Buku Kelas XI
    static void crudXI() {
        int no2;
        ArrayList kelasXI = new ArrayList();
        // Read Buku Kelas XI
        System.out.println("\n=============================");
        System.out.println("| Daftar Buku Kelas XI :    |");
        System.out.println("=============================");
        kelasXI.add("Ekonomi");
        kelasXI.add("Gegografi");
        kelasXI.add("Sosiologi");
        for(int i = 0; i < kelasXI.size(); i++) {
            System.out.println(kelasXI.get(i));
        } System.out.println("=============================");
        // Create Buku Kelas XI
        System.out.println("\nTambah Buku Baru");
        Scanner bukuXI = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasXI.add(bukuXI.nextLine());
        // Update Buku Kelas XI
        Buku edit = new Buku("", 0, 0, "");
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no2 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasXI.set(no2, bukuXI.nextLine());
        Scanner ubahKategori = new Scanner(System.in);
        System.out.print("Kategori Buku Baru  : ");
        edit.setKategoriBuku(ubahKategori.nextInt());
        Scanner ubahWarna = new Scanner(System.in);
        System.out.print("Warna Buku Baru     : ");
        edit.setWarnaBuku(ubahWarna.nextLine());
        // Hapus Buku Kelas XI
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasXI.remove(bukuXI.nextLine());
        // Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        kelasXI.forEach(buku -> {
            System.out.println(buku+" Kelas "+edit.getKategoriBuku()
                    +" ("+edit.getWarnaBuku()+")");
        });
        System.out.println("=============================");
        menuAdmin();
    }
    // CRUD Buku Kelas XII
    static void crudXII() {
        int no3;
        ArrayList kelasXII = new ArrayList();
        // Read Buku Kelas XII
        System.out.println("\n=============================");
        System.out.println("Daftar Buku Kelas XII :");
        System.out.println("=============================");
        kelasXII.add("Matematika Kelas XII");
        kelasXII.add("Bahasa Inggris Kelas XII");
        kelasXII.add("Seni Budaya Kelas XII");
        for(int i = 0; i < kelasXII.size(); i++) {
            System.out.println(kelasXII.get(i));
        } System.out.println("=============================");
        // Create Buku Kelas XII
        System.out.println("\nTambah Buku Baru");
        Scanner bukuXII = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasXII.add(bukuXII.nextLine());
        // Update Buku Kelas XII
        Buku edit = new Buku("", 0, 0, "");
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no3 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasXII.set(no3, bukuXII.nextLine());
        Scanner ubahKategori = new Scanner(System.in);
        System.out.print("Kategori Buku Baru  : ");
        edit.setKategoriBuku(ubahKategori.nextInt());
        Scanner ubahWarna = new Scanner(System.in);
        System.out.print("Warna Buku Baru     : ");
        edit.setWarnaBuku(ubahWarna.nextLine());
        // Hapus Buku Kelas XII
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasXII.remove(bukuXII.nextLine());
        // Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        kelasXII.forEach(buku -> {
            System.out.println(buku+" Kelas "+edit.getKategoriBuku()
                    +" ("+edit.getWarnaBuku()+")");
        });
        System.out.println("=============================");
        menuAdmin();
    }
    // Daftar Buku Kelas X
    static void kelasX() {
        ArrayList kelasX = new ArrayList();
        kelasX.add("| Biologi Kelas X");
        kelasX.add("| Fisika Kelas X");
        kelasX.add("| Kimia Kelas X");
        System.out.println("=============================");
        System.out.println("|    Daftar Buku Kelas X    |");
        System.out.println("=============================");
        for(int i = 0; i < kelasX.size(); i++) {
            System.out.println(kelasX.get(i));
        } System.out.println("=============================");
    }
    // Daftar Buku Kelas XI
    static void kelasXI() {
        ArrayList kelasXI = new ArrayList();
        kelasXI.add("| Ekonomi Kelas XI");
        kelasXI.add("| Geografi Kelas XI");
        kelasXI.add("| Sejarah Kelas XI");
        System.out.println("=============================");
        System.out.println("|    Daftar Buku Kelas XI   |");
        System.out.println("=============================");
        for(int i = 0; i < kelasXI.size(); i++) {
            System.out.println(kelasXI.get(i));
        } System.out.println("=============================");
    }
    // Daftar Buku Kelas XII
    static void kelasXII() {
        ArrayList kelasXII = new ArrayList();
        kelasXII.add("| Matematika Kelas XII");
        kelasXII.add("| PPkn Kelas XII");
        kelasXII.add("| Seni Budaya Kelas XII");
        System.out.println("=============================");
        System.out.println("|   Daftar Buku Kelas XII   |");
        System.out.println("=============================");
        for(int i = 0; i < kelasXII.size(); i++) {
            System.out.println(kelasXII.get(i));
        } System.out.println("=============================");
    }
    // Menu Baca & Pinjam Buku
    static void bacapinjam() {
        System.out.println("1. Baca buku");
        System.out.println("2. Pinjam buku");
        Scanner pilih = new Scanner(System.in);
        System.out.print("> Pilih : ");
        int menu = pilih.nextInt();
        switch(menu) {
            case 1:
                bacaBuku();
                menuUser();
                break;
            case 2:
                pinjamBuku();
                menuUser();
                break;
            default:
                System.out.println("Input salah");
                bacapinjam();
                break;
        }
    }
    // Method Baca Buku
    static void bacaBuku() {
        Siswa nama = new Siswa("", 0, 0);
        Buku baca = new Buku("", 0, 0, "");
        Scanner nSiswa = new Scanner(System.in);
        System.out.print("Nama siswa : ");
        nama.setNama(nSiswa.nextLine());
        Scanner kBuku = new Scanner(System.in);
        System.out.print("Kode buku  : ");
        baca.setKodeBuku(kBuku.nextInt());
        Scanner nBuku = new Scanner(System.in);
        System.out.print("Nama buku  : ");
        baca.setNamaBuku(nBuku.nextLine());
        Scanner jBuku = new Scanner(System.in);
        System.out.print("Buku kelas : ");
        baca.setKategoriBuku(jBuku.nextInt());
        Scanner wBuku = new Scanner(System.in);
        System.out.print("Warna buku : ");
        baca.setWarnaBuku(wBuku.nextLine());
        
        System.out.println("\n=============================");
        System.out.println("| Nama siswa : "+nama.getNama());
        System.out.println("| Kode buku  : "+baca.getKodeBuku());
        System.out.println("| Nama buku  : "+baca.getNamaBuku());
        System.out.println("| Buku kelas : "+baca.getKategoriBuku());
        System.out.println("| Warna buku : "+baca.getWarnaBuku());
        System.out.println("=============================");
    }
    // Method Pinjam Buku
    static void pinjamBuku() {
        Siswa siswa = new Siswa("", 0, 0);
        Buku pinjam = new Buku("", 0, 0, "");
        Scanner namaS = new Scanner(System.in);
        System.out.print("Masukkan Nama siswa : ");
        siswa.setNama(namaS.nextLine());
        Scanner nisnS = new Scanner(System.in);
        System.out.print("Masukkan NISN siswa : ");
        siswa.setNisn(nisnS.nextInt());
        Scanner kBuku = new Scanner(System.in);
        System.out.print("Masukkan Kode buku  : ");
        pinjam.setKodeBuku(kBuku.nextInt());
        Scanner nBuku = new Scanner(System.in);
        System.out.print("Masukkan Nama buku  : ");
        pinjam.setNamaBuku(nBuku.nextLine());
        Scanner jBuku = new Scanner(System.in);
        System.out.print("Masukkan Buku kelas : ");
        pinjam.setKategoriBuku(jBuku.nextInt());
        Scanner wBuku = new Scanner(System.in);
        System.out.print("Masukkan Warna buku : ");
        pinjam.setWarnaBuku(wBuku.nextLine());
            
        System.out.println("\n=============================");
        System.out.println("| Nama siswa : "+siswa.getNama());
        System.out.println("| NISN siswa : "+siswa.getNisn());
        System.out.println("| Kode buku  : "+pinjam.getKodeBuku());
        System.out.println("| Nama buku  : "+pinjam.getNamaBuku());
        System.out.println("| Buku kelas : "+pinjam.getKategoriBuku());
        System.out.println("| Warna buku : "+pinjam.getWarnaBuku());
        System.out.println("=============================");
    }
    // List Pengunjung Perpustakaan
    static void siswa() {
        Siswa baru = new Siswa("", 0, 0);
        baru.setNama("Asril");
        baru.setNisn(100502);
        baru.setKelas(10);
        
        System.out.println("=============================");
        System.out.println("|  Daftar Nama Pengunjung   |");
        System.out.println("=============================");
        System.out.println("Nama Siswa  : "+baru.getNama());
        System.out.println("NISN        : "+baru.getNisn());
        System.out.println("Kelas       : "+baru.getKelas());
        System.out.println();
        menuAdmin();
    }
    public static void main(String[] args) {       
        do {
            menuLogin();
        } while(isRunning);
    }
}