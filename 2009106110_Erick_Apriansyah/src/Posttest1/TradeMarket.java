package Posttest1;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TradeMarket {
ArrayList <Market> data;
    TradeMarket(){
    data = new ArrayList<>();
    }
    void tambahData(int no,String nama,String jenis,int price,String game){
    data.add(new Market(no,nama,jenis,price,game));
    }
    void hapusData(int no_h){
    data.removeIf(item -> item.no == (no_h));
}
    void ubahData(int no_h,int no,String nama,String jenis,int price,String game){

        int loop = -1;
        for(int i=0; i<data.size(); i++){
            if (data.get(i).no == no_h){
                loop = i;
                System.out.println(loop);   
                data.set(loop,new Market(no,nama,jenis,price,game));
            }
        }
    }
void showData(){
    for(Market market:data){
        System.out.println("|==================================|");
        System.out.println("No.Barang = "+market.getno());
        System.out.println("Nama Barang = "+market.getnama());
        System.out.println("Jenis Barang = "+market.getjenis());
        System.out.println("Harga Barang = "+market.getprice());
        System.out.println("Asal Game = "+market.getgame());
        System.out.println("|==================================|");
}}
    
    public static void main(String[] args) {
    Scanner Masukkan = new Scanner (System.in);
    int Ngulang = 1;
    TradeMarket tm = new TradeMarket();
    while(Ngulang==1){
        System.out.println("/======================\\");
        System.out.println(" Market Trade Community");
        System.out.println("\\======================/");
        System.out.println(" 1. Tambah Data");
        System.out.println(" 2. Hapus Data ");
        System.out.println(" 3. Ubah Data ");
        System.out.println(" 4. Lihat Data ");
        System.out.println(" 5. Keluar");
        System.out.println("\\=====================/");
        int pilih;
        System.out.print("Masukkan Pilihanmu : ");
        pilih = Masukkan.nextInt();
        if (pilih == 1){
            int nobar;
            String nabar;
            String jebar;
            int habar;
            String asbar;
            System.out.print("No.Barang    : ");
            nobar = Masukkan.nextInt();
            System.out.print("Nama Barang  : ");
            nabar = Masukkan.next();
            System.out.print("Jenis Barang : ");
            jebar = Masukkan.next();
            System.out.print("Harga Barang : ");
            habar = Masukkan.nextInt();
            System.out.print("Asal Game    : ");
            asbar = Masukkan.next();
            tm.tambahData(nobar,nabar,jebar,habar,asbar);
        }else if(pilih == 2){
            int hapus;
            System.out.print("Masukkan No Barang yang ingin dihapus : ");
            hapus = Masukkan.nextInt();
            tm.hapusData(hapus);
        }else if(pilih == 3){
            int nobar;
            String nabar;
            String jebar;
            int habar;
            String asbar;
            int pilihan;
            System.out.print("Pilih No Barang yang ingin diubah : ");
            pilihan = Masukkan.nextInt();
            System.out.print("No.Barang    : ");
            nobar = Masukkan.nextInt();
            System.out.print("Nama Barang  : ");
            nabar = Masukkan.next();
            System.out.print("Jenis Barang : ");
            jebar = Masukkan.next();
            System.out.print("Harga Barang : ");
            habar = Masukkan.nextInt();
            System.out.print("Asal Game    : ");
            asbar = Masukkan.next();
            tm.ubahData(pilihan,nobar,nabar,jebar,habar,asbar);
        }else if(pilih == 4){
            tm.showData();
        }else if(pilih == 5){
            System.out.println();
}

        }
    }
}
