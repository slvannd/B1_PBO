/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author MSI Gaming
 */
public class Main {
    public static void main(String[] args)throws Exception {
        Kamera kameraSilvia = new Kamera("CANON","PINK",2.5,1200000,20,5);
        
        System.out.println(kameraSilvia.getMerk());
        System.out.println(kameraSilvia.getWarna());
        System.out.println(kameraSilvia.getBerat());
        System.out.println(kameraSilvia.getHarga());
        System.out.println(kameraSilvia.getJumlahTombol());
        System.out.println(kameraSilvia.getUkuranLensa());
    }
}
