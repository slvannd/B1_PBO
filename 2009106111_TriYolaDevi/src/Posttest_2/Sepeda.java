package Posttest_2;

public class Sepeda {
 String merk, warna, ukuran;
    int id, harga;

    public Sepeda (int id, String merk, String warna, String ukuran, int harga){
        this.id = id;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setUkuran(String uuran) {
        this.ukuran = ukuran;
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

//    void TambahSepeda() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    void UpdateSepeda() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    void HapusSepeda() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
}