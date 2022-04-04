/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

/**
 *
 * @author RIRI-CHAN
 */
public class tas {
    String brand;
    String namatas;
    String color;
    int kode;
    String negara;
    double harga;
    
    public tas(String brand, String namatas, String color, int kode, String negara, Double harga){
        this.brand = brand;
        this.namatas = namatas;
        this.color = color;
        this.kode = kode;
        this.negara = negara;
        this.harga = harga;
        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNamatas() {
        return namatas;
    }

    public void setNamatas(String namatas) {
        this.namatas = namatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
