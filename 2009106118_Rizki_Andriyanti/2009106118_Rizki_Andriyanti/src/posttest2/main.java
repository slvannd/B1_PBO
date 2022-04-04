/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

import java.io.IOException;

/**
 *
 * @author RIRI-CHAN
 */

public class main {
    public static void main(String[] args) throws IOException{
        tas luxury = new tas ("Charles & Keith","Tas Bahu Koa Square Push-Lock","Beige",202,"Indonesia",1.500);
        
        
        System.out.println(luxury.brand);
        System.out.println(luxury.namatas);
        System.out.println(luxury.color);
        System.out.println(luxury.kode);
        System.out.println(luxury.negara);
        System.out.println(luxury.harga);
        System.out.println(" ");
        luxury.setBrand("Charles & Keith");
        luxury.setNamatas("Tas Charlot Jacquard Printed");
        luxury.setKode(807);
        luxury.setNegara("Indonesia");
        luxury.setHarga(1.149);
        System.out.println(" ");
        System.out.println("Brand : " +luxury.getBrand());
        System.out.println("Nama Tas : " +luxury.getNamatas());
        System.out.println("Warna : " +luxury.getColor());
        System.out.println("Kode : " +luxury.getKode());
        System.out.println("Negara Tujuan : " +luxury.getNegara());
        System.out.println("Harga : " +luxury.getHarga());
    }
}
