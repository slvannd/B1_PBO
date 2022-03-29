package posttest1_double_posttest;

import posttest1_double_posttest.Siswa;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static boolean isRunning = true;
     //Menu Login 
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
    //Login Admin / Penjaga Perpustakaan
    static void loginAdmin() {
        String admin = "admin123";
        int ktsandi = 101010;
        
        System.out.println("\n=============================");
        System.out.println("| >>  MENU LOGIN ADMIN  <<  |");
        System.out.println("=============================");
        Scanner input1 = new Scanner(System.in);
        System.out.print(" Masukkan Username : ");
        admin = input1.nextLine();
        System.out.print(" Masukkan Password : ");
        ktsandi = input1.nextInt();
        if(admin.equals("admin123") && ktsandi == 101010){
            menuAdmin();
        } else {
            System.out.println("\nUsername & Password salah !!!");
            loginAdmin();
        }
    }
    //Login User / Siswa
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
    //Menu Utama Admin
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
    //Menu Utama User
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
                pinjamBuku();
                break;
            case 2:
                kelasXI();
                pinjamBuku();
                break;
            case 3:
                kelasXII();
                pinjamBuku();
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
    //Create Buku Kelas X
    static void crudX() {
        int no1;
        ArrayList kelasX = new ArrayList<>();
        //Read Buku Kelas X
        System.out.println("\n=============================");
        System.out.println("| Daftar Buku Kelas X :     |");
        System.out.println("=============================");
        kelasX.add("Biologi Kelas X");
        kelasX.add("Fisika Kelas X");
        kelasX.add("Kimia Kelas X");
        for(int i = 0; i < kelasX.size(); i++) {
            System.out.println(kelasX.get(i));
        } System.out.println("=============================");
        //Create Buku Kelas X
        System.out.println("\nTambah Buku Baru");
        Scanner bukuX = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasX.add(bukuX.nextLine());
        //Update Buku Kelas X
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no1 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasX.set(no1, bukuX.nextLine());
        //Hapus Buku Kelas X
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasX.remove(bukuX.nextLine());
        //Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        for(Object buku : kelasX) {
            System.out.println("| "+buku);
        } System.out.println("=============================");
        menuAdmin();
    }
     //CRUD Buku Kelas XI
    static void crudXI() {
        int no2;
        ArrayList kelasXI = new ArrayList<>();
        //Read Buku Kelas XI
        System.out.println("\n=============================");
        System.out.println("| Daftar Buku Kelas XI :    |");
        System.out.println("=============================");
        kelasXI.add("Ekonomi Kelas XI");
        kelasXI.add("Gegografi Kelas XI");
        kelasXI.add("Sosiologi Kelas XI");
        for(int i = 0; i < kelasXI.size(); i++) {
            System.out.println(kelasXI.get(i));
        } System.out.println("=============================");
        //Create Buku Kelas XI
        System.out.println("\nTambah Buku Baru");
        Scanner bukuXI = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasXI.add(bukuXI.nextLine());
        //Update Buku Kelas XII
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no2 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasXI.set(no2, bukuXI.nextLine());
        //Hapus Buku Kelas X
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasXI.remove(bukuXI.nextLine());
        //Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        for(Object buku : kelasXI) {
            System.out.println(buku);
        } System.out.println("=============================");
        menuAdmin();
    }
    //CRUD Buku Kelas XII
    static void crudXII() {
        int no3;
        ArrayList kelasXII = new ArrayList();
        //Read Buku Kelas XI
        System.out.println("\n=============================");
        System.out.println("Daftar Buku Kelas XII :");
        System.out.println("=============================");
        kelasXII.add("Matematika Kelas XII");
        kelasXII.add("Bahasa Inggris Kelas XII");
        kelasXII.add("Seni Budaya Kelas XII");
        for(int i = 0; i < kelasXII.size(); i++) {
            System.out.println(kelasXII.get(i));
        } System.out.println("=============================");
        //Create Buku Kelas XI
        System.out.println("\nTambah Buku Baru");
        Scanner bukuXII = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasXII.add(bukuXII.nextLine());
        //Update Buku Kelas XII
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no3 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasXII.set(no3, bukuXII.nextLine());
        //Hapus Buku Kelas X
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasXII.remove(bukuXII.nextLine());
        //Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        for(Object buku : kelasXII) {
            System.out.println(buku);
        } System.out.println("=============================");
        menuAdmin();
    }
    //Daftar Buku Kelas X
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
    //Daftar Buku Kelas XI
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
    //Daftar Buku Kelas XII
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
    //Pinjam Buku
    static void pinjamBuku() {
        String ya;
        ArrayList nama = new ArrayList<>();
        ArrayList buku = new ArrayList<>();
        Scanner pnjmB = new Scanner(System.in);
        Scanner pinjam = new Scanner(System.in);
        System.out.print("\nApakah anda ingin pinjam buku (y/t) ? ");
        ya = pnjmB.nextLine();
        if(ya.equals("y")) {
            System.out.print("Masukkan Nama       : ");
            nama.add(pinjam.nextLine());
            System.out.print("Masukkan Judul Buku : ");
            buku.add(pinjam.nextLine());
            System.out.println("==================================");
            System.out.println("| Nama Peminjam : "+nama);
            System.out.println("| Judul Buku    : "+buku);
            System.out.println("==================================");
            System.out.println("T E R I M A - K A S I H");
            menuUser();
        } else if(ya.equals("t")) {
            menuUser();
        } else {
            System.out.println("Input Salah !!!");
            pinjamBuku();
        }
    }
    // 
    static void siswa() {
        Siswa baru = new Siswa("Asril", 100502, 10);
        
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