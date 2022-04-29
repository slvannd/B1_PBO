package Posttest2;

public class Data {
    int nik;
    String nama,ttl,jk,agama,status,alamat;
    
    public Data(int nik, String nama,String ttl,String jk,String agama,String status,String alamat){
        this.nik = nik;
        this.nama = nama;
        this.ttl= ttl;
        this.jk = jk;
        this.agama = agama;
        this.status = status;
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



