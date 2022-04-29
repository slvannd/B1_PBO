
package Posttest1;

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
}
