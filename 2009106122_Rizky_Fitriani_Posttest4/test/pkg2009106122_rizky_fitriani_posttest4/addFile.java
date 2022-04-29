package pkg2009106122_rizky_fitriani_posttest4;
        
import java.io.FileWriter;
import java.io.IOException;
import static pkg2009106122_rizky_fitriani_posttest4.Main.input;
        
public class addFile {

    private static char[] fileContent;

    public static void main(String[] args) {

        String fileName = "src/pkg2009106122_rizky_fitriani_posttest4/petshop.csv";
        PetShop petshopprimrose = new PetShop (17, "Zeolite Super", "unscented litter", 25.000, 37.000, "pasir");
        System.out.println(petshopprimrose.getNo());
        System.out.println(petshopprimrose.getMerk());
        System.out.println (petshopprimrose.getJenis());
        System.out.println(petshopprimrose.getBerat());
        System.out.println(petshopprimrose.getHarga());
        System.out.println(petshopprimrose.getKategori());
        
        petshopprimrose.setNo(16);
        petshopprimrose.setMerk("Super Zeolite");
        petshopprimrose.setJenis("unscented litter");
        petshopprimrose.setBerat(25.000);
        petshopprimrose.setHarga(30.000);
        petshopprimrose.setKategori("pasir");
        
        System.out.println("Tuliskan merk barang!");
        System.out.print("Jawab: ");
        String newPetShop = input.nextLine();

        try {
            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.append(String.format("%s%n", newPetShop));
            }

            System.out.println("Barang berhasil di tambahkan!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
}