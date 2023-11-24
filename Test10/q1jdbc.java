package Test10;

import java.sql.*;

public class q1jdbc {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";
        Connection c = DriverManager.getConnection(url, user, password);

        Statement stmt = c.createStatement();
        String qr = "select * from person";

        try (ResultSet rs = stmt.executeQuery(qr);
             PreparedStatement ps1 = c.prepareStatement("update PERSON set taxid = 'NNNN' where id=?");) {
            while (rs.next()) {
                int id = rs.getInt(1);
                ps1.setInt(1, id);
                ps1.executeUpdate(); //1
                System.out.println("Updated "+rs.getString(3)); //2
            }
        }
    }
}
