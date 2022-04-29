package pkg2009106122_rizky_fitriani_posttest4;

class PetShop {
    int No;
    String Merk;
    String Jenis;
    double Berat;
    double Harga;
    String Kategori;
    
    public PetShop(int No, String Merk, String Jenis, double Berat, double Harga, String Kategori) {
        this.No = No;
        this.Merk = Merk;
        this.Jenis = Jenis;
        this.Berat = Berat;
        this.Harga = Harga;
        this.Kategori = Kategori;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public double getBerat() {
        return Berat;
    }

    public void setBerat(double Berat) {
        this.Berat = Berat;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }
    
}