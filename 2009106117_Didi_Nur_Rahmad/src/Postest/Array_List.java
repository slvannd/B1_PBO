/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest;

import Postest3.Mouse;
import Postest3.Keyboard;
import Postest3.Laptop;
import Postest2.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author D I D I
 */


public class Array_List {
    //static ArrayList<String> idLaptop = new ArrayList<>();
    //static ArrayList<String> idMouse = new ArrayList<>();
    //static ArrayList<String> idKeyboard = new ArrayList<>();
    static ArrayList<String> ListLaptop = new ArrayList<>();
    static ArrayList<String> ListMouse = new ArrayList<>();
    static ArrayList<String> ListKeyboard = new ArrayList<>();
    static ArrayList<Integer> TotalLaptop = new ArrayList<>();
    static ArrayList<Integer> TotalMouse = new ArrayList<>();
    static ArrayList<Integer> TotalKeyboard = new ArrayList<>();
    static boolean isEditing = false;
    static Scanner input = new Scanner(System.in);
    static int pilih;
    
    
    static void menuUtama(){
        System.out.println("\n\t\t Daftar Stok Aksesoris Komputer MSI");
        System.out.println("\t\t ----------------------------------");
        System.out.println("\n[1] Stok Laptop.");
        System.out.println("[2] Stok Mouse.");
        System.out.println("[3] Stok Keyboard.");
        System.out.println("[4] Keluar Aplikasi.");
        
        System.out.println("Masukan Pilihan : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                menuLaptop();
                break;
            case 2:
                menuMouse();
                break;
            case 3:
                menuKeyboard();
                break;
            case 4:
                break;
            default:
                System.out.println("Pilihan Anda salah..\nSilahkan Inputkan Kembali");
                input.nextLine();
                break;
                
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

        System.out.println("Masukan Pilihan (1/2/3/4/5) : ");
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
                hapusLaptop();
                break;
            case 5:
                System.out.println("Byebyee..");
                break;
            default:
                System.out.println("Input Anda Salah!");
                System.out.println("Silahkan Input data Kembali..");
        }
    }
    static void menuMouse(){
        
        System.out.println("\n\n\t\tDaftar Mouse");
        System.out.println("\t\t-------------");
        System.out.println("\n[1] Tambah Stok Mouse.");
        System.out.println("[2] Lihat Stok Mouse.");
        System.out.println("[3] Edit Stok Mouse.");
        System.out.println("[4] Hapus Stok Mouse.");
        System.out.println("[5] Kembali.");

        System.out.println("Masukan Pilihan (1/2/3/4/5) : ");
        pilih = input.nextInt();

        switch(pilih){
            case 1:
                System.out.println("\n\tTambah data\n");
                tambahMouse();
                break;
            case 2:
                System.out.println("\n\tLihat Data\n");
                lihatMouse();
                break;
            case 3:
                System.out.println("\n\tUbah Data\n");
                editMouse();
                break;
            case 4:
                System.out.println("\n\tHapus Data\n");
                hapusMouse();
                break;
            case 5:
                System.out.println("Byebyee..");
                break;
            default:
                System.out.println("Input Anda Salah!");
                System.out.println("Silahkan Input data Kembali..");
        }
    }
    static void menuKeyboard(){
        
        System.out.println("\n\n\t\tDaftar Keyboad");
        System.out.println("\t\t-------------");
        System.out.println("\n[1] Tambah Stok Keyboad.");
        System.out.println("[2] Lihat Stok Stok Keyboard.");
        System.out.println("[3] Edit Stok Keyboard.");
        System.out.println("[4] Hapus Stok Keyboard.");
        System.out.println("[5] Kembali.");

        System.out.println("Masukan Pilihan (1/2/3/4/5) : ");
        pilih = input.nextInt();

        switch(pilih){
            case 1:
                System.out.println("\n\tTambah data\n");
                tambahKeyboard();
                break;
            case 2:
                System.out.println("\n\tLihat Data\n");
                lihatKeyboard();
                break;
            case 3:
                System.out.println("\n\tUbah Data\n");
                editKeyboard();
                break;
            case 4:
                System.out.println("\n\tHapus Data\n");
                hapusKeyboard();
                break;
            case 5:
                System.out.println("Byebyee..");
                break;
            default:
                System.out.println("Input Anda Salah!");
                System.out.println("Silahkan Input data Kembali..");
        }
    }
    
