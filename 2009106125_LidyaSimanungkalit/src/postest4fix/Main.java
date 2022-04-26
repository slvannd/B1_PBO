/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest4fix;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
//    ArrayList<POSTEST3enkapsulasi.BOLA> bola = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static ArrayList<Long> data_no_punggungInti = new ArrayList<>();
    static ArrayList<String> data_namaInti = new ArrayList<>();
    static ArrayList<String> data_posisiInti = new ArrayList<>();
    static ArrayList<Long> data_no_punggungCadangan = new ArrayList<>();
    static ArrayList<String> data_namaCadangan = new ArrayList<>();
    static ArrayList<String> data_posisiCadangan = new ArrayList<>();
    static ArrayList<String> data_kondisiInti = new ArrayList<>();
    static ArrayList<String> data_kondisiCadangan = new ArrayList<>();
    
    public static void main(String[] args) {
        tampil();
        while(true){
        menu();    
        }
        
    }
    
    //method
static void tampil(){
        clearScreen();
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t||||<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        System.out.println("\t\t\t||||<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        System.out.println("\t\t\t||||         PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA   ||||");
        System.out.println("\t\t\t||||               BY :                                ||||");
        System.out.println("\t\t\t||||       LIDYA SIMANUNGKALIT ==> 2009106125          ||||");
        System.out.println("\t\t\t||<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        System.out.println("\t\t\t||<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        
        System.out.print("\n\t\t\ttekan [ENTER] untuk melanjutkan....");
        input.nextLine();
    }
static void clearScreen(){
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
static void back_to_menu() {
    System.out.println("");
    System.out.print("Tekan [Enter] untuk kembali..");
    input.nextLine();
    menu();

  
    clearScreen();
    }

static void menu() {
        Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t||===========================================");
        System.out.println("\t\t\t|| PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t|| [1] TAMBAH DATA                         ||");
        System.out.println("\t\t\t|| [2] LIHAT DATA                          ||");
        System.out.println("\t\t\t|| [3] EDIT DATA                           ||");
        System.out.println("\t\t\t|| [4] HAPUS DATA                          ||");
        System.out.println("\t\t\t|| [0] KELUAR                              ||");
        System.out.println("\t\t\t||=========================================||");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
         switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.out.println("BYEEEEEEEEEEEEEEEEEEE");
               
                System.exit(0);
         case 1:
                clearScreen();
                tambah();
                break;
        case 2:
                clearScreen();
                lihat();
                break;
        case 3 :
                clearScreen();
                update();
                break;
	case 4 :
                clearScreen();
                hapus();
                
                break;
		
            default:
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
        }
    }
//membuat method tambah berupa public supaya bisa di akses oleh method yang lain
static void tambahInti(){
    clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t   ||  MENGINPUT DATA PEMAIN      ||");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Masukan banyak data           : ");
        int banyak = input.nextInt();
        for(int y = 0 ; y < banyak; y++){
            System.out.print("Masukkan NO PUNGGUING     : ");
            long no_punggung = input.nextLong();
            input.nextLine();
            data_no_punggungInti.add(no_punggung);
            System.out.print("Masukkan Nama             : ");
            String nama = input.nextLine();
            data_namaInti.add(nama);
            System.out.print("Masukkan POSISI           : ");
            String posisi = input.nextLine();
            data_posisiInti.add(posisi);
            System.out.print("Masukkan Kondisi          : ");
            String kondisiInti = input.nextLine();
            data_kondisiInti.add(kondisiInti);
          
            Utama Data = new Utama(no_punggung, nama, posisi, kondisiInti);
            System.out.println("\n");
            Data.dataDitambah();
            Data.getNo_punggung();
            Data.getNama();
            Data.getPosisi();
            Data.getKondisiInti();
           
            System.out.println("NO PUNGGUNG  : " + Data.getNo_punggung());
            System.out.println("NAMA         : " + Data.getNama());
            System.out.println("POSISI       : " + Data.getPosisi());
            System.out.println("KONDISI      : " + Data.getKondisiInti());
        }
        tambah();
}

static void tambahCadangan(){
    clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t   ||  MENGINPUT DATA PEMAIN      ||");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Masukan banyak data           : ");
        int banyak = input.nextInt();
        for(int y = 0 ; y < banyak; y++){
            System.out.print("Masukkan NO PUNGGUING     : ");
            long no_punggung = input.nextLong();
            input.nextLine();
            data_no_punggungCadangan.add(no_punggung);
            System.out.print("Masukkan Nama             : ");
            String nama = input.nextLine();
            data_namaCadangan.add(nama);
            System.out.print("Masukkan POSISI           : ");
            String posisi = input.nextLine();
            data_posisiCadangan.add(posisi);
            System.out.println("Masukkan Kondisi        : ");
            String kondisiCadangan = input.nextLine();
            data_kondisiCadangan.add(kondisiCadangan);
          
            Cadangan Data = new Cadangan(no_punggung, nama, posisi, kondisiCadangan);
            System.out.println("\n");
            Data.dataDitambah();
            Data.getNo_punggung();
            Data.getNama();
            Data.getPosisi();
            Data.getKondisiCadangan();
           
            System.out.println("NO PUNGGUNG  : " + Data.getNo_punggung());
            System.out.println("NAMA         : " + Data.getNama());
            System.out.println("POSISI       : " + Data.getPosisi());
            System.out.println("KONDISI      : " + Data.getKondisiCadangan());
        }
        tambah();
}

