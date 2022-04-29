/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest2;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author D I D I
 */


public class Array_List {

    static ArrayList<String> ListLaptop = new ArrayList<>();
    static ArrayList<String> ListMouse = new ArrayList<>();
    static ArrayList<String> ListKeyboard = new ArrayList<>();
    static ArrayList<String> WarnaLaptop = new ArrayList<>();
    static ArrayList<String> WarnaMouse = new ArrayList<>();
    static ArrayList<String> WarnaKeyboard = new ArrayList<>();
    static ArrayList<Integer> TotalLaptop = new ArrayList<>();
    static ArrayList<Integer> TotalMouse = new ArrayList<>();
    static ArrayList<Integer> TotalKeyboard = new ArrayList<>();
    static ArrayList<Integer> HargaLaptop = new ArrayList<>();
    static ArrayList<Integer> HargaMouse = new ArrayList<>();
    static ArrayList<Integer> HargaKeyboard = new ArrayList<>();
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
        System.out.print("\nMasukkan Merk Laptop : ");
        String merk = input.next();
        ListLaptop.add(merk);
        
        System.out.print("\nMasukkan warna Laptop : ");
        String warna = input.next();
        WarnaLaptop.add(warna);
        
        System.out.print("\nMasukkan Total Stok : ");
        int stok = input.nextInt();
        TotalLaptop.add(stok);
        
        System.out.print("\nMasukkan Harga Laptop : ");
        int harga = input.nextInt();
        HargaLaptop.add(harga);
        
        System.out.print("\nMasukkan lagi? y/n :");
        String lagi = input.next();
        
