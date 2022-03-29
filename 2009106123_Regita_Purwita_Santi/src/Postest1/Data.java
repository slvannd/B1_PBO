/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest1;

public class Data {
    int nik;
    String nama,ttl,jk,agama,status,alamat;
    
    public Data(int nik, String nama,String ttl,String jk,String agama,String status,String alamat){
        this.nik = nik;
        this.nama = nama;
        this.alamat= ttl;
        this.jk = jk;
        this.agama = agama;
        this.status = status;
        this.alamat = alamat;
    }  
    public int getnik()
    {
       return nik;
    }
     
    public String getnama()
    {
       return nama;
    }
     
    public String getttl()
    {
       return ttl;
    }
    
   public String getjk()
    {
       return jk;
    }

    public String getagama()
    {
       return agama;
    }

    public String getstatus ()
    {
       return status;
    }

    public String getalamat()
    {
       return alamat;
    }
}
