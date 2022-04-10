/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpraktikum3;

/**
 *
 * @author MSI Gaming
 */
public class Main {
    public static void main(String[] args)throws Exception {
        
        Laptop laptopSilvia = new Laptop("MSI","PINK","KOTAK",110000,2.3);
        Laptop laptopRidwan = new Laptop("ASUS","HITAM","KOTAK",100000,2.5);
        
        System.out.println(laptopSilvia.getMerk());
        System.out.println(laptopSilvia.getWarna());
        System.out.println(laptopSilvia.getBentuk());
        System.out.println(laptopSilvia.getHarga());
        System.out.println(laptopSilvia.getBerat());
        System.out.println("=====================");
        System.out.println(laptopRidwan.getMerk());
        System.out.println(laptopRidwan.getWarna());
        System.out.println(laptopRidwan.getBentuk());
        System.out.println(laptopRidwan.getHarga());
        System.out.println(laptopRidwan.getBerat());
    }
}
