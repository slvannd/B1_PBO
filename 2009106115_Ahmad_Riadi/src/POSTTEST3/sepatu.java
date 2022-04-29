package POSTTEST3;
import java.util.Formatter;  
class sepatu {
    //Atribut-----------------------------------------
    private String KodeBarang;
    private String Jenis;
    private String Brand;
    private int    Ukuran;
    private String Warna;
    private int    Harga;
 
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
    sepatu(){
        this.KodeBarang  = "-";
        this.Jenis       = "-";
        this.Brand       = "-";
        this.Ukuran      = 0;
        this.Warna       = "-";
        this.Harga       = 0;
    }
    // method untuk Tampilkan Objek ------------------
    public void print(){
        System.out.println("Kode   Barang : " + getKodeBarang());
        System.out.println("Jenis  Sepatu : " + getJenis());
        System.out.println("Brand  Sepatu : " + getBrand());
        System.out.println("Ukuran Sepatu : " + getUkuran());
        System.out.println("Warna  Sepatu : " + getWarna());
        System.out.println("Harga  Sepatu : " + getHarga()+"\n\n");
    }

    void print2(){
        Formatter tabel = new Formatter();  
        tabel.format("%1s %15s %15s %8s %15s %8s",
        this.KodeBarang,this.Jenis,this.Brand,this.Ukuran,this.Warna,this.Harga);  
        System.out.println(tabel);  
    }

    public String getKodeBarang() {
        return KodeBarang;
    }

    public void setKodeBarang(String KodeBarang) {
        this.KodeBarang = KodeBarang;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getUkuran() {
        return Ukuran;
    }

    public void setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
}
