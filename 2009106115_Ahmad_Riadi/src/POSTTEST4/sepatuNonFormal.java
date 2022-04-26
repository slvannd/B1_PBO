
package POSTTEST4;

import java.util.Formatter;


public class sepatuNonFormal extends sepatu{
    private String JenisPakai;

    public sepatuNonFormal(String P_JenisPakai, String P_KodeBarang, String P_Jenis, String P_Brand, int P_Ukuran, String P_Warna, int P_Harga) {
        super(P_KodeBarang, P_Jenis, P_Brand, P_Ukuran, P_Warna, P_Harga);
        this.JenisPakai = P_JenisPakai;
    }

    public sepatuNonFormal(String P_JenisPakai) {
        this.JenisPakai = P_JenisPakai;
    }
    public sepatuNonFormal() {
        this.JenisPakai = "";
    }
    public String getJenisPakai() {
        return JenisPakai;
    }

    public void setJenisPakai(String JenisPakai) {
        this.JenisPakai = JenisPakai;
    }

    public void print(){
        System.out.println("Kode   Barang       : " + getKodeBarang());
        System.out.println("Jenis  Sepatu       : " + getJenis());
        System.out.println("Brand  Sepatu       : " + getBrand());
        System.out.println("Jenis  Pakai Sepatu : " + getJenisPakai());
        System.out.println("Ukuran Sepatu       : " + getUkuran());
        System.out.println("Warna  Sepatu       : " + getWarna());
        System.out.println("Harga  Sepatu       : " + getHarga()+"\n\n");
    }

    void print2(){
        Formatter tabel = new Formatter();  
        tabel.format("%1s %15s %15s %15s %8s %15s %8s",
        this.KodeBarang,this.Jenis,this.Brand,this.JenisPakai,this.Ukuran,this.Warna,this.Harga);  
        System.out.println(tabel);  
    }
}