    static void tambahLaptop(){
        System.out.print("\nMasukkan merk Laptop : ");
        String namaL = input.next();
        ListLaptop.add(namaL);
        System.out.print("\nMasukkan Total Stok : ");
        int totalL = input.nextInt();
        TotalLaptop.add(totalL);
        
        System.out.print("\nMasukkan lagi? y/n :");
        String lagi = input.next();
        
        if (lagi.equalsIgnoreCase("y")) {
            tambahLaptop();
        } else {
            input.nextLine();
        }  
       
    }
    static void tambahMouse(){
        System.out.print("\nMasukkan merk Mouse : ");
        String namaM = input.next();
        ListMouse.add(namaM);
        System.out.print("\nMasukkan Total Stok : ");
        int totalM = input.nextInt();
        TotalMouse.add(totalM);
        
        System.out.print("\nMasukkan lagi? y/n :");
        String lagi = input.next();
        
        if (lagi.equalsIgnoreCase("y")) {
            tambahMouse();
        } else {
            input.nextLine();
        }  
       
    }
    static void tambahKeyboard(){
        System.out.print("\nMasukkan merk Keyboard : ");
        String namaK = input.next();
        ListKeyboard.add(namaK);
        System.out.print("\nMasukkan Total Stok : ");
        int totalK = input.nextInt();
        TotalKeyboard.add(totalK);
        
        System.out.print("\nMasukkan lagi? y/n :");
        String lagi = input.next();
        
        if (lagi.equalsIgnoreCase("y")) {
            tambahKeyboard();
        } else {
            input.nextLine();
        }  
       
    }
    static void lihatLaptop(){
        if(ListLaptop.isEmpty()){
            System.out.println("Data Kosong");
            menuLaptop();
        } else {
            System.out.println("NO\tNama Laptop\t\t\tTotal Stok");
            System.out.println("===========================================================");
            int i = 0;
            for(String namaL : ListLaptop){
                int totalL = TotalLaptop.get(i);
                System.out.println(String.format("[%d] %s\t\t\t\t%s", i+1 , namaL, totalL));
                
                i++;
            }
            
        input.nextLine();
        
    }
    }
    static void lihatMouse(){
        if(ListMouse.isEmpty()){
            System.out.println("Data Kosong");
            menuMouse();
        } else {
            System.out.println("NO\tNama Mouse\t\t\tTotal Stok");
            System.out.println("===========================================================");
            int i = 0;
            for(String namaM : ListMouse){
                int totalM = TotalMouse.get(i);
                System.out.println(String.format("[%d] %s\t\t\t\t%s", i+1 , namaM, totalM));
                
                i++;
            }
            
        input.nextLine();
        
    }
    }
    static void lihatKeyboard(){
        if(ListKeyboard.isEmpty()){
            System.out.println("Data Kosong");
            menuKeyboard();
        } else {
            System.out.println("NO\tNama Keyboard\t\t\tTotal Stok");
            System.out.println("===========================================================");
            int i = 0;
            for(String namaK : ListKeyboard){
                int totalK = TotalKeyboard.get(i);
                System.out.println(String.format("[%d] %s\t\t\t\t%s", i+1 , namaK, totalK));
                
                i++;
            }
            
        input.nextLine();
        
    }
    }
    static void editLaptop(){
        System.out.println("NO\tNama Laptop\t\t\tTotal Stok");
            System.out.println("===========================================================");
            int index = 0;
            for(String laptop : ListLaptop){
                int total = TotalLaptop.get(index);
                System.out.println(String.format("[%d] %s\t\t\t\t%s", index , laptop, total));
                
                index++;
            }
            
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("Pilih Indeks -> ");
            int i = Integer.parseInt(input.next());

            if (i > ListLaptop.size()) {
                throw new IndexOutOfBoundsException("Index tidak ada !");
            } else {

                System.out.print("Data Laptop baru: ");
                String namaL = input.next();
                
                System.out.print("Data Total Laptop: ");
                int totalL = input.nextInt();

                // update data
                ListLaptop.set(i, namaL);
                TotalLaptop.set(i, totalL);
            }
        input.nextLine();
    }
    static void editMouse(){
        System.out.println("NO\tNama Mouse\t\t\tTotal Stok");
            System.out.println("===========================================================");
            int index = 0;
            for(String Mouse : ListMouse){
                int total = TotalMouse.get(index);
                System.out.println(String.format("[%d] %s\t\t\t\t%s", index , Mouse, total));
                
                index++;
            }
            
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("Pilih Indeks -> ");
            int i = Integer.parseInt(input.next());

            if (i > ListMouse.size()) {
                throw new IndexOutOfBoundsException("Index tidak ada !");
            } else {

                System.out.print("Data Mouse baru: ");
                String namaM = input.next();
                
                System.out.print("Data Total Mouse: ");
                int totalM = input.nextInt();

                // update data
                ListMouse.set(i, namaM);
                TotalMouse.set(i, totalM);
            }
        input.nextLine();
    }
    static void editKeyboard(){
        System.out.println("NO\tNama Keyboard\t\t\tTotal Stok");
            System.out.println("===========================================================");
            int index = 0;
            for(String Keyboard : ListKeyboard){
                int total = TotalKeyboard.get(index);
                System.out.println(String.format("[%d] %s\t\t\t\t%s", index , Keyboard, total));
                
                index++;
            }
            
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("Pilih Indeks -> ");
            int i = Integer.parseInt(input.next());

            if (i > ListKeyboard.size()) {
                throw new IndexOutOfBoundsException("Index tidak ada !");
            } else {

                System.out.print("Data Laptop baru: ");
                String namaK = input.next();
                
                System.out.print("Data Total Keyboard: ");
                int totalK = input.nextInt();

                // update data
                ListKeyboard.set(i, namaK);
                TotalKeyboard.set(i, totalK);
            }
        input.nextLine();
    }

