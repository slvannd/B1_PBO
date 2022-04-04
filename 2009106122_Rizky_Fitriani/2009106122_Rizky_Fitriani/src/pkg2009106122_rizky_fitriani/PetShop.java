package pkg2009106122_rizky_fitriani;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class PetShop {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:8001/index.php?route=/sql&server=1&db=Pet_Shop&table=data_Barang";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Create Data");
        System.out.println("2. Read Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Exit");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    createBarang();
                    break;
                case 2:
                    showBarang();
                    break;
                case 3:
                    updateBarang();
                    break;
                case 4:
                    deleteBarang();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showBarang() {
        String sql = "SELECT * FROM data_Barang";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA BARANG DI PET SHOP PRIMROSE   |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int Id_Barang = rs.getInt("Id_Barang");
                String Merk_Barang = rs.getString("Merk_Barang");
                String Jenis_Barang = rs.getString("Jenis_Barang");
                int Berat_Barang = rs.getInt("Berat_Barang");
                int Harga_Barang = rs.getInt("Harga_Barang");
                String Kelompok_Barang = rs.getString("Kelompok_Barang");
                
                System.out.println(String.format("%d. %s -- (%s)", Id_Barang, Merk_Barang, Jenis_Barang, Berat_Barang, Harga_Barang, Kelompok_Barang));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void createBarang() {
        try {
            // ambil input dari user
            System.out.print("Merk Barang: ");
            String Merk_Barang = input.readLine().trim();
            System.out.print("Jenis Barang: ");
            String Jenis_Barang = input.readLine().trim();
            System.out.print("Berat Barang: ");
            Int Berat_Barang = input.readLine().trim();
            System.out.print("Harga Barang: ");
            Int Harga_Barang = input.readLine().trim();
            System.out.print("Kelompok Barang: ");
            String Kelompok_Barang = input.readLine().trim();

 
            String sql = "INSERT INTO buku (Merk_Barang, Jenis_Barang, Berat_Barang, Harga_Barang, Kelompok_Barang) VALUE('%s', '%s')";
            sql = String.format(sql, Merk_Barang, Jenis_Barang, Berat_Barang, Harga_Barang, Kelompok_Barang);

            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updateBarang() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau diedit: ");
            int id_Barang = Integer.parseInt(input.readLine());
            System.out.print("Merk Barang: ");
            String Merk_Barang = input.readLine().trim();
            System.out.print("Jenis Barang: ");
            String Jenis_Barang = input.readLine().trim();
            System.out.print("Berat Barang: ");
            Int Berat_Barang = input.readLine().trim();
            System.out.print("Harga Barang: ");
            Int Harga_Barang = input.readLine().trim();
            System.out.print("Kelompok Barang: ");
            String Kelompok_Barang = input.readLine().trim();

            String sql = "UPDATE buku SET Merk_Barang='%s', Jenis_Barang='%s', Berat_Barang='%s', Harga_Barang='%s', Kelompok_Barang='%s' WHERE Id_Barang=%d";
            sql = String.format(sql, Merk_Barang, Jenis_Barang, Berat_Barang, Harga_Barang, Kelompok_Barang, Id_Barang);

            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteBarang() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int Id_Barang = Integer.parseInt(input.readLine());

            String sql = String.format("DELETE FROM data_Barang WHERE Id_Barang=%d", Id_Barang);

            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}