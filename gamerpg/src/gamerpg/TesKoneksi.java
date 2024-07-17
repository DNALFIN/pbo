
package gamerpg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesKoneksi {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://127.0.0.1/game";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

