/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author MSI Gaming
 */
public class New2 {
    public static void main(String[] args) {

        // read and write menggunaka public 
        microwave ini = new microwave();
        System.out.println(" Name  : " + ini.Name);
        
            //read only menggunakan getter     
        int NO = ini.getId();
        System.out.println("id pengguna : " + NO);
 
        int harga = ini.getPrice();
        System.out.println(" Harga : " + harga);
        
        //write only menggunakan setter 
        ini.setStock(10);
        ini.display();
        
        //gabungan dari read dan wrtite dengan setter dan getter 
        
        System.out.println("Brand microwave ini : " + ini.Brand);
        
        ini.setVersion(1.3);
        ini.display();
    }
    
}

