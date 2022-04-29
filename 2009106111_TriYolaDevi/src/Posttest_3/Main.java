package Posttest_3;

import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args)throws IOException {
          PanggilSepeda yola = new PanggilSepeda();
        
    Scanner inputdata = new Scanner (System.in);
    int coba = 1;
    while(coba==1){
        System.out.println("||========== MENU ==========||");
        System.out.println("||1.Tambah Data Sepeda      ||");
        System.out.println("||2.Lihat Data Sepeda       ||");
        System.out.println("||3.Ubah Data Sepeda        ||");
        System.out.println("||4.Hapus Data Sepeda       ||");
        System.out.println("||5.Exit                    ||");
        System.out.println("||==========================||");
        int pilihan;
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = inputdata.nextInt();
        if (pilihan == 1){
                yola.tambahDataSepeda();
                System.out.println("Data Berhasil Di Tambahkan!!");
                System.out.println(" ");
        }
        else if (pilihan == 2){
                yola.lihatDataSepeda();
                System.out.println(" ");
        }
        else if (pilihan == 3){
                yola.ubahDataSepeda();
                System.out.println("Data Berhasil Di Ubah!!");
                System.out.println(" ");
        }
        else if (pilihan == 4){  
                yola.hapusDataSepeda();
                System.out.println("Data Berhasil Di Hapus!!");
                System.out.println(" ");   
        } 
         else if (pilihan == 5){ 
                System.out.println("DAH BYE BYE");
                System.exit(1);}
        }
    }
}

