/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MSI Gaming
 */
public class Mainan extends TamanBermain {
    private String merk;
    private String bentuk_mainan;
    private String warna_mainan;

    public Mainan(String merk, String bentuk_mainan, String warna_mainan, String nama_taman, String alamat_taman) {
        super(nama_taman, alamat_taman);
        this.merk = merk;
        this.bentuk_mainan = bentuk_mainan;
        this.warna_mainan = warna_mainan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getBentuk_mainan() {
        return bentuk_mainan;
    }

    public void setBentuk_mainan(String bentuk_mainan) {
        this.bentuk_mainan = bentuk_mainan;
    }

    public String getWarna_mainan() {
        return warna_mainan;
    }

    public void setWarna_mainan(String warna_mainan) {
        this.warna_mainan = warna_mainan;
    }
    public static void main(String[] args) {
        TamanBermain tamanBermainBaru = new TamanBermain("Taman Baru","Jl.perjuangan");
        TamanBermain tamanBermainLama = new TamanBermain("Taman Lama","Jl.pramuka");
  
    Mainan mainanBaru = new Mainan("bobo","bulat","pink","Taman Sari","jl.pahlawan");
    Mainan mainanLama = new Mainan("Play Game","Hitam","persegi panjang","Taman Anggrek","jl.Anggur");
    
        System.out.println(mainanBaru.getMerk());
        System.out.println(mainanBaru.getBentuk_mainan());
        System.out.println(mainanBaru.getWarna_mainan());
        System.out.println(tamanBermainBaru.getAlamat_taman());
        System.out.println(tamanBermainBaru.getNama_taman());
        System.out.println("==========================");
        System.out.println(mainanLama.getMerk());
        System.out.println(mainanLama.getBentuk_mainan());
        System.out.println(mainanLama.getWarna_mainan());
        System.out.println(tamanBermainLama.getNama_taman());
        System.out.println(tamanBermainLama.getAlamat_taman());
    }
}

