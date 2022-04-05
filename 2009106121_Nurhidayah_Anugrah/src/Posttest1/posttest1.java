/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author MSi-Modern
 */
public class posttest1 {
    static ArrayList Listinformasi = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void ShowMenu() throws IOException{
        System.out.println("Sistem Informasi Lomba dan Beasiswa");        
        System.out.println("[1] Tampilkan seluruh informasi");
        System.out.println("[2] Tambah informasi");
        System.out.println("[3] Edit informasi");
        System.out.println("[4] Hapus informasi");
        System.out.println("[5] Exit");
        System.out.println("Pilih menu>");
        
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                Tampilkan_informasi();
                break;
            case 2:
                Tambah_informasi();
                break;
            case 3:
                Edit_informasi();
                break;
            case 4:
                Hapus_informasi();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("\nPilihan anda tidak tersedia");
        }
    }
        static void Tampilkan_informasi(){
            if(Listinformasi.isEmpty()){
                System.out.println("Belum ada informasi lomba dan beasiswa");
            } else {
                for(int i = 0; i < Listinformasi.size(); i++){
                    System.out.println(String.format("[%d] %s",i, Listinformasi.get(i)));
                }
            }     
        }
        static void Tambah_informasi() throws IOException{
            System.out.println("Nama lomba/beasiswa:");
            String namainformasi = input.readLine();
            Listinformasi.add(namainformasi);
        }
        static void Edit_informasi() throws IOException{
            Tampilkan_informasi();
            System.out.print("Pilih nomor informasi:");
            int indexinformasi = Integer.valueOf(input.readLine());
            
            System.out.println("Informasi lomba atau beasiswa baru:");
            String namaBaru = input.readLine();
            
            Listinformasi.set(indexinformasi, namaBaru);
        }
        static void Hapus_informasi() throws IOException{
            Tampilkan_informasi();
            System.out.print("Pilih nomor informasi yang ingin dihapus:");
            int indexinformasi = Integer.valueOf(input.readLine());
            
            Listinformasi.remove(indexinformasi);
        }
        public static void main(String[] args)throws IOException{
            do{
                ShowMenu();
            }while (isRunning);
        }
}
