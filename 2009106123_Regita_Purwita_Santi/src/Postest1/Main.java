/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Data> Data_KTP;
    static Scanner input = new Scanner (System.in);
    static Main data = new Main();
    
    Main (){
        Data_KTP = new ArrayList<>();
    }
    
    // Tambah Data 
    static void AddData(){
        System.out.print("NIK                  : ");
            int Nik = input.nextInt();
            System.out.print("NAMA                 : ");
            String Nama = input.next();
            System.out.print("TEMPAT TANGGAL LAHIR : ");
            String TTL = input.next();
            System.out.print("JENIS KELAMIN        : ");
            String JK = input.next();
            System.out.print("AGAMA                : ");
            String Agama = input.next();
            System.out.print("STATUS               : ");
            String Status = input.next();
            System.out.print("ALAMAT               : ");
            String Alamat = input.next();
            data.addData(Nik,Nama,TTL,JK,Agama,Status,Alamat);
    }
    void addData(int nik,String nama,String ttl,String jk,String agama,String status,String alamat){
        Data_KTP.add(new Data(nik,nama,ttl,jk,agama,status,alamat));
    }
    
    // Lihat Data
    void ShowData(){
        System.out.println("======================================================");
        System.out.println("|             DAFTAR KARTU TANDA PENDUDUK            |");
        for(Data kartu:Data_KTP)
        {
            System.out.println("======================================================");
            System.out.println("=> NIK\t\t\t\t:" + kartu.getnik());
            System.out.println("=> NAMA\t\t\t\t:" + kartu.getnama());
            System.out.println("=> TEMPAT TANGGAL LAHIR\t:" + kartu.getttl());
            System.out.println("=> JENIS KELAMIN\t\t:" + kartu.getjk());
            System.out.println("=> AGAMA\t\t\t:" + kartu.getagama());
            System.out.println("=> STATUS\t\t\t:" + kartu.getstatus());
            System.out.println("=> ALAMAT\t\t\t:" + kartu.getalamat());
            System.out.println("======================================================");
        
        }
    }
    
    // Edit Data
    static void EditData(){
        System.out.print("Masukkan NIK Yang Ingin Di Ubah : ");
            int pilih = input.nextInt();
            System.out.print("NIK                  : ");
            int Nik = input.nextInt();
            System.out.print("NAMA                 : ");
            String Nama = input.next();
            System.out.print("TEMPAT TANGGAL LAHIR : ");
            String TTL = input.next();
            System.out.print("JENIS KELAMIN        : ");
            String JK = input.next();
            System.out.print("AGAMA                : ");
            String Agama = input.next();
            System.out.print("STATUS               : ");
            String Status = input.next();
            System.out.print("ALAMAT               : ");
            String Alamat = input.next();
            data.editData(pilih,Nik,Nama,TTL,JK,Agama,Status,Alamat);
    }
    void editData(int x,int nik,String nama,String ttl,String jk,String agama,String status,String alamat){

        int cek = -1;
        for(int i=0; i<Data_KTP.size(); i++){
            if (Data_KTP.get(i).nik == x){
                cek = i;
                System.out.println(cek);   
                Data_KTP.set(cek,new Data (nik,nama,ttl,jk,agama,status,alamat));
            }
        }
    }
    
    // Hapus Data
    static void DeleteData(){
        int hapus;
            System.out.print("Masukkan NIK yang akan dihapus : ");
            hapus = input.nextInt();
            data.deleteData(hapus);
    }
    void deleteData(int x){
        Data_KTP.removeIf(item -> item.nik ==(x));
    }
    
   
    public static void main(String args[]){
    int i = 1;
    while(i==1){
        System.out.println("+=================================+");
        System.out.println("|       PROGRAM PEMBUATAN KTP     |");
        System.out.println("+=================================+");
        System.out.println("|    1.Tambah Data                |");
        System.out.println("|    2.Lihat Data                 |");
        System.out.println("|    3.Edit Data                  |");
        System.out.println("|    4.Hapus Data                 |");
        System.out.println("|    5.Exit Program               |");
        System.out.println("+=================================+"); 
        int pilihan;
        System.out.print("Masukkan Pilihan [1-5] : ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            AddData(); 
        } else if (pilihan == 2){ 
            data.ShowData();
        } else if (pilihan == 3){
           EditData();
        } else if (pilihan == 4){
            DeleteData();
        } else if (pilihan == 5){
        System.exit(0);
        }
    } 
    }
}

