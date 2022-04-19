/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RIRI-CHAN
 */
public class main {
    static ArrayList listTas = new ArrayList();
    static ArrayList kode = new ArrayList();
    static ArrayList tgl = new ArrayList();
    static ArrayList namaTas = new ArrayList();
    static ArrayList brand = new ArrayList();
    static ArrayList tujuan = new ArrayList();
    static ArrayList status = new ArrayList();
    static boolean isRunning = true;
    static boolean isEditing = false;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
  
    public static void main(String[] args) throws IOException{
        do{
            showMenuUtama();
        } while (isRunning);
    }
    
    static void showMenuUtama() throws IOException{
        System.out.println("||+++++EKSPOR - IMPOR TAS LUXURY+++++||");
        System.out.println("1. EKSPOR DAN IMPOR");
        System.out.println("2. PENGIRIMAN");
        System.out.println("3. KELUAR");
        System.out.println("||+++++++++++++++++++++++++++++++++++||");
        System.out.print("Pilih menu [1/2] : ");
        int selectMenu = Integer.valueOf(input.readLine());
            
        switch (selectMenu) {
            case 1 :
                System.out.println("EKSPOR DAN IMPOR TAS LUXURY");
                showMenu();
                break;
            case 2 :
                pengiriman kirim = new pengiriman();
                kirim.setNo_kirim(123456);
                kirim.setEkspedisi("J&T EKSPRESS");
                kirim.setNama_barang("TAS LUXURY");
                kirim.setStatus_kirim("EKSPOR");
                kirim.setBerat_barang(1.0);
                kirim.setTgl_kirim("14 Januari 2022");
                
                System.out.println("No Pengiriman : "+kirim.getNo_kirim());
                System.out.println("Ekspedisi : "+kirim.getEkspedisi());
                System.out.println("Nama Barang : "+kirim.getNama_barang());
                System.out.println("Status Kirim : " + kirim.getStatus_kirim());
                System.out.println("Berat Barang : "+kirim.getBerat_barang()+"kg");
                System.out.println("======="+kirim.getTgl_kirim()+"=========");
            case 3 :
                System.exit(0);
            default :
                System.out.println("\nPilihan Anda salah\nSilahkan memilih [1/2]");
            }
    }
    
    static void kembali()throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
    }
    
    static void showMenu()throws IOException{
        System.out.println("||+++++++++++++++++MENU++++++++++++++++||");
        System.out.println("1. Lihat Data Tas yang telah di Ekspor");
        System.out.println("2. Membuat Data Tas");
        System.out.println("3. Mengupdate Data Tas");
        System.out.println("4. Menghapus Data Tas");
        System.out.println("5. Kembali");
        System.out.println("||+++++++++++++++++++++++++++++++++++++||");  
        System.out.print("Silahkan Pilih [1/2/3/4/5] : ");
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
                    kembali();
                    break;
                default :
                    System.out.println("\n Inputan Salah\nSilahkan memilih [1-5] ");
            }
    }

    static void lihatdatatas() throws IOException{
        if(listTas.isEmpty()){
            System.out.println("Data Kosong");
            kembali();
        } else {
            for(int i = 0; i < listTas.size(); i++){
                System.out.println("No\tKode\t\tNama Tas\tBrand\t\tStatus\t\tTujuan\t\tTanggal");
                System.out.println("====================================================================================================================");
                System.out.println(String.format("%d\t%s",i,listTas.get(i)));
            }
            if(!isEditing){
            kembali();
            }
        }
    }
    
    static void buatdatatas() throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Kode : ");
        int kode = input.nextInt();
        input.nextLine();
        System.out.print("Nama Tas : ");
        String namaTas = input.nextLine();
        System.out.print("Nama Brand : ");
        String brand = input.nextLine();
        System.out.print("Status : ");
        String status = input.nextLine();
        System.out.print("Tujuan Negara : ");
        String tujuan = input.nextLine();
        System.out.print("Tanggal Produksi : ");
        String tgl = input.nextLine();
        listTas.add(kode+"\t\t"+namaTas+"\t\t"+brand+"\t\t"+status+"\t\t"+tujuan+"\t"+tgl);
        kembali();
    }
    
    static void editdatatas() throws IOException{
        isEditing = true;
        lihatdatatas();
        Scanner input = new Scanner(System.in);
        try {
                System.out.println("-----------------");
                System.out.print("Pilih Indeks -> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > listTas.size()) {
                    throw new IndexOutOfBoundsException("Data anda salah !");
                } else {
                    System.out.print("Kode : ");
                    int newkode = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Tas : ");
                    String newnamaTas = input.nextLine();
                    System.out.print("Nama Brand : ");
                    String newbrand = input.nextLine();
                    System.out.print("Status : ");
                    String newstatus = input.nextLine();
                    System.out.print("Tujuan Negara : ");
                    String newtujuan = input.nextLine();
                    System.out.print("Tanggal Produksi : ");
                    String newtgl = input.nextLine();

                    // update data
                    listTas.set(index, newkode);
                    listTas.set(index, newnamaTas);
                    listTas.set(index, newbrand);
                    listTas.set(index, newtujuan);
                    listTas.set(index, newstatus);
                    listTas.set(index, newtgl);

                    System.out.println(listTas.set(index, newkode+"\t\t"+newnamaTas+"\t\t"+newbrand+"\t\t"+newstatus+"\t\t"+newtujuan+"\t\t"+newtgl));
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        
        isEditing = false; 
        kembali();
    }
          
    static void hapusdatatas() throws IOException{
        isEditing = true;
        lihatdatatas();
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            try {
                if (index > listTas.size()) {
                    throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
                } else {

                    System.out.println("Kamu akan menghapus Index ke " + index);
                    listTas.remove(index);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            kembali();
    }
       

}
