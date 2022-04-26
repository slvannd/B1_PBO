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
public class Cadangan extends BOLA{
    private String kondisiCadangan;
    
    public Cadangan(long no_punggung, String nama, String posisi, String kondisiCadangan){
        super(no_punggung, nama, posisi);
        this.kondisiCadangan = kondisiCadangan;
    }

    public String getKondisiCadangan() {
        return kondisiCadangan;
    }

    public void setKondisiCadangan(String kondisiCadangan) {
        this.kondisiCadangan = kondisiCadangan;
    }

    
    @Override
    void dataDitambah(){
        System.out.println("BERHASIL MENAMBAHKAN DATA PEMAIN CADANGAN");
    }
    @Override
    void dataDiubah(){
        System.out.println("BERHASIL MENGUBAH DATA PEMAIN CADANGAN");
    }
    
}
