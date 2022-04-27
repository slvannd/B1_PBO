/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI Gaming
 */
public class PelangganJahitan extends MyAbstract{
    ArrayList<ModelPelanggan> dataList;
    JasaJahitSilvia classUtama;

    public PelangganJahitan(ArrayList<ModelPelanggan> dataList, JasaJahitSilvia classUtama) {
        this.dataList = dataList;
        this.classUtama = classUtama;
    }
    
    @Override
    public void labelData(){
        System.out.println("--  DATA PELANGGAN  --");
        System.out.println("======================");
        System.out.println();
    }
    
    @Override
    public void showData(){
        labelData();
        System.out.println("~~~  TAMPIL DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.println("ID\tNAMA\t\tJENKEL\tALAMAT\t\tNO HP");
        for(int i=0; i < dataList.size(); i++){
            ModelPelanggan data = dataList.get(i);
            System.out.print(data.id + "\t");
            System.out.print(data.nama + "\t");
            System.out.print(data.jenis_kelamin + "\t");
            System.out.print(data.alamat + "\t");
            System.out.print(data.nohp);
            System.out.println();
        }
        
        int aksiKembali = aksiKembali();
        System.out.println();
        
        switch (aksiKembali) {
            case 0: classUtama.dataPelanggan(); break;
            case 1: classUtama.mainMenu(); break;
            default: 
                    aksiKosong();
                    showData();
            break;
        }
    }
    
    public void addData(){
        Scanner myInput = new Scanner(System.in);
        String id, nama, jenis_kelamin, alamat, nohp;
        
        labelData();
        System.out.println("~~~  TAMBAH DATA  ~~~~");
        System.out.println("======================");
        System.out.println();
        
        System.out.print("ID Pelanggan : ");
        id = myInput.nextLine();
        System.out.print("Nama Pelanggan : ");
        nama = myInput.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        jenis_kelamin = myInput.nextLine();
        System.out.print("Alamat : ");
        alamat = myInput.nextLine();
        System.out.print("No HP Pelanggan : ");
        nohp = myInput.nextLine();
        System.out.println();
        
        ModelPelanggan tambah = new ModelPelanggan(id, nama, jenis_kelamin, alamat, nohp);
        
        int pilihanAksi = menuAksi();
        System.out.println();

        switch (pilihanAksi) {
            case 1:
                dataList.add(tambah);
                addData();
            break;
            case 2:
                dataList.add(tambah);
                classUtama.dataPelanggan();
            break;
            case 3: classUtama.dataPelanggan(); break;
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
        String id, nama, jenis_kelamin, alamat, nohp;
        
        labelData();
        System.out.println("~~~  EDIT DATA  ~~~~");
        System.out.println("====================");
        System.out.println();
        
        System.out.print("Masukkan ID Pelanggan : ");
        id = myInput.nextLine();
        int index = cariData(id);
        if(index >= 0){
            System.out.print("Nama Pelanggan : ");
            nama = myInput.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            jenis_kelamin = myInput.nextLine();
            System.out.print("Alamat : ");
            alamat = myInput.nextLine();
            System.out.print("No HP Pelanggan : ");
            nohp = myInput.nextLine();
            System.out.println();
            int aksi = aksiSimpanKembali();
            System.out.println();
            ModelPelanggan tambah = new ModelPelanggan(id, nama, jenis_kelamin, alamat, nohp);

            switch (aksi) {
                case 1: 
                    dataList.set(index, tambah);
                    classUtama.dataPelanggan();
                break;
                case 2:
                    editData(); 
                    break;
                default:
                    aksiKosong();
                    classUtama.dataPelanggan();
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
        
        System.out.print("Masukkan ID Pelanggan : ");
        int index = cariData(myInput.nextLine());
        if(index >= 0){
            int aksi = aksiHapusKembali();
            System.out.println();

            switch (aksi) {
                case 1:
                    dataList.remove(index);
                    classUtama.dataPelanggan();
                break;
                case 2: deleteData(); break;
                default:
                    aksiKosong();
                    classUtama.dataPelanggan();
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
            ModelPelanggan data = dataList.get(i);
            if(id.equals(data.id)){
                index=i;
                i = dataList.size();
            }
        }
        return index;
    }
}