    static void hapusLaptop(){
        System.out.println("NO\tNama Laptop\t\t\tTotal Stok");
        System.out.println("===========================================================");
        int index = 0;
        for(String laptop : ListLaptop){
            int total = TotalLaptop.get(index);
            System.out.println(String.format("[%d] %s\t\t\t\t%s", index , laptop, total));
       
            index++;
        }
        System.out.print("Pilih Index Laptop yang mau dihapus : ");
        int i = Integer.parseInt(input.next());
        
        if (i > ListLaptop.size()) {
            throw new IndexOutOfBoundsException("data tidak ketemu!");
        } else {

            
            ListLaptop.remove(i);
            TotalLaptop.remove(i);
        }
        input.nextLine();
    }
    static void hapusMouse(){
        System.out.println("NO\tNama Mouse\t\t\tTotal Stok");
        System.out.println("===========================================================");
        int index = 0;
        for(String Mouse : ListMouse){
            int total = TotalMouse.get(index);
            System.out.println(String.format("[%d] %s\t\t\t\t%s", index , Mouse, total));
       
            index++;
        }
        System.out.print("Pilih Index Mouse yang mau dihapus : ");
        int i = Integer.parseInt(input.next());
        
        if (i > ListMouse.size()) {
            throw new IndexOutOfBoundsException("data tidak ketemu!");
        } else {

            
            ListMouse.remove(i);
            TotalMouse.remove(i);
        }
        input.nextLine();
    }
    static void hapusKeyboard(){
        System.out.println("NO\tNama Keyboard\t\t\tTotal Stok");
        System.out.println("===========================================================");
        int index = 0;
        for(String Keyboard : ListKeyboard){
            int total = TotalKeyboard.get(index);
            System.out.println(String.format("[%d] %s\t\t\t\t%s", index , Keyboard, total));
       
            index++;
        }
        System.out.print("Pilih Index Keyboard yang mau dihapus : ");
        int i = Integer.parseInt(input.next());
        
        if (i > ListKeyboard.size()) {
            throw new IndexOutOfBoundsException("data tidak ketemu!");
        } else {

            
            ListKeyboard.remove(i);
            TotalKeyboard.remove(i);
        }
        input.nextLine();
    }
    public static void main(String[] args) {
        while(true){
            menuUtama();
        }
    }
}
    
            
