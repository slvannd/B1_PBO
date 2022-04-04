package PenjualanSepeda;

import java.util.Scanner;
import java.util.ArrayList;

public class TampilData {
    ArrayList<DataSepeda> Data;
    
    TampilData(){
        Data = new ArrayList<>();
    }
    
    void tambahData(int id, String merk, String ukr, String wrn, int hrg){
        Data.add(new DataSepeda(id, merk, wrn, ukr, hrg));
    }
    
    void lihatData(){
        for(DataSepeda sepeda:Data){
            System.out.println("id Sepeda : "+sepeda.getId()+""+", Merk : "+sepeda.getMerk()+", Warna : "+sepeda.getWrn()+""+", Ukuran : "+sepeda.getUkr()+""+",Harga : "+sepeda.getHrg()+"");
        }
    }
    
    void hapusData(int idd ){
        Data.removeIf(item -> item.id == (idd));
    }

    void ubahData(int idd, int id, String merk, String ukr, String wrn, int hrg){
        
        int cek = -1;
        for(int i=0; i<Data.size(); i++){
            if (Data.get(i).id == idd){
                cek = i;
                System.out.println(cek);
                Data.set(cek, new DataSepeda(id, merk, wrn, ukr, hrg));
            }
        }
    }
    
    
    
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        int ulang = 1;
        TampilData spd = new TampilData();
        while(ulang == 1){
            System.out.println("\n\n-------------------------");
            System.out.println("|Toko Sepeda Yola Cantik|");
            System.out.println("-------------------------");
            System.out.println("|1. Tambah Data Sepeda  |");
            System.out.println("|2. Tampil Data Sepeda  |");
            System.out.println("|3. Ubah Data Sepeda    |");
            System.out.println("|4. Hapus Data Sepeda   |");
            System.out.println("|5. Keluar              |");
            System.out.println("-------------------------");
            
            int pilihan;
            System.out.print("Masukan Pilihan [1-5] : ");
            pilihan = input.nextInt();
            if (pilihan == 1){
                int ID;
                String Merk;
                String Warna;
                String Ukuran;
                int Harga;
                
                System.out.print("ID                :");
                ID = input.nextInt();
                
                System.out.print("Merk Sepeda       :");
                Merk = input.next();
                
                System.out.print("Warna Sepeda      :");
                Warna = input.next();
                
                System.out.print("Ukuran Sepeda     :");
                Ukuran = input.next();
                           
                System.out.print("Harga Sepeda      :");
                Harga = input.nextInt();
                
                spd.tambahData(ID, Merk, Warna, Ukuran, Harga);
            }
            else if (pilihan == 2){
                spd.lihatData();
                
            }
            else if (pilihan == 3){
                int ID;
                String Merk;
                String Warna;
                String Ukuran;
                int Harga;
                int pilih;
                
                System.out.print("Pilih ID Sepeda Yang Ingin Di Ubah :");
                pilih = input.nextInt();
                
                System.out.print("ID        :");
                ID = input.nextInt();
                
                System.out.print("Merk Sepeda       :");
                Merk = input.next();
                
                System.out.print("Warna Sepeda      :");
                Warna = input.next();
                
                System.out.print("Ukuran Sepeda     :");
                Ukuran = input.next();
                
                
                System.out.print("Harga Sepeda      :");
                Harga = input.nextInt();
                
                spd.ubahData(pilih,ID, Merk, Warna, Ukuran, Harga);
            }
            else if (pilihan == 4){
                int pilih_hapus;
                System.out.print("Pilih ID Sepeda :");
                pilih_hapus = input.nextInt();
                spd.hapusData(pilih_hapus);
            }
             else if (pilihan == 5){
        System.out.println("BYE BYE HEHEHE");
        System.out.println();
             }


        
        }
    }

    private DataSepeda Barang(int id, String merk, String wrn, String ukr, int hg) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
