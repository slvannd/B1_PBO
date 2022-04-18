package POSTEST2construktor;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
public class Main {
     //variabel global array
    static ArrayList<Long> no_pgung = new ArrayList<>();
    static ArrayList<String> data_nama = new ArrayList<>();
    static ArrayList<String> data_posisi = new ArrayList<>();
    static ArrayList<String> data_status = new ArrayList<>();
    
    static Scanner input = new Scanner(System.in);
    
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
    
    static void tampil(){
        clearScreen();
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t======================================================");
        System.out.println("\t\t\t=         PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA    =");
        System.out.println("\t\t\t=                oleh :                              =");
        System.out.println("\t\t\t=        2009106125 - LIDYA SIMANUNGKALIT            =");
        System.out.println("\t\t\t======================================================");
        
        System.out.print("\n\t\t\ttekan [ENTER] untuk melanjutkan....");
        input.nextLine();
    }
    
    static void menu(){
        Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t===========================================");
        System.out.println("\t\t\t= PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA =");
        System.out.println("\t\t\t= [1] Create data                         =");
        System.out.println("\t\t\t= [2] Read Data                           =");
        System.out.println("\t\t\t= [3] Update Data                         =");
        System.out.println("\t\t\t= [4] Delete Data                         =");
        System.out.println("\t\t\t= [5] Show Postest 2                      =");
        System.out.println("\t\t\t= [0] Exit                                =");
        System.out.println("\t\t\t===========================================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.out.println("\t\t\t=                                              ===");
                System.out.println("\t\t\t===    PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA ===");
                System.exit(0);
         case 1:
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t=============================");
                System.out.println("\t\t\t=  MENGINPUT DATA PEMAIN  =");
                System.out.println("\t\t\t=============================");
                System.out.print("Masukan banyak data : ");
                int banyak = input.nextInt();
                for(int y = 0 ; y < banyak; y++){
                    System.out.print("Masukan no punggung : ");
                    long punggung = input.nextLong();
                    input.nextLine(); 
                    no_pgung.add(punggung);
                    System.out.print("Masukan nama        : ");
                    String nama = input.nextLine();
                    data_nama.add(nama);
                    System.out.print("Masukan posisi      : ");
                    String posisi= input.nextLine();
                    data_posisi.add(posisi);
                    System.out.print("Masukan status      : ");
                    String status = input.nextLine();
                    data_status.add(status); 
                    System.out.print("\n\nDATA BERHASIL DITAMBAHKAN!");
                    System.out.println("");
                    System.out.println("");
                }
                
                System.out.print("\ntekan [ENTER] untuk kembali...");
                System.out.println("");
                input.nextLine();
                menu();
                break;
        case 2:
                clearScreen();
                System.out.println("= DATA PEEMAIN KOTA SAMARINDA =");
                
                for(int y = 0; y < no_pgung.size(); y++){
                   System.out.println("PEMAIN KE-" + (y+1));
                   System.out.println("NO Punggung    : "+no_pgung.get(y));
		   System.out.println("Nama           : "+data_nama.get(y));
                   System.out.println("Posisi         : "+data_posisi.get(y));
                   System.out.println("Status         : "+data_status.get(y));

                   System.out.println("=====================");
                   
                }
                
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
        case 3 :
                clearScreen();
                System.out.println("= DATA PEMAIN KOTA SMARINDA =");
                
                for(int y = 0; y < no_pgung.size(); y++){
                   System.out.println("PEMAIN KE-" + (y+1));
                   System.out.println("Nomor Punggung : "+no_pgung.get(y));
		   System.out.println("Nama           : "+data_nama.get(y));
                   System.out.println("Posisi         : "+data_posisi.get(y));
                   System.out.println("Status         : "+data_status.get(y));
                   System.out.println("=====================");
                   
                }
                
                System.out.println(" = MENGUBAH DATA PEMAIN =");
                System.out.print("Mengubah Data Ke: ");
                int edit = input.nextInt();
		
                System.out.print("SILAHKAN UBAH DATA KE : ");
                System.out.println("");
		System.out.print("Masukan NO Punggung : ");
                long punggung2 = input.nextLong();
                input.nextLine(); //biar ga lompat 
                no_pgung.set((edit-1), punggung2);
                System.out.print("Masukan nama        : ");
                String nama2 = input.nextLine();
                data_nama.set((edit-1), nama2);
                System.out.print("Masukan posisi      : ");
                String posisi2 = input.nextLine();
                data_posisi.set((edit-1),posisi2);
                System.out.print("Masukan status      : ");
                String status2 = input.nextLine();
                data_status.set((edit-1),status2);
                                             
                System.out.print("\nDATA BERHASIL DIUBAH!");
	
                System.out.print("\ntekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
	case 4 :
                clearScreen();
                System.out.println("= DATA PEMAIN KOTA SAMARINDA =");
                
                for(int y = 0; y < no_pgung.size(); y++){
                   System.out.println("PENDUDUK KE-" + (y+1));
                   System.out.println("Nomor Punggung : "+no_pgung.get(y));
		   System.out.println("Nama           : "+data_nama.get(y));
                   System.out.println("Posisi         : "+data_posisi.get(y));
                   System.out.println("Status         : "+data_status.get(y));
                   System.out.println("=====================");
                }
		
		System.out.println(" = MENGHAPUS DATA PEMAIN KE =");
                System.out.print("Data pemain yang dihapus : ");
                int hapus = input.nextInt();
		no_pgung.remove((hapus-1));
		data_nama.remove((hapus-1));
		data_posisi.remove((hapus-1));
		data_status.remove((hapus-1));

                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
        case 5 :
                clearScreen();
                System.out.println("= DATA PEMAIN KOTA SAMARINDA =");
                
                Pemainbola pemainA = new Pemainbola(69,"Gustay", "Penjaga Gawang","Pemain Inti");
                Pemainbola pemainB = new Pemainbola(14,"Yohannes","Penyerang","Pemain Cadangan");
                
                System.out.print("Nomor Punggung  : ");
                System.out.println(pemainA.no_punggung);
                System.out.print("Nama            : ");
                System.out.println(pemainA.nama);
                System.out.print("Posisi          : ");
                System.out.println(pemainA.posisi);
                System.out.print("Status          : ");
                System.out.println(pemainA.status);
                System.out.print("Tugas           : ");
                pemainA.pemain1();
                System.out.println("=======================================");
                System.out.print("Nomor Punggung  : ");
                System.out.println(pemainB.no_punggung);
                System.out.print("Nama            : ");
                System.out.println(pemainB.nama);
                System.out.print("Posisi          : ");
                System.out.println(pemainB.posisi);
                System.out.print("Status          : ");
                System.out.println(pemainB.status);
                System.out.print("Tugas           : ");
                pemainB.pemain2();
                
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
                
		
            default:
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
        }}
    public static void main(String[] args) {
       tampil(); 
       menu();
    }       
}
