package POSTTEST4;

import java.util.Scanner;
public class Penjualan_Sepatu {


    public static void main(String[] args) {
        ArrayNyaNonFormal ARR = new ArrayNyaNonFormal();
        ArrayNyaFormal ARRF = new ArrayNyaFormal();
        Scanner pilihan = new Scanner(System.in);

        int pilih_menu,pilih_menu2;
        int perulangan = 1;

        sepatuNonFormal sepatuNF1 = new sepatuNonFormal(); 
        sepatuFormal    sepatuF1  = new sepatuFormal();
//-----------------------Setter-------------------------------
        sepatuNF1.setJenisPakai("Slip On");
        sepatuNF1.setKodeBarang("NF11");
        sepatuNF1.setJenis("Sport");
        sepatuNF1.setBrand("Nike");
        sepatuNF1.setUkuran(15);
        sepatuNF1.setWarna("Hitam");
        sepatuNF1.setHarga(15000);
        ARR.tambahBarang(sepatuNF1);


        sepatuF1.setJenisKulit("Domba");
        sepatuF1.setKodeBarang("F11");
        sepatuF1.setJenis("OxFord");
        sepatuF1.setBrand("Supreme");
        sepatuF1.setUkuran(42);
        sepatuF1.setWarna("Hitam");
        sepatuF1.setHarga(67000);
        ARRF.tambahBarang(sepatuF1);
//-----------------------Setter-------------------------------

        ARR.tambahBarang(new sepatuNonFormal("Tali",   "NF12","Sneakers","Adidas",    25,"Merah",25000));
        ARR.tambahBarang(new sepatuNonFormal("Slip On","NF13","Boats",   "Aerostreet",35,"Hijau",35000));

        ARRF.tambahBarang(new sepatuFormal("Harimau","F12","Wingtip","Reebok",  25,"Coklat" ,85000));
        ARRF.tambahBarang(new sepatuFormal("Kerbau" ,"F13","Derby",  "Spalding",35,"Abu-abu",100000));
        
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

            System.out.println("\n\n-----------------------------------");
            System.out.println("       List Tipe Sepatu Pria        ");
            System.out.println("-----------------------------------");
            System.out.println("   [1] Non Formal ");
            System.out.println("   [2] Formal     ");
            System.out.println("-----------------------------------");
            System.out.print  ("       Masukan Pilihan [1/2] : ");
            pilih_menu2 = pilihan.nextInt();



            String KODE,JENS,BRAN,WARN,JEPK;
            int UKUR,HARG;
            String dicari;

            if(pilih_menu2 ==1){
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

                    System.out.print("   Kode Barang         : " );
                    KODE = pilihan.next();
                    System.out.print("   Jenis Sepatu        : " );
                    JENS = pilihan.next();
                    System.out.print("   Brand Sepatu        : " );
                    BRAN = pilihan.next();
                    System.out.print("   Jenis Pakai Sepatu  : " );
                    JEPK = pilihan.next();
                    System.out.print("   Ukuran Sepatu       : " );
                    UKUR = pilihan.nextInt();
                    System.out.print("   Warna Sepatu        : " );
                    WARN = pilihan.next();
                    System.out.print("   Harga Sepatu        : " );
                    HARG = pilihan.nextInt();
                    ARR.tambahBarang(new sepatuNonFormal(JEPK,KODE,JENS,BRAN,UKUR,WARN,HARG));
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
                    System.out.print("   Kode Barang         : " );
                    KODE = pilihan.next();
                    System.out.print("   Jenis Sepatu        : " );
                    JENS = pilihan.next();
                    System.out.print("   Brand Sepatu        : " );
                    BRAN = pilihan.next();
                    System.out.print("   Jenis Pakai Sepatu  : " );
                    JEPK = pilihan.next();
                    System.out.print("   Ukuran Sepatu       : " );
                    UKUR = pilihan.nextInt();
                    System.out.print("   Warna Sepatu        : " );
                    WARN = pilihan.next();
                    System.out.print("   Harga Sepatu        : " );
                    HARG = pilihan.nextInt();
                    ARR.ubahData(dicari,new sepatuNonFormal(JEPK,KODE,JENS,BRAN,UKUR,WARN,HARG));
                    }


                else if(pilih_menu ==0){
                    // menghapus data barang berkode 'A12'
                    perulangan = 0;
                    System.out.println("\n    << Program Selesai >>\n         Terima Kasih\n\n");
                    }
                System.out.println("\n\n");
            }


