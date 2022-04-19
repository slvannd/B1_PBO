/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest4;
import Postest3.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


/**
 *
 * @author HP
 */
public class Postest3 {
    public static void main(String[] args) {
               
        DriannCell  pulsa1 = new DriannCell(5000,"-","Driann Cell","-");
        DriannCell  pulsa2 = new DriannCell(10000,"-","Driann Cell","-");
        DriannCell  pulsa3 = new DriannCell(20000,"-","Driann Cell","-");
        DriannCell  pulsa4 = new DriannCell(50000,"-","Driann Cell","-");
        DriannCell  pulsa5 = new DriannCell(100000,"-","Driann Cell","-");
        DriannCell  kuotat1 = new DriannCell(0,"1GB","Driann Cell","Telkomsel");
        DriannCell  kuotat2 = new DriannCell(0,"2GB","Driann Cell","Telkomsel");
        DriannCell  kuotat3 = new DriannCell(0,"3GB","Driann Cell","Telkomsel");
        DriannCell  kuotat4 = new DriannCell(0,"5GB","Driann Cell","Telkomsel");
        DriannCell  kuotat5 = new DriannCell(0,"10GB","Driann Cell","Telkomsel");
        DriannCell  kuotatr1 = new DriannCell(0,"1GB","Driann Cell","Tri");
        DriannCell  kuotatr2 = new DriannCell(0,"2GB","Driann Cell","Tri");
        DriannCell  kuotatr3= new DriannCell(0,"3GB","Driann Cell","Tri");
        DriannCell  kuotatr4= new DriannCell(0,"5GB","Driann Cell","Tri");
        DriannCell  kuotatr5= new DriannCell(0,"10GB","Driann Cell","Tri");
        DriannCell  kuotaa1 = new DriannCell(0,"1GB","Driann Cell","Axis");
        DriannCell  kuotaa2 = new DriannCell(0,"2GB","Driann Cell","Axis");
        DriannCell  kuotaa3 = new DriannCell(0,"3GB","Driann Cell","Axis");
        DriannCell  kuotaa4 = new DriannCell(0,"5GB","Driann Cell","Axis");
        DriannCell  kuotaa5 = new DriannCell(0,"10GB","Driann Cell","Axis");
        DriannCell  kuotax1 = new DriannCell(0,"1GB","Driann Cell","XL");
        DriannCell  kuotax2 = new DriannCell(0,"2GB","Driann Cell","XL");
        DriannCell  kuotax3 = new DriannCell(0,"3GB","Driann Cell","XL");
        DriannCell  kuotax4 = new DriannCell(0,"5GB","Driann Cell","XL");
        DriannCell  kuotax5 = new DriannCell(0,"10GB","Driann Cell","XL");
        DriannCell  kuotai1 = new DriannCell(0,"1GB","Driann Cell","Indosat");
        DriannCell  kuotai2 = new DriannCell(0,"2GB","Driann Cell","Indosat");
        DriannCell  kuotai3 = new DriannCell(0,"3GB","Driann Cell","Indosat");
        DriannCell  kuotai4 = new DriannCell(0,"5GB","Driann Cell","Indosat");
        DriannCell  kuotai5 = new DriannCell(0,"10GB","Driann Cell","Indosat");
        int menu;
        int ypilih;
        int pilih;
        int tambah;
        int admin;
        int pjumlah;
        int kjumlah;
        int tjumlah;
        int ajumlah;
        int xjumlah;
        int ijumlah;
        int Provider;
        String ulg = "Y";
        while (ulg.equals("Y")){
        List<String> provider = new ArrayList<>();
        provider.add("Telkomsel");
        provider.add("Tri");
        provider.add("Axis");
        provider.add("XL");
        provider.add("Indosat");
        
        ArrayList kuota = new ArrayList<>();
        kuota.add("1 GB");
        kuota.add("2 GB");
        kuota.add("3 GB");
        kuota.add("5 GB");
        kuota.add("10 GB");
        
        ArrayList pulsa = new ArrayList<>();
        pulsa.add("5.000");
        pulsa.add("10.000");
        pulsa.add("20.000");
        pulsa.add("50.000");
        pulsa.add("100.000");
        
        ArrayList h_pulsa = new ArrayList<>();
        h_pulsa.add("7.000");
        h_pulsa.add("12.000");
        h_pulsa.add("22.000");
        h_pulsa.add("52.000");
        h_pulsa.add("102.000");
        
        ArrayList h_kuota = new ArrayList<>();
        h_kuota.add("Rp. 18.000");
        h_kuota.add("Rp. 35.000");
        h_kuota.add("Rp. 50.000");
        h_kuota.add("Rp.85.000");
        h_kuota.add("Rp.170.000");
        
        ArrayList h_tri = new ArrayList<>();
        h_tri.add("Rp. 10.000");
        h_tri.add("Rp. 18.000");
        h_tri.add("Rp. 25.000");
        h_tri.add("Rp.42.000");
        h_tri.add("Rp.80.000");
        
        ArrayList h_axis = new ArrayList<>();
        h_axis.add("Rp.10.000");
        h_axis.add("Rp.20.000");
        h_axis.add("Rp.25.000");
        h_axis.add("Rp.45.000");
        h_axis.add("Rp.85.000");
        
        ArrayList h_xl = new ArrayList<>();
        h_xl.add("Rp.11.000");
        h_xl.add("Rp.22.000");
        h_xl.add("Rp.30.000");
        h_xl.add("Rp.43.000");
        h_xl.add("Rp.88.000");
        
        ArrayList h_ind = new ArrayList<>();
        h_ind.add("Rp. 13.000");
        h_ind.add("Rp. 20.000");
        h_ind.add("Rp. 35.000");
        h_ind.add("Rp.70.000");
        h_ind.add("Rp.95.000");
        
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("===============================");
        System.out.println("====      Driann Cell      ====");
        System.out.println("===============================");
        System.out.println("====        1.Pulsa        ====");
        System.out.println("====        2.Kuota        ====");
        System.out.println("====        3.Keluar       ====");
        System.out.println("===============================");
        
        
        Scanner Menu = new Scanner(System.in);
        System.out.print("Pilih Menu : ");
        menu = Menu.nextInt();
        if (menu == 1)
        {
            System.out.println("================================");
            System.out.println("          Daftar Pulsa          ");
            System.out.println("================================");
            System.out.println("           [1]"+pulsa.get(0)     );
            System.out.println("           [2]"+pulsa.get(1)     );
            System.out.println("           [3]"+pulsa.get(2)     );
            System.out.println("           [4]"+pulsa.get(3)     );
            System.out.println("           [5]"+pulsa.get(4)     );
            System.out.println("================================");
            Scanner x_pulsa = new Scanner(System.in);
            System.out.print("Pilih Jumlah : ");
            pjumlah = x_pulsa.nextInt();
            if (pjumlah == 1)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(0) );
                System.out.println("Total Rp."+h_pulsa.get(0));
                pulsa1.pulsa();
                System.out.println("Silahkan Ke Kasir [Y/N]");
                ulg = input.next();
            }
            else if (pjumlah == 2)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(1) );
                System.out.println("Total Rp."+h_pulsa.get(1));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                pulsa2.pulsa();
                ulg = input.next();
            } 
            else if (pjumlah == 3)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(2) );
                System.out.println("Total Rp."+h_pulsa.get(2));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                pulsa3.pulsa();
                ulg = input.next();
            } 
            else if (pjumlah == 4)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(3) );
                System.out.println("Total Rp."+h_pulsa.get(3));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                pulsa4.pulsa();
                ulg = input.next();
            } 
            else if (pjumlah == 5)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(4));
                System.out.println("Total Rp."+h_pulsa.get(4));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                pulsa5.pulsa();
                ulg = input.next();
            } 
            else{
                System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
                ulg = input.next();
        }
                      }
        else if (menu == 2){
            System.out.println("================================");
            System.out.println("          Daftar Provider       ");
            System.out.println("================================");
            System.out.println("           [1]"+provider.get(0)     );
            System.out.println("           [2]"+provider.get(1)     );
            System.out.println("           [3]"+provider.get(2)     );
            System.out.println("           [4]"+provider.get(3)     );
            System.out.println("           [5]"+provider.get(4)     );
            System.out.println("================================");
            Scanner x_provider = new Scanner(System.in);
            System.out.print("Pilih Provider : ");
            Provider = x_provider.nextInt();
            if (Provider == 1){
                System.out.println("================================");
                System.out.println("          Daftar Kuota       ");
                System.out.println("================================");
                System.out.println("           [1]"+kuota.get(0)     );
                System.out.println("           [2]"+kuota.get(1)     );
                System.out.println("           [3]"+kuota.get(2)     );
                System.out.println("           [4]"+kuota.get(3)     );
                System.out.println("           [5]"+kuota.get(4)     );
                System.out.println("================================");
                Scanner x_kuota = new Scanner(System.in);
                System.out.print("Pilih Jumlah : ");
                kjumlah = x_kuota.nextInt();
                if (kjumlah == 1){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(0));
                    System.out.println("Total Rp."+h_kuota.get(0));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotat1.kuota();
                    ulg = input.next();
                }
                else if(kjumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_kuota.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotat2.kuota();
                    ulg = input.next();
                }
                else if(kjumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_kuota.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotat3.kuota();
                    ulg = input.next();
            }
                else if(kjumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_kuota.get(3));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotat4.kuota();
                    ulg = input.next();
                }
                else if(kjumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_kuota.get(4));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    kuotat5.kuota();
                    ulg = input.next();
                }
                else{
                    System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
                    ulg = input.next();
                }
                
        
    }
            else if (Provider == 2){
                System.out.println("================================");
                System.out.println("          Daftar Kuota       ");
                System.out.println("================================");
                System.out.println("           [1]"+kuota.get(0)     );
                System.out.println("           [2]"+kuota.get(1)     );
                System.out.println("           [3]"+kuota.get(2)     );
                System.out.println("           [4]"+kuota.get(3)     );
                System.out.println("           [5]"+kuota.get(4)     );
                System.out.println("================================");
                Scanner x_kuota = new Scanner(System.in);
                System.out.print("Pilih Jumlah : ");
                tjumlah = x_kuota.nextInt();
                if (tjumlah == 1){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(0));
                    System.out.println("Total Rp."+h_tri.get(0));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotatr1.kuota();
                    ulg = input.next();
                }
                else if(tjumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_tri.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotatr2.kuota();
                    ulg = input.next();
                }
                else if(tjumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_tri.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotatr3.kuota();
                    ulg = input.next();
            }
                else if(tjumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_tri.get(3));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotatr4.kuota();
                    ulg = input.next();
                }
                else if(tjumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_tri.get(4));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotatr5.kuota();
                    ulg = input.next();
                }
                else{
                    System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
                    ulg = input.next();
                }
    
            } 
            else if (Provider == 3){
                System.out.println("================================");
                System.out.println("          Daftar Kuota       ");
                System.out.println("================================");
                System.out.println("           [1]"+kuota.get(0)     );
                System.out.println("           [2]"+kuota.get(1)     );
                System.out.println("           [3]"+kuota.get(2)     );
                System.out.println("           [4]"+kuota.get(3)     );
                System.out.println("           [5]"+kuota.get(4)     );
                System.out.println("================================");
                Scanner x_kuota = new Scanner(System.in);
                System.out.print("Pilih Jumlah : ");
                ajumlah = x_kuota.nextInt();
                if (ajumlah == 1){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(0));
                    System.out.println("Total Rp."+h_axis.get(0));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotaa1.kuota();
                    ulg = input.next();
                }
                else if(ajumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_axis.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotaa2.kuota();
                    ulg = input.next();
                }
                else if(ajumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_axis.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotaa3.kuota();
                    ulg = input.next();
            }
                else if(ajumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_axis.get(3));
                    System.out.println("Silahkan Ke Kasir[Y/N]");
                    kuotaa4.kuota();
                    ulg = input.next();
                }
                else if(ajumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_axis.get(4));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotaa5.kuota();
                    ulg = input.next();
                }
                else{
                    System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
                    ulg = input.next();
                }
                
        }
            else if (Provider == 4){
                System.out.println("================================");
                System.out.println("          Daftar Kuota       ");
                System.out.println("================================");
                System.out.println("           [1]"+kuota.get(0)     );
                System.out.println("           [2]"+kuota.get(1)     );
                System.out.println("           [3]"+kuota.get(2)     );
                System.out.println("           [4]"+kuota.get(3)     );
                System.out.println("           [5]"+kuota.get(4)     );
                System.out.println("================================");
                Scanner x_kuota = new Scanner(System.in);
                System.out.print("Pilih Jumlah : ");
                xjumlah = x_kuota.nextInt();
                if (xjumlah == 1){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(0));
                    System.out.println("Total Rp."+h_xl.get(0));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotax1.kuota();
                    ulg = input.next();
                }
                else if(xjumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_xl.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotax2.kuota();
                    ulg = input.next();
                }
                else if(xjumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_xl.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotax3.kuota();
                    ulg = input.next();
            }
                else if(xjumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_xl.get(3));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotax4.kuota();
                    ulg = input.next();
                }
                else if(xjumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_xl.get(4));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    kuotax5.kuota();
                    ulg = input.next();
                }
                else{
                    System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
                    ulg = input.next();
                }
            
}
            else if (Provider == 5){
                System.out.println("================================");
                System.out.println("          Daftar Kuota       ");
                System.out.println("================================");
                System.out.println("           [1]"+kuota.get(0)     );
                System.out.println("           [2]"+kuota.get(1)     );
                System.out.println("           [3]"+kuota.get(2)     );
                System.out.println("           [4]"+kuota.get(3)     );
                System.out.println("           [5]"+kuota.get(4)     );
                System.out.println("================================");
                Scanner x_kuota = new Scanner(System.in);
                System.out.print("Pilih Jumlah : ");
                ijumlah = x_kuota.nextInt();
                if (ijumlah == 1){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(0));
                    System.out.println("Total Rp."+h_ind.get(0));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    kuotai1.kuota();
                    ulg = input.next();
                }
                else if(ijumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_ind.get(1));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    kuotai2.kuota();
                    ulg = input.next();
                }
                else if(ijumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_ind.get(2));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    kuotai3.kuota();
                    ulg = input.next();
            }
                else if(ijumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_ind.get(3));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    kuotai4.kuota();
                    ulg = input.next();
                }
                else if(ijumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_ind.get(4));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    kuotai5.kuota();
                    ulg = input.next();
                }
                else{
                    System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
                    ulg = input.next();
                }
}
            else{
            System.out.println("Input Salah, Kembali Ke Menu? [Y/N]");
            ulg = input.next();
            
            }
        }
        else if (menu==3){
            System.out.println("Keluar Program?[O]");
            ulg = input.next();
        
        }
//        Ini adalah menu tersembunyi untuk admin
        else if (menu==4){
            Scanner Admin = new Scanner(System.in);
            System.out.print("Masukkan Kode : ");
            admin = Admin.nextInt();
            if(admin==1){
                System.out.println("================================");
                System.out.println("            Menu Admin       ");
                System.out.println("================================");
                System.out.println("      [1]Tambah Pulsa"     );
                System.out.println("      [2]Lihat Pulsa"     );
                System.out.println("      [3]Update Harga"     );
                System.out.println("      [4]Hapus Data"     );
                System.out.println("================================");
                Scanner Pilih = new Scanner(System.in);
                System.out.print("Pilih : ");
                pilih = Pilih.nextInt();
                if(pilih==1){
                    Scanner Tambah = new Scanner(System.in);
                    System.out.print("Masukkan Jumlahh Pulsa : ");
                    tambah = Tambah.nextInt();
                    pulsa.add(tambah);
                    System.out.println("================================");
                    System.out.println("          Daftar Pulsa          ");
                    System.out.println("================================");
                    System.out.println("           [1]"+pulsa.get(0)     );
                    System.out.println("           [2]"+pulsa.get(1)     );
                    System.out.println("           [3]"+pulsa.get(2)     );
                    System.out.println("           [4]"+pulsa.get(3)     );
                    System.out.println("           [5]"+pulsa.get(4)     );
                    System.out.println("           [6]"+pulsa.get(5)     );
                    System.out.println("================================");
                    System.out.println("Kembali Ke Menu?[Y/N]");
                    ulg = input.next();       
            }
                else if (pilih==2){
                    System.out.println("================================");
                    System.out.println("          Daftar Pulsa          ");
                    System.out.println("================================");
                    System.out.println("           [1]"+pulsa.get(0)     );
                    System.out.println("           [2]"+pulsa.get(1)     );
                    System.out.println("           [3]"+pulsa.get(2)     );
                    System.out.println("           [4]"+pulsa.get(3)     );
                    System.out.println("           [5]"+pulsa.get(4)     );
                    System.out.println("================================");
                    System.out.println("Kembali Ke Menu?[Y/N]");
                    ulg = input.next();
                }
                else if (pilih==3){
                    System.out.println("================================");
                    System.out.println("          Daftar Pulsa          ");
                    System.out.println("================================");
                    System.out.println("           [1]"+pulsa.get(0)     );
                    System.out.println("           [2]"+pulsa.get(1)     );
                    System.out.println("           [3]"+pulsa.get(2)     );
                    System.out.println("           [4]"+pulsa.get(3)     );
                    System.out.println("           [5]"+pulsa.get(4)     );
                    System.out.println("================================");
                    Scanner xpilih = new Scanner(System.in);
                    System.out.print("Update : ");
                    ypilih = xpilih.nextInt();
                    pulsa.set(0,ypilih);
                    System.out.println("================================");
                    System.out.println("          Daftar Pulsa          ");
                    System.out.println("================================");
                    System.out.println("           [1]"+pulsa.set(0,ypilih)     );
                    System.out.println("           [2]"+pulsa.get(1)     );
                    System.out.println("           [3]"+pulsa.get(2)     );
                    System.out.println("           [4]"+pulsa.get(3)     );
                    System.out.println("           [5]"+pulsa.get(4)     );
                    System.out.println("================================");
                    System.out.println("Kembali Ke Menu?[Y/N]");
                    ulg = input.next();
                   
                }
                else if (pilih==4){
                    pulsa.clear();
                    kuota.clear();
                    provider.clear();
                    System.out.println("Folder Kosong");
                    System.out.println("Kembali Ke Menu?[Y/N]");
                    ulg = input.next();
                }
            
        }
    }
}
}
}
