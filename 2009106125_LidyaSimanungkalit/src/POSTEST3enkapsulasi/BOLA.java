/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST3enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class BOLA {
    private long no_punggung;
    private String nama,posisi,status;
    
    BOLA(long no_punggung,String nama,String posisi,String status){
        this.no_punggung = no_punggung;
        this.nama = nama;
        this.posisi= posisi;
        this.status = status;
    }
    
    void dataDitambah(){
        System.out.println("BERHASIL MENAMBAHKAN DATA");
    }
    void dataDiubah(){
        System.out.println("BERHASIL MENGUBAH DATA");
    }

    public long getNo_punggung() {
        return no_punggung;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public String getStatus() {
        return status;
    }

    public void setNo_punggung(long no_punggung) {
        this.no_punggung = no_punggung;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    String Status() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
