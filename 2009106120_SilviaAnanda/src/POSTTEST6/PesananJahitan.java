/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI Gaming
 */
public class PesananJahitan extends MyAbstract {
    ArrayList<ModelPesanan> dataList;
    JasaJahitSilvia classUtama;

    public PesananJahitan(ArrayList<ModelPesanan> dataList, JasaJahitSilvia classUtama) {
        this.dataList = dataList;
        this.classUtama = classUtama;
    }
    
    @Override
    public void labelData(){
        System.out.println("--  DATA PESANAN  --");
        System.out.println("====================");
        System.out.println();
    }
    
    @Override
    public void showData(){
        labelData();
        System.out.println("~~~  TAMPIL DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.println("ID\tJENIS JAHITAN\t\tUKURAN\tJENIS KAIN\t\tJUMLAH");
        for(int i=0; i < dataList.size(); i++){
            ModelPesanan data = dataList.get(i);
            System.out.print(data.id + "\t");
            System.out.print(data.jenis_jahitan + "\t");
            System.out.print(data.ukuran + "\t");
            System.out.print(data.jenis_kain + "\t");
            System.out.print(data.jumlah);
            System.out.println();
        }
        
        int aksiKembali = aksiKembali();
        System.out.println();
        
        switch (aksiKembali) {
            case 0: classUtama.dataPesanan(); break;
            case 1: classUtama.mainMenu(); break;
            default: 
                    aksiKosong();
                    showData();
            break;
        }
    }
    
    public void addData(){
        Scanner myInput = new Scanner(System.in);
        String id, jenis_jahitan, ukuran, jenis_kain, jumlah;
        
        labelData();
        System.out.println("~~~  TAMBAH DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.print("ID Pesanan : ");
        id = myInput.nextLine();
        System.out.print("Jenis Jahitan : ");
        jenis_jahitan = myInput.nextLine();
        System.out.print("Ukuran : ");
        ukuran = myInput.nextLine();
        System.out.print("Jenis Kain : ");
        jenis_kain = myInput.nextLine();
        System.out.print("Jumlah : ");
        jumlah = myInput.nextLine();
        System.out.println();
        
        ModelPesanan tambah = new ModelPesanan(id, jenis_jahitan, ukuran, jenis_kain, jumlah);
        
        int pilihanAksi = menuAksi();
        System.out.println();

        switch (pilihanAksi) {
            case 1:
                dataList.add(tambah);
                addData();
            break;
            case 2:
                dataList.add(tambah);
                classUtama.dataPesanan();
            break;
            case 3: classUtama.dataPesanan(); break;
            case 4: classUtama.mainMenu(); break;
            default:
                    aksiKosong();
                    addData();
            break;
        }
    }
    
    @Override
    public void editData(){
        Scanner myInput = new Scanner(System.in);
        String id, jenis_jahitan, ukuran, jenis_kain, jumlah;
        
        labelData();
        System.out.println("~~~  EDIT DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        
        System.out.print("Masukkan ID Pesanan : ");
        id = myInput.nextLine();
        int index = cariData(id);
        if(index >= 0){
            System.out.print("Jenis Jahitan : ");
            jenis_jahitan = myInput.nextLine();
            System.out.print("Ukuran : ");
            ukuran = myInput.nextLine();
            System.out.print("Jenis Kain : ");
            jenis_kain = myInput.nextLine();
            System.out.print("Jumlah : ");
            jumlah = myInput.nextLine();
            System.out.println();
            int aksi = aksiSimpanKembali();
            System.out.println();
            ModelPesanan tambah = new ModelPesanan(id, jenis_jahitan, ukuran, jenis_kain, jumlah);

            switch (aksi) {
                case 1: 
                    dataList.set(index, tambah);
                    classUtama.dataPesanan();
                break;
                case 2:
                    editData(); 
                    break;
                default:
                    aksiKosong();
                    classUtama.dataPesanan();
                break;
            }
        }else{
            int aksi = aksiMengulang();
            System.out.println();
            switch (aksi) {
                case 0: classUtama.dataPesanan(); break;
                case 1: editData(); break;
                default:
                    aksiKosong();
                    editData();
                break;
            }
        }
    }
    
    @Override
    public void deleteData(){
        Scanner myInput = new Scanner(System.in);
        
        labelData();
        System.out.println("~~~  HAPUS DATA  ~~~~");
        System.out.println("=====================");
        System.out.println();
        
        System.out.print("Masukkan ID Pesanan : ");
        int index = cariData(myInput.nextLine());
        if(index >= 0){
            int aksi = aksiHapusKembali();
            System.out.println();

            switch (aksi) {
                case 1:
                    dataList.remove(index);
                    classUtama.dataPesanan();
                break;
                case 2: deleteData(); break;
                default:
                    aksiKosong();
                    classUtama.dataPesanan();
                break;
            }
        }else{
            int aksi = aksiMengulang();
            System.out.println();
            switch (aksi) {
                case 0: classUtama.dataPelanggan(); break;
                case 1: editData(); break;
                default:
                    aksiKosong();
                    deleteData();
                break;
            }
        }
    }
    
    private int cariData(String id){
        int index = -1;
        for(int i=0; i < dataList.size(); i++){
            ModelPesanan data = dataList.get(i);
            if(id.equals(data.id)){
                index=i;
                i = dataList.size();
            }
        }
        return index;
    }
}
