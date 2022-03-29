import java.util.Scanner;
public class tugas2nomor2 {
 static Scanner sc = new Scanner(System.in);
 public static void main(String args[]) {

  System.out.print("Masukkan radius: ");
       /* Simpan radius yang dimasukkan ke tipe double
        * karena pengguna dapat memasukkan radius dalam desimal
        */
       double radius = sc.nextDouble();
       //Area = PI*radius*radius
       double luas =(radius * radius) * Math.PI ;
       System.out.println("Luas lingkaran adalah: " + luas);
       //volume = area*panjang
       double volume= 2*radius * Math.PI ;
       System.out.println( "volume lingkaran adalah:"+volume) ;
 }
}

