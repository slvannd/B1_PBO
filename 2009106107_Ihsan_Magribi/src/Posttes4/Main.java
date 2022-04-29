package Posttes4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salim
 */
public class Main {

    ArrayList<SuratKTM> dataktm;
    ArrayList<SuratKematian> datameninggal;

    Main(){
        dataktm = new ArrayList<>();
        datameninggal = new ArrayList<>();
    }

    void isidataktm(int rt, int rw, String kec, String kep,int nik, String nm, String ttl, String jk) {
        dataktm.add(new SuratKTM(rt, rw, kec, kep,nik, nm, ttl, jk));
    }
    
    void isidatameninggal(int rt, int rw, String kec, String kep,String tglmd,int nik, String nm, String ttl, String jk) {
        datameninggal.add(new SuratKematian(rt, rw, kec, kep,tglmd,nik, nm, ttl, jk));
    }
    
    
    void hapusdataktm(int nikk) {
        dataktm.removeIf(item -> item.getNik() == (nikk));
    }
    void hapusdatameninggal(int nikk) {
        datameninggal.removeIf(item -> item.getNik() == (nikk));
    }
    
    
    void ubahdataktm(int nikk, int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep) {
        int cek = -1;
        for (int i = 0; i < dataktm.size(); i++) {
            if (dataktm.get(i).getNik() == nikk) {
                cek = i;
                System.out.println(cek);
                dataktm.set(cek, new SuratKTM(rt, rw, kec, kep,nik, nm, ttl, jk));
            }
        }
    }
    
    void ubahdatameninggal(int nikk, int rt, int rw, String kec, String kep,String tglmd,int nik, String nm, String ttl, String jk) {
        int cek = -1;
        for (int i = 0; i < datameninggal.size(); i++) {
            if (datameninggal.get(i).getNik() == nikk) {
                cek = i;
                System.out.println(cek);
                datameninggal.set(cek, new SuratKematian(rt, rw, kec, kep,tglmd ,nik, nm, ttl, jk));
            }
        }
    }    

