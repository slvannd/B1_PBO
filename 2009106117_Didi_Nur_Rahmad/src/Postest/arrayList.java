/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author D I D I
 */
public class arrayList {
    static ArrayList<String> ListLaptop = new ArrayList<>();
    static ArrayList<String> ListMouse = new ArrayList<>();
    static ArrayList<String> ListKeyboard = new ArrayList<>();
    static ArrayList<Integer> TotalLaptop = new ArrayList<>();
    static ArrayList<Integer> TotalMouse = new ArrayList<>();
    static ArrayList<Integer> TotalKeyboard = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static boolean isEditing = false;
    static int pilih;
   
    static void menuUtama(){
        
        System.out.println("\n\t\t Daftar Stok Aksesoris Komputer MSI");
        System.out.println("\t\t ----------------------------------");
        System.out.println("\n[1] Stok Laptop.");
        //System.out.println("[2] Stok Mouse.");
        //System.out.println("[3] Stok Keyboard.");
        //System.out.println("[5] Keluar Aplikasi.");
        
        System.out.println("Masukan Pilihan : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                menuLaptop();
                
            case 2:
                kembali();
                menuUtama();
            default:
                kembali();
                
            }
        
        }
     static void clearScreen() {
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
    static void menuLaptop(){
        
        System.out.println("\n\n\t\tDaftar Laptop");
        System.out.println("\t\t-------------");
        System.out.println("\n[1] Tambah Stok Laptop.");
        System.out.println("[2] Lihat Stok Laptop.");
        System.out.println("[3] Edit Stok Laptop.");
        System.out.println("[4] Hapus Stok Laptop.");
        System.out.println("[5] Kembali.");

        System.out.println("Masukan Pilihan : ");
        pilih = input.nextInt();

        switch(pilih){
            case 1:
                System.out.println("Tambah data\n");
                tambahLaptop();
                break;
            case 2:
                System.out.println("Lihat Data\n");
                lihatLaptop();
                break;
            case 3:
                System.out.println("Ubah Data\n");
                editLaptop();
                break;
            case 4:
                System.out.println("Hapus Data\n");
                break;
            case 5:
                System.out.println("Byebyee..");
                break;
            default:
                System.out.println("Input Anda Salah!");
                System.out.println("Byebyee..");
        }
    }
    static void kembali() {
        System.out.print("Tekan Enter untuk kembali..");
        input.nextLine();
        clearScreen();
    }
    static void tambahLaptop(){
        System.out.print("Masukan nama Laptop: ");
        String NL = input.next();
        ListLaptop.add(NL);
        System.out.print("\nMasukan Total Laptop: ");
        int TL = input.nextInt();
        TotalLaptop.add(TL);
        System.out.println("\nMasukan lagi? [y/n]");
        String lagi = input.next();
        if (lagi.equalsIgnoreCase("y")) {
            tambahLaptop();
        } else {
            kembali();
            menuLaptop();
        }  
 }
    static void lihatLaptop() {
        if(ListLaptop.isEmpty()){
            System.out.println("Data Kosong");
            menuLaptop();
        } else {
            System.out.println("NO\tNama Laptop\t\tTotal Stok");
            System.out.println("===========================================================");
            int i = 0;
            for(String NL : ListLaptop){
                int TL = TotalLaptop.get(i);
                System.out.println(String.format("[%d] %s\t\t\t\t\t%s", i , NL, TL));
                
                i++;
            }
            
        kembali();
        menuLaptop();
    }
    }

    static void editLaptop() {
        isEditing = true;
     

        try {
        System.out.println("\n\nPilih Indeks dari data List Laptop ");
        int ind = Integer.parseInt(input.nextLine());

        if (ind > ListLaptop.size()) {
            throw new IndexOutOfBoundsException("Data yang kamu masukan salah!");
        } else {
            System.out.print("Nama Baru Laptop      : ");
            String namaBaruNL = input.nextLine();
            System.out.print("Total Laptop Baru     : ");
            int totalBaruTL = input.nextInt();
            //data Setelah di Ubah
            ListLaptop.set(ind, namaBaruNL);
            TotalLaptop.set(ind, totalBaruTL);           
                    
        }      
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        kembali();
    
    }
        
    

    public static void main(String[] args) {
        
        menuUtama(); 
    
    }
}


  
        
        
        
    

