package POSTTEST3;

/**
 *
 * @author Asus
 */
public class Helm {

// Atribut
    private String nama;
    private String merk;
    private String warna;
    private String ukuran;
    private int berat;
    private int jumlah;
    private int harga;

// Constructor primary
    public Helm(String nama, String merk, String warna, String ukuran, int berat, int jumlah, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.berat = berat;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

//Method
    void tampildata() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Merk Helm   : " + this.merk);
        System.out.println("Warna Helm  : " + this.warna);
        System.out.println("Ukuran Helm : " + this.ukuran);
        System.out.println("Berat Helm  : " + this.berat);
        System.out.println("Jumlah Helm : " + this.jumlah);
        System.out.println("Harga Helm  : " + this.harga);
    }

    void infotambah() {
        System.out.print("\nData Berhasil di Tambah...\n");
    }

    void infoupdate() {
        System.out.print("\nData Berhasil di Ubah...\n");

    }

    void infodelete() {
        System.out.print("\nData Berhasil di Hapus...\n");
    }

}
