package POSTTEST2;
import java.util.ArrayList;
import java.util.Formatter;

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
     
    void tampilBarang(int pilih_menu){



        if(pilih_menu ==1){
        for(sepatu item: this.list_sepatu){
            item.print();
        }}
        else if(pilih_menu ==2){
             
            Formatter tabel = new Formatter();  
            System.out.println("----------------------------------------------------------------------");
            tabel.format("%1s %14s %15s %10s %13s %8s",
            "Kode","Jenis","Brand","Ukuran","Warna","Harga");  
            System.out.println(tabel);  
            System.out.println("----------------------------------------------------------------------");
            for(sepatu item: this.list_sepatu){
                item.print2();
            }

        }
    }
}
