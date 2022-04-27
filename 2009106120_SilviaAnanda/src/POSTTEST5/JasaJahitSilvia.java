/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI Gaming
 */
public class JasaJahitSilvia {
    ArrayList<ModelPelanggan> data_pelanggan = new ArrayList<>();
    ArrayList<ModelPesanan> data_pesanan = new ArrayList<>();
    PelangganJahitan pelanggan;
    PesananJahitan pesanan;

    public static void main(String[] args) {
        JasaJahitSilvia jasajahitSilvia = new JasaJahitSilvia();
        jasajahitSilvia.mainMenu();
    }
    
    public void mainMenu(){
        pelanggan = new PelangganJahitan(data_pelanggan, this);
        pesanan = new PesananJahitan(data_pesanan, this);
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
                pelanggan.aksiKosong();
                mainMenu();
                break;
        }
    }

    public void dataPelanggan() {
        pelanggan.labelData();
        int pilihanMenu = pelanggan.menuData();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                pelanggan.showData();
                break;
            case 2:
                pelanggan.addData();
                break;
            case 3:
                pelanggan.editData();
                break;
            case 4:
                pelanggan.deleteData();
                break;
            case 0:
                mainMenu();
            default:
                pelanggan.aksiKosong();
                dataPelanggan();
                break;
        }
    }

    public void dataPesanan() {
        pesanan.labelData();
        int pilihanMenu = pesanan.menuData();
        System.out.println();
        
        switch (pilihanMenu) {
            case 1:
                pesanan.showData();
                break;
            case 2:
                pesanan.addData();
                break;
            case 3:
                pesanan.editData();
                break;
            case 4:
                pesanan.deleteData();
                break;
            case 0:
                mainMenu();
            default:
                pesanan.aksiKosong();
                dataPesanan();
                break;
        }
    }
}
