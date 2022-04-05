/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author MSI Gaming
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        botolMinum botolMinumsilvia = new botolMinum ("Sprite","Hitam","Lonjong",3.4);
        
        System.out.println(botolMinumsilvia.merk);
        System.out.println(botolMinumsilvia.warna);
        System.out.println(botolMinumsilvia.bentuk);
        System.out.println(botolMinumsilvia.berat);
        System.out.println("=====================");
        botolMinumsilvia.menampungAir();
        botolMinumsilvia.menumpahkanAir();
        botolMinumsilvia.meminumAir();
    }
}
