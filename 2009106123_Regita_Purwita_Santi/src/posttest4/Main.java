package posttest4;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    ArrayList<DataPenduduk> Data_KTP = new ArrayList<>();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Main data = new Main();
    static int Nik;
    static String Nama,TTL,JK,Agama,Status,Alamat, Goldar, Kewarganegaraan,Provinsi, Kabupaten, Kecamatan, Desa, RtRw;
    static DataPenduduk dataktp = new DataPenduduk(Nik,Nama,TTL,JK,Agama,Status,Goldar, Kewarganegaraan,Alamat,Provinsi, Kabupaten, Kecamatan, Desa, RtRw);
    

    
    public static void main(String[] args) throws IOException
    {
        dataktp.message();
        ShowMenu ();
    }
    
    static void ClearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    // Tambah Data 
    static void AddData() throws IOException{
            System.out.println("===================================================");
            System.out.println("                   TAMBAH DATA KTP                 ");
            System.out.println("===================================================");
            System.out.print("-> NIK                  : ");
            int Nik = Integer.parseInt(input.readLine());
            dataktp.setNik(Nik);
            System.out.print("-> NAMA                 : ");
            String Nama = input.readLine();
            dataktp.setNama(Nama);
            System.out.print("-> TEMPAT TANGGAL LAHIR : ");
            String TTL = input.readLine();
            dataktp.setTtl(TTL);
            System.out.print("-> JENIS KELAMIN        : ");
            String JK = input.readLine();
            dataktp.setJk(JK);
            System.out.print("-> AGAMA                : ");
            String Agama = input.readLine();
            dataktp.setAgama(Agama);
            System.out.print("-> STATUS               : ");
            String Status = input.readLine();
            dataktp.setStatus(Status);
            System.out.print("-> GOLONGAN DARAH       : ");
            String Goldar = input.readLine();
            dataktp.setGoldar(Goldar);
            System.out.print("-> KEWARGANEGARAAN      : ");
            String Kewarganegaraan = input.readLine();
            dataktp.setKewarganegaraan(Kewarganegaraan);
            System.out.print("-> ALAMAT               : ");
            String Alamat = input.readLine();
            dataktp.setAlamat(Alamat);
            dataktp.InfoDataPenduduk();
            System.out.print("-> PROVINSI             : ");
            String Provinsi = input.readLine();
            dataktp.setProvinsi(Provinsi);
            System.out.print("-> KABUPATEN            : ");
            String Kabupaten = input.readLine();
            dataktp.setKabupaten(Kabupaten);
            System.out.print("-> KECAMATAN            : ");
            String Kecamatan = input.readLine();
            dataktp.setKecamatan(Kecamatan);
            dataktp.info(Provinsi, Kabupaten, Kecamatan);
            dataktp.info();
            System.out.print("-> DESA                 : ");
            String Desa = input.readLine();
            dataktp.setDesa(Desa);
            System.out.print("-> RT/RW                : ");
            String RtRw = input.readLine();
            dataktp.setRtrw(RtRw);
            dataktp.InfoDataKelurahan(Desa, RtRw);
            data.addData(dataktp.getNik(), dataktp.getNama(), dataktp.getTtl(), dataktp.getJk(), dataktp.getAgama(), dataktp.getStatus(),dataktp.getGoldar(), dataktp.getKewarganegaraan(),dataktp.getAlamat(),dataktp.getProvinsi(),dataktp.getKabupaten(), dataktp.getKecamatan(),dataktp.getDesa(),dataktp.getRtrw());
    }
    void addData(int nik,String nama,String ttl,String jk,String agama,String status,String goldar, String kewarganegaraan,String alamat,String provinsi, String kabupaten, String kecamatan, String desa, String rtrw){
        Data_KTP.add(new DataPenduduk(nik,nama,ttl,jk,agama,status,goldar, kewarganegaraan,alamat,provinsi, kabupaten, kecamatan, desa, rtrw));
        System.out.println("===================================================");
        System.out.println("\nDATA KTP DENGAN NIK " + nik+ " BERHASIL DITAMBAHKAN");
        System.out.println("===================================================");
    }
    
    
    // Lihat Data
    void ShowData(){
        System.out.println("======================================================");
        System.out.println("|             DAFTAR KARTU TANDA PENDUDUK            |");      
        System.out.println("======================================================");
        for(DataPenduduk kartu:Data_KTP)
        {
        System.out.println("=> NIK                      :" + kartu.getNik());
        System.out.println("=> NAMA                     :" + kartu.getNama());
        System.out.println("=> TEMPAT TANGGAL LAHIR     :" + kartu.getTtl());
        System.out.println("=> JENIS KELAMIN            :" + kartu.getJk());
        System.out.println("=> AGAMA                    :" + kartu.getAgama());
        System.out.println("=> STATUS                   :" + kartu.getStatus());
        System.out.println("=> GOLONGAN DARAH           :" + kartu.getGoldar());
        System.out.println("=> KEWARGANEGARAAN          :" + kartu.getKewarganegaraan());
        System.out.println("=> ALAMAT                   :" + kartu.getAlamat());
        System.out.println("=> PROVINSI                 :" + kartu.getProvinsi()); 
        System.out.println("=> KABUPATEN                :" + kartu.getKabupaten()); 
        System.out.println("=> KECAMATAN                :" + kartu.getKecamatan()); 
        System.out.println("=> DESA                     :" + kartu.getDesa()); 
        System.out.println("=> RT/RW                    :" + kartu.getRtrw()); 
        System.out.println("======================================================");
        
        
        }
    }
    
    
    // Edit Data
    static void EditData() throws IOException{
        System.out.println("===================================================");
        System.out.println("                    EDIT  DATA KTP                 ");
        System.out.println("===================================================");
        System.out.print("Masukkan NIK Yang Ingin Di Ubah : ");
        int pilih = Integer.parseInt(input.readLine());
            System.out.print("-> NIK                  : ");
            int Nik = Integer.parseInt(input.readLine());
            dataktp.setNik(Nik);
            System.out.print("-> NAMA                 : ");
            String Nama = input.readLine();
            dataktp.setNama(Nama);
            System.out.print("-> TEMPAT TANGGAL LAHIR : ");
            String TTL = input.readLine();
            dataktp.setTtl(TTL);
            System.out.print("-> JENIS KELAMIN        : ");
            String JK = input.readLine();
            dataktp.setJk(JK);
            System.out.print("-> AGAMA                : ");
            String Agama = input.readLine();
            dataktp.setAgama(Agama);
            System.out.print("-> STATUS               : ");
            String Status = input.readLine();
            dataktp.setStatus(Status);
            System.out.print("-> GOLONGAN DARAH       : ");
            String Goldar = input.readLine();
            dataktp.setGoldar(Goldar);
            System.out.print("-> KEWARGANEGARAAN      : ");
            String Kewarganegaraan = input.readLine();
            dataktp.setKewarganegaraan(Kewarganegaraan);
            System.out.print("-> ALAMAT               : ");
            String Alamat = input.readLine();
            dataktp.setAlamat(Alamat);
            System.out.print("-> PROVINSI             : ");
            String Provinsi = input.readLine();
            dataktp.setProvinsi(Provinsi);
            System.out.print("-> KABUPATEN            : ");
            String Kabupaten = input.readLine();
            dataktp.setKabupaten(Kabupaten);
            System.out.print("-> KECAMATAN            : ");
            String Kecamatan = input.readLine();
            dataktp.setKecamatan(Kecamatan);
            System.out.print("-> DESA                 : ");
            String Desa = input.readLine();
            dataktp.setDesa(Desa);
            System.out.print("-> RT/RW                : ");
            String RtRw = input.readLine();
            dataktp.setRtrw(RtRw);
            data.editData(pilih, dataktp.getNik(), dataktp.getNama(), dataktp.getTtl(), dataktp.getJk(), dataktp.getAgama(), dataktp.getStatus(),dataktp.getGoldar(), dataktp.getKewarganegaraan(), dataktp.getAlamat(),dataktp.getProvinsi(),dataktp.getKabupaten(), dataktp.getKecamatan(),dataktp.getDesa(),dataktp.getRtrw());
    }
    void editData(int pilih,int nik,String nama,String ttl,String jk,String agama,String status,String goldar, String kewarganegaraan,String alamat,String provinsi, String kabupaten, String kecamatan, String desa, String rtrw){

        int cek = -1;
        for(int i=0; i<Data_KTP.size(); i++){
            if (Data_KTP.get(i).getNik() == pilih){
                cek = i;   
                Data_KTP.set(cek,new DataPenduduk (nik,nama,ttl,jk,agama,status,goldar, kewarganegaraan,alamat,provinsi, kabupaten, kecamatan, desa, rtrw));
                System.out.println("===================================================");
                System.out.println("DATA KTP DENGAN NIK " + pilih + " BERHASIL DIUPDATE");
                System.out.println("===================================================");
            }
         }
    } 
    
    
    // Hapus Data
    static void DeleteData()throws IOException{
        System.out.println("===================================================");
        System.out.println("                    HAPUS DATA KTP                 ");
        System.out.println("===================================================");
        System.out.print("Masukkan NIK yang akan dihapus : ");
        int hapus = Integer.parseInt(input.readLine());
        data.deleteData(hapus);
        }
    
    void deleteData(int hapus){
        int cek = -1;
        for(int i=0; i<Data_KTP.size(); i++){
            if (Data_KTP.get(i).getNik() == hapus){
                cek = i; 
                Data_KTP.removeIf(item -> item.getNik() ==(hapus));
                System.out.println("===================================================");
                System.out.println("DATA KTP DENGAN NIK " + hapus + " BERHASIL DI HAPUS");
                System.out.println("===================================================");
            }
         }
    } 
    
    
   // Show Menu
    static void ShowMenu() throws IOException{
        int i = 1;
        while(i==1){
            System.out.println("");
            System.out.println("+==============================================+");
            System.out.println("|          MENU PROGRAM PEMBUATAN KTP          |");
            System.out.println("+==============================================+");
            System.out.println("|            1.Tambah Data                     |");
            System.out.println("|            2.Lihat Data                      |");
            System.out.println("|            3.Edit Data                       |");
            System.out.println("|            4.Hapus Data                      |");
            System.out.println("|            5.Keluar Program                  |");
            System.out.println("+==============================================+"); 
            int pilihan;
            System.out.print("Masukkan Pilihan [1-5] : ");
            pilihan =Integer.parseInt(input.readLine());
            if (pilihan == 1){
                ClearScreen();
                System.out.println("");
                AddData(); 
            } else if (pilihan == 2){ 
                ClearScreen();
                System.out.println("");
                if(data.Data_KTP.size() <= 0){
                    System.out.println("*** TIDAK ADA DATA KTP ***");
                }
                else{
                    data.ShowData();
                }
            } else if (pilihan == 3){
                ClearScreen();
                System.out.println("");
                if(data.Data_KTP.size() <= 0){
                   System.out.println("*** TIDAK ADA DATA KTP ***");
                }
                else{
                   EditData();
                }
            } else if (pilihan == 4){
                ClearScreen();
                System.out.println("");
                if(data.Data_KTP.size() <= 0){
                   System.out.println("*** TIDAK ADA DATA KTP ***");
                }
                else{
                   DeleteData(); 
                }            
            } else if (pilihan == 5){
                ClearScreen();
                System.out.println("");
                dataktp.Thanks();
                System.exit(0);
            } else{
                ClearScreen();
                System.out.println("");
                System.out.println("*** INPUTAN ANDA SALAH ***");
            }

        } 
    }
    
    
}
