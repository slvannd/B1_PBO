/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest2;

/**
 *
 * @author HP
 */
class DriannCell {
//    Atribut
    int Pulsa;
    String Kuota;
    String nama;
    String Provider;
    
//    Method Khusus
    public DriannCell(int Pulsa, String Kuota, String nama, String Provider){
        this.Pulsa=Pulsa;
        this.Kuota=Kuota;
        this.nama=nama;
        this.Provider=Provider;
}
//    Method
    void pulsa(){
        System.out.println("Terima Kasih telah membeli pulsa " +Pulsa+ " di" +nama);
    }
    void kuota(){
        System.out.println("Terima Kasih telah membeli kuota "+Provider + Kuota+" di"+nama);
    }
    
}
