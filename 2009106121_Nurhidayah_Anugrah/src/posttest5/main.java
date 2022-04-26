/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author MSi-Modern
 */
public final class main{
    static ArrayList <informasi> listinformasi = new ArrayList();
    static ArrayList <lomba> listlomba = new ArrayList();
    static ArrayList <beasiswa> listbeasiswa = new ArrayList();
    
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    
    static void menu() throws IOException{
        System.out.println("Sistem Informasi Lomba dan Beasiswa MBKM AI 2022\n");        
        System.out.println("[1] Tampilkan seluruh informasi");
        System.out.println("[2] Tambah informasi");
        System.out.println("[3] Edit informasi");
        System.out.println("[4] Hapus informasi");
        System.out.println("[5] Exit");
        System.out.print("Pilih menu> ");
        
        String PilihMenu = input.readLine();
        switch(PilihMenu){
            case "1":
                Tampilkan_informasi();
                break;
            case "2":
                Tambah_informasi();
                break;
            case "3":
                Edit_informasi();
                break;
            case "4":
                Hapus_informasi();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("\nPilihan anda tidak tersedia");
        }
    }
        static void Tampilkan_informasi() throws IOException{
            if(listinformasi.isEmpty()){
                System.out.println("Belum ada informasi lomba dan beasiswa");
            } else {
                for (int i = 0; i < listinformasi.size(); i++){
                                       
                    System.out.println("Data ke-" + (i+1));
                    System.out.println(listinformasi.get(i).getNamainfo());
                    System.out.println(listinformasi.get(i).getPenyelenggara());
                    System.out.println(listinformasi.get(i).getTanggal_pendaftaran());
                    System.out.println(listinformasi.get(i).getTanggal_penutupan());
                    System.out.println(listlomba.get(i).getBiayapendaftaran());
                    System.out.println(listbeasiswa.get(i).getKategori());
                }
            }
        }

        static void Tambah_informasi() throws IOException{
            System.out.print("Nama lomba/beasiswa:");
            String namainfo = input.readLine();
            
            System.out.print("Penyelenggara:");
            String penyelenggara = input.readLine();
            
            System.out.print("Tanggal pendaftaran:");
            String tanggal_pendaftaran = input.readLine();
            
            System.out.print("Tanggal penutupan:");
            String tanggal_penutupan = input.readLine();
            
            System.out.print("Biaya Pendaftaran:");
            int biayapendaftaran = Integer.parseInt(input.readLine());

            System.out.print("Kategori:");
            String kategori = input.readLine();
            
            listinformasi.add(new informasi(namainfo, penyelenggara, tanggal_pendaftaran, tanggal_penutupan) {});
            informasi databaru = new informasi(namainfo, penyelenggara, tanggal_pendaftaran, tanggal_penutupan) {};
            listlomba.add(new lomba(databaru, biayapendaftaran));
            listbeasiswa.add(new beasiswa(databaru, kategori));
        }
        
        static void Edit_informasi() throws IOException{
            Tampilkan_informasi();
            System.out.print("Pilih nomor informasi:");
            int indexinformasi = Integer.valueOf(input.readLine());
            
            System.out.print("Nama lomba/beasiswa:");
            String namainfo = input.readLine();
            
            System.out.print("Penyelenggara:");
            String penyelenggara = input.readLine();
            
            System.out.print("Tanggal pendaftaran:");
            String tanggal_pendaftaran = input.readLine();
            
            System.out.print("Tanggal penutupan:");
            String tanggal_penutupan = input.readLine();
            
            System.out.println("Biaya Pendaftaran:");
            int biayapendaftaran = Integer.parseInt(input.readLine());

            System.out.print("Kategori:");
            String kategori = input.readLine();
            
            listinformasi.get(indexinformasi-1).setNamainfo(namainfo);
            listinformasi.get(indexinformasi-1).setPenyelenggara(penyelenggara);
            listinformasi.get(indexinformasi-1).setTanggal_pendaftaran(tanggal_pendaftaran);
            listinformasi.get(indexinformasi-1).setTanggal_penutupan(tanggal_penutupan);
            listlomba.get(indexinformasi-1).setBiayapendaftaran(biayapendaftaran);
            listbeasiswa.get(indexinformasi-1).setKategori(kategori);
            
        }
        
        static void Hapus_informasi() throws IOException{
            Tampilkan_informasi();
            System.out.print("Pilih nomor informasi yang ingin dihapus:");
            int indexinformasi = Integer.valueOf(input.readLine());
            
            listinformasi.remove(indexinformasi-1);
            listlomba.remove(indexinformasi-1);
            listbeasiswa.remove(indexinformasi-1);
        }
        
        public static void main(String[] args)throws IOException{
             do{
                menu();
            }while (isRunning);
        }

}