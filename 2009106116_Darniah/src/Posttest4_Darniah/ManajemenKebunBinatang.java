
package Posttest4_Darniah;

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKebunBinatang {
    public static void main(String[] args){
        ArrayList<Manajemen> dataManajemen = new ArrayList<>();
        ArrayList<Binatang> dataBinatang = new ArrayList<>();
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
                System.out.println("1. Manajemen");
                System.out.println("2. Binatang");
                System.out.println("Masukan Pilihan : ");
                pilih = scan.nextInt();
                if (pilih == 1){
                    System.out.println("Menu Tampilkan Data Kebun Binatang");
                    if(dataManajemen.isEmpty()) System.out.println("Data Kosong!");
                    else {
                        for(int i = 0; i < dataManajemen.size(); i++) {
                            System.out.println("=======================================");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("Nama    : " + dataManajemen.get(i).getNama_Hewan());
                            System.out.println("Jenis   : " + dataManajemen.get(i).getJenis_Hewan());
                            System.out.println("Habitat : " + dataManajemen.get(i).getHabitat_Hewan());
                            System.out.println("Jumlah  : " + dataManajemen.get(i).getJumlah_Hewan());
                            System.out.println("Umur    : " + dataManajemen.get(i).getUmur());
                            System.out.println("=======================================");
                        }                    
                    } 

                } else {
                    System.out.println("Menu Tampilkan Data Kebun Binatang");
                    if(dataBinatang.isEmpty()) System.out.println("Data Kosong!");
                    else {
                        for(int i = 0; i < dataBinatang.size(); i++) {
                            System.out.println("=======================================");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("Nama    : " + dataBinatang.get(i).getNama_Hewan());
                            System.out.println("Jenis   : " + dataBinatang.get(i).getJenis_Hewan());
                            System.out.println("Habitat : " + dataBinatang.get(i).getHabitat_Hewan());
                            System.out.println("Jumlah  : " + dataBinatang.get(i).getJumlah_Hewan());
                            System.out.println("Warna : " + dataBinatang.get(i).getWarna());
                            System.out.println("=======================================");
                        }                    
                    } 
                }
                            }
            
            if (pilih == 2){
                Scanner scancreate = new Scanner(System.in);
                String nama, jenis, habitat;
                int jumlah, Umur; 
                System.out.println("1. Manajemen ");
                System.out.println("2. Binatang ");
                System.out.println("Masukan Pilihan : ");
                pilih = scan.nextInt();
                if (pilih == 1){
                        System.out.println("Menu Tambah Data Kebun Binatang");
                        System.out.print("Masukkan Nama    : ");
                        nama = scancreate.nextLine();
                        System.out.print("Masukkan Jenis   : ");
                        jenis = scancreate.nextLine();
                        System.out.print("Masukkan Habitat : ");
                        habitat = scancreate.nextLine();
                        System.out.print("Masukkan Jumlah  : ");
                        jumlah = scancreate.nextInt();
                        System.out.print("Masukan Umur : ");
                        Umur = scancreate.nextInt();
                        dataManajemen.add(new Manajemen(nama, jenis, habitat, jumlah, Umur));
                         System.out.println("Data Berhasil Ditambahkan!");
                    } 
                        else {
                    
                        Scanner input = new Scanner (System.in);
                        System.out.println("Menu Tambah Data Kebun Binatang");
                        System.out.print("Masukkan Nama    : ");
                        String Nama_Hewan = input.nextLine();
                        System.out.print("Masukkan Jenis   : ");
                        String Jenis_Hewan = input.nextLine();
                        System.out.print("Masukkan Habitat : ");
                        String Habitat_Hewan = input.nextLine();
                        System.out.print("Masukkan Jumlah  : ");
                        int Jumlah_Hewan = input.nextInt();
                        System.out.print("Masukan Warna : ");
                        String Warna = input.nextLine();
                        dataBinatang.add(new Binatang(Nama_Hewan,Jenis_Hewan, Habitat_Hewan,Jumlah_Hewan, Warna));
                        System.out.println("Data Berhasil Ditambahkan!");
                    } 
                }
              
            
            if (pilih == 3){
                Scanner input = new Scanner(System.in);
                Scanner scanupdate = new Scanner(System.in);
                String nama, jenis, habitat;
                int jumlah, Umur;
                System.out.println("1. Manajemen");
                System.out.println("2. Binatang");
                pilih = scan.nextInt();
                if (pilih == 1){
                    System.out.println("Menu Ubah Data Kebun Binatang");
                    if(dataManajemen.isEmpty()) System.out.println("Data Kosong!");
                    else {
                        for(int i = 0; i < dataManajemen.size(); i++) {
                            System.out.println("=======================================");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("Nama    : " + dataManajemen.get(i).getNama_Hewan());
                            System.out.println("Jenis   : " + dataManajemen.get(i).getJenis_Hewan());
                            System.out.println("Habitat : " + dataManajemen.get(i).getHabitat_Hewan());
                            System.out.println("Jumlah  : " + dataManajemen.get(i).getJumlah_Hewan());
                            System.out.println("Umur : " + dataManajemen.get(i).getUmur());
                            System.out.println("=======================================");
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
                        System.out.println("Masukan Umur : ");
                        Umur = scanupdate.nextInt();
                        dataManajemen.add(new Manajemen(nama, jenis, habitat, jumlah, Umur));
                        System.out.print("Data Berhasil Diubah!"); 
                }
            }   else {
                    
                    System.out.println("Menu Tampilkan Data Kebun Binatang");
                    if(dataBinatang.isEmpty()) System.out.println("Data Kosong!");
                    else {
                        for(int i = 0; i < dataBinatang.size(); i++) {
                            System.out.println("=======================================");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("Nama    : " + dataBinatang.get(i).getNama_Hewan());
                            System.out.println("Jenis   : " + dataBinatang.get(i).getJenis_Hewan());
                            System.out.println("Habitat : " + dataBinatang.get(i).getHabitat_Hewan());
                            System.out.println("Jumlah  : " + dataBinatang.get(i).getJumlah_Hewan());
                            System.out.println("Warna : " + dataBinatang.get(i).getWarna());
                            System.out.println("=======================================");
                            System.out.println("Menu Tambah Data Kebun Binatang");
                        System.out.print("Masukkan Nama    : ");
                        String Nama_Hewan = input.nextLine();
                        System.out.print("Masukkan Jenis   : ");
                        String Jenis_Hewan = input.nextLine();
                        System.out.print("Masukkan Habitat : ");
                        String Habitat_Hewan = input.nextLine();
                        System.out.print("Masukkan Jumlah  : ");
                        int Jumlah_Hewan = input.nextInt();
                        System.out.print("Masukan Warna : ");
                        String Warna = input.nextLine();
                        dataBinatang.add(new Binatang(Nama_Hewan,Jenis_Hewan, Habitat_Hewan, Jumlah_Hewan, Warna));
                        System.out.println("Data Berhasil diubah!");
                        }
                        
                    } 
                }
                               
            }if (pilih == 4){
                System.out.println("Menu Hapus Data Kebun Binatang");
                Scanner input = new Scanner(System.in);
                System.out.println("1. Manajemen");
                System.out.println("2. Binatang");
                pilih = scan.nextInt();
                if (pilih == 1);
                    System.out.println("Menu Ubah Data Kebun Binatang");
                    if(dataManajemen.isEmpty()) System.out.println("Data Kosong!");
                    else {
                        for(int i = 0; i < dataManajemen.size(); i++) {
                            System.out.println("=======================================");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("Nama    : " + dataManajemen.get(i).getNama_Hewan());
                            System.out.println("Jenis   : " + dataManajemen.get(i).getJenis_Hewan());
                            System.out.println("Habitat : " + dataManajemen.get(i).getHabitat_Hewan());
                            System.out.println("Jumlah  : " + dataManajemen.get(i).getJumlah_Hewan());
                            System.out.println("Umur : " + dataManajemen.get(i).getUmur());
                            System.out.println("=======================================");
                            System.out.print("Masukkan Nomor Data yang ingin dihapus: ");
                            int no = input.nextInt();
                            dataManajemen.remove(no-1);
                            System.out.println("Data Berhasil Dihapus!");
                    }
                } System.out.println("Menu Ubah Data Kebun Binatang");
                    if(dataBinatang.isEmpty()) System.out.println("Data Kosong!");
                    else {
                        for(int i = 0; i < dataManajemen.size(); i++) {
                            System.out.println("=======================================");
                            System.out.println("Data ke-" + (i+1));
                            System.out.println("Nama    : " + dataBinatang.get(i).getNama_Hewan());
                            System.out.println("Jenis   : " + dataBinatang.get(i).getJenis_Hewan());
                            System.out.println("Habitat : " + dataBinatang.get(i).getHabitat_Hewan());
                            System.out.println("Jumlah  : " + dataBinatang.get(i).getJumlah_Hewan());
                            System.out.println("Warna : " + dataBinatang.get(i).getWarna());
                            System.out.println("=======================================");
                            System.out.print("Masukkan Nomor Data yang ingin dihapus: ");
                            int no = input.nextInt();
                            dataManajemen.remove(no-1);
                            System.out.println("Data Berhasil Dihapus!");
                    }
                } 
                  
                    
            }if (pilih == 5){
                System.out.println("Terima Kasih");
            }
        } while(pilih != 5);      
    }
}