            if(pilih_menu2 ==2){
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
                        ARRF.tampilBarang(pilih_menu);}
                    else if(pilih_menu ==2){
                        ARRF.tampilBarang(pilih_menu);}         




                }
                else if(pilih_menu ==2){
                    System.out.println("\n\n---------------------------------------");
                    System.out.println("        Menu Tambah Daftar Sepatu     ");
                    System.out.println("---------------------------------------\n");
                    // menambah beberapa data barang ke dalam array list

                    System.out.print("   Kode Barang         : " );
                    KODE = pilihan.next();
                    System.out.print("   Jenis Sepatu        : " );
                    JENS = pilihan.next();
                    System.out.print("   Brand Sepatu        : " );
                    BRAN = pilihan.next();
                    System.out.print("   Jenis Kulit Sepatu  : " );
                    JEPK = pilihan.next();
                    System.out.print("   Ukuran Sepatu       : " );
                    UKUR = pilihan.nextInt();
                    System.out.print("   Warna Sepatu        : " );
                    WARN = pilihan.next();
                    System.out.print("   Harga Sepatu        : " );
                    HARG = pilihan.nextInt();
                    ARRF.tambahBarang(new sepatuFormal(JEPK,KODE,JENS,BRAN,UKUR,WARN,HARG));
                    System.out.println("\n   Data sepatu Berhasil ditambah");
                    ARRF.tampilBarang(pilih_menu);
                }
                else if(pilih_menu ==5){ 
                    System.out.println("\n\n---------------------------------------");
                    System.out.println("      Menu Cari Daftar Sepatu     ");
                    System.out.println("---------------------------------------\n");
                    System.out.print("   Masukan Kode Barang Yang Ingin Dicari : " );
                    dicari = pilihan.next();
                    ARRF.cariBarang(dicari);}

                else if(pilih_menu ==3){
                    System.out.println("\n\n---------------------------------------");
                    System.out.println("      Menu Lihat Hapus Sepatu     ");
                    System.out.println("---------------------------------------\n");
                    ARRF.tampilBarang(2);
                    String dihapus;
                    System.out.print  ("\n\n   Masukan Kode Barang Yang Ingin Dihapus : " );
                    dihapus = pilihan.next();
                    ARRF.hapusBarang(dihapus);}

                else if(pilih_menu ==4){
                    System.out.println("\n\n---------------------------------------");
                    System.out.println("      Menu Ubah Daftar Sepatu     ");
                    System.out.println("---------------------------------------\n");
                    ARRF.tampilBarang(2);
                    System.out.print  ("\n\n   Masukan Kode Barang Yang Ingin Diubah : " );

                    dicari = pilihan.next();
                    // Merubah data barang ke dalam array list
                    System.out.print("   Kode Barang         : " );
                    KODE = pilihan.next();
                    System.out.print("   Jenis Sepatu        : " );
                    JENS = pilihan.next();
                    System.out.print("   Brand Sepatu        : " );
                    BRAN = pilihan.next();
                    System.out.print("   Jenis Kulit Sepatu  : " );
                    JEPK = pilihan.next();
                    System.out.print("   Ukuran Sepatu       : " );
                    UKUR = pilihan.nextInt();
                    System.out.print("   Warna Sepatu        : " );
                    WARN = pilihan.next();
                    System.out.print("   Harga Sepatu        : " );
                    HARG = pilihan.nextInt();
                    ARRF.ubahData(dicari,new sepatuFormal(JEPK,KODE,JENS,BRAN,UKUR,WARN,HARG));
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
}
