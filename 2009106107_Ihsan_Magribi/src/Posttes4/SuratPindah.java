/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttes4;

public class SuratPindah {
    int NIK;
    String Nama;
    String TanggalLahir;
    String JenisKelamin;
    int RT;
    int RW;
    String Kecamatan;
    String Keperluan;
    SuratPindah(int nik, String nm, String ttl, String jk, int rt, int rw, String kec, String kep)
    {
        this.NIK = nik;
        this.Nama = nm;
        this.TanggalLahir = ttl;
        this.JenisKelamin = jk;
        this.RT = rt;
        this.RW = rw;
        this.Kecamatan = kec;
        this.Keperluan = kep;

    }

    SuratPindah(int id, String nm) {
        throw new UnsupportedOperationException("Not supported yet.");
    } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody}
     
    public int getnik()
    {
       return NIK;
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