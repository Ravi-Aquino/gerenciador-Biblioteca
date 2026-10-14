package br.com.gerenciadorbiblioteca.config;

import java.sql.Connection;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

public class ConnectionFactory {

    private static final Dotenv dotenv = Dotenv.configure().load();

    private static final DataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://" + dotenv.get("DB_HOST")
                + ":" + dotenv.get("DB_PORT")
                + "/" + dotenv.get("DB_DATABASE"));
        config.setUsername(dotenv.get("DB_USER"));
        config.setPassword(dotenv.get("DB_PASSWORD"));
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setConnectionTimeout(30000);
        dataSource = new HikariDataSource(config);
    }

    private ConnectionFactory() { }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close() {
        ((HikariDataSource) dataSource).close();
    }
}