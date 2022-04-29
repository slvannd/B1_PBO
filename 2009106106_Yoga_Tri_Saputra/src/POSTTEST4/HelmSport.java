package POSTTEST4;

/**
 *
 * @author Asus
 */
public class HelmSport extends Helm {

    private String jenis;

    public HelmSport(String jenis, String nama, String merk, String warna, String ukuran, int berat, int jumlah, int harga) {
        super(nama, merk, warna, ukuran, berat, jumlah, harga);
        this.jenis = jenis;
    }

    public HelmSport() {
        this.jenis = "";
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    void tampildata() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Merk Helm   : " + this.merk);
        System.out.println("Warna Helm  : " + this.warna);
        System.out.println("Ukuran Helm : " + this.ukuran);
        System.out.println("Jenis Helm  : " + this.jenis);
        System.out.println("Berat Helm  : " + this.berat);
        System.out.println("Jumlah Helm : " + this.jumlah);
        System.out.println("Harga Helm  : " + this.harga);
    }

    void infotambah() {
        System.out.print("\nData Helm Sport Berhasil di Tambah...\n");
    }

    void infoupdate() {
        System.out.print("\nData Helm Sport Berhasil di Ubah...\n");

    }

    void infodelete() {
        System.out.print("\nData Helm Sport Berhasil di Hapus...\n");
    }

}
