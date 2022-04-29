package Posttest_3;

public class Sepeda {

    String merk;
    String warna;
    String ukuran;
    int id;
    int harga;

    public Sepeda (int id, String merk, String warna, String ukuran, int harga){
        this.id = id;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    void TambahData(){
        System.out.println("ID Sepeda ini," + this.id +" sudah ditambahkan"); 
        System.out.println(" ");
    }
    void UpdateData(){
        System.out.println("ID Sepeda ini," + this.id +" sudah diperbarui");
        System.out.println(" ");
    }
    void HapusData(){
        System.out.println("ID Sepeda ini," + this.id +" sudah dihapus");
        System.out.println(" ");
    }
}
