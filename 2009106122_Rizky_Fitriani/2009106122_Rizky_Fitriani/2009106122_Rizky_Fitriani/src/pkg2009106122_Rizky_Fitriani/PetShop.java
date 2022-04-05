package pkg2009106122_Rizky_Fitriani;

class PetShop {
    String merk;
    String jenis;
    double berat;
    double harga;
    String kategori;
    
    public PetShop(String merk, String jenis, double berat, double harga, String kategori) {
        this.merk = merk;
        this.jenis = jenis;
        this.berat = berat;
        this.harga = harga;
        this.kategori = kategori;
    }
    void melihatbarang() {
        System.out.println("Melihat data barang di pet shop");
    }
    void menambahBarang(){
        System.out.println("Data barang di pet shop ditambah");
    }
    void mengeditBarang() {
        System.out.println("Data barang di pet shop diedit");
    }
    void menghapusBarang() {
        System.out.println("Data barang di pet shop dihapus");
    }
}
