package infrastructure.mysql;

import domaine.Score;
import domaine.ServerException;
import domaine.User;
import services.StockageScoreInterface;
import services.StockageUserInterface;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockageScoreMySQL implements StockageScoreInterface {
    private ConnexionMySQL CONNECTION;
    private Connection connection;

    public StockageScoreMySQL() {
        this.CONNECTION = ConnexionMySQL.CONNECTION;
        connection = this.CONNECTION.getConnection();
    }

    @Override
    public List<Score> recupererDixMeilleursScores() {
//        String query = "select u.id, login, password, dateHeure, score " +
//                "from user u " +
//                "join resultat r on u.id = r.idUser " +
//                "order by score desc limit 10;";
        String query = "select u.id, login, dateHeure, score " +
                "from user u " +
                "join resultat r on u.id = r.idUser " +
                "order by score desc limit 10;";
        try {
            ArrayList<Score> scoreArrayList = new ArrayList<Score>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                //Création de l'utilisateur ayant réalisé le score
//                User utilisateur = new User(resultSet.getString("login"),resultSet.getString("password"));
                //Création du score et ajout du score dans la liste
//                Score score = new Score(resultSet.getInt("score"),utilisateur, (Date) resultSet.getDate("dateHeure"));
                Score score = new Score(resultSet.getInt("score"), resultSet.getString("login"), (Date) resultSet.getDate("dateHeure"));
                scoreArrayList.add(score);
            }
            return scoreArrayList;
        } catch (SQLException e) {
            throw new ServerException("Cette application a besoin d'une base de données", e);
        }
    }
}