    void showdataktm() {
        dataktm.forEach(biodata -> {
            System.out.println("NIK : " + biodata.getNik() + "" + ",Nama : " + biodata.getNama() + "" + ",Tanggal Lahir : " + biodata.getTanggalLahir() + "" + ",Jenis Kelamin : " + biodata.getJenisKelamin() + "" + ",RT : " + biodata.getRT() + "" + ",RW : " + biodata.getRW() + ",Kecamatan : " + biodata.getKecamatan() + "" + ",Keperluan : " + biodata.getKeperluan() + "");
        });
    }
    void showdatameninggal() {
        datameninggal.forEach(biodata -> {
            System.out.println("NIK : " + biodata.getNik() + "" + ",Nama : " + biodata.getNama() + "" + ",Tanggal Lahir : " + biodata.getTanggalLahir() + "" + ",Jenis Kelamin : " + biodata.getJenisKelamin() + "" + ",RT : " + biodata.getRT() + "" + ",RW : " + biodata.getRW() + ",Kecamatan : " + biodata.getKecamatan() + "" + ",Keperluan : " + biodata.getKeperluan() + ""+ ",Tanngal Kematian : " + biodata.getTanggalMeninggal()+ "");
        });
    }
    
    
    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
        int coba = 1;
        Main pts = new Main();
        while (coba == 1) {
            System.out.println("------------------------------------------");
            System.out.println("\tSELAMAT DATANG DI MENU \n\tSISTEM MANAJEMEN PERSURATAN \n\tKANTOR DESA BABULU DARAT ");
            System.out.println("------------------------------------------");
            System.out.println(" [1] TAMBAH DATA \n [2] SHOW DATA \n [3] UBAH DATA \n [4] HAPUS DATA \n [0] KELUAR ");
            System.out.println("------------------------------------------");
            int pilihan,pilihan2;
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = inputdata.nextInt();
            if (pilihan == 1) {
                int Nik;
                String Nama;
                String TanggalLahir;
                String JenisKelamin;
                int RT;
                int RW;
                String Kecamatan;
                String Keperluan,TGLkematian;
                
                System.out.println("-----------------------------------------");
                System.out.println("           Menu Tambah Data              ");
                System.out.println("-----------------------------------------");
                System.out.println("  [1] Tambah Data Surat KTM                    ");
                System.out.println("  [2] Tambah Data Surat Kematian                    ");
                System.out.println("-----------------------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan2 = inputdata.nextInt();
                
                if (pilihan2 == 1) {
                    System.out.print("NIK\t\t: ");
                    Nik = inputdata.nextInt();

                    System.out.print("Nama\t\t: ");
                    Nama = inputdata.next();

                    System.out.print("Tanggal Lahir\t: ");
                    TanggalLahir = inputdata.next();

                    System.out.print("Jenis Kelamin\t: ");
                    JenisKelamin = inputdata.next();

                    System.out.print("RT\t\t: ");
                    RT = inputdata.nextInt();

                    System.out.print("RW\t\t: ");
                    RW = inputdata.nextInt();

                    System.out.print("Kecamatan\t: ");
                    Kecamatan = inputdata.next();

                    System.out.print("Keperluan Surat : ");
                    Keperluan = inputdata.next();
                
                
                
                    pts.isidataktm(RT, RW, Kecamatan, Keperluan,Nik, Nama, TanggalLahir, JenisKelamin);
                }
                else if (pilihan2 == 2) {
                    System.out.print("NIK\t\t: ");
                    Nik = inputdata.nextInt();

                    System.out.print("Nama\t\t: ");
                    Nama = inputdata.next();

                    System.out.print("Tanggal Lahir\t: ");
                    TanggalLahir = inputdata.next();

                    System.out.print("Jenis Kelamin\t: ");
                    JenisKelamin = inputdata.next();

                    System.out.print("RT\t\t: ");
                    RT = inputdata.nextInt();

                    System.out.print("RW\t\t: ");
                    RW = inputdata.nextInt();

                    System.out.print("Kecamatan\t: ");
                    Kecamatan = inputdata.next();

                    System.out.print("Keperluan Surat : ");
                    Keperluan = inputdata.next();
                
                    System.out.print("Tanggal Meninggal : ");
                    TGLkematian = inputdata.next();
                
                    pts.isidatameninggal(RT, RW, Kecamatan, Keperluan,TGLkematian,Nik, Nama, TanggalLahir, JenisKelamin);
                }     

            } else if (pilihan == 2) {
                System.out.println("-----------------------------------------");
                System.out.println("           Menu Tambah Data              ");
                System.out.println("-----------------------------------------");
                System.out.println("  [1] Show Data Surat KTM                    ");
                System.out.println("  [2] Show Data Surat Kematian               ");
                System.out.println("-----------------------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan2 = inputdata.nextInt();
                if (pilihan2 == 1) {
                    pts.showdataktm();}
                else if (pilihan2 == 2) {
                    pts.showdatameninggal();
                }
            } else if (pilihan == 3) {
                int Nik;
                String Nama;
                String TanggalLahir;
                String JenisKelamin;
                int RT;
                int RW;
                String Kecamatan;
                String Keperluan,TGLmeninggal;
                int Masukkan;
                System.out.println("-----------------------------------------");
                System.out.println("           Menu Tambah Data              ");
                System.out.println("-----------------------------------------");
                System.out.println("  [1] Ubah Data Surat KTM                    ");
                System.out.println("  [2] Ubah Data Surat Kematian               ");
                System.out.println("-----------------------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan2 = inputdata.nextInt();
                if (pilihan2 == 1) {
                    System.out.print("Masukkan NIK yang Ingin Di Ubah : ");
                    Masukkan = inputdata.nextInt();

                    System.out.print("NIK\t\t: ");
                    Nik = inputdata.nextInt();
                    System.out.print("Nama\t\t:");
                    Nama = inputdata.next();
                    System.out.print("Tanggal Lahir\t: ");
                    TanggalLahir = inputdata.next();
                    System.out.print("Jenis Kelamin\t: ");
                    JenisKelamin = inputdata.next();
                    System.out.print("RT\t\t: ");
                    RT = inputdata.nextInt();
                    System.out.print("RW\t\t: ");
                    RW = inputdata.nextInt();
                    System.out.print("Kecamatan\t: ");
                    Kecamatan = inputdata.next();
                    System.out.print("Keperluan Surat : ");
                    Keperluan = inputdata.next();
                    pts.ubahdataktm(Masukkan, Nik, Nama, TanggalLahir, JenisKelamin, RT, RW, Kecamatan, Keperluan);
                }
                if (pilihan2 == 2) {
                    System.out.print("Masukkan NIK yang Ingin Di Ubah : ");
                    Masukkan = inputdata.nextInt();

                    System.out.print("NIK\t\t: ");
                    Nik = inputdata.nextInt();
                    System.out.print("Nama\t\t:");
                    Nama = inputdata.next();
                    System.out.print("Tanggal Lahir\t: ");
                    TanggalLahir = inputdata.next();
                    System.out.print("Jenis Kelamin\t: ");
                    JenisKelamin = inputdata.next();
                    System.out.print("RT\t\t: ");
                    RT = inputdata.nextInt();
                    System.out.print("RW\t\t: ");
                    RW = inputdata.nextInt();
                    System.out.print("Kecamatan\t: ");
                    Kecamatan = inputdata.next();
                    System.out.print("Keperluan Surat : ");
                    Keperluan = inputdata.next();
                    System.out.print("Keperluan Surat : ");
                    TGLmeninggal = inputdata.next();
                    pts.ubahdatameninggal(Masukkan, RT, RW, Kecamatan, Keperluan,TGLmeninggal, Nik, Nama, TanggalLahir, JenisKelamin);
                }


                
            } else if (pilihan == 4) {
                System.out.println("-----------------------------------------");
                System.out.println("           Menu Tambah Data              ");
                System.out.println("-----------------------------------------");
                System.out.println("  [1] Hapus Data Surat KTM                    ");
                System.out.println("  [2] Hapus Data Surat Kematian               ");
                System.out.println("-----------------------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan2 = inputdata.nextInt();
                if (pilihan2 == 1) {
                    int hapusdata;
                    System.out.print("Masukkan NIK : ");
                    hapusdata = inputdata.nextInt();
                    pts.hapusdataktm(hapusdata);}
                else if (pilihan2 == 2) {
                    int hapusdata;
                    System.out.print("Masukkan NIK : ");
                    hapusdata = inputdata.nextInt();
                    pts.hapusdatameninggal(hapusdata);}
                
 
            } else if (pilihan == 0) {
                System.out.println("=================================================================");
                System.out.println("\t\t\tKANTOR DESA BABULU DARAT");
                System.out.println("JL.Provinsi KM 48 Kecamatan Babulu Kabupaten Penajam Paser utara");
                System.out.println("=================================================================");
                break;
            }

        }

    }

}
