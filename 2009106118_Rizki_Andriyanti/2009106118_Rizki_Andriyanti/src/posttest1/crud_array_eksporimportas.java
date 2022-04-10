/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author RIRI-CHAN
 */
public class crud_array_eksporimportas {
    static ArrayList listTas = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenuUtama() throws IOException{
        System.out.println("EKSPOR - IMPOR TAS LUXURY");
        System.out.println("1. EKSPOR");
        System.out.println("2. IMPOR");
        System.out.println("3. KELUAR");
           
        System.out.print("\nAnda memilih menu: ");
        int selectMenu = Integer.valueOf(input.readLine());
            
        switch (selectMenu) {
            case 1 :
                System.out.println("EKSPOR TAS LUXURY");
                ekspor();
                break;
            case 2 :
                System.out.println("IMPOR TAS LUXURY");
                impor();
                break;
            case 3 :
                System.exit(0);
                break;
            default :
                System.out.println("\nPilihan Anda salah\nSilahkan memilih [1/2]");
            }
    }
    
    static void ekspor()throws IOException{
        System.out.println("MENU");
        System.out.println("1. Lihat Data Tas yang telah di Ekspor");
        System.out.println("2. Membuat Data Tas");
        System.out.println("3. Mengupdate Data Tas");
        System.out.println("4. Menghapus Data Tas");
        System.out.println("5. KELUAR");
            
        System.out.print("\nSilahkan Pilih : ");
        int Ekspor = Integer.valueOf(input.readLine());
        
         switch (Ekspor) {
                case 1 :
                    System.out.println("Lihat Data Tas Luxury");
                    lihatdatatas();
                    break;
                case 2 :
                    System.out.println("Membuat Data Tas Luxury");
                    buatdatatas();
                    break;
                case 3 :
                    System.out.println("Update Data Tas Luxury");
                    editdatatas();
                    break;
                case 4 :
                    System.out.println("Hapus Data Tas Luxury");
                    hapusdatatas();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("\n Inputan Salah\nSilahkan memilih [1-5] ");
            }
    }
    
    static void impor()throws IOException{
        System.out.println("MENU");
        System.out.println("1. Lihat Data Tas yang telah di Impor");
        System.out.println("2. Membuat Data Tas");
        System.out.println("3. Mengupdate Data Tas");
        System.out.println("4. Menghapus Data Tas");
        System.out.println("5. KELUAR");
            
        System.out.println("\nSilahkan Pilih : ");
        int Ekspor = Integer.valueOf(input.readLine());
        
         switch (Ekspor) {
                case 1 :
                    System.out.println("Lihat Data Tas Luxury");
                    lihatdatatas();
                    break;
                case 2 :
                    System.out.println("Membuat Data Tas Luxury");
                    buatdatatas();
                    break;
                case 3 :
                    System.out.println("Update Data Tas Luxury");
                    editdatatas();
                    break;
                case 4 :
                    System.out.println("Hapus Data Tas Luxury");
                    hapusdatatas();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("\n Inputan Salah\nSilahkan memilih [1-5] ");
            }
    }
    
    static void lihatdatatas(){
        if(listTas.isEmpty()){
            System.out.println("Data Kosong");
        } else {
            for(int i = 0; i < listTas.size(); i++){
                System.out.println(String.format("[%d] %s",i,listTas.get(i)));
            }
        }
    }
    
    static void buatdatatas() throws IOException{
        System.out.print("Kode : ");
        int kode = input.read();
        System.out.print("Nama Tas : ");
        String namaTas = input.readLine();
        System.out.print("Nama Brand : ");
        String brand = input.readLine();
        System.out.print("Tanggal Produksi : ");
        int tgl = input.read();
        System.out.print("Tujuan Negara : ");
        String tujuan = input.readLine();
        listTas.add(namaTas +"\n"+ kode +"\n"+ brand +"\n" +tgl +"\n" +tujuan);
    }
    
    static void editdatatas() throws IOException{
        lihatdatatas();
        System.out.println("Pilih Nomor Urutan : ");
        int noTas = Integer.valueOf(input.readLine());
        
        System.out.println("Kode : ");
        int kode = input.read();
        System.out.println("Nama Tas yang Baru : ");
        String namaTas = input.readLine();
        System.out.println("Nama Brand yang Baru : ");
        String brand = input.readLine();
        System.out.println("Tanggal Produksi yang Baru : ");
        int tgl = input.read();
        System.out.println("Tujuan Negara yang Baru : ");
        String tujuan = input.readLine();
        listTas.add(noTas,namaTas + kode + brand + tgl + tujuan);
    }
    
    static void hapusdatatas() throws IOException{
        lihatdatatas();
        System.out.println("Pilih Nomor Urutan : ");
        int noTas = Integer.valueOf(input.readLine());
        
        listTas.remove(noTas);
    }
    
    public static void main(String[] args) throws IOException{
        do{
            showMenuUtama();
        } while (isRunning);
    }
}
