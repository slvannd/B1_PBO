/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttes2;
public class SuratKTM {
    int Nik;
    String Nama;
    String TanggalLahir;
    String JenisKelamin;
    int RT;
    int RW;
    String Kecamatan;
    String Keperluan;
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

    public int getnik()
    {
       return Nik;
    }
     
    public String getnm()
    {
       return Nama;
    }
     
    public String getttl()
    {
       return TanggalLahir;
    }
    
   public String getjk()
    {
       return JenisKelamin;
    }

    public int getrt()
    {
       return RT;
    }

    public int getrw()
    {
       return RW;
    }
    public String getkec()
    {
       return Kecamatan;
    }

    public String getkep()
    {
       return Keperluan;
    }
}
