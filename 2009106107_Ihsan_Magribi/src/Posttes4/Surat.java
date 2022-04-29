
package Posttes4;

public class Surat {
    protected int Nik;
    protected String Nama;
    protected String TanggalLahir;
    protected String JenisKelamin;

    public Surat(int Nik, String Nama, String TanggalLahir, String JenisKelamin) {
        this.Nik = Nik;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.JenisKelamin = JenisKelamin;
    }
    
    public Surat() {
        this.Nik = 0;
        this.Nama = "";
        this.TanggalLahir = "";
        this.JenisKelamin = "";
    }

    public int getNik() {
        return Nik;
    }

    public void setNik(int Nik) {
        this.Nik = Nik;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    
}
