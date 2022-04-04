package pkg2009106122_rizky_fitriani;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.*

public class HubungkanphpMyAdmin {
    
    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:8001/index.php?route=/sql&server=1&db=Pet_Shop&table=data_Barang";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM data_Barang";
            
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID Barang: " + rs.getInt("Id_Barang"));
                System.out.println("Merk Barang: " + rs.getString("Merk_Barang"));
               System.out.println("Jenis Barang: " + rs.getString("Jenis_Barang"));
               System.out.println("Berat Barang: " + rs.getInt("Berat_Barang"));
               System.out.println("Harga Barang: " + rs.getInt("Harga_Barang"));
               System.out.println("Kelompok Barang: " + rs.getString("Kelompok_Barang"));
               
            }
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}