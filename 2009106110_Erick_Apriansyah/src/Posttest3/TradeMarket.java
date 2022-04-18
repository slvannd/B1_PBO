package Posttest3;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TradeMarket {

    Scanner Masukkan = new Scanner(System.in);

    public void TambahData(ArrayList<Market> mket) {
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

        mket.add(market);
        market.BarangSukes();
    }

    public void UbahData(ArrayList<Market> data) {

        int nobar;
        String nabar;
        String jebar;
        int habar;
        String asbar;
        System.out.print("Pilih Indeks Barang yang ingin diubah : ");
        int pilihan = Masukkan.nextInt();
        System.out.println("====Data Sebelumnya====");
        System.out.println("No.Barang    : " + data.get(pilihan).getno());
        System.out.println("Nama Barang  : " + data.get(pilihan).getnama());
        System.out.println("Jenis Barang : " + data.get(pilihan).getjenis());
        System.out.println("Harga Barang : " + data.get(pilihan).getprice());
        System.out.println("Asal Game    : " + data.get(pilihan).getgame());
        System.out.println("");
        System.out.println("====Data Baru====");
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

    public void HapusData(ArrayList<Market> data) {
        String hapus;
        System.out.print("Masukkan Indeks Barang yang ingin dihapus : ");
        hapus = Masukkan.next();
        data.remove((int) Integer.valueOf(hapus));
        Market market = new Market();
        market.BarangGagal();
    }

    public void ShowData(ArrayList<Market> data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println("|==================================|");
            System.out.println("Indeks Barang = " + i);
            System.out.println("No.Barang     = " + data.get(i).getno());
            System.out.println("Nama Barang   = " + data.get(i).getnama());
            System.out.println("Jenis Barang  = " + data.get(i).getjenis());
            System.out.println("Harga         = " + data.get(i).getprice());
            System.out.println("Asal Game     = " + data.get(i).getgame());
            System.out.println("|==================================|");
        }
    }

}
