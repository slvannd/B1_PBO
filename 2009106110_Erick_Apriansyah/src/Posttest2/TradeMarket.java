package Posttest2;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TradeMarket {
    static ArrayList<Market> data =  new ArrayList<>();
    static Scanner Masukkan = new Scanner(System.in);
    public static void TambahData(){
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
            Market market = new Market();
            market.setNo(nobar);
            market.setNama_barang(nabar);
            market.setJenis_barang(jebar);
            market.setHarga(habar);
            market.setJenis_game(asbar);
            data.add(market);
            market.BarangSukes();
    }
    public static void UbahData(){
            int nobar;
            String nabar;
            String jebar;
            int habar;
            String asbar;
            System.out.print("Pilih Indeks Barang yang ingin diubah : ");
            int pilihan = Masukkan.nextInt();
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

            data.get(pilihan).setNo(nobar);
            data.get(pilihan).setNama_barang(nabar);
            data.get(pilihan).setJenis_barang(jebar);
            data.get(pilihan).setHarga(habar);
            data.get(pilihan).setJenis_game(asbar);
            Market market = new Market();
            market.BarangDiubah();
    }
    public static void HapusData(){
        String hapus;
        System.out.print("Masukkan Indeks Barang yang ingin dihapus : ");
        hapus = Masukkan.next();
        data.remove((int)Integer.valueOf(hapus));
        Market market = new Market();
        market.BarangGagal();
    }
public static void ShowData(){
    for(int i = 0 ; i < data.size(); i++){
        System.out.println("|==================================|");
        System.out.println("Indeks Barang = "+i);
        System.out.println("No.Barang     = "+data.get(i).getno());
        System.out.println("Nama Barang   = "+data.get(i).getnama());
        System.out.println("Jenis Barang  = "+data.get(i).getjenis());
        System.out.println("Harga         = "+data.get(i).getprice());
        System.out.println("Asal Game     = "+data.get(i).getgame());
        System.out.println("|==================================|");
        }
    }


    public static void main(String[] args) {
    
    int Ngulang = 1;
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
          TambahData();  
        }else if(pilih == 2){
          HapusData();
        }else if(pilih == 3){
          UbahData();
        }else if(pilih == 4){
          ShowData();
        }else if(pilih == 5){
            System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
            System.exit(0);    
}

        }
    }
}
