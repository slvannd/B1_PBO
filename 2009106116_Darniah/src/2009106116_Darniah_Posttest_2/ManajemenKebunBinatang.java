package pkg116_darniah;

import Darniah.Hewan;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKebunBinatang {
    public static void main(String[] args){
        ArrayList<Hewan> dataHewan = new ArrayList<>();

        int pilih;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("||==Data Kebun BInatang==||");
            System.out.println("[1] Lihat Data Kebun BInatang");
            System.out.println("[2] Tambah Data kebun Binatang");
            System.out.println("[3] Edit Data Kebun Binatang");
            System.out.println("[4] Hapus Data Kebun Binatang");
            System.out.println("[5] Exit ");
            System.out.println("------------------------------");
            System.out.println("Pilih menu yang ingin anda pilih");
            pilih = scan.nextInt();
            if (pilih == 1){
                System.out.println("Menu Tampilkan Data Kebun Binatang");
                if(dataHewan.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < dataHewan.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama    : " + dataHewan.get(i).getNama_Hewan());
                        System.out.println("Jenis   : " + dataHewan.get(i).getJenis_Hewan());
                        System.out.println("Habitat : " + dataHewan.get(i).getHabitat_Hewan());
                        System.out.println("Jumlah  : " + dataHewan.get(i).getJumlah_Hewan());
                        System.out.println("=======================================");
                    }                    
                }
            }if (pilih == 2){
                Scanner scancreate = new Scanner(System.in);
                String nama, jenis, habitat;
                int jumlah;

                System.out.println("Menu Tambah Data Kebun Binatang");
                System.out.print("Masukkan Nama    : ");
                nama = scancreate.nextLine();
                System.out.print("Masukkan Jenis   : ");
                jenis = scancreate.nextLine();
                System.out.print("Masukkan Habitat : ");
                habitat = scancreate.nextLine();
                System.out.print("Masukkan Jumlah  : ");
                jumlah = scancreate.nextInt();
                dataHewan.add(new Hewan(nama, jenis, habitat, jumlah));
                System.out.println("Data Berhasil Ditambahkan!");
            }if (pilih == 3){
                Scanner input = new Scanner(System.in);
                Scanner scanupdate = new Scanner(System.in);
                String nama, jenis, habitat;
                int jumlah;
        
                System.out.println("Menu Ubah Data Kebun Binatang");
                if(dataHewan.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < dataHewan.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama    : " + dataHewan.get(i).getNama_Hewan());
                        System.out.println("Jenis   : " + dataHewan.get(i).getJenis_Hewan());
                        System.out.println("Habitat : " + dataHewan.get(i).getHabitat_Hewan());
                        System.out.println("Jumlah  : " + dataHewan.get(i).getJumlah_Hewan());
                        System.out.println("=======================================");
                    }                    
                }
                System.out.print("Masukkan Nomor Data yang ingin diubah: ");
                int no = input.nextInt();
                System.out.print("Masukkan Nama : ");
                nama = scanupdate.nextLine();
                System.out.print("Masukkan Jenis : ");
                jenis = scanupdate.nextLine();
                System.out.print("Masukkan Habitat : ");
                habitat = scanupdate.nextLine();
                System.out.print("Masukkan Jumlah : ");
                jumlah = scanupdate.nextInt();
                dataHewan.set(no-1, new Hewan(nama, jenis, habitat, jumlah));
                System.out.println("Data Berhasil Diubah!");                
            }if (pilih == 4){
                System.out.println("Menu Hapus Data Kebun Binatang");
                Scanner input = new Scanner(System.in);
        
                System.out.println("Menu Ubah Data Kebun Binatang");
                if(dataHewan.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < dataHewan.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama    : " + dataHewan.get(i).getNama_Hewan());
                        System.out.println("Jenis   : " + dataHewan.get(i).getJenis_Hewan());
                        System.out.println("Habitat : " + dataHewan.get(i).getHabitat_Hewan());
                        System.out.println("Jumlah  : " + dataHewan.get(i).getJumlah_Hewan());
                        System.out.println("=======================================");
                    }
                }
                System.out.print("Masukkan Nomor Data yang ingin dihapus: ");
                int no = input.nextInt();
                dataHewan.remove(no-1);
                System.out.println("Data Berhasil Dihapus!");
            }if (pilih == 5){
                System.out.println("Terima Kasih");
            }
        } while(pilih != 5);      
    }
}