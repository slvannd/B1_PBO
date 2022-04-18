package pkg2009106122_rizky_fitriani_posttest4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) {
        
        String fileName = "src/pkg2009106122_rizky_fitriani_posttest4/petshop.csv";
        try {
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
}