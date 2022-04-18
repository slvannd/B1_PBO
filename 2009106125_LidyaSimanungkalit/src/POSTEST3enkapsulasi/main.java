
package POSTEST3enkapsulasi;


import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
public class main {
    ArrayList<POSTEST3enkapsulasi.BOLA> bola = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static ArrayList<Long> data_no_punggung = new ArrayList<>();
    static ArrayList<String> data_nama = new ArrayList<>();
    static ArrayList<String> data_posisi = new ArrayList<>();
    static ArrayList<String> data_status = new ArrayList<>();
   
    public static void main(String[] args) {
        tampil();
        while(true){
        menu();    
        }
        
    }
    
    //method
static void tampil(){
        clearScreen();
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t||||<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        System.out.println("\t\t\t||||<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        System.out.println("\t\t\t||||         PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA   ||||");
        System.out.println("\t\t\t||||               BY :                                ||||");
        System.out.println("\t\t\t||||       LIDYA SIMANUNGKALIT ==> 2009106125          ||||");
        System.out.println("\t\t\t||<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        System.out.println("\t\t\t||<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||");
        
        System.out.print("\n\t\t\ttekan [ENTER] untuk melanjutkan....");
        input.nextLine();
    }
static void clearScreen(){
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
static void back_to_menu() {
    System.out.println("");
    System.out.print("Tekan [Enter] untuk kembali..");
    input.nextLine();
    menu();

  
    clearScreen();
    }

static void menu() {
         Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t||===========================================");
        System.out.println("\t\t\t|| PROGRAM DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t|| [1] TAMBAH DATA                         ||");
        System.out.println("\t\t\t|| [2] LIHAT DATA                          ||");
        System.out.println("\t\t\t|| [3] EDIT DATA                           ||");
        System.out.println("\t\t\t|| [4] HAPUS DATA                          ||");
        System.out.println("\t\t\t|| [0] KELUAR                              ||");
        System.out.println("\t\t\t||=========================================||");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
         switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.out.println("BYEEEEEEEEEEEEEEEEEEE");
               
                System.exit(0);
         case 1:
                clearScreen();
                tambah();
                break;
        case 2:
                clearScreen();
                lihat();
                break;
        case 3 :
                clearScreen();
                update();
                break;
	case 4 :
                clearScreen();
                hapus();
                
                break;
		
            default:
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
        }
    }
//membuat method tambah berupa public supaya bisa di akses oleh method yang lain
static void tambah(){
    clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t   ||  MENGINPUT DATA PEMAIN      ||");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Masukan banyak data           : ");
        int banyak = input.nextInt();
        for(int y = 0 ; y < banyak; y++){
            System.out.print("Masukkan NO PUNGGUING     : ");
            long no_punggung = input.nextLong();
            input.nextLine();
            data_no_punggung.add(no_punggung);
            System.out.print("Masukkan Nama             : ");
            String nama = input.nextLine();
            data_nama.add(nama);
            System.out.print("Masukkan POSISI           : ");
            String posisi = input.nextLine();
            data_posisi.add(posisi);
            System.out.print("Masukkan STATUS           : ");
            String status = input.nextLine();
            data_status.add(status);
          
            BOLA Data = new BOLA(no_punggung, nama, posisi, status);
            System.out.println("\n");
            Data.dataDitambah();
            Data.getNo_punggung();
            Data.getNama();
            Data.getPosisi();
            Data.getStatus();
           
            System.out.println("NO PUNGGUNG  : " + Data.getNo_punggung());
            System.out.println("NAMA         : " + Data.getNama());
            System.out.println("POSISI       : " + Data.getPosisi());
            System.out.println("STATUS       : " + Data.getStatus() + "\n\n");
        }
        back_to_menu();
}
static void lihat(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===================================");
        System.out.println("\t\t\t   || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    ===================================");
        if(data_no_punggung.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggung.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG     : "+data_no_punggung.get(y));
            System.out.println("NAMA            : "+data_nama.get(y));
            System.out.println("POSISI          : "+data_posisi.get(y));
            System.out.println("STATUS          : "+data_status.get(y));

            System.out.println("=====================");
             }
        }
        back_to_menu();
    }
static void update(){
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ====================================");
        System.out.println("\t\t\t    || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    ====================================");
        if(data_no_punggung.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggung.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG     : "+data_no_punggung.get(y));
            System.out.println("NAMA            : "+data_nama.get(y));
            System.out.println("POSISI          : "+data_posisi.get(y));
            System.out.println("STATUS          : "+data_status.get(y));

            System.out.println("========================================");
             }
            System.out.print("Tekan Enter");
            input.nextLine();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    ||    MENGUBAH DATA PEMAIN   ||");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data  pemain yang diubah : ");
        int edit = input.nextInt();
        System.out.println("SILAHKAN UBAH DATA!");
        System.out.print("Masukan NO PUNGGUNG : ");
        long no_punggung2 = input.nextLong();
        data_no_punggung.set((edit-1), no_punggung2);
        input.nextLine();  
        System.out.print("Masukan nama        : ");
        String nama2 = input.nextLine();
        data_nama.set((edit-1), nama2);
        System.out.print("Masukan posisi      : ");
        String posisi2 = input.nextLine();
        data_posisi.set((edit-1),posisi2);
        System.out.print("Masukan status      : ");
        String status2 = input.nextLine();
        data_status.set((edit-1),status2);

        BOLA data = new BOLA (no_punggung2, nama2, posisi2, status2);
        System.out.println(" ");
        data.dataDiubah();
        data.setNo_punggung(no_punggung2);
        data.setNama(nama2);
        data.setPosisi(posisi2);
        data.setStatus(status2);

      
            System.out.println("NO PUNGGUNG     : " + data.getNo_punggung());
            System.out.println("NAMA            : " + data.getNama());
            System.out.println("POSISI          : " + data.getPosisi());
            System.out.println("STATUS          : " + data.getStatus() + "\n\n");
        back_to_menu();
}}
static void hapus(){
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ====================================");
        System.out.println("\t\t\t    || DATA PEMAIN BOLA KOTA SAMARINDA ||");
        System.out.println("\t\t\t    =====================================");
        if(data_no_punggung.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_no_punggung.size(); y++){
            System.out.println("PEMAIN KE-" + (y+1));
            System.out.println("NO PUNGGUNG            : "+data_no_punggung.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("POSISI   : "+data_posisi.get(y));
            System.out.println("STATUS  : "+data_status.get(y));

            System.out.println("=====================");
             }
        }

        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ================================");
        System.out.println("\t\t\t    ||   MENGHAPUS DATA PEMAIN     ||");
        System.out.println("\t\t\t    ================================");
        System.out.print("Data PEMAIN yang dihapus : ");
        int hapus = input.nextInt();
        data_no_punggung.remove((hapus-1));
        data_nama.remove((hapus-1));
        data_posisi.remove((hapus-1));
        data_status.remove((hapus-1));

        System.out.println("DATA BERHASIL DIHAPUS!");
        back_to_menu();
    }



}
    