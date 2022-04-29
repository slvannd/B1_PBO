package POSTTEST1;

import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class main {
static ArrayList<Helm> helm = new ArrayList<Helm>();

public static void menu()throws IOException{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\n|-----------------------------|");
    System.out.println("|       HELMET GALLERY        |");
    System.out.println("|--|--------------------------|");
    System.out.println("|1.| Tambah Data Helm         |");
    System.out.println("|2.| Lihat Data Helm          |");
    System.out.println("|3.| Ubah Data Helm           |");
    System.out.println("|4.| Hapus Data Helm          |");
    System.out.println("|5.| Exit                     |"); 
    System.out.println("|--|--------------------------|");
    String pilih;
    System.out.print("Masukan Pilihan : ");
    pilih = r.readLine();
    if(pilih.equals("1")){
        TambahData();
    } else if (pilih.equals("2")){
        LihatData();
    } else if (pilih.equals("3")){
        UbahData();
    } else if (pilih.equals("4")){
        HapusData();
    } else if (pilih.equals("5")){
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
    System.out.print("Masukan Jumlah Helm  : ");
    jumlah = Integer.parseInt(r.readLine());
    System.out.print("Masukan Harga Helm   : ");
    harga = Integer.parseInt(r.readLine());

    Helm datahelm = new Helm();
    datahelm.nama = nama;
    datahelm.merk = merk;
    datahelm.warna = warna;
    datahelm.ukuran = ukuran;
    datahelm.jumlah = jumlah;
    datahelm.harga = harga;
    helm.add(datahelm);
    System.out.print("\nData Berhasil di Tambah...\n");
    }

public static void LihatData()throws IOException{
    if(helm.isEmpty()){
        System.out.println("\nTidak Ada Data");
    } else{
        for (int i = 0; i < helm.size(); i++){            
            System.out.println("\nData ke-" + (i + 1));
            System.out.println("------------------------");
            System.out.println("Nama        : " + helm.get(i).nama);
            System.out.println("Merk Helm   : " + helm.get(i).merk);
            System.out.println("Warna Helm  : " + helm.get(i).warna);
            System.out.println("Ukuran Helm : " + helm.get(i).ukuran);
            System.out.println("Jumlah Helm : " + helm.get(i).jumlah);
            System.out.println("Harga Helm  : " + helm.get(i).harga);
            System.out.println(" ");
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
    int jumlah;
    int harga;

    LihatData();

    System.out.print("Masukkan Data yang Ingin di Ubah: ");
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
    System.out.print("Masukan Jumlah Helm  : ");
    jumlah = Integer.parseInt(r.readLine());
    System.out.print("Masukan Harga Helm   : ");
    harga = Integer.parseInt(r.readLine());

    helm.get(index).nama = nama;
    helm.get(index).merk = merk;
    helm.get(index).warna = warna;
    helm.get(index).ukuran = ukuran;
    helm.get(index).jumlah = jumlah;
    helm.get(index).harga = harga; 
    System.out.print("\nData Berhasil di Ubah...\n");
    }

public static void HapusData()throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int ubahID;
    LihatData();
    System.out.print("Masukkan Data yang Ingin di Hapus: ");
    ubahID = Integer.parseInt(r.readLine());
    int index = ubahID-1;

    helm.remove(index);
    System.out.print("\nData Berhasil di Hapus...\n");
    }

public static void main(String[] args)throws IOException {

    while(true) {
       menu();
       }
    }   

}
