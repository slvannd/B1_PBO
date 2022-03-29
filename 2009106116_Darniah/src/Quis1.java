import java.util.Scanner;

public class Quis1 {
    public static void main(String []args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("masukan suatu integer : ");
            int angka = masukan.nextInt();
            
        if (angka % 5 == 0)
            System.out.println("kelipatanlima");
        
        if (angka % 2 == 0)
            System.out.println("Angkagenap");
    }
}
        