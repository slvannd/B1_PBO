
package posttes3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salim
 */
public class Posttes3 {
    ArrayList<SuratKTM> dataktm;
    Posttes3()
    {
        dataktm = new ArrayList<>();
    }
    void isidataktm(int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep)
    {
        dataktm.add(new SuratKTM (nik,nm,ttl,jk,rt,rw,kec,kep));
    }
    void hapusdataktm(int nikk)
    {
        dataktm.removeIf(item -> item.getNik() == (nikk));
    }
    void ubahdataktm(int nikk,int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep)
    {   
        int cek = -1;
        for(int i=0; i < dataktm.size(); i++){
            if(dataktm.get(i).getNik() == nikk){
                cek = i;
                System.out.println(cek);
                dataktm.set(cek,new SuratKTM(nik,nm,ttl,jk,rt,rw,kec,kep));
            }
        }
    }
    void showdataktm()
    {
        for(SuratKTM biodata:dataktm)
        {
            System.out.println("NIK : "+biodata.getNik()+""+",Nama : "+biodata.getNama()+""+",Tanggal Lahir : "+biodata.getTanggalLahir()+""+",Jenis Kelamin : "+biodata.getJenisKelamin()+""+",RT : "+biodata.getRT()+""+",RW : "+biodata.getRW()+",Kecamatan : "+biodata.getKecamatan()+""+",Keperluan : "+biodata.getKeperluan()+"");
        }
    }
    public static void main(String[] args) {
    Scanner inputdata = new Scanner (System.in);
    int coba = 1;
    Posttes3 pts = new Posttes3();
    while(coba==1){
        System.out.println("------------------------------------------");
        System.out.println("\tSELAMAT DATANG DI MENU \n\tSISTEM MANAJEMEN PERSURATAN \n\tKANTOR DESA BABULU DARAT ");
        System.out.println("------------------------------------------");
        System.out.println(" [1] TAMBAH DATA \n [2] SHOW DATA \n [3] UBAH DATA \n [4] HAPUS DATA \n [0] KELUAR ");
        System.out.println("------------------------------------------");
        int pilihan;
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = inputdata.nextInt();
        if (pilihan == 1){
            int Nik;
            String Nama;
            String TanggalLahir;
            String JenisKelamin;
            int RT;
            int RW;
            String Kecamatan;
            String Keperluan;
            
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
            pts.isidataktm(Nik, Nama, TanggalLahir, JenisKelamin, RT, RW, Kecamatan, Keperluan);
        }
        else if (pilihan == 2){
            pts.showdataktm();
        }
        else if (pilihan == 3){
            int Nik;
            String Nama;
            String TanggalLahir;
            String JenisKelamin;
            int RT;
            int RW;
            String Kecamatan;
            String Keperluan;
            int Masukkan;
            
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
            pts.ubahdataktm(Masukkan,Nik, Nama, TanggalLahir, JenisKelamin, RT, RW, Kecamatan, Keperluan);
        }
        else if(pilihan == 4){
            int hapusdata;
            System.out.print("Masukkan NIK : ");
            hapusdata = inputdata.nextInt();
            pts.hapusdataktm(hapusdata);
        }
        else if (pilihan == 0){
            System.out.println("=================================================================");
            System.out.println("\t\t\tKANTOR DESA BABULU DARAT");
            System.out.println("JL.Provinsi KM 48 Kecamatan Babulu Kabupaten Penajam Paser utara");
            System.out.println("=================================================================");
            break;
        }
        
    }
    
    }
    
    
}
