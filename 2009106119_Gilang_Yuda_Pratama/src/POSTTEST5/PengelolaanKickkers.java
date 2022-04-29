/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSi-GAMING
 */
public class PengelolaanKickkers {
    ArrayList<Sepatu> dataSepatu;
    ArrayList<Sandal> dataSandal;
    Scanner input = new Scanner(System.in);
    
    public void tambahDataSepatu(ArrayList<Sepatu> dataSepatu){
        clearScreen();
        
        System.out.print("\nMasukkan Artikel      : ");
        String artikel = input.nextLine();
        System.out.print("Masukkan Warna        : ");
        String warna = input.nextLine();
        System.out.print("Masukkan Harga        : ");
        String harga = input.nextLine();
        System.out.print("Masukkan Total Barang : ");
        int total_brg = input.nextInt();
        
        Sepatu S1 = new Sepatu(artikel, warna, harga, total_brg);
        S1.setArtikel(artikel);
        S1.setWarna(warna);
        S1.setHarga(harga);
        S1.setTotal_brg(total_brg);
        
        System.out.println(" ");
        S1.tambahData(); // Overriding
        dataSepatu.add(S1);
        
        System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
        System.out.println("1. Artikel      : " + S1.getArtikel());
        System.out.println("2. Warna        : " + S1.getWarna());
        System.out.println("3. Harga        : " + S1.getHarga());
        System.out.println("4. Total Barang : " + S1.getTotal_brg());
        
    }
    
    public void tambahDataSandal(ArrayList<Sandal> dataSandal){
        clearScreen();
        
        System.out.print("\nMasukkan Artikel      : ");
        String artikel = input.nextLine();
        System.out.print("Masukkan Warna        : ");
        String warna = input.nextLine();
        System.out.print("Masukkan Harga        : ");
        String harga = input.nextLine();
        System.out.print("Masukkan Total Barang : ");
        int total_brg = input.nextInt();
        
        Sandal S2 = new Sandal("", "", "", 0);
        S2.setArtikel(artikel);
        S2.setWarna(warna);
        S2.setHarga(harga);
        S2.setTotal_brg(total_brg);
        
        System.out.println(" ");
        S2.tambahData(); // Overriding
        dataSandal.add(S2);
        
        System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
        System.out.println("1. Artikel      : " + S2.getArtikel());
        System.out.println("2. Warna        : " + S2.getWarna());
        System.out.println("3. Harga        : " + S2.getHarga());
        System.out.println("4. Total Barang : " + S2.getTotal_brg());

    }
    
    
    public void ubahDataSepatu(ArrayList<Sepatu> dataSepatu){
        clearScreen();
        lihatDataSepatu(dataSepatu);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dataSepatu.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                System.out.print("Data baru Artikel      : ");
                String Artikel = input.nextLine();
                System.out.print("Data baru Warna        : ");
                String Warna = input.nextLine();
                System.out.print("Data baru Harga        : ");
                String Harga = input.nextLine();
                System.out.print("Data baru Total Barang : ");
                int Total_brg = input.nextInt();
                
                Sepatu S1 = new Sepatu(Artikel, Warna, Harga, Total_brg);
                dataSepatu.get(index).setArtikel(Artikel);
                dataSepatu.get(index).setWarna(Warna);
                dataSepatu.get(index).setHarga(Harga);
                dataSepatu.get(index).setTotal_brg(Total_brg);
                
                System.out.println(" ");
                S1.ubahData(); // Overriding
                
                System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
                System.out.println("1. Artikel      : " + S1.getArtikel());
                System.out.println("2. Warna        : " + S1.getWarna());
                System.out.println("3. Harga        : " + S1.getHarga());
                System.out.println("4. Total Barang : " + S1.getTotal_brg());
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    
    public void ubahDataSandal(ArrayList<Sandal> dataSandal){
        clearScreen();
        lihatDataSandal(dataSandal);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dataSandal.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                System.out.print("Data baru Artikel      : ");
                String Artikel = input.nextLine();
                System.out.print("Data baru Warna        : ");
                String Warna = input.nextLine();
                System.out.print("Data baru Harga        : ");
                String Harga = input.nextLine();
                System.out.print("Data baru Total Barang : ");
                int Total_brg = input.nextInt();
                
                Sandal S2 = new Sandal(Artikel, Warna, Harga, Total_brg);
                dataSandal.get(index).setArtikel(Artikel);
                dataSandal.get(index).setWarna(Warna);
                dataSandal.get(index).setHarga(Harga);
                dataSandal.get(index).setTotal_brg(Total_brg);
                
                System.out.println(" ");
                S2.ubahData(); // Overriding
                
                System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
                System.out.println("1. Artikel      : " + S2.getArtikel());
                System.out.println("2. Warna        : " + S2.getWarna());
                System.out.println("3. Harga        : " + S2.getHarga());
                System.out.println("4. Total Barang : " + S2.getTotal_brg());
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    
    
    public void hapusDataSepatu(ArrayList<Sepatu> dataSepatu){
        clearScreen();
        lihatDataSepatu(dataSepatu);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dataSepatu.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                dataSepatu.remove(index);
                Sepatu S1 = new Sepatu();
                S1.hapusData();
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    
    public void hapusDataSandal(ArrayList<Sandal> dataSandal){
        clearScreen();
        lihatDataSandal(dataSandal);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dataSandal.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                dataSandal.remove(index);
                Sandal S2 = new Sandal();
                S2.hapusData();
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    
    
    
    protected void lihatDataSepatu(ArrayList<Sepatu> dataSepatu){
        clearScreen();
        try{
            if(dataSepatu.size() > 0){
                System.out.println("\n=============================================================");
                System.out.println("NO\tARTIKEL\t\tWARNA\t\tHARGA\t\tTOTAL");
                System.out.println("=============================================================");
                
                for (int index = 0; index < dataSepatu.size(); index++){
                    String Artikel = dataSepatu.get(index).getArtikel();
                    String Warna = dataSepatu.get(index).getWarna();
                    String Harga = dataSepatu.get(index).getHarga();
                    int Total_brg = dataSepatu.get(index).getTotal_brg();
                    
                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s", index, Artikel, Warna, Harga, Total_brg));
                    System.out.println("-------------------------------------------------------------");
                }
            }
            
            else {
                System.out.println("\nTidak ada data!");
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
    protected final void lihatDataSandal(ArrayList<Sandal> dataSandal){
        clearScreen();
        try{
            if(dataSandal.size() > 0){
                System.out.println("\n=============================================================");
                System.out.println("NO\tARTIKEL\t\tWARNA\t\tHARGA\t\tTOTAL");
                System.out.println("=============================================================");
                
                for (int index = 0; index < dataSandal.size(); index++){
                    String Artikel = dataSandal.get(index).getArtikel();
                    String Warna = dataSandal.get(index).getWarna();
                    String Harga = dataSandal.get(index).getHarga();
                    int Total_brg = dataSandal.get(index).getTotal_brg();
                    
                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s", index, Artikel, Warna, Harga, Total_brg));
                    System.out.println("-------------------------------------------------------------");
                }
            }
            
            else {
                System.out.println("\nTidak ada data!");
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }
    
    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }
}
