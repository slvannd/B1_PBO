package POSTTEST2;


import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class main {
static ArrayList<Helm> helm = new ArrayList<>();
static Scanner Masukkan = new Scanner(System.in);

public static void menu()throws IOException{
    System.out.println("\n|-----------------------------|");
    System.out.println("|       HELMET GALLERY        |");
    System.out.println("|--|--------------------------|");
    System.out.println("|1.| Tambah Data Helm         |");
    System.out.println("|2.| Lihat Data Helm          |");
    System.out.println("|3.| Ubah Data Helm           |");
    System.out.println("|4.| Hapus Data Helm          |");
    System.out.println("|5.| Exit                     |"); 
    System.out.println("|--|--------------------------|");
    int pilih;
    System.out.print("Masukan Pilihan : ");
    pilih = Masukkan.nextInt();
    if(pilih == 1){
        TambahData();
    } else if (pilih == 2){
        LihatData();
    } else if (pilih == 3){
        UbahData();
    } else if (pilih == 4){
        HapusData();
    } else if (pilih == 5){
        System.out.println("GOOD BYE");        
        System.exit(0);        
    } else {
        System.out.println("Inputan Yang Anda Masukan Salah !");
        }    
    }

public static void TambahData()throws IOException{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    String nama;
    String merk;
    String warna;
    String ukuran;
    int berat;
    int jumlah;
    int harga;

    System.out.print("\nMasukan Nama         : ");
    nama = r.readLine();
    System.out.print("Masukan Merk Helm    : ");
    merk = r.readLine();
    System.out.print("Masukan Warna Helm   : ");
    warna = r.readLine();
    System.out.print("Masukan Ukuran Helm  : ");
    ukuran = r.readLine();
    System.out.print("Masukan Berat Helm   : ");
    berat = Integer.parseInt(r.readLine());
    System.out.print("Masukan Jumlah Helm  : ");
    jumlah = Integer.parseInt(r.readLine());
    System.out.print("Masukan Harga Helm   : ");
    harga = Integer.parseInt(r.readLine());

    Helm datahelm = new Helm(nama,merk,warna,ukuran,berat,jumlah,harga);
    datahelm.nama = nama;
    datahelm.merk = merk;
    datahelm.warna = warna;
    datahelm.ukuran = ukuran;
    datahelm.berat = berat;
    datahelm.jumlah = jumlah;
    datahelm.harga = harga;
    helm.add(datahelm);
    datahelm.infotambah();
    }

public static void LihatData()throws IOException{
    if(helm.isEmpty()){
        System.out.println("\nTidak Ada Data");
    } else{
        for (int i = 0; i < helm.size(); i++){            
            System.out.println("\nData ke-" + (i + 1));
            System.out.println("------------------------");
            helm.get(i).tampildata();
            }
        }
    }

public static void UbahData()throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int ubahID;
    String nama;
    String merk;
    String warna;
    String ukuran;
    int berat;
    int jumlah;
    int harga;

    LihatData();

    System.out.print("\nMasukkan Data yang Ingin di Ubah: ");
    ubahID = Integer.parseInt(r.readLine());
    int index = ubahID-1;

    System.out.print("\nMasukan Nama         : ");
    nama = r.readLine();
    System.out.print("Masukan Merk Helm    : ");
    merk = r.readLine();
    System.out.print("Masukan Warna Helm   : ");
    warna = r.readLine();
    System.out.print("Masukan Ukuran Helm  : ");
    ukuran = r.readLine();
    System.out.print("Masukan Berat Helm   : ");
    berat = Integer.parseInt(r.readLine());
    System.out.print("Masukan Jumlah Helm  : ");
    jumlah = Integer.parseInt(r.readLine());
    System.out.print("Masukan Harga Helm   : ");
    harga = Integer.parseInt(r.readLine());

    helm.get(index).nama = nama;
    helm.get(index).merk = merk;
    helm.get(index).warna = warna;
    helm.get(index).ukuran = ukuran;
    helm.get(index).berat = berat;
    helm.get(index).jumlah = jumlah;
    helm.get(index).harga = harga; 
    
    helm.get(index).infoupdate(); 
    }

public static void HapusData()throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int ubahID;
    LihatData();

    System.out.print("\nMasukkan Data yang Ingin di Hapus: ");
    ubahID = Integer.parseInt(r.readLine());
    int index = ubahID-1;
    
    helm.get(index).infodelete();
    helm.remove(index);
    
    
    }

public static void main(String[] args)throws IOException {

    while(true) {
       menu();
       }
    }   

}
