/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST3;


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author MSI Gaming
 */
public class Jasajahit {
    ArrayList<POSTTEST3.DataPelanggan> data_pelanggan = new ArrayList<>();
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
                System.out.println("Edit Data Pelanggan");
                dataPelangganEdit();
                break;
            case 4:
                System.out.println("Hapus Data Pelanggan");
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
                System.out.println("Tampil Data Pesanan");
                break;
            case 2:
                System.out.println("Tambah Data Pesanan");
                break;
            case 3:
                System.out.println("Edit Data Pesanan");
                break;
            case 4:
                System.out.println("Hapus Data Pesanan");
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
            POSTTEST3.DataPelanggan data = data_pelanggan.get(i);
            System.out.print(data.id_pelanggan + "\t");
            System.out.print(data.nama_pelanggan + "\t");
            System.out.print(data.jenis_kelamin + "\t");
            System.out.print(data.alamat_pelanggan + "\t");
            System.out.print(data.nohp);
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
                data_pelanggan.add(new POSTTEST3.DataPelanggan(id, nama, jenis_kelamin, alamat, nohp));
                dataPelangganTambah();
                break;
            case 2:
                data_pelanggan.add(new POSTTEST3.DataPelanggan(id, nama, jenis_kelamin, alamat, nohp));
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
        boolean ketemu = false;
        String id_pelanggan, nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp;
        
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println("~~~  EDIT DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        
        System.out.print("Masukkan ID Pelanggan : ");
        id_pelanggan = myInput.nextLine();
        
        for(int i=0; i < data_pelanggan.size(); i++){
            POSTTEST3.DataPelanggan data = data_pelanggan.get(i);
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
                    data_pelanggan.set(index, new POSTTEST3.DataPelanggan(id_pelanggan, nama_pelanggan, jenis_kelamin, alamat_pelanggan, nohp));
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
        
        System.out.println(labelDataPelanggan);
        System.out.println(garisDataPelanggan);
        System.out.println("~~~  HAPUS DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        
        System.out.print("data ke berapa yang mau di hapus: ");
        System.out.println();
        System.out.println("Data Terhapus");
       //2 int hapus = input.
        
        
    }
}




