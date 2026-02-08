import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "Satyam@23111973";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // Create statement
            Statement stmt = conn.createStatement();
            var rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) {
                System.out.println("Table: " + rs.getString(1));
            }
            // Close resources
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
        }
    }
}
