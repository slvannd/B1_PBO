package POSTTEST3;

import java.util.Scanner;
public class Penjualan_Sepatu {


    public static void main(String[] args) {
        ArrayNya ARR = new ArrayNya();
        Scanner pilihan = new Scanner(System.in);

//        ArrayList <sepatu> list_sepatu = new ArrayList <sepatu>();
        int pilih_menu;
        int perulangan = 1;
        // menambah beberapa data barang ke dalam array list
//        SP.tambahBarang(new sepatu("A11","Sports",  "Nike",      15,"Hitam",15000));
        sepatu sepatu1 = new sepatu(); 
//-----------------------Setter-------------------------------
        sepatu1.setKodeBarang("A11");
        sepatu1.setJenis("Sport");
        sepatu1.setBrand("Nike");
        sepatu1.setUkuran(15);
        sepatu1.setWarna("Hitam");
        sepatu1.setHarga(15000);
        ARR.tambahBarang(sepatu1);
//-----------------------Setter-------------------------------

        ARR.tambahBarang(new sepatu("A12","Sneakers","Adidas",    25,"Merah",25000));
        ARR.tambahBarang(new sepatu("A13","Boats",   "Aerostreet",35,"Hijau",35000));
        
        while(perulangan ==1){
            System.out.println("-----------------------------------");
            System.out.println("   Program CRUD List Sepatu Pria");
            System.out.println("-----------------------------------\n");

            System.out.println("   [1] Lihat  List Sepatu ");
            System.out.println("   [2] Tambah List Sepatu ");
            System.out.println("   [3] Hapus  List Sepatu ");
            System.out.println("   [4] Ubah   List Sepatu ");
            System.out.println("   [0] Exit Program\n");
            System.out.println("-----------------------------------");
            System.out.print  ("       Masukan Pilihan [0-4] : ");
            pilih_menu = pilihan.nextInt();


            String KODE,JENS,BRAN,WARN;
            int UKUR,HARG;
            String dicari;


            if(pilih_menu ==1){
                System.out.println("\n\n-----------------------------------");
                System.out.println("      Menu Lihat Daftar Sepatu     ");
                System.out.println("-----------------------------------");
                // menampilkan semua data barang dari array list
                System.out.println("\n   [1] Lihat List Detail");
                System.out.println  ("   [2] Lihat List Perbaris");
                System.out.print    ("       Masukan Pilihan [1/2] : ");
                pilih_menu = pilihan.nextInt();
                System.out.println("\n");
                if(pilih_menu ==1){
                    ARR.tampilBarang(pilih_menu);}
                else if(pilih_menu ==2){
                    ARR.tampilBarang(pilih_menu);}         




            }
            else if(pilih_menu ==2){
                System.out.println("\n\n---------------------------------------");
                System.out.println("        Menu Tambah Daftar Sepatu     ");
                System.out.println("---------------------------------------\n");
                // menambah beberapa data barang ke dalam array list

                System.out.print("   Kode Barang   : " );
                KODE = pilihan.next();
                System.out.print("   Jenis Sepatu  : " );
                JENS = pilihan.next();
                System.out.print("   Brand Sepatu  : " );
                BRAN = pilihan.next();
                System.out.print("   Ukuran Sepatu : " );
                UKUR = pilihan.nextInt();
                System.out.print("   Warna Sepatu  : " );
                WARN = pilihan.next();
                System.out.print("   Harga Sepatu  : " );
                HARG = pilihan.nextInt();
                ARR.tambahBarang(new sepatu(KODE,JENS,BRAN,UKUR,WARN,HARG));
                System.out.println("\n   Data sepatu Berhasil ditambah");
                ARR.tampilBarang(pilih_menu);
            }
            else if(pilih_menu ==5){ 
                System.out.println("\n\n---------------------------------------");
                System.out.println("      Menu Cari Daftar Sepatu     ");
                System.out.println("---------------------------------------\n");
                System.out.print("   Masukan Kode Barang Yang Ingin Dicari : " );
                dicari = pilihan.next();
                ARR.cariBarang(dicari);}

            else if(pilih_menu ==3){
                System.out.println("\n\n---------------------------------------");
                System.out.println("      Menu Lihat Hapus Sepatu     ");
                System.out.println("---------------------------------------\n");
                ARR.tampilBarang(2);
                String dihapus;
                System.out.print  ("\n\n   Masukan Kode Barang Yang Ingin Dihapus : " );
                dihapus = pilihan.next();
                ARR.hapusBarang(dihapus);}

            else if(pilih_menu ==4){
                System.out.println("\n\n---------------------------------------");
                System.out.println("      Menu Ubah Daftar Sepatu     ");
                System.out.println("---------------------------------------\n");
                ARR.tampilBarang(2);
                System.out.print  ("\n\n   Masukan Kode Barang Yang Ingin Diubah : " );
                
                dicari = pilihan.next();
                // Merubah data barang ke dalam array list
                System.out.print("   Kode Barang   : " );
                KODE = pilihan.next();
                System.out.print("   Jenis Sepatu  : " );
                JENS = pilihan.next();
                System.out.print("   Brand Sepatu  : " );
                BRAN = pilihan.next();
                System.out.print("   Ukuran Sepatu : " );
                UKUR = pilihan.nextInt();
                System.out.print("   Warna Sepatu  : " );
                WARN = pilihan.next();
                System.out.print("   Harga Sepatu  : " );
                HARG = pilihan.nextInt();
                ARR.ubahData(dicari,new sepatu(KODE,JENS,BRAN,UKUR,WARN,HARG));
                }


            else if(pilih_menu ==0){
                // menghapus data barang berkode 'A12'
                perulangan = 0;
                System.out.println("\n    << Program Selesai >>\n         Terima Kasih\n\n");
                }
            System.out.println("\n\n");
            }
    }
}
