package week11;

import java.sql.*;
import java.util.Scanner;

public class Week11 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/pbo_week11";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Insert");
            System.out.println("2. Show");
            System.out.println("3. Change");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Pilih menu : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    System.out.print("Masukan ID Buku untuk diganti : ");
                    int changeId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    change(scanner, changeId);
                    break;
                case 4:
                    System.out.print("Masukan ID Buku yang akan dihapus : ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    delete(deleteId);
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi.");
            }
        }
    }

    public static void insert(Scanner scanner) {
        System.out.print("Masukan judul buku : ");
        String judul_buku = scanner.nextLine();
        System.out.print("Masukan tahun buku terbit : ");
        int tahun_terbit = scanner.nextInt();
        System.out.print("Masukan stok : ");
        int stok = scanner.nextInt();
        System.out.print("Masukan ID penulis: ");
        int penulis = scanner.nextInt();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO buku (judul_buku, tahun_terbit, stok, penulis) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);
            ps.execute();
            ps.close();
            conn.close();
            System.out.println("Data berhasil ditambahkan !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM buku");
            int i = 1;
            while (rs.next()) {
                System.out.println("Data ke-" + i);
                System.out.println("ID Buku      : " + rs.getInt("id"));
                System.out.println("Judul Buku   : " + rs.getString("judul_buku"));
                System.out.println("Tahun Terbit : " + rs.getInt("tahun_terbit"));
                System.out.println("Stok         : " + rs.getInt("stok"));
                System.out.println("Penulis .    : " + rs.getInt("penulis"));
                System.out.println("");
                i++;
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void change(Scanner scanner, int id) {
        System.out.print("Masukan judul buku baru : ");
        String judul_buku = scanner.nextLine();
        System.out.print("Masukan tahun terbit baru : ");
        int tahun_terbit = scanner.nextInt();
        System.out.print("Masukan stok baru : ");
        int stok = scanner.nextInt();
        System.out.print("Masukan ID penulis baru : ");
        int penulis = scanner.nextInt();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String checkSql = "SELECT COUNT(*) FROM buku WHERE id = ?";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setInt(1, id);
            ResultSet checkRs = checkPs.executeQuery();
            checkRs.next();
            if (checkRs.getInt(1) == 0) {
                System.out.println("Buku dengan ID  " + id + " tidak ditemukan !");
                checkRs.close();
                checkPs.close();
                conn.close();
                return;
            }
            checkRs.close();
            checkPs.close();
            
            String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, penulis = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);
            ps.setInt(5, id);
            ps.execute();
            ps.close();
            conn.close();
            System.out.println("Perubahan data berhasil !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String checkSql = "SELECT COUNT(*) FROM buku WHERE id = ?";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setInt(1, id);
            ResultSet checkRs = checkPs.executeQuery();
            checkRs.next();
            if (checkRs.getInt(1) == 0) {
                System.out.println("Buku dengan ID " + id + " tidak ditemukan !");
                checkRs.close();
                checkPs.close();
                conn.close();
                return;
            }
            checkRs.close();
            checkPs.close();
            
            String sql = "DELETE FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            conn.close();
            System.out.println("Penghapusan data berhasil !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
