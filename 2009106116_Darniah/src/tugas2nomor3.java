import java.util.Scanner;

public class tugas2nomor3 {
        static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        //deklarasikan variable
        double feet;
        double meter;
        //menerima inputan
        System.out.println("Masukan nilai feet: ");
        feet = input.nextDouble();
        System.out.println("Angka dalam feet adalah: " + feet);
        //satuan feet nya adalah 0.305
        meter = feet * 0.305;
        System.out.println(feet + "adalah"  + meter + "meter ");
        
    }
}
