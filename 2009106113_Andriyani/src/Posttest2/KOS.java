package Posttest2;

class KOS {
    String NamaKos;
    String Alamat;
    String Pemilik;
    int Kamar_Kosong;
    int Harga;
    KOS(String NK, String ALM, String PML,int KK, int HRG)
    {
        this.NamaKos = NK;
        this.Alamat = ALM;
        this.Pemilik = PML;
        this.Kamar_Kosong = KK;
        this.Harga = HRG;
    }

    KOS() {
        }

    public String getNk()
    {
        return NamaKos;
    }
    
    public String getAlm()
    {
        return Alamat;
    }
    public String getPml()
    {
        return Pemilik;
    }
    public int getKk()
    {
        return Kamar_Kosong;
    }
    public int getHrg()
    {
        return Harga;
    }

//    void TambahData(){
//        System.out.println("Motor Nyala");
//    }
    
    void TambahData(){
         System.out.println("Selamat, Data Berhasil ditambahkan !\n");
     }
    
    void EditData(){
         System.out.println("Data Berhasil diubah !\n");
     }
    
    void HapusData(){
         System.out.println("Data Terhapus !\n");
     }
}
