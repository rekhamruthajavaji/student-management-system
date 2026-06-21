
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String url =
            "jdbc:mysql://localhost:3306/studentdb";

    private static String user = "root";
    private static String password = "12345";

    public static Connection getConnection()
            throws SQLException {

        return DriverManager.getConnection(
                url, user, password);
    }
}
