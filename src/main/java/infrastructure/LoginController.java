package infrastructure;

import domaine.ClientException;
import domaine.ServerException;
import infrastructure.mysql.StockageUserMySQL;
import services.UserService;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import domaine.User;

public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String login = req.getParameter("id");
        String password = req.getParameter("mdp");
        String passwdHashe = DigestUtils.sha256Hex(password);
        try {

            User user = new User(login,passwdHashe);
            UserService userService = new UserService(new StockageUserMySQL());
            Boolean authentificationSuccessful = userService.authenticateUser(user);

            if (authentificationSuccessful) {
                //Génération du token

                resp.setStatus(200);
                resp.getWriter().write("Authentification Successful !");
            }
            else {
                resp.getWriter().write("Authentification failed !");
            }
        }
        catch (ServerException e) {
            resp.sendError(500,e.getMessage());
        }
        catch (ClientException e) {
            resp.sendError(400,e.getMessage());
        }
        catch (Exception e) {
            resp.sendError(500,e.getMessage());
        }
    }
}
