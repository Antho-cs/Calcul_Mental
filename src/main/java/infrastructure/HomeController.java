package infrastructure;

import domaine.Expression;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = "/Acceuil.jsp")
public class HomeController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write("<h1> Hello Anthony, j'ai réussi ! </h1>");
//        TODO Construire la requete pour afficher les 10 meilleurs Joueurs
        //   SELECT * FROM user ORDER BY bestscore DESC Limit 10;

        // Appel de l'expression pour générer un calcul
        Expression expression = new Expression();
        String exp = String.valueOf(expression.generator());
        System.out.println(exp);
        req.setAttribute("expression", exp);

        req.getRequestDispatcher("/Acceuil.jsp").forward(req, response);


        String operators[]=exp.split("[0-100]+");
        String operands[]=exp.split("[+-]");

    }

    protected void doPost() {

    }

}
