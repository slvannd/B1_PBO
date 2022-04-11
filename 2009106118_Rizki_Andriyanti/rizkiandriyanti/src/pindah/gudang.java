/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pindah;

/**
 *
 * @author RIRI-CHAN
 */
import java.util.ArrayList;

public class gudang {
    private  ArrayList<String> isi;
    
    public gudang(ArrayList<String> isi){
       setIsi(isi);
    }

    public ArrayList<String> getIsi() {
        ArrayList<String> cloneIsi = (ArrayList<String>)isi.clone();
        return cloneIsi;
    }

    public void setIsi(ArrayList<String> newIsi) {
        ArrayList<String> cloneIsi = (ArrayList<String>)newIsi.clone();
        this.isi = cloneIsi;
    }
}
