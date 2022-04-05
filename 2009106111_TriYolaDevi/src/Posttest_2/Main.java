package Posttest_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    static ArrayList<Sepeda> dataSepeda = new ArrayList<Sepeda>();

 
    public static void main(String[] args)throws IOException {
        while (true) {
            menu();
        }
    }
    public static void lihatDataSepeda()throws IOException{
        for (int i = 0; i < dataSepeda.size(); i++){
            System.out.println("Data ke- :" + (i + 1));
            System.out.println("ID Sepeda     : " + dataSepeda.get(i).id);
            System.out.println("Merk Sepeda   : " + dataSepeda.get(i).merk);
            System.out.println("Warna Sepeda  : " + dataSepeda.get(i).warna);
            System.out.println("Ukuran Sepeda : " + dataSepeda.get(i).ukuran);
            System.out.println("Harga Sepeda  : " + dataSepeda.get(i).harga);
        }
    }
    public static void tambahDataSepeda() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        int input5;

        System.out.print("Masukan ID Sepeda     : ");
        input1 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Merk Sepeda   : ");
        input2 = br.readLine();
        System.out.print("Masukan Warna Sepeda  : ");
        input3 = br.readLine();
        System.out.print("Masukan Ukuran Sepeda : ");
        input4 = br.readLine();
        System.out.print("Masukan Harga Sepeda  : ");
        input5 = Integer.parseInt(br.readLine());
        

        Sepeda dataTerbaru = new Sepeda(input1,input2,input3,input4,input5);
        dataSepeda.add(dataTerbaru);
        dataTerbaru.TambahData();
    }
    public static void ubahDataSepeda()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        int input5;

        lihatDataSepeda();

        System.out.print("Masukan Data ke- :");
        int inputid = Integer.parseInt(br.readLine());
        int indexe = inputid-1;

        System.out.print("Masukan ID Sepeda     : ");
        input1 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Merk Sepeda   : ");
        input2 = br.readLine();
        System.out.print("Masukan Warna Sepeda  : ");
        input3 = br.readLine();
        System.out.print("Masukan Ukuran Sepeda : ");
        input4 = br.readLine();
        System.out.print("Masukan Harga Sepeda  : ");
        input5 = Integer.parseInt(br.readLine());
        

        dataSepeda.get(indexe).id = input1;
        dataSepeda.get(indexe).merk = input2;
        dataSepeda.get(indexe).warna = input3;
        dataSepeda.get(indexe).ukuran = input4;
        dataSepeda.get(indexe).harga = input5;
        
        dataSepeda.get(indexe).UpdateData();
    }
    public static void hapusDataSepeda()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;

        lihatDataSepeda();

        System.out.println("Data yang ingin di hapus");
        System.out.print("Masukan Data ke-");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        if (dataSepeda.size() > indexd){
            dataSepeda.get(indexd).HapusData();
            dataSepeda.remove(indexd);
        }
    }
    
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("||========== MENU ==========||");
        System.out.println("||1.Tambah Data Sepeda      ||");
        System.out.println("||2.Lihat Data Sepeda       ||");
        System.out.println("||3.Ubah Data Sepeda      ||");
        System.out.println("||4.Hapus Data Sepeda       ||");
        System.out.println("||5.Exit                    ||");
        System.out.println("||==========================||");
        String inputan_m;
        System.out.print("Masukan Menu :");
        inputan_m = br.readLine();
        switch (inputan_m) {
            case "1":
                tambahDataSepeda();
                break;
            case "2":
                lihatDataSepeda();
                break;
            case "3":
                ubahDataSepeda();
                break;
            case "4":
                hapusDataSepeda();
                break;    
            case "5":
                System.exit(1);
                System.out.println("DAH BYE BYE");
            default:
                System.out.println("SALAH PILIH MENU");
                break;
        }
    }
    

//    private static void LihatData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static void TambahData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}