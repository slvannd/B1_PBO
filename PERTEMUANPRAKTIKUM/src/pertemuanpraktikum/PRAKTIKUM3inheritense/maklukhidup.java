/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpraktikum.PRAKTIKUM3inheritense;

/**
 *
 * @author LENOVO
 */
public class maklukhidup {
    int jumlah = 1;
  int kode = 12; 
  String jenis = "hewan";


   
  String cekmaklukhidup() { 
    return "Ini berasal dari clas mhidup";
    
}
  class hewan extends maklukhidup {
  String nama = "ayam";
  String jenis = "ayam";
  
 
  String cekhewan() { 
    return "Ini berasal dari class hewan"; 
  }
}
  class semua extends hewan {
  String lihatketentuan() { 
   return "jumlah: " + jumlah + ", kode: "+ kode + 
           ", jenos: " + jenis  ; 
}
   String ceksemua() { 
    return "berikut Ini adalah dari hewannya"; 
  }


  }

    public static void main(String[] args) {
        semua hewanku= new semua();
     
    System.out.println(hewanku.lihatketentuan());
    System.out.println(hewanku.cekmaklukhidup());
    System.out.println(hewanku.cekhewan());
    System.out.println(hewanku.ceksemua());
   
        
    }}
    

