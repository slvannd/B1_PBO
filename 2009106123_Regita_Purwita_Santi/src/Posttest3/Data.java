/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest3;

public class Data {
    private int nik;
    private String status;
    private String nama;
    private String ttl;
    private String jk;
    private String agama;
    private String alamat;
    
    public Data(int nik, String nama,String ttl,String jk,String agama,String status,String alamat){
        this.nik = nik;
        this.nama = nama;
        this.ttl= ttl;
        this.jk = jk;
        this.agama = agama;
        this.status = status;
        this.alamat = alamat;
    }  

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    void Welcome(){
        System.out.println("================================================");
        System.out.println("         SELAMAT DATANG DALAM PROGRAM           ");
        System.out.println("                PEMBUATAN KTP                   ");
        System.out.println("================================================");
        System.out.println("Description :                                   ");
        System.out.println("1.Program pembuatan KTP dengan 7 inputan        ");
        System.out.println("2.User dapat melakukan CRUD terhadap Data KTP   ");
    }
    
    void Thanks(){
        System.out.println("================================================");
        System.out.println("        TERIMAKASIH TELAH MENGGUNAKAN           ");
        System.out.println("           PPROGRAM PEMBUATAN KTP               ");
        System.out.println("================================================");
        
    }
    
}   

