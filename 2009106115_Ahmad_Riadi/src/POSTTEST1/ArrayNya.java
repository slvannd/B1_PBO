package POSTTEST1;
import java.util.ArrayList;

class ArrayNya {

    ArrayList<sepatu> list_sepatu = new ArrayList<>();
     
    void tambahBarang(sepatu data){
        this.list_sepatu.add(data);}
     
    void hapusBarang(String kode){
        this.list_sepatu.removeIf(item -> item.KodeBarang.equals(kode));}
     
    void ubahData(String kode,sepatu data){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.list_sepatu.size(); i++){
            if (this.list_sepatu.get(i).KodeBarang.equals(kode)){
                index = i;
                ditemukan = true;
            }
        }

        if (ditemukan == true){
          this.list_sepatu.set(index,data);
}
        else {
            System.out.println("Data sepatu tidak ditemukan");}
}


    void cariBarang(String kode){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.list_sepatu.size(); i++){
            if (this.list_sepatu.get(i).KodeBarang.equals(kode)){
                index = i;
                ditemukan = true;
            }
        }
         
        if (ditemukan == true){
            this.list_sepatu.get(index).print();}
        else {
            System.out.println("Data barang tidak ditemukan");}
            }
     
    void tampilBarang(){
//        Formatter tabel = new Formatter(); 
//        tabel.format("%15s %10s %10s %10i %10s %10i\n","Kode","Jenis","Brand","Ukuran","Warna","Harga"); 
        System.out.println("-----------------");
        for(sepatu item: this.list_sepatu){
            item.print();
        }
    }
}
