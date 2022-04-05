/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST2;


class Makeups{
    String brand;
    String name;
    int stock;
    int price;
    
    public Makeups(String brand, String name, int stock, int price) {
        this.brand = brand;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    void add(){
    System.out.println ("your stock is add ");
                    }
    
    void remove(){
     System.out.println ("your stock is remove");
              
    }
    void edit(){
    System.out.println ("your stock is edit");
    
}
}
