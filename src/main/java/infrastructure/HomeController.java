package infrastructure;

import domaine.Expression;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

//@WebServlet(urlPatterns = "/Acceuil.jsp")
public class HomeController extends HttpServlet {

    protected void doGet() {
//        TODO Construire la requete pour afficher les 10 meilleurs Joueurs
        //   SELECT * FROM user ORDER BY bestscore DESC Limit 10;

        // TODO Voir pour l'appel a la génération de calcul
        // Appel de l'expression pour générer un calcul
        Expression expression = new Expression();
        expression.generator();

    }

    protected void doPost() {

    }

}
