package POSTTEST1;

import java.util.Scanner;
public class Penjualan_Sepatu {


    public static void main(String[] args) {
        ArrayNya SP = new ArrayNya();
        Scanner pilihan = new Scanner(System.in);

//        ArrayList <sepatu> list_sepatu = new ArrayList <sepatu>();
        int pilih_menu;
        int perulangan = 1;
        // menambah beberapa data barang ke dalam array list
        SP.tambahBarang(new sepatu("A11","Sport_Adan","Puma_Adan",15,"Hitam_Adan",15000));
        SP.tambahBarang(new sepatu("A12","Sport_Yoga","Puma_Yoga",25,"Hitam_Yoga",25000));
        SP.tambahBarang(new sepatu("A13","Sport_Eric","Puma_Eric",35,"Hitam_Erik",35000));

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
            // menampilkan semua data barang dari array list
            SP.tampilBarang();
        }
        else if(pilih_menu ==2){
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
            SP.tambahBarang(new sepatu(KODE,JENS,BRAN,UKUR,WARN,HARG));
        }
        else if(pilih_menu ==5){ 
            System.out.print("   Masukan Kode Barang Yang Ingin Dicari : " );
            dicari = pilihan.next();
            SP.cariBarang(dicari);}

        else if(pilih_menu ==3){
            String dihapus;
            System.out.print("   Masukan Kode Barang Yang Ingin Dihapus : " );
            dihapus = pilihan.next();
            SP.hapusBarang(dihapus);}

        else if(pilih_menu ==4){
            System.out.print("   Masukan Kode Barang Yang Ingin Diubah : " );
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
            SP.ubahData(dicari,new sepatu(KODE,JENS,BRAN,UKUR,WARN,HARG));
            }


        else if(pilih_menu ==0){
            // menghapus data barang berkode 'A12'
            perulangan = 0;
            System.out.println("\n    << Program Selesai >>\n         Terima Kasih\n\n");
            }


        }
    }
    
}