static void lihatCadangan(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===================================");
        System.out.println("\t\t\t   || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    ===================================");
        if(data_no_punggungCadangan.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggungCadangan.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG     : "+data_no_punggungCadangan.get(y));
            System.out.println("NAMA            : "+data_namaCadangan.get(y));
            System.out.println("POSISI          : "+data_posisiCadangan.get(y));
            System.out.println("KONDIS          : "+data_kondisiCadangan.get(y));

            System.out.println("=====================");
             }
        }        lihat();
    }

static void lihatInti(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===================================");
        System.out.println("\t\t\t   || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    ===================================");
        if(data_no_punggungInti.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggungInti.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG     : "+data_no_punggungInti.get(y));
            System.out.println("NAMA            : "+data_namaInti.get(y));
            System.out.println("POSISI          : "+data_posisiInti.get(y));
            System.out.println("KONDISI          : "+data_kondisiInti.get(y));

            System.out.println("=====================");
             }
        }
        lihat();
    }

static void updateInti(){
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ====================================");
        System.out.println("\t\t\t    || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    ====================================");
        if(data_no_punggungInti.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggungInti.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG     : "+data_no_punggungInti.get(y));
            System.out.println("NAMA            : "+data_namaInti.get(y));
            System.out.println("POSISI          : "+data_posisiInti.get(y));
            System.out.println("KONDISI         : "+data_kondisiInti.get(y));

            System.out.println("========================================");
             }
            System.out.print("Tekan Enter");
            input.nextLine();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    ||    MENGUBAH DATA PEMAIN   ||");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data  pemain yang diubah : ");
        int edit = input.nextInt();
        System.out.println("SILAHKAN UBAH DATA!");
        System.out.print("Masukan NO PUNGGUNG : ");
        long no_punggung2 = input.nextLong();
        data_no_punggungInti.set((edit-1), no_punggung2);
        input.nextLine();  
        System.out.print("Masukan nama        : ");
        String nama2 = input.nextLine();
        data_namaInti.set((edit-1), nama2);
        System.out.print("Masukan posisi      : ");
        String posisi2 = input.nextLine();
        data_posisiInti.set((edit-1),posisi2);
        System.out.println("Masukkan Kondisi  : ");
        String kondisiInti2 = input.nextLine();
        data_kondisiInti.set((edit-1), kondisiInti2);

        Utama data = new Utama (no_punggung2, nama2, posisi2, kondisiInti2);
        System.out.println(" ");
        data.dataDiubah();
        data.setNo_punggung(no_punggung2);
        data.setNama(nama2);
        data.setPosisi(posisi2);
        data.setKondisiInti(kondisiInti2);

      
            System.out.println("NO PUNGGUNG     : " + data.getNo_punggung());
            System.out.println("NAMA            : " + data.getNama());
            System.out.println("POSISI          : " + data.getPosisi());
            System.out.println("KONDISI         : " + data.getKondisiInti());
        update();
    }
}

