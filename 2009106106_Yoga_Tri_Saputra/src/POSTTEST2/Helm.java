package POSTTEST2;

/**
 *
 * @author Asus
 */
public class Helm {

// Atribut
    String nama;
    String merk;
    String warna;
    String ukuran;
    int berat;
    int jumlah;
    int harga;

// Constructor primary
    public Helm(String nama, String merk, String warna, String ukuran,int berat, int jumlah, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.berat = berat;
        this.jumlah = jumlah;
        this.harga = harga;
    }

//Method
void tampildata(){ 
    System.out.println("Nama        : " + this.nama);
    System.out.println("Merk Helm   : " + this.merk);
    System.out.println("Warna Helm  : " + this.warna);
    System.out.println("Ukuran Helm : " + this.ukuran);
    System.out.println("Berat Helm  : " + this.berat);
    System.out.println("Jumlah Helm : " + this.jumlah);
    System.out.println("Harga Helm  : " + this.harga);
    }

void infotambah(){
    System.out.print("\nData Berhasil di Tambah...\n");
    }

void infoupdate(){
    System.out.print("\nData Berhasil di Ubah...\n");

    }

void infodelete(){
    System.out.print("\nData Berhasil di Hapus...\n");
    }

}
