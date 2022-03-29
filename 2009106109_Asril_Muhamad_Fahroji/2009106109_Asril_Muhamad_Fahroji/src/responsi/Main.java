package responsi;

import responsi.Novel;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Primary Constructor
        Novel alaska = new Novel("Alaska", "NISAAFATM", 100000, 10, 404, "Bintang Media");
        
        // Default Constructor
        Novel pergi = new Novel();
        
        // Setter methods
        pergi.setJudul("Pergi");
        pergi.setPenulis("Tere Liye");
        pergi.setHarga(110000);
        pergi.setJumlahNovel(20);
        pergi.setJumlahHalaman(455);
        pergi.setPenerbit("Republika Penerbit");
        
        // Getter methods
        
    }
}
