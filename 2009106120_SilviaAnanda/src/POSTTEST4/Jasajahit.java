/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI Gaming
 */
public class Jasajahit {
    ArrayList<DataPelanggan> data_pelanggan = new ArrayList<>();
    ArrayList<DataPesanan> data_pesanan = new ArrayList<>();
    String labelDataPelanggan   = "--  DATA PELANGGAN  --";
    String garisDataPelanggan   = "======================";
    String labelDataPesanan     = "--  DATA PESANAN  --";
    String garisDataPesanan     = "====================";
    
    public static void main(String[] args) {
        Jasajahit jasajahitSilvia = new Jasajahit();
        jasajahitSilvia.mainMenu();
    }
    
    private void mainMenu(){
        Scanner myInput = new Scanner(System.in);
        int pilihanMenu;
        System.out.println("Silahkan pilih menu dibawah ini :");
        System.out.println("[1] Data Pelanggan");
        System.out.println("[2] Data Pesanan");
        System.out.println("[0] Stop Program");
        System.out.println();
        System.out.print("Masukkan Pilihan Menu : ");
        pilihanMenu = myInput.nextInt();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                dataPelanggan();
                break;
            case 2:
                dataPesanan();
                break;
            case 0:
                System.out.println("Keluar Program,Terimakasih Telah Menggunakan Program Silvia");
                System.exit(0);
            default:
                System.out.println("Pilihan Menu Tidak Tersedia");
                System.out.println();
                mainMenu();
                break;
        }
    }
    
    private void dataPelanggan(){
        Scanner myInput = new Scanner(System.in);
        int pilihanMenu;
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println();
        System.out.println("Silahkan pilih menu dibawah ini :");
        System.out.println("[1] Tampil Data\t\t[4] Hapus Data\t\t[0] Kembali");
        System.out.println("[2] Tambah Data\t\t");
        System.out.println("[3] Edit Data\t\t");
        System.out.println();
        System.out.print("Masukkan Pilihan Menu : ");
        pilihanMenu = myInput.nextInt();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                dataPelangganTampil();
                break;
            case 2:
                dataPelangganTambah();
                break;
            case 3:
                dataPelangganEdit();
                break;
            case 4:
                hapusDataPelanggan();
                break;
            case 0:
                mainMenu();
            default:
                System.out.println("Pilihan Menu Tidak Tersedia");
                System.out.println();
                dataPelanggan();
                break;
        }
    }
    
    private void dataPesanan(){
        Scanner myInput = new Scanner(System.in);
        int pilihanMenu;
        System.out.println(labelDataPesanan);
        System.out.println(garisDataPesanan);
        System.out.println("--  DATA PESANAN  --");
        System.out.println("====================");
        System.out.println();
        System.out.println("Silahkan pilih menu dibawah ini :");
        System.out.println("[1] Tampil Data\t\t[4] Hapus Data\t\t[0] Kembali");
        System.out.println("[2] Tambah Data\t\t");
        System.out.println("[3] Edit Data\t\t");
        System.out.println();
        System.out.print("Masukkan Pilihan Menu : ");
        pilihanMenu = myInput.nextInt();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                tampilDataPesanan();
                break;
            case 2:
                dataPesananTambah();
                break;
            case 3:
                dataPesananEdit();
                break;
            case 4:
                hapusDataPesanan();
                break;
            case 0:
                mainMenu();
            default:
                System.out.println("Pilihan Menu Tidak Tersedia");
                System.out.println();
                dataPesanan();
                break;
        }
    }
    
    public void dataPelangganTampil(){
        Scanner myInput = new Scanner(System.in);
        int pilihanAksi;
        
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println("~~~  TAMPIL DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.println("ID\tNAMA\t\tJENKEL\tALAMAT\t\tNO HP");
        for(int i=0; i < data_pelanggan.size(); i++){
            DataPelanggan data = data_pelanggan.get(i);
            System.out.print(data.id_pelanggan + "\t");
            System.out.print(data.nama_pelanggan + "\t");
            System.out.print(data.jenis_kelamin + "\t");
            System.out.print(data.alamat_pelanggan + "\t");
            System.out.print(data.nohp_pelanggan);
            System.out.println();
        }
        
        System.out.println();
        System.out.print("Masukkan angka nol (0) untuk kembali atau 1 untuk kembali ke menu utama : ");
        pilihanAksi = myInput.nextInt();
        System.out.println();
        
        switch (pilihanAksi) {
            case 0:
                dataPelanggan();
                break;
            case 1:
                mainMenu();
                break;
            default:
                System.out.println("Pilihan Aksi Tidak Tersedia");
                System.out.println();
                dataPelangganTampil();
                break;
        }
    }
    
    public void dataPelangganTambah(){
        Scanner myInput = new Scanner(System.in);
        String id, nama, jenis_kelamin, alamat, nohp;
        int pilihanAksi;
        
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println("~~~  TAMBAH DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.print("ID Pelanggan : ");
        id = myInput.nextLine();
        System.out.print("Nama Pelanggan : ");
        nama = myInput.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        jenis_kelamin = myInput.nextLine();
        System.out.print("Alamat : ");
        alamat = myInput.nextLine();
        System.out.print("No HP Pelanggan : ");
        nohp = myInput.nextLine();
        System.out.println();
        
        System.out.println("Silahkan pilih aksi dibawah ini :");
        System.out.println("[1] Simpan Data & Tambah Lagi\t[3] Kembali");
        System.out.println("[2] Simpan Data & Kembali\t[4] Kembali Ke Menu Utama");
        System.out.println();
        System.out.print("Masukkan Pilihan Aksi : ");
        pilihanAksi = myInput.nextInt();
        System.out.println();
        
        switch (pilihanAksi) {
            case 1:
                data_pelanggan.add(new DataPelanggan(id, nama, jenis_kelamin, alamat, nohp));
                dataPelangganTambah();
                break;
            case 2:
                data_pelanggan.add(new DataPelanggan(id, nama, jenis_kelamin, alamat, nohp));
                dataPelanggan();
                break;
            case 3:
                dataPelanggan();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Pilihan Aksi Tidak Tersedia");
                System.out.println();
                dataPelangganTambah();
                break;
        }
    }
    
    public void dataPelangganEdit(){
        Scanner myInput = new Scanner(System.in);
        int pilihanAksi;
        int index = 0;
        boolean ketemu = true;
        String id_pelanggan, nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp;
        
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println("~~~  EDIT DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        
        System.out.print("Masukkan ID Pelanggan : ");
        id_pelanggan = myInput.nextLine();
        
        for(int i=0; i < data_pelanggan.size(); i++){
            DataPelanggan data = data_pelanggan.get(i);
            if(id_pelanggan == data.id_pelanggan){
                index = i;
                ketemu = true;
                i = data_pelanggan.size();
            }
        }
        
        if(ketemu==false){
            System.out.print("Data tidak ditemukan. Masukkan angka nol (0) untuk kembali atau 1 untuk mengulang : ");
            pilihanAksi = myInput.nextInt();
            switch (pilihanAksi) {
                case 0:
                    dataPelanggan();
                    break;
                case 1:
                    dataPelangganEdit();
                    break;
                default:
                    System.out.println("Pilihan Aksi Tidak Tersedia");
                    System.out.println();
                    dataPelangganEdit();
                    break;
            }
        }else{        
            System.out.println("ID Pelanggan : " + id_pelanggan);
            System.out.print("Nama Pelanggan : ");
            nama_pelanggan = myInput.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            jenis_kelamin = myInput.nextLine();
            System.out.print("Alamat : ");
            alamat_pelanggan = myInput.nextLine();
            System.out.print("No HP Pelanggan : ");
            nohp = myInput.nextLine();
            System.out.println();

            System.out.println("Silahkan pilih aksi dibawah ini :");
            System.out.println("[1] Simpan Data & Kembali\t[2] Ulangi");
            System.out.println();
            System.out.print("Masukkan Pilihan Aksi : ");
            pilihanAksi = myInput.nextInt();
            System.out.println();

            switch (pilihanAksi) {
                case 1:
                    data_pelanggan.set(index, new DataPelanggan(id_pelanggan, nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp));
                    dataPelanggan();
                    break;
                case 2:
                    dataPelangganEdit();
                    break;
                default:
                    System.out.println("Pilihan Aksi Tidak Tersedia");
                    System.out.println();
                    dataPelanggan();
                    break;
            }
        }
    }
    public void hapusDataPelanggan(){
                
        Scanner myInput = new Scanner(System.in);
        int pilihanAksi;
        int index = 0;
        boolean ketemu = true;
        String id_pelanggan, nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp;
        
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println("~~~  HAPUS DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        System.out.print("Masukkan ID Pelanggan : ");
        id_pelanggan = myInput.nextLine();
        
        for(int i=0; i < data_pelanggan.size(); i++){
            if(id_pelanggan == id_pelanggan){
                index = i;
                ketemu = true;
                i = data_pelanggan.size();{

             }
            }
            if(ketemu==false){
                System.out.print("Data tidak ditemukan. Masukkan angka nol (0) untuk kembali atau 1 untuk mengulang : ");
                pilihanAksi = myInput.nextInt();
                switch (pilihanAksi) {
                case 0:
                    dataPelanggan();
                    break;
                case 1:
                    hapusDataPelanggan();
                    break;
                default:
                    System.out.println("Pilihan Aksi Tidak Tersedia");
                    System.out.println();
                    hapusDataPelanggan();
                    break;
                }  
            }else{
                    System.out.println("Data Terhapus");
                    System.out.println("Silahkan pilih aksi dibawah ini :");
                    System.out.println("[1] Simpan Data & Kembali\t[2] Ulangi");
                    System.out.println();
                    System.out.print("Masukkan Pilihan Aksi : ");
                    pilihanAksi = myInput.nextInt();
                     System.out.println();
                    
                    switch (pilihanAksi) {
                    case 0:
                        dataPelanggan();
                        break;
                    case 1:
                        dataPelanggan();
                        break;
                    default:
                       System.out.println("Pilihan Aksi Tidak Tersedia");
                       System.out.println();
                       hapusDataPelanggan();
                       break;
                 }
            }
        }
    }
    public void tampilDataPesanan(){
        Scanner myInput = new Scanner(System.in);
        int pilihanAksi;
        System.out.println(labelDataPesanan);
        System.out.println(garisDataPesanan);
        System.out.println("~~~  TAMPIL DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.println("ID\tJENIS JAHITAN\t\tUKURANL\tJENIS KAIN\t\tJUMLAH");
        for(int i=0; i < data_pesanan.size(); i++){
            DataPesanan data = data_pesanan.get(i);
            System.out.print(data.id_pesanan + "\t");
            System.out.print(data.jenis_jahitan + "\t");
            System.out.print(data.ukuran + "\t");
            System.out.print(data.jenis_kain + "\t");
            System.out.print(data.jumlah);
            System.out.println();
        }
        
        System.out.println();
        System.out.print("Masukkan angka nol (0) untuk kembali atau 1 untuk kembali ke menu utama : ");
        pilihanAksi = myInput.nextInt();
        System.out.println();
        
        switch (pilihanAksi) {
            case 0:
                dataPesanan();
                break;
            case 1:
                mainMenu();
                break;
            default:
                System.out.println("Pilihan Aksi Tidak Tersedia");
                System.out.println();
                dataPelangganTampil();
                break;
        }
    }
    public void dataPesananTambah (){
        Scanner myInput = new Scanner(System.in);
        String id, jenis_jahitan, ukuran, jenis_kain, jumlah;
        int pilihanAksi;
        System.out.println(labelDataPesanan);
        System.out.println(garisDataPesanan);
        System.out.println("~~~  TAMBAH DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.print("ID Pesanan : ");
        id = myInput.nextLine();
        System.out.print("Jenis Jahitan : ");
        jenis_jahitan = myInput.nextLine();
        System.out.print("ukuran : ");
        ukuran = myInput.nextLine();
        System.out.print("Jenis Kain : ");
        jenis_kain = myInput.nextLine();
        System.out.print("Jumlah : ");
        jumlah = myInput.nextLine();
        System.out.println();
        
        System.out.println("Silahkan pilih aksi dibawah ini :");
        System.out.println("[1] Simpan Data & Tambah Lagi\t[3] Kembali");
        System.out.println("[2] Simpan Data & Kembali\t[4] Kembali Ke Menu Utama");
        System.out.println();
        System.out.print("Masukkan Pilihan Aksi : ");
        pilihanAksi = myInput.nextInt();
        System.out.println();
        
        switch (pilihanAksi) {
            case 1:
                data_pesanan.add(new DataPesanan(id, jenis_jahitan, ukuran, jenis_kain, jumlah));
                dataPesananTambah();
                break;
            case 2:
                data_pesanan.add(new DataPesanan(id, jenis_jahitan, ukuran, jenis_kain, jumlah));
                dataPesanan();
                break;
            case 3:
                dataPesanan();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Pilihan Aksi Tidak Tersedia");
                System.out.println();
                dataPesananTambah();
                break;
        }
    }
    private void dataPesananEdit (){
        Scanner myInput = new Scanner(System.in);
        int pilihanAksi;
        int index = 0;
        boolean ketemu = true;
        String id_pesanan, jenis_jahitan, ukuran, jenis_kain, jumlah;
        
        System.out.println(labelDataPesanan);
        System.out.println(garisDataPesanan);
        System.out.println("~~~  EDIT DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        
        System.out.print("Masukkan ID Pesanan : ");
        id_pesanan = myInput.nextLine();
        
        for(int i=0; i < data_pesanan.size(); i++){
            DataPesanan data = data_pesanan.get(i);
            if(id_pesanan == data.id_pesanan){
                index = i;
                ketemu = true;
                i = data_pesanan.size();
            }
        }
        
        if(ketemu==false){
            System.out.print("Data tidak ditemukan. Masukkan angka nol (0) untuk kembali atau 1 untuk mengulang : ");
            pilihanAksi = myInput.nextInt();
            switch (pilihanAksi) {
                case 0:
                    dataPesanan();
                    break;
                case 1:
                    dataPesananEdit();
                    break;
                default:
                    System.out.println("Pilihan Aksi Tidak Tersedia");
                    System.out.println();
                    dataPesananEdit();
                    break;
            }
        }else{        
            System.out.println("ID Pesanan : " + id_pesanan);
            System.out.print("Jenis Jahitan : ");
            jenis_jahitan = myInput.nextLine();
            System.out.print("ukuran : ");
            ukuran = myInput.nextLine();
            System.out.print("Jenis Kain : ");
            jenis_kain = myInput.nextLine();
            System.out.print("Jumlah : ");
            jumlah = myInput.nextLine();
            System.out.println();

            System.out.println("Silahkan pilih aksi dibawah ini :");
            System.out.println("[1] Simpan Data & Kembali\t[2] Ulangi");
            System.out.println();
            System.out.print("Masukkan Pilihan Aksi : ");
            pilihanAksi = myInput.nextInt();
            System.out.println();

            switch (pilihanAksi) {
                case 1:
                    data_pesanan.set(index, new DataPesanan(id_pesanan, jenis_jahitan, ukuran, jenis_kain, jumlah));
                    dataPesanan();
                    break;
                case 2:
                    dataPesananEdit();
                    break;
                default:
                    System.out.println("Pilihan Aksi Tidak Tersedia");
                    System.out.println();
                    dataPesanan();
                    break;
            }
        }
    }
    public void hapusDataPesanan(){
        Scanner myInput = new Scanner(System.in);
        int pilihanAksi;
        int index = 0;
        boolean ketemu = true;
        String id_pesanan, jenis_jahitan, ukuran, jenis_kain, jumlah;
        
        System.out.println(labelDataPesanan);
        System.out.println(garisDataPesanan);
        System.out.println("~~~  HAPUS DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        System.out.print("Masukkan ID Pesanan : ");
        id_pesanan = myInput.nextLine();
        
        for(int i=0; i < data_pesanan.size(); i++){
            if(id_pesanan == id_pesanan){
                index = i;
                ketemu = true;
                i = data_pesanan.size();{

             }
            }
            if(ketemu==false){
                System.out.print("Data tidak ditemukan. Masukkan angka nol (0) untuk kembali atau 1 untuk mengulang : ");
                pilihanAksi = myInput.nextInt();
                switch (pilihanAksi) {
                case 0:
                    dataPesanan();
                    break;
                case 1:
                    hapusDataPesanan();
                    break;
                default:
                    System.out.println("Pilihan Aksi Tidak Tersedia");
                    System.out.println();
                    hapusDataPesanan();
                    break;
                }  
            }else{
                    System.out.println("Data Terhapus");
                    System.out.println("Silahkan pilih aksi dibawah ini :");
                    System.out.println("[1] Simpan Data & Kembali\t[2] Ulangi");
                    System.out.println();
                    System.out.print("Masukkan Pilihan Aksi : ");
                    pilihanAksi = myInput.nextInt();
                    System.out.println();
                    
                    switch (pilihanAksi) {
                    case 0:
                        dataPesanan();
                        break;
                    case 1:
                        dataPesanan();
                        break;
                    default:
                       System.out.println("Pilihan Aksi Tidak Tersedia");
                       System.out.println();
                       hapusDataPesanan();
                       break;
            }
        }
    }
    }
}


      