static void updateCadangan(){
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ====================================");
        System.out.println("\t\t\t    || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    ====================================");
        if(data_no_punggungCadangan.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggungCadangan.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG     : "+data_no_punggungCadangan.get(y));
            System.out.println("NAMA            : "+data_namaCadangan.get(y));
            System.out.println("POSISI          : "+data_posisiCadangan.get(y));
            System.out.println("KONDISI         : "+data_kondisiCadangan.get(y));

            System.out.println("========================================");
             }
            System.out.print("Tekan Enter");
            input.nextLine();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    ||    MENGUBAH DATA PEMAIN   ||");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data  pemain yang diubah : ");
        int edit = input.nextInt();
        System.out.println("SILAHKAN UBAH DATA!");
        System.out.print("Masukan NO PUNGGUNG : ");
        long no_punggung2 = input.nextLong();
        data_no_punggungCadangan.set((edit-1), no_punggung2);
        input.nextLine();  
        System.out.print("Masukan nama        : ");
        String nama2 = input.nextLine();
        data_namaCadangan.set((edit-1), nama2);
        System.out.print("Masukan posisi      : ");
        String posisi2 = input.nextLine();
        data_posisiCadangan.set((edit-1),posisi2);
        System.out.println("Masukkan Kondisi  : ");
        String kondisiCadangan2 = input.nextLine();
        data_kondisiCadangan.set((edit-1),kondisiCadangan2);

        Cadangan data = new Cadangan (no_punggung2, nama2, posisi2, kondisiCadangan2);
        System.out.println(" ");
        data.dataDiubah();
        data.setNo_punggung(no_punggung2);
        data.setNama(nama2);
        data.setPosisi(posisi2);
        data.setKondisiCadangan(kondisiCadangan2);

      
            System.out.println("NO PUNGGUNG     : " + data.getNo_punggung());
            System.out.println("NAMA            : " + data.getNama());
            System.out.println("POSISI          : " + data.getPosisi());
            System.out.println("KONDISI         : " + data.getKondisiCadangan());
        update();
    }
}

static void hapusInti(){
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ====================================");
        System.out.println("\t\t\t    || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    =====================================");
        if(data_no_punggungInti.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggungInti.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG            : "+data_no_punggungInti.get(y));
            System.out.println("Nama           : "+data_namaInti.get(y));
            System.out.println("POSISI   : "+data_posisiInti.get(y));
            System.out.println("Kondisi  : "+data_kondisiInti.get(y));

            System.out.println("=====================");
             }
        }

        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ================================");
        System.out.println("\t\t\t    ||   MENGHAPUS DATA PEMAIN     ||");
        System.out.println("\t\t\t    ================================");
        System.out.print("Data PEMAIN yang dihapus : ");
        int hapus = input.nextInt();
        data_no_punggungInti.remove((hapus-1));
        data_namaInti.remove((hapus-1));
        data_posisiInti.remove((hapus-1));
        data_kondisiInti.remove((hapus-1));

//        BOLA Data = new BOLA();
//        Data.dataDihapus();
         System.out.println("DATA BERHASIL DIHAPUS!");
               hapus();
//        back_to_menu();
    }

