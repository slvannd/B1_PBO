package pertemuan1;

import pertemuan1.model.Mouse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an instance ob BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Create an instance of ArrayList based on Mouse class
        ArrayList<Mouse> mouseList = new ArrayList<>();

        try {
            do {
                menu();
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(br.readLine());

                switch (menu) {
                    case 1: {
                        System.out.print("Masukkan brand mouse: ");
                        String nama = br.readLine();
                        System.out.print("Masukkan berat mouse: ");
                        int berat = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan jumlah tombol mouse: ");
                        int jumlahTombol = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan warna mouse: ");
                        String warna = br.readLine();
                        mouseList.add(new Mouse(nama, berat, jumlahTombol, warna));
                        break;
                    }
                    case 2: {
                        System.out.println("List Mouse");
                        for (Mouse mouse : mouseList) {
                            System.out.println(mouse.getBrand());
                            System.out.println(mouse.getWeight());
                            System.out.println(mouse.getTotalButton());
                            System.out.println(mouse.getColor());
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("Masukkan brand mouse yang mau dihapus: ");
                        String nama = br.readLine();
                        mouseList.removeIf(mouse -> mouse.getBrand().equals(nama));
                        break;
                    }
                    case 4: {
                        System.out.print("Masukkan brand mouse yang mau diupdate: ");
                        String nama = br.readLine();
                        for (Mouse mouse : mouseList) {
                            if (mouse.getBrand().equals(nama)) {
                                System.out.print("Masukkan brand mouse: ");
                                mouse.setBrand(br.readLine());
                                System.out.print("Masukkan berat mouse: ");
                                mouse.setWeight(Integer.parseInt(br.readLine()));
                                System.out.print("Masukkan jumlah tombol mouse: ");
                                mouse.setTotalButton(Integer.parseInt(br.readLine()));
                                System.out.print("Masukkan warna mouse: ");
                                mouse.setColor(br.readLine());
                            }
                        }
                        break;
                    }
                    default: {
                        System.exit(0);
                    }
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void menu() {
        System.out.println("1. Add Mouse");
        System.out.println("2. Show Mouse");
        System.out.println("3. Delete Mouse");
        System.out.println("4. Update Mouse");
        System.out.println("5. Exit");
    }
}
