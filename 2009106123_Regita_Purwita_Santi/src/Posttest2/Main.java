package Posttest2;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    ArrayList<Data> Data_KTP = new ArrayList<>();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Main data = new Main();
    static int Nik;
    static String Nama,TTL,JK,Agama,Status,Alamat;
    static Data dataktp = new Data(Nik,Nama,TTL,JK,Agama,Status,Alamat);
    

    
    public static void main(String[] args) throws IOException
    {
        dataktp.Welcome();
        ShowMenu ();
    }
    
    // Tambah Data 
    static void AddData() throws IOException{
            System.out.print("NIK                  : ");
            int Nik = Integer.parseInt(input.readLine());
            dataktp.nik = Nik;
            System.out.print("NAMA                 : ");
            String Nama = input.readLine();
            dataktp.nama = Nama;
            System.out.print("TEMPAT TANGGAL LAHIR : ");
            String TTL = input.readLine();
            dataktp.ttl = TTL;
            System.out.print("JENIS KELAMIN        : ");
            String JK = input.readLine();
            dataktp.jk = JK;
            System.out.print("AGAMA                : ");
            String Agama = input.readLine();
            dataktp.agama = Agama;
            System.out.print("STATUS               : ");
            String Status = input.readLine();
            dataktp.status = Status;
            System.out.print("ALAMAT               : ");
            String Alamat = input.readLine();
            dataktp.alamat = Alamat;
            data.addData(dataktp.nik,dataktp.nama,dataktp.ttl,dataktp.jk,dataktp.agama,dataktp.status,dataktp.alamat);
    }
    void addData(int nik,String nama,String ttl,String jk,String agama,String status,String alamat){
        Data_KTP.add(new Data(nik,nama,ttl,jk,agama,status,alamat));
    }
    
    
    // Lihat Data
    void ShowData(){
        System.out.println("======================================================");
        System.out.println("|             DAFTAR KARTU TANDA PENDUDUK            |");
        System.out.println("======================================================");
        for(Data kartu:Data_KTP)
        {
        System.out.println("=> NIK\t\t\t\t:" + kartu.nik);
        System.out.println("=> NAMA\t\t\t\t:" + kartu.nama);
        System.out.println("=> TEMPAT TANGGAL LAHIR\t:" + kartu.ttl);
        System.out.println("=> JENIS KELAMIN\t\t:" + kartu.jk);
        System.out.println("=> AGAMA\t\t\t:" + kartu.agama);
        System.out.println("=> STATUS\t\t\t:" + kartu.status);
        System.out.println("=> ALAMAT\t\t\t:" + kartu.alamat);
        System.out.println("======================================================");
        
        
        }
    }
    
    
    // Edit Data
    static void EditData() throws IOException{
        System.out.print("Masukkan NIK Yang Ingin Di Ubah : ");
        int pilih = Integer.parseInt(input.readLine());
            System.out.print("NIK                  : ");
            int Nik = Integer.parseInt(input.readLine());
            dataktp.nik = Nik;
            System.out.print("NAMA                 : ");
            String Nama = input.readLine();
            dataktp.nama = Nama;
            System.out.print("TEMPAT TANGGAL LAHIR : ");
            String TTL = input.readLine();
            dataktp.ttl = TTL;
            System.out.print("JENIS KELAMIN        : ");
            String JK = input.readLine();
            dataktp.jk = JK;
            System.out.print("AGAMA                : ");
            String Agama = input.readLine();
            dataktp.agama = Agama;
            System.out.print("STATUS               : ");
            String Status = input.readLine();
            dataktp.status = Status;
            System.out.print("ALAMAT               : ");
            String Alamat = input.readLine();
            dataktp.alamat = Alamat;
            data.editData(pilih,dataktp.nik,dataktp.nama,dataktp.ttl,dataktp.jk,dataktp.agama,dataktp.status,dataktp.alamat);
    }
    void editData(int pilih,int nik,String nama,String ttl,String jk,String agama,String status,String alamat){

        int cek = -1;
        for(int i=0; i<Data_KTP.size(); i++){
            if (Data_KTP.get(i).nik == pilih){
                cek = i;
                System.out.println(cek);   
                Data_KTP.set(cek,new Data (nik,nama,ttl,jk,agama,status,alamat));
                System.out.println("===================================================");
                System.out.println("DATA KTP DENGAN NIK " + pilih + " BERHASIL DIUPDATE");
                System.out.println("===================================================");
            }
            else if (Data_KTP.get(i).nik != pilih){
                System.out.println(" ============================================== ");
                System.out.println("         *** NIK TIDAK DITEMUKAN ***            ");
                System.out.println(" ============================================== ");
        }
        }
    } 
    
    
    // Hapus Data
    static void DeleteData()throws IOException{
        System.out.print("Masukkan NIK yang akan dihapus : ");
        int hapus = Integer.parseInt(input.readLine());
        data.deleteData(hapus);
        }
    
    void deleteData(int hapus){
        int cek = -1;
        for(int i=0; i<Data_KTP.size(); i++){
            if (Data_KTP.get(i).nik == hapus){
                cek = i;
                System.out.println(cek);   
                Data_KTP.removeIf(item -> item.nik ==(hapus));
                System.out.println("===================================================");
                System.out.println("DATA KTP DENGAN NIK " + hapus + " BERHASIL DI HAPUS");
                System.out.println("===================================================");
            }
            else if (Data_KTP.get(i).nik != hapus){
                System.out.println(" ============================================== ");
                System.out.println("         *** NIK TIDAK DITEMUKAN ***            ");
                System.out.println(" ============================================== ");
            }
         }
    } 
    
    
   // Show Menu
    static void ShowMenu() throws IOException{
        int i = 1;
        while(i==1){
        System.out.println("+==============================================+");
        System.out.println("|          MENU PROGRAM PEMBUATAN KTP          |");
        System.out.println("+==============================================+");
        System.out.println("|            1.Tambah Data                     |");
        System.out.println("|            2.Lihat Data                      |");
        System.out.println("|            3.Edit Data                       |");
        System.out.println("|            4.Hapus Data                      |");
        System.out.println("|            5.Exit Program                    |");
        System.out.println("+==============================================+"); 
        int pilihan;
        System.out.print("Masukkan Pilihan [1-5] : ");
        pilihan =Integer.parseInt(input.readLine());
        if (pilihan == 1){
            AddData(); 
        } else if (pilihan == 2){ 
            if(data.Data_KTP.size() <= 0){
                System.out.println("*** TIDAK ADA DATA KTP ***");
            }
            else{
                data.ShowData();
            }
        } else if (pilihan == 3){
            if(data.Data_KTP.size() <= 0){
               System.out.println("*** TIDAK ADA DATA KTP ***");
            }
            else{
               EditData();
            }
        } else if (pilihan == 4){
            if(data.Data_KTP.size() <= 0){
               System.out.println("*** TIDAK ADA DATA KTP ***");
            }
            else{
               DeleteData(); 
            }            
        } else if (pilihan == 5){
            dataktp.Thanks();
            System.exit(0);
        } else{
            System.out.println("Inputan Anda Salah");
        }
        
    } 
    }
}