static void hapusCadangan(){
        System.out.println("\n\n\n");
        
        System.out.println("\t\t\t    ====================================");
        System.out.println("\t\t\t    || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    =====================================");
        if(data_no_punggungCadangan.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggungCadangan.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG            : "+data_no_punggungCadangan.get(y));
            System.out.println("Nama           : "+data_namaCadangan.get(y));
            System.out.println("POSISI   : "+data_posisiCadangan.get(y));
            System.out.println("KONDISI  : "+data_kondisiCadangan.get(y));

            System.out.println("=====================");
             }
        }

        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ================================");
        System.out.println("\t\t\t    ||   MENGHAPUS DATA PEMAIN     ||");
        System.out.println("\t\t\t    ================================");
        System.out.print("Data PEMAIN yang dihapus : ");
        int hapus = input.nextInt();
        data_no_punggungCadangan.remove((hapus-1));
        data_namaCadangan.remove((hapus-1));
        data_posisiCadangan.remove((hapus-1));
        data_kondisiCadangan.remove((hapus-1));
         System.out.println("DATA BERHASIL DIHAPUS!");
//               back_to_menu();

//        BOLA Data = new BOLA();
//        Data.dataDihapus("PEMAIN UTAMA");
        
        hapus();
    }

static void tambah(){
    Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t||=============================================||");
        System.out.println("\t\t\t|| MENU TAMBAH DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t|| [1] PEMAIN INTI                             ||");
        System.out.println("\t\t\t|| [2] PEMAIN CADANGAN                         ||");
        System.out.println("\t\t\t|| [0] KEMBALI                                  ||");
        System.out.println("\t\t\t||=============================================||");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        
        switch (pilihMenu) {
            case 0:
                clearScreen();
                back_to_menu();
                break;
               
               
         case 1:
                clearScreen();
                tambahInti();
                break;
        case 2:
                clearScreen();
                tambahCadangan();
                break;
                default:
        System.out.println("Menu yang dipilih tidak tersedia!");
                back_to_menu();
                break;
        }

    }

static void lihat(){
    Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t||=============================================||");
        System.out.println("\t\t\t|| MENU LIHAT DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t|| [1] PEMAIN INTI                             ||");
        System.out.println("\t\t\t|| [2] PEMAIN CADANGAN                         ||");
        System.out.println("\t\t\t|| [0] KEMBALI                                  ||");
        System.out.println("\t\t\t||=============================================||");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        
        switch (pilihMenu) {
            case 0:
                clearScreen();
                back_to_menu();
                break;
         case 1:
                clearScreen();
                lihatInti();
                break;
        case 2:
                clearScreen();
                lihatCadangan();
                break;
        default:
                System.out.println("Menu yang dipilih tidak tersedia!");
                back_to_menu();
                break;
        }
}

static void update(){
    Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t||=============================================||");
        System.out.println("\t\t\t|| MENU UPDATE DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t|| [1] PEMAIN INTI                             ||");
        System.out.println("\t\t\t|| [2] PEMAIN CADANGAN                         ||");
        System.out.println("\t\t\t|| [0] KEMBALI                                  ||");
        System.out.println("\t\t\t||=============================================||");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        
        switch (pilihMenu) {
            case 0:
                clearScreen();
                back_to_menu();
                break;
         case 1:
                clearScreen();
                updateInti();
                break;
        case 2:
                clearScreen();
                updateCadangan();
                break;
        default:
                System.out.println("Menu yang dipilih tidak tersedia!");
                back_to_menu();
                break;
        }
}

static void hapus(){
    Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t||=============================================||");
        System.out.println("\t\t\t|| MENU HAPUS DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t|| [1] PEMAIN INTI                             ||");
        System.out.println("\t\t\t|| [2] PEMAIN CADANGAN                         ||");
        System.out.println("\t\t\t|| [0] KEMBALI                                  ||");
        System.out.println("\t\t\t||=============================================||");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        
        switch (pilihMenu) {
            case 0:
                clearScreen();
                back_to_menu();
                break;
               
         case 1:
                clearScreen();
                hapusInti();
                hapus();
                break;
        case 2:
                clearScreen();
                hapusCadangan();
                hapus();
                
                break;
        default:
                System.out.println("Menu yang dipilih tidak tersedia!");
                back_to_menu();
                break;
        }
}

}
