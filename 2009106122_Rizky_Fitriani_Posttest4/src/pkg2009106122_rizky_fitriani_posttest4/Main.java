package pkg2009106122_rizky_fitriani_posttest4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static String fileName;
    static ArrayList<String> petShops;
    static boolean isEditing = false;
    static Scanner input;

    public static void main(String[] args) {
        petShops = new ArrayList<>();
        input = new Scanner(System.in);

        String filePath;
        filePath = System.console() == null ? "src/pkg2009106122_rizky_fitriani_posttest4/petshop.csv" : "/petshop.csv";
        fileName = System.getProperty("petshop.dir") + filePath;

        System.out.println("FILE: " + fileName);

        while (true) {
            showMenu();
        }
    }

    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }

    static void showMenu() {
        System.out.println("=== SISTEM MANAGEMENT PET SHOP PRIMROSE ===");
        System.out.println("[1] Lihat Barang");
        System.out.println("[2] Tambah Barang");
        System.out.println("[3] Edit Barang");
        System.out.println("[4] Hapus Barang");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        switch (selectedMenu) {
            case "1":
                showPetShop();
                break;
            case "2":
                addPetShop();
                break;
            case "3":
                editPetShop();
                break;
            case "4":
                deletePetShop();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Anda salah memilih menu!");
                backToMenu();
                break;
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void readPetShop() {
        try {
            File file;
            file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            petShops.clear();
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                petShops.add(data);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void showPetShop() {
        clearScreen();
        readPetShop();
        
        if (petShops.size() > 0) {
            System.out.println("BARANG DI PET SHOP: ");
            int index = 0;
            for (String data : petShops) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }
    }

    static void addPetShop() {
        clearScreen();
        
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
        backToMenu();
    }

    static void editPetShop() {
        isEditing = true;
        showPetShop();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > petShops.size()) {
                throw new IndexOutOfBoundsException("Anda memasukkan data yang salah!");
            } else {

                System.out.print("Data baru: ");
                String newData = input.nextLine();

                petShops.set(index,newData);
                System.out.println(petShops.toString());
                try {
                    try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                        petShops.forEach(data -> {
                            try {
                                fileWriter.append(String.format("%s%n", data));
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                    }

                    System.out.println("Data barang berhasil di ubah!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }

    static void deletePetShop() {
        isEditing = true;
        showPetShop();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > petShops.size ()) {
                throw new IndexOutOfBoundsException("Anda memasukkan data yang salah!");
            } else {

                System.out.println("Anda akan menghapus: ");
                System.out.println(String.format("[%d] %s", index, petShops.get(index)));
                System.out.println("Are you sure?");
                System.out.print("Jawab (y/n): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    petShops.remove(index);

                    try {
                        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                            for (String data : petShops) {
                                fileWriter.append(String.format("%s%n", data));
                            }
                        }

                        System.out.println("Data barang berhasil di hapus!");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }
}