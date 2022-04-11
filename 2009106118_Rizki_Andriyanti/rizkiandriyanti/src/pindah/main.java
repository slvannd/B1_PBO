/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pindah;

import java.util.ArrayList;

/**
 *
 * @author RIRI-CHAN
 */
public class main {
    public static void main(String[] args) {
        ArrayList<String> isiGudang = new ArrayList<>();
        
        isiGudang.add ("sikat gigi");
        isiGudang.add("odol");
        gudang Gudang = new gudang(isiGudang);
        System.out.println("Isi Gudang Sebelum");
        for (String item : Gudang.getIsi()){
            System.out.println(item);
        }
        
        isiGudang.add("sandal");
        System.out.println("Isi gudang setelah");
        for (String item: Gudang.getIsi()){
            System.out.println(item);
        }
        
        
//        BendaSatu benda = new BendaSatu (90,10000,2.0);
//        System.out.println(benda.getJumlah());
//        System.out.println(benda.getHarga());
//        System.out.println(benda.getBerat());
    }
}
