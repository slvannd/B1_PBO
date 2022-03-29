import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Darniah_2009106116_Postetts1 {
    // deklarasikan variabel global 
    static String fileName ;
    static ArrayList <String> DataKebunBinatang;
    static boolean isEditing = false;
    static Scanner input ;
    private static Object ListDataKebunBinatang;
   
    public static void main (String[]args ) throws IOException, InterruptedException {
        // initialize
    DataKebunBinatang = new ArrayList<>();
    input = new Scanner(System.in);

    String filePath = System.console() == null ? "/src/DataKebunBinatang.txt" : "/DataKebunBinatang.txt";
    fileName = System.getProperty("user.dir") + filePath;

    System.out.println("FILE: " + fileName);

    // run the program (main loop)
    while (true) {
       showMenu();
    }
}
    static void clearScreen() throws IOException, InterruptedException {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            // clear screen untuk windows
            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
        }
        }
    static void showMenu() throws IOException, InterruptedException {
        System.out.println("||==Data Kebun BInatang==||");
        System.out.println("[1] Lihat Data Kebun BInatang");
        System.out.println("[2] Tambah Data kebun Binatang");
        System.out.println("[3] Edit Data Kebun Binatang");
        System.out.println("[4] Hapus Data Kebun Binatang");
        System.out.println("[5] Exit ");
        System.out.println("------------------------------");
        System.out.println("Pilih menu yang ingin anda pilih");
        
        String selectedMenu = input.nextLine();
        switch (selectedMenu) {
            case "1":
                showDataKebunBinatang();
                break;
            case "2":
                addDataKebunBinatang();
                break;
            case "3":
                editDataKebunBinatang();
                break;
            case "4":
                hapusDataKebunBinatang();
                break;
            case "5":
                System.exit(5);
            default:
                System.out.println("Anda Salah Pilih Menu");
                backToMenu();
                break;
        }
    }
    static void backToMenu(){
        System.out.println("");
        System.out.println("tekan enter untuk kembali kemenu awal");
        input.nextLine();
    }
    
    static void readDataKebunBinatang() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);

        // load isi file ke dalam array DataKebunBinatang
        DataKebunBinatang.clear();
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            DataKebunBinatang.add(data);
        }
    }    
    static void showDataKebunBinatang() throws IOException, InterruptedException {   
       clearScreen();
    readDataKebunBinatang();
    if (DataKebunBinatang.size() > 0) {
        System.out.println("Data Kebun Binatang:");
        int index = 0;
        for (String data : DataKebunBinatang) {
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
    static void addDataKebunBinatang() throws IOException, InterruptedException {
    clearScreen();

    System.out.println("Data Kebun Binatang apa yang ingin anda tambah kan");
    System.out.print("Jawab: ");
    String newDataKebunBinatang = input.nextLine();

    try {
        try ( // tulis file
                FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.append(String.format("%s%n", newDataKebunBinatang));
        }
        System.out.println("Berhasil ditambahkan!");
    } catch (IOException e) {
        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
    }
    backToMenu();
}
    static void editDataKebunBinatang() throws IOException, InterruptedException {
    isEditing = true;
    showDataKebunBinatang();

    try {
        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        if (DataKebunBinatang.size() <= index) {
            throw new IndexOutOfBoundsException("Anda memasukan data yang salah!");
        } else {
            
            System.out.print("Data baru: ");
            String newData = input.nextLine();

            // update data
            DataKebunBinatang.set(index, newData);

            System.out.println(DataKebunBinatang.toString());

            try {
                // write new data
                try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                    // write new data
                    for (String data : DataKebunBinatang) {
                        fileWriter.append(String.format("%s%n", data));
                    }
                }

                System.out.println("Berhasil diubah!");
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
    static void hapusDataKebunBinatang() throws IOException, InterruptedException {
    isEditing = true;
    showDataKebunBinatang();

    System.out.println("-----------------");
    System.out.print("Pilih Indeks> ");
    int index = Integer.parseInt(input.nextLine());

    try {
        if (index > DataKebunBinatang.size()) {
            throw new IndexOutOfBoundsException("Anda memasukan data yang salah!");
        } else {

            System.out.println("Kamu akan menghapus:");
            System.out.println(String.format("[%d] %s", index, DataKebunBinatang.get(index)));
            System.out.println("Apa kamu yakin?");
            System.out.print("Jawab (y/t): ");
            String jawab = input.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                // hapus data
                DataKebunBinatang.remove(index);

                // tulis ulang file
                try {
                    // write new data
                    try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                        // write new data
                        for (String data : DataKebunBinatang) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                    }

                    System.out.println("Berhasil dihapus!");
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
    
    
    

    
   


    
    

