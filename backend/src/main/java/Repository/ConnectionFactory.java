package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionFactory {

    private static final Dotenv dotenv = Dotenv.configure().load();

    private static final String HOST = dotenv.get("DB_HOST");
    private static final String PORT = dotenv.get("DB_PORT");
    private static final String DATABASE = dotenv.get("DB_DATABASE");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");


    private static final String URL = "jdbc:postgresql://"+HOST+":"+PORT+"/"+DATABASE;

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
