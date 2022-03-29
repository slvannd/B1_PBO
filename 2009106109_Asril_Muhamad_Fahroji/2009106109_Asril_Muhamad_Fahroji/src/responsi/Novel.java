package responsi;

public class Novel {
    private String judul;
    private String penulis;
    private int harga;
    private int jumlahNovel;
    private int jumlahHalaman;
    private String penerbit;
    
    // Default Constructor 
    public Novel() {
        this.judul = "";
        this.penulis = "";
        this.harga = 0;
        this.jumlahNovel = 0;
        this.jumlahHalaman = 0;
        this.penerbit = "";
    }
    
    // Primary Constructor
    public Novel(String judul, String penulis, int harga, int jumlahNovel, int jumlahHalaman, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.jumlahNovel= jumlahNovel;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
    }
    
//    // The getter method judul
//    public String getJudul() {
//        return judul;
//    }
    
    // The Setter method judul
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
//    // The getter method penulis
//    public String getPenulis() {
//        return penulis;
//    }
    
    // The Setter method penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
//    // The getter method harga
//    public int getHarga() {
//        return harga;
//    }
    
    // The Setter method harga
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
//    // The getter method jumlahNovel
//    public int getJumlahNovel() {
//        return jumlahNovel;
//    }
    
    // The Setter method jumlahNovel
    public void setJumlahNovel(int jumlahNovel) {
        this.jumlahNovel = jumlahHalaman;
    }
    
//    // The getter method jumlahHalaman
//    public int getJumlahHalaman() {
//        return jumlahHalaman;
//    }
    
    // The Setter method jumlahHalaman
    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
    
//    // The getter method penerbit
//    public String getPenerbit() {
//        return penerbit;
//    }
    
    // The Setter method penerbit
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }    
}