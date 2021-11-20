package infrastructure.mysql;

import domaine.ServerException;
import domaine.User;
import services.StockageUserInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockageUserMySQL implements StockageUserInterface {
    private ConnexionMySQL CONNECTION;
    private Connection connection;

    public StockageUserMySQL() {
        this.CONNECTION = ConnexionMySQL.CONNECTION;
        connection = this.CONNECTION.getConnection();
    }

    @Override
    public Boolean authenticateUser(User user) {
        String query = "SELECT * FROM users where login = ? and hashed_passwd = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,user.getLogin());
            statement.setString(2,user.getPassword());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String login = resultSet.getString("login");
                String hashed_password = resultSet.getString("hashed_passwd");
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException e) {
            throw new ServerException("Erreur de connexion à la BDD");
        }
    }
}
