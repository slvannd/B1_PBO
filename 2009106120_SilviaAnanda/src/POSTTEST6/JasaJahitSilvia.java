/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI Gaming
 */
public class JasaJahitSilvia {
    ArrayList<ModelPelanggan> data_pelanggan = new ArrayList<>();
    ArrayList<ModelPesanan> data_pesanan = new ArrayList<>();
    
    Jahitan iPelanggan, iPesanan;
    UserJahitan uPelanggan, uPesanan;

    public static void main(String[] args) {
        JasaJahitSilvia jasajahitSilvia = new JasaJahitSilvia();
        jasajahitSilvia.mainMenu();
    }
    
    public void mainMenu(){
        iPelanggan = new Pelanggan(data_pelanggan, this);
        uPelanggan = new UserJahitan(iPelanggan);
        
        iPesanan = new Pesanan(data_pesanan, this);
        uPesanan = new UserJahitan(iPesanan);
        
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
                System.out.println("Pilihan Tidak Tersedia");
                System.out.println();
                mainMenu();
                break;
        }
    }

    public void dataPelanggan() {
        uPelanggan.tampilkanLabel();
        int pilihanMenu = uPelanggan.pilihanMenu();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                uPelanggan.tampilkanData();
                break;
            case 2:
                uPelanggan.aksiTambah();
                break;
            case 3:
                uPelanggan.aksiEdit();
                break;
            case 4:
                uPelanggan.aksiHapus();
                break;
            case 0:
                mainMenu();
            default:
                uPelanggan.aksiKosong();
                dataPelanggan();
                break;
        }
    }

    public void dataPesanan() {
        uPesanan.tampilkanLabel();
        int pilihanMenu = uPesanan.pilihanMenu();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                uPesanan.tampilkanData();
                break;
            case 2:
                uPesanan.aksiTambah();
                break;
            case 3:
                uPesanan.aksiEdit();
                break;
            case 4:
                uPesanan.aksiHapus();
                break;
            case 0:
                mainMenu();
            default:
                uPesanan.aksiKosong();
                dataPelanggan();
                break;
        }
    }
}
