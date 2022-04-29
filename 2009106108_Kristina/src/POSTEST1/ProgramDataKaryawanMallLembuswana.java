/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST1;

/**
 *
 * @author ASUS
 */
public class ProgramDataKaryawanMallLembuswana {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
    int umur,umurku,tahunmasuk;
    int tahunlahir;
    int angka = 2019;
    int masakerja;
    String nik,nama;
    long gapok = 0,gaji;
    
        System.out.println("");
        System.out.println("Input Data Pegawai");
        System.out.println("--------------------------------------");
        System.out.print("Nama Karyawan = ");
        nama = input.nextLine();
        System.out.print("Nik Karyawan = ");
        nik = input.nextLine();
        System.out.print("Tahun Lahir Karyawan = ");
        tahunlahir = input.nextlnt();
        System.out.print("Tahun Masuk Karyawan = ");
        tahunmasuk = input.nextlnt();
        umurku = angka-tahunlahir;
        masakerja = angka-tahunmasuk;
        System.out.println("-------------------------------------");
    
        System.out.println("");
        System.out.println("Result Gaji karyawan");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan           = "+nama);
        System.out.println("Nik Karyawan            = "+nik);
        System.out.println("Tahun Lahir Karyawan    = "+tahunlahir);
        System.out.println("Umur Karyawan Sekarang  = "+masakerja);
        masakerja=2019-tahunmasuk;
        System.out.print("Total Gaji    =");
        if(masakerja<=8)
        {
            System.out.println("Rp 3.000.000");
            gaji=gapok+3000000;
        }
        else
            if(masakerja>=8)
            {
            System.out.println("Rp 6.000.000");
            gaji=gapok+6000000;
            }
        else
            {
            System.out.println("Rp.0");
            gaji=gapok+0;
            }
        System.out.println("===========================================");
        System.out.println("Gaji Karyawan = Rp."+gaji);
        System.out.println("===========================================");
    }
 }
}
