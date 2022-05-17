/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author MSI Gaming
 */
public class mysql {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
static final String USER = "root";
static final String PASS = "";

Class.forName(JDBC_DRIVER);
conn = DriverManager.getConnection(DB_URL, USER, PASS);
}
