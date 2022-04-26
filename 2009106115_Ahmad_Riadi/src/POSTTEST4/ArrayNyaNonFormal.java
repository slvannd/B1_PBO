package POSTTEST4;
import java.util.ArrayList;
import java.util.Formatter;

class ArrayNyaNonFormal {

    ArrayList<sepatuNonFormal> list_sepatu = new ArrayList<>();
     
    void tampilBarang(int pilih_menu){
        if(pilih_menu ==1){
        for(sepatuNonFormal item: this.list_sepatu){
            item.print();
        }}
        else if(pilih_menu ==2){
             
            Formatter tabel = new Formatter();  
            System.out.println("--------------------------------------------------------------------------------------");
            tabel.format("%1s %14s %15s %15s %10s %13s %8s",
            "Kode","Jenis","Brand","Jenis Pakai","Ukuran","Warna","Harga");  
            System.out.println(tabel);  
            System.out.println("--------------------------------------------------------------------------------------");
            for(sepatuNonFormal item: this.list_sepatu){
                item.print2();
            }

        }
    }
    void tambahBarang(sepatuNonFormal data){
        
        this.list_sepatu.add(data);
}
     
    void hapusBarang(String kode){
        boolean ditemukan = false;
        for(int i=0; i<this.list_sepatu.size(); i++){
            if (this.list_sepatu.get(i).getKodeBarang().equals(kode)){
                ditemukan = true;
            }
        }
        if (ditemukan == true){
          this.list_sepatu.removeIf(item -> item.getKodeBarang().equals(kode));
          System.out.println("\n   Data sepatu Berhasil dihapus");
          tampilBarang(2);
}
        else {
            System.out.println("   Data sepatu tidak ditemukan");}

}
     
    void ubahData(String kode,sepatuNonFormal data){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.list_sepatu.size(); i++){
            if (this.list_sepatu.get(i).getKodeBarang().equals(kode)){
                index = i;
                ditemukan = true;
            }
        }

        if (ditemukan == true){
          this.list_sepatu.set(index,data);
          System.out.println("\n   Data sepatu Berhasil diubah");
          tampilBarang(2);
}
        else {
            System.out.println("   Data sepatu tidak ditemukan");}
}


    void cariBarang(String kode){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.list_sepatu.size(); i++){
            if (this.list_sepatu.get(i).getKodeBarang().equals(kode)){
                index = i;
                ditemukan = true;
            }
        }
        if (ditemukan == true){
            this.list_sepatu.get(index).print();}
        else {
            System.out.println("   Data barang tidak ditemukan");}
            }
     

}
