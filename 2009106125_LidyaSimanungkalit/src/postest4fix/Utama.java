/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest4fix;

/**
 *
 * @author LENOVO
 */
public class Utama extends BOLA{
    private String kondisiInti;
    
    public Utama(long no_punggung, String nama, String posisi, String kondisiInti){
        super(no_punggung, nama, posisi);
        this.kondisiInti = kondisiInti;
    }

    public String getKondisiInti() {
        return kondisiInti;
    }

    public void setKondisiInti(String kondisiInti) {
        this.kondisiInti = kondisiInti;
    }
    
    @Override
    void dataDitambah(){
        System.out.println("BERHASIL MENAMBAHKAN DATA PEMAIN UTAMA");
    }
    @Override
    void dataDiubah(){
        System.out.println("BERHASIL MENGUBAH DATA PEMAIN UTAMA");
    }
}
    