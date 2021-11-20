package infrastructure.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
public enum ConnexionMySQL {
    CONNECTION("jdbc:mysql://localhost:3306/expressions_polonaises_b3?user=user_expressions_polonaises&password=ep");
    private Connection connection;
    private ConnexionMySQL(String url) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url);
        } catch (SQLException | ClassNotFoundException e) {
            throw new IllegalStateException("Cette application a besoin d'une base de données", e);
        }
    }
    public Connection getConnection() {
        return this.connection;
    }
}
