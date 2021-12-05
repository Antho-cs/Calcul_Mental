package infrastructure;

import domaine.Expression;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import domaine.Score;
import infrastructure.mysql.StockageScoreMySQL;
import services.ScoreService;

//@WebServlet(urlPatterns = "/Acceuil.jsp")
public class HomeController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write("<h1> Hello Anthony, j'ai réussi ! </h1>");
//        TODO Construire la requete pour afficher les 10 meilleurs Joueurs
        //   SELECT * FROM user ORDER BY bestscore DESC Limit 10;

        // TODO Voir pour l'appel a la génération de calcul
        // Appel de l'expression pour générer un calcul

        Expression expression = new Expression();
        expression.generator();
        System.out.println(expression.generator());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.getWriter().write("Arrivé ici par redirection");
        try {
            ScoreService scoreService = new ScoreService(new StockageScoreMySQL());
            List<Score> dixMeilleursScores = scoreService.recupererDixMeilleursScores();
            System.out.println(dixMeilleursScores);
            req.setAttribute("dixMeilleursScores", dixMeilleursScores);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/Acceuil.jsp");
            dispatcher.forward(req, res);
        }
        catch (ServerException e) {
            res.sendError(500);
        }
    }

}
