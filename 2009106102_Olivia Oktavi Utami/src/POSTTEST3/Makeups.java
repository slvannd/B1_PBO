/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST3;

class Makeups{
   private String brand;
   public  String name;
   private int stock;
   private int price;
   
 //setter dan getter untuk class private 
  
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    } 
   
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
   
    public Makeups(String brand, String name, int stock, int price) {
        this.brand = brand;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    
    
    void tamp(){
        System.out.println(this.name);
        
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
    
