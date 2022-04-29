/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Karyawan {
    String namaKaryawan, alamat;
    int umur, gajipokok, tahunmasuk, masakerja, tahunlahir;
    public Scanner str = new Scanner(System.in);
    public Scanner in = new Scanner(System.in);
    public void setData(){
        this.gajipokok = 0;
}
public void setData(int gajipokok){
        this.gajipokok = 0 + gajipokok;
        System.out.print("Nama Karyawan : ");
        this.namaKaryawan = str.nextLine();
        System.out.print("Alamat Karyawan  : ");
        this.alamat = str.nextLine();
        System.out.print("Tahun Lahir Karyawan : ");
        this.tahunlahir = in.nextInt();
        System.out.print("Tahun Masuk Karyawan  : ");
        this.tahunmasuk = in.nextInt();
}
public void setData(int gajipokok,int angka){
        this.gajipokok = 0 + gajipokok;
        System.out.print("Nama Karyawan : ");
        this.namaKaryawan = str.nextLine();
        System.out.print("Alamat Karyawan  : ");
        this.alamat = str.nextLine();
        System.out.print("Tahun Lahir Karyawan : ");
        this.tahunlahir = in.nextInt();
        System.out.print("Tahun Masuk Karyawan  : ");
        this.tahunmasuk = in.nextInt();
}
 public int getId(){
        return this.gajipokok;
}
public void tampil(){
        System.out.println("Umur Karyawan            : "+this.umur);
        System.out.println("Nama Karyawan            : "+this.namaKaryawan);
        System.out.println("Alamat Karyawan          : "+this.alamat);
        System.out.println("Tahun Lahir Karyawan     : "+this.tahunlahir);
        System.out.println("Tahun Masuk Karyawan     : "+this.tahunmasuk);
        System.out.println("Total Gaji               : "+this.gajipokok);
}
public static void main(String[] args){
        int i = 0,menu = 0,a,gajipokok;
       
        while(menu!= 6){
            System.out.print("Tampilan Menu Awal :\n");
            System.out.print("1.Menambahkan\n2.Menampilkan\n3.Mengubah\n4.Menghapus\n5.exit\n ");
            System.out.print("Pilih Menu : ");
            if(menu == 1){
                gajipokok = 0;
                while(gajipokok < 1){
                    System.out.print("Masukkan Gaji Karyawan : ");  
                }
                i++;
                if(gajipokok > 1) {}
                else
            }else if (menu == 2){
                if(i < 1)
                    System.out.println("Data kosong");
                else{
                    System.out.println("Masukkan Data Karyawan Yang Ditampilkan : ");
                    a = 1;
                    while(a<= i){
                            break;  
                    }
                    if(a<= i) {}
                    else
                        System.out.println("Data Tidak Ditemukan");
                }
            }else if(menu == 3){
                    if(i < 1)
                        System.out.println("Data Kosong");
                    else{
                        System.out.print("Masukkan Data Karyawan Yang Diubah : ");
                        a = 1;
                        while(a<= i){
                                break;
                        }
                        if(a<= i){
                            gajipokok = 0;
                            while(gajipokok < 1){
                                System.out.print("Masukkan Jumlah Barang : ");
                            }
                            if(gajipokok > 1){}
                            else
                        else{
                            System.out.println("Data Tidak Ditemukan");
                    }
            }else if(menu == 4){
                    if(i < 1)
                        System.out.println("Data Kosong");
                    else{
                        System.out.print("Masukkan Data Karyawan Yang Dihapus: ");
                        a = 1;
                        while(a<= i){
                                break;
                        }
                        if(a<= i){
                            while(a < i){
                                a++;
                            }
                            i--;
                            System.out.println("Data Berhasil Dihapus");
                        }
                        else
                            System.out.println("Data Tidak Ditemukan");
                    }
                    }else if(menu == 5){
                    System.out.println("Keluar...");
                    else
                    System.out.println("Menu Tidak Ditemukan");
        }
}
