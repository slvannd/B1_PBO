package POSTTEST2;
import java.util.Formatter;  
class sepatu {
    //Atribut-----------------------------------------
    String KodeBarang;
    String Jenis;
    String Brand;
    int    Ukuran;
    String Warna;
    int    Harga;
 
    // konstruktor------------------------------------
    sepatu(String P_KodeBarang,
           String P_Jenis,
           String P_Brand,
           int    P_Ukuran,
           String P_Warna,
           int    P_Harga){

        this.KodeBarang  = P_KodeBarang;
        this.Jenis       = P_Jenis;
        this.Brand       = P_Brand;
        this.Ukuran      = P_Ukuran;
        this.Warna       = P_Warna;
        this.Harga       = P_Harga;
    }
    // method untuk Tampilkan Objek ------------------
    void print(){
        System.out.println("Kode   Barang : " + this.KodeBarang);
        System.out.println("Jenis  Sepatu : " + this.Jenis);
        System.out.println("Brand  Sepatu : " + this.Brand);
        System.out.println("Ukuran Sepatu : " + this.Ukuran);
        System.out.println("Warna  Sepatu : " + this.Warna);
        System.out.println("Harga  Sepatu : " + this.Harga+"\n\n");
    }

    void print2(){
        Formatter tabel = new Formatter();  
        tabel.format("%1s %15s %15s %8s %15s %8s",
        this.KodeBarang,this.Jenis,this.Brand,this.Ukuran,this.Warna,this.Harga);  
        System.out.println(tabel);  
    }
}
