package Posttest4_Darniah;

public class Manajemen extends KebunBinatang {
    private int Umur;
    
    public Manajemen(String Nama_Hewan, String Jenis_Hewan, String Habitat_Hewan, int Jumlah_Hewan, int Umur) {
        super(Nama_Hewan, Jenis_Hewan, Habitat_Hewan, Jumlah_Hewan);
        this.Umur = Umur;
    }
    
    
   void display (){
       System.out.println("Nama_Hewan :"+ this.Nama_Hewan);
       System.out.println("Jenis_Hewan:"+ this.Jenis_Hewan);
       System.out.println("Habitat_Hewan:"+ this.Habitat_Hewan);
       System.out.println("Jumlah_Hewan:"+ this.Jumlah_Hewan);
       
   }
   
    public void setUmur(int Umur){
        this.Umur= Umur;
    }
    public int getUmur(){
        return Umur;
    }
    
}
