/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttes3;
public class SuratKTM {
    private int Nik;
    private String Nama;
    private String TanggalLahir;
    private String JenisKelamin;
    private int RT;
    private int RW;
    private String Kecamatan;
    private String Keperluan;
    SuratKTM(int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep)
    {
        this.Nik = nik;
        this.Nama = nm;
        this.TanggalLahir = ttl;
        this.JenisKelamin = jk;
        this.RT = rt;
        this.RW = rw;
        this.Kecamatan = kec;
        this.Keperluan = kep;

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

    public int getRT() {
        return RT;
    }

    public void setRT(int RT) {
        this.RT = RT;
    }

    public int getRW() {
        return RW;
    }

    public void setRW(int RW) {
        this.RW = RW;
    }

    public String getKecamatan() {
        return Kecamatan;
    }

    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    public String getKeperluan() {
        return Keperluan;
    }

    public void setKeperluan(String Keperluan) {
        this.Keperluan = Keperluan;
    }

    
}
