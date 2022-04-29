package POSSTEST4;

public class Karyawan {
    private String nama;
    private String alamat;
    private int tahunLahir;
    private int tahunMasuk;
    
    public Karyawan(String nama, String alamat, int tahunLahir, int tahunMasuk){
        this.nama = nama;
        this.alamat = alamat;
        this.tahunLahir = tahunLahir;
        this.tahunMasuk = tahunMasuk;
    }
    void Karyawan(){
        System.out.println("Nama Karyawan       : "+ this.nama);
        System.out.println("alamat              : "+ this.alamat);
        System.out.println("tahunLahir          : "+ this.tahunLahir);
        System.out.println("tahunMasuk          : "+ this.tahunMasuk);
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    
}