        if (lagi.equalsIgnoreCase("y")) {
            
            tambahLaptop();
        } else {
            input.nextLine();
        }  
        Laptop dataLaptop = new Laptop(merk,warna,stok,harga);
        dataLaptop.isiLaptop();
    }
    static void tambahMouse(){
        System.out.print("\nMasukkan Merk Mouse : ");
        String merk = input.next();
        ListMouse.add(merk);
        
        System.out.print("\nMasukkan warna Mouse : ");
        String warna = input.next();
        WarnaMouse.add(warna);
        
        System.out.print("\nMasukkan Total Mouse : ");
        int stok = input.nextInt();
        TotalMouse.add(stok);
        
        System.out.print("\nMasukkan Harga Mouse : ");
        int harga = input.nextInt();
        HargaMouse.add(harga);
        
        System.out.print("\nMasukkan lagi? y/n :");
        String lagi = input.next();
        
        if (lagi.equalsIgnoreCase("y")) {
            tambahMouse();
        } else {
            input.nextLine();
        }  
        Mouse dataMouse = new Mouse(merk,warna,stok,harga);
        dataMouse.isiMouse();
       
    }
    static void tambahKeyboard(){
        System.out.print("\nMasukkan Merk Keyboard : ");
        String merk = input.next();
        ListKeyboard.add(merk);
        
        System.out.print("\nMasukkan warna Keyboard : ");
        String warna = input.next();
        WarnaKeyboard.add(warna);
        
        System.out.print("\nMasukkan Total Keyboard : ");
        int stok = input.nextInt();
        TotalKeyboard.add(stok);
        
        System.out.print("\nMasukkan Harga Keyboard : ");
        int harga = input.nextInt();
        HargaKeyboard.add(harga);
        
        System.out.print("\nMasukkan lagi? y/n :");
        String lagi = input.next();
        
        if (lagi.equalsIgnoreCase("y")) {
            tambahKeyboard();
        } else {
            input.nextLine();
        }  
        Keyboard dataKeyboard = new Keyboard(merk,warna,stok,harga);
        dataKeyboard.isiKeyboard();
    }
    static void lihatLaptop(){
        if(ListLaptop.isEmpty()){
            System.out.println("Data Kosong");
            menuLaptop();
        } else {
            System.out.println("NO\tMerk Laptop\t\tWarna\tHarga\tStok");
            System.out.println("===========================================================");
            int i = 0;
            for(String merk : ListLaptop){
                String warna = WarnaLaptop.get(i);
                int stok = TotalLaptop.get(i);
                int harga = HargaLaptop.get(i);
                System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i+1 , merk, warna, stok, harga));
                
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
            System.out.println("NO\tMerk Mouse\t\tWarna\tHarga\tStok");
            System.out.println("===========================================================");
            int i = 0;
            for(String merk : ListMouse){
                String warna = WarnaMouse.get(i);
                int stok = TotalMouse.get(i);
                int harga = HargaMouse.get(i);
                System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i+1 , merk, warna, stok, harga));
                
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
           System.out.println("NO\tMerk Keyboard\t\tWarna\tHarga\tStok");
            System.out.println("===========================================================");
            int i = 0;
            for(String merk : ListKeyboard){
                String warna = WarnaKeyboard.get(i);
                int stok = TotalKeyboard.get(i);
                int harga = HargaKeyboard.get(i);
                System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i+1 , merk, warna, stok, harga));
                
                i++;
            }
            
        input.nextLine();
        
    }
    }
    static void editLaptop(){
        System.out.println("NO\tMerk Laptop\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");
        int index = 0;
        for(String merk : ListLaptop){
            String warna = WarnaLaptop.get(index);
            int stok = TotalLaptop.get(index);
            int harga = HargaLaptop.get(index);
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", index , merk, warna, stok, harga));

            index++;
            }
            
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("Pilih Indeks -> ");
            int i = Integer.parseInt(input.next());

            if (i > ListLaptop.size()) {
                throw new IndexOutOfBoundsException("Index tidak ada !");
            } else {

                System.out.print("Merk Laptop baru: ");
                String newMerk = input.next();
                
                System.out.print("Data warna Laptop: ");
                String newWarna = input.next();
                
                System.out.print("Data Stok Laptop: ");
                int newStok = input.nextInt();
                
                System.out.print("Data Harga Laptop: ");
                int newHarga = input.nextInt();

                // update data
                ListLaptop.set(i, newMerk);
                WarnaLaptop.set(i, newWarna);
                TotalLaptop.set(i, newStok);
                HargaLaptop.set(i, newHarga);
                
                Laptop dataLaptop = new Laptop(newMerk,newWarna,newStok,newHarga);
                dataLaptop.editLaptop();
            }
       
        input.nextLine();
    }
    static void editMouse(){
        System.out.println("NO\tMerk Mouse\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");
        int index = 0;
        for(String merk : ListMouse){
            String warna = WarnaMouse.get(index);
            int stok = TotalMouse.get(index);
            int harga = HargaMouse.get(index);
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", index , merk, warna, stok, harga));

            index++;
            }
            
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("Pilih Indeks -> ");
            int i = Integer.parseInt(input.next());

            if (i > ListMouse.size()) {
                throw new IndexOutOfBoundsException("Index tidak ada !");
            } else {

                System.out.print("Merk Mouse baru: ");
                String newMerk = input.next();
                
                System.out.print("Data warna Mouse: ");
                String newWarna = input.next();
                
                System.out.print("Data Stok Mouse: ");
                int newStok = input.nextInt();
                
                System.out.print("Data Harga Mouse: ");
                int newHarga = input.nextInt();

                // update data
                ListMouse.set(i, newMerk);
                WarnaMouse.set(i, newWarna);
                TotalMouse.set(i, newStok);               
                HargaMouse.set(i, newHarga);
                
                Mouse dataMouse = new Mouse(newMerk,newWarna,newStok,newHarga);
                dataMouse.editMouse();
            }
        input.nextLine();
    }
    static void editKeyboard(){
        System.out.println("NO\tMerk Keyboard\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");
        int index = 0;
        for(String merk : ListKeyboard){
            String warna = WarnaKeyboard.get(index);
            int stok = TotalKeyboard.get(index);
            int harga = HargaKeyboard.get(index);
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", index , merk, warna, stok, harga));

            index++;
            }
            
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("Pilih Indeks -> ");
            int i = Integer.parseInt(input.next());

            if (i > ListKeyboard.size()) {
                throw new IndexOutOfBoundsException("Index tidak ada !");
            } else {

                System.out.print("Merk Keyboard baru: ");
                String newMerk = input.next();
                
                System.out.print("Data warna Keyboard: ");
                String newWarna = input.next();
                
                System.out.print("Data Stok Keyboard: ");
                int newStok = input.nextInt();
                
                System.out.print("Data Harga Keyboard: ");
                int newHarga = input.nextInt();

                // update data
                ListKeyboard.set(i, newMerk);
                WarnaKeyboard.set(i, newWarna);
                TotalKeyboard.set(i, newStok);
                HargaKeyboard.set(i, newHarga);
                
                Keyboard dataKeyboard = new Keyboard(newMerk,newWarna,newStok,newHarga);
                dataKeyboard.editKeyboard();
            }
            
        input.nextLine();
    }

    static void hapusLaptop(){
        System.out.println("NO\tMerk Laptop\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");
        int index = 0;
        for(String merk : ListLaptop){
            String warna = WarnaLaptop.get(index);
            int stok = TotalLaptop.get(index);
            int harga = HargaLaptop.get(index);
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", index , merk, warna, stok, harga));

            index++;
        }
        System.out.print("Pilih Index Laptop yang mau dihapus : ");
        int i = Integer.parseInt(input.next());
        
        if (i > ListLaptop.size()) {
            throw new IndexOutOfBoundsException("data tidak ketemu!");
        } else {

            ListLaptop.remove(i);
            WarnaLaptop.remove(i);
            TotalLaptop.remove(i);
            HargaLaptop.remove(i);
            
            Laptop dataLaptop = new Laptop("","",i,i);
            System.out.println("");
            dataLaptop.hapusLaptop();
            
        }
        input.nextLine();
    }
    static void hapusMouse(){
        System.out.println("NO\tMerk Mouse\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");
        int index = 0;
        for(String merk : ListMouse){
            String warna = WarnaMouse.get(index);
            int stok = TotalMouse.get(index);
            int harga = HargaMouse.get(index);
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", index , merk, warna, stok, harga));
       
            index++;
        }
        System.out.print("Pilih Index Mouse yang mau dihapus : ");
        int i = Integer.parseInt(input.next());
        
        if (i > ListMouse.size()) {
            throw new IndexOutOfBoundsException("data tidak ketemu!");
        } else {

            
            ListMouse.remove(i);
            WarnaMouse.remove(i);
            TotalMouse.remove(i);
            HargaMouse.remove(i);
            
            Mouse dataMouse = new Mouse("","",i,i);
            System.out.println("");
            dataMouse.hapusMouse();
        }
        input.nextLine();
        
    }
    static void hapusKeyboard(){
        System.out.println("NO\tMerk Keyboard\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");
        int index = 0;
        for(String merk : ListKeyboard){
            String warna = WarnaKeyboard.get(index);
            int stok = TotalKeyboard.get(index);
            int harga = HargaKeyboard.get(index);
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", index , merk, warna, stok, harga));
       
            index++;
        }
        System.out.print("Pilih Index Keyboard yang mau dihapus : ");
        int i = Integer.parseInt(input.next());
        
        if (i > ListKeyboard.size()) {
            throw new IndexOutOfBoundsException("data tidak ketemu!");
        } else {

            
            ListKeyboard.remove(i);
            WarnaKeyboard.remove(i);
            TotalKeyboard.remove(i);
            HargaKeyboard.remove(i);
            
            Keyboard dataKeyboard = new Keyboard("","",i,i);
            System.out.println("");
            dataKeyboard.hapusKeyboard();
        }
        input.nextLine();
    }
    public static void main(String[] args) {
        
        while(true){
            menuUtama();
        }
    }
}
    
            
