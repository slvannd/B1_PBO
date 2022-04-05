class sayur {

    String kode;
    String namasayur;
    double isi;
    String produksi;
    }

public class Main {
    public static void main (String[] args) throws Exception {

    sayur sayurSatu = new sayur("SD1", "Sawi Putih", 30, "Sayur Murni");

    System.out.println(sayurSatu.kode);
    System.out.println(sayurSatu.namasayur);
    System.out.println(sayurSatu.isi);
    System.out.println(sayurSatu.produksi);

    lampuSatu.namaclass();
    lampuSatu.keteranganclass();
}
}    

    public sayur (String kode, String warna, double isi, String produksi) {
        this.kode = kode;
        this.namasayur = namasayur;
        this.isi = isi;
        this.produksi = produksi;
}
        void namaclass() {
            System.out.println ("Ini adalah class sayur");
        }
        void keteranganclass() {
            System.out.println ("Berisi mengenai atribut class sayur");
        }