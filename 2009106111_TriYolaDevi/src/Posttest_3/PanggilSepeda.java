package Posttest_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PanggilSepeda {
    ArrayList<Sepeda> dataSepeda = new ArrayList<Sepeda>();
    
    void lihatDataSepeda()throws IOException{
        for (int i = 0; i < dataSepeda.size(); i++){
            System.out.println("Data ke- :" + (i + 1));
            System.out.println("ID Sepeda     : " + dataSepeda.get(i).id);
            System.out.println("Merk Sepeda   : " + dataSepeda.get(i).merk);
            System.out.println("Warna Sepeda  : " + dataSepeda.get(i).warna);
            System.out.println("Ukuran Sepeda : " + dataSepeda.get(i).ukuran);
            System.out.println("Harga Sepeda  : " + dataSepeda.get(i).harga);
        }
    }
    
    void tambahDataSepeda() throws IOException{
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
    
    void ubahDataSepeda()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        int input5;

        lihatDataSepeda();
         
        System.out.println(" ");

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
    
    void hapusDataSepeda()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;

        lihatDataSepeda();

        System.out.println("Data yang ingin di hapus");
        System.out.print("Masukan Data ke- :");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        if (dataSepeda.size() > indexd){
            dataSepeda.get(indexd).HapusData();
            dataSepeda.remove(indexd);
        }
    }
}
