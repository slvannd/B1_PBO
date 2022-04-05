package Posttest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static String fileName;
    static ArrayList<String> todoLists;
    static boolean isEditing = false;
    static Scanner input;

    public static void main(String[] args) {
        // initialize
        todoLists = new ArrayList<>();
        input = new Scanner(System.in);

        String filePath = System.console() == null ? "/src/petshop.txt" : "/petshop.txt";
        fileName = System.getProperty("user.dir") + filePath;

        System.out.println("FILE: " + fileName);

        // run the program
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
        } catch (final Exception e) {
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

        if (selectedMenu.equals("1")) {
            showPetShop();
        } else if (selectedMenu.equals("2")) {
            addPetShop();
        } else if (selectedMenu.equals("3")) {
            editPetShop();
        } else if (selectedMenu.equals("4")) {
            deletePetShop();
        } else if (selectedMenu.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("Anda salah memilih menu!");
            backToMenu();
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void readPetShop();
        try {
            File file = new File(fileName);
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

        System.out.println("Tuliskan merk barang!");
        System.out.print("Jawab: ");
        String newTodoList = input.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append(String.format("%s%n", newPetShop));
            fileWriter.close();

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
                    FileWriter fileWriter = new FileWriter(fileName, false);

                    for (String data : petShops) {
                        fileWriter.append(String.format("%s%n", data));
                    }
                    fileWriter.close();

                    System.out.println("Data barang berhasil di ubah!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        } catch (Exception e) {
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
            if (index > petShop.size ()) {
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
                        FileWriter fileWriter = new FileWriter(fileName, false);

                        for (String data : petShops) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                        fileWriter.close();

                        System.out.println("Data barang berhasil di hapus!");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }

}