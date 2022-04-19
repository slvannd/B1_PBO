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
public class BOLA {
    protected long no_punggung;
    protected String nama,posisi;
    
    public BOLA(long no_punggung,String nama,String posisi){
        this.no_punggung = no_punggung;
        this.nama = nama;
        this.posisi= posisi;
    }

    BOLA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void dataDitambah(){
        System.out.println("BERHASIL MENAMBAHKAN DATA");
    }
    void dataDiubah(){
        System.out.println("BERHASIL MENGUBAH DATA");
    }
    void dataDihapus(){
        System.out.println("BERHASIL MENGHAPUS DATA");
    }
    
    void dataDihapus(String actor){
        System.out.println("BERHASIL MENGHAPUS DATA "+actor);
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

    public void setNo_punggung(long no_punggung) {
        this.no_punggung = no_punggung;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

}
