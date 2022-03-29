import java.util.Scanner;

public class tugas2nomor1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int celcius, fahrenheit;
        System.out.print("Masukan Nilai Fahrenheit : ");
        fahrenheit = input.nextInt();
        celcius =(int) ((5.0/9.0)*(fahrenheit-32.0));
        System.out.println("Nilai celcius :"+celcius);
    }
}