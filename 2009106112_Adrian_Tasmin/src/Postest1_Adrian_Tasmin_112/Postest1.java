/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest1_Adrian_Tasmin_112;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author HP
 */
public class Postest1 {
    public static void main(String[] args) {
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
                System.out.println("Silahkan Ke Kasir [Y/N]");
                ulg = input.next();
            }
            else if (pjumlah == 2)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(1) );
                System.out.println("Total Rp."+h_pulsa.get(1));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                ulg = input.next();
            } 
            else if (pjumlah == 3)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(2) );
                System.out.println("Total Rp."+h_pulsa.get(2));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                ulg = input.next();
            } 
            else if (pjumlah == 4)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(3) );
                System.out.println("Total Rp."+h_pulsa.get(3));
                System.out.println("Silahkan Ke Kasir [Y/N]");
                ulg = input.next();
            } 
            else if (pjumlah == 5)
            {
                System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+pulsa.get(4));
                System.out.println("Total Rp."+h_pulsa.get(4));
                System.out.println("Silahkan Ke Kasir [Y/N]");
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
                    ulg = input.next();
                }
                else if(kjumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_kuota.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(kjumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_kuota.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
            }
                else if(kjumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_kuota.get(3));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(kjumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_kuota.get(4));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
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
                    ulg = input.next();
                }
                else if(tjumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_tri.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(tjumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_tri.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
            }
                else if(tjumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_tri.get(3));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(tjumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_tri.get(4));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
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
                    ulg = input.next();
                }
                else if(ajumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_axis.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(ajumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_axis.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
            }
                else if(ajumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_axis.get(3));
                    System.out.println("Silahkan Ke Kasir[Y/N]");
                    ulg = input.next();
                }
                else if(ajumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_axis.get(4));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
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
                    ulg = input.next();
                }
                else if(xjumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_xl.get(1));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(xjumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_xl.get(2));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
            }
                else if(xjumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_xl.get(3));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
                    ulg = input.next();
                }
                else if(xjumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_xl.get(4));
                    System.out.println("Silahkan Ke Kasir [Y/N]");
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
                    ijumlah=1;
                    ulg = input.next();
                }
                else if(ijumlah == 2){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(1));
                    System.out.println("Total Rp."+h_ind.get(1));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    ulg = input.next();
                }
                else if(ijumlah == 3){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(2));
                    System.out.println("Total Rp."+h_ind.get(2));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    ulg = input.next();
            }
                else if(ijumlah == 4){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(3));
                    System.out.println("Total Rp."+h_ind.get(3));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
                    ulg = input.next();
                }
                else if(ijumlah == 5){
                    System.out.println("Anda Akan Membeli Pulsa Dengan Jumlah "+kuota.get(4));
                    System.out.println("Total Rp."+h_ind.get(4));
                    System.out.println("Silahkan Ke Menu Pembayaran [Y/N]");
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
