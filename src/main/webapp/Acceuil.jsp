<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="FR">
<head>
    <title>Calcul Mental - Page de connexion</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/table.css">

</head>
<body>
<div class="limiter">
    <div class="container-principal">
        <div class="container-table100">
            <div class="wrap-table100">
                <div class="table100">
                    <table>
                        <div class="table-title">
                            <h2>Les 10 Meilleurs Joueurs :</h2>
                        </div>
                        <thead>
                        <tr class="table100-head">
                            <th class="column1">Utilisateur</th>
                            <th class="column2">Score</th>
                            <th class="column3">Date</th>
                        </tr>
                        </thead>
                        <tbody>
                        <%-- TODO générer une ligne de tableau pour chaque score --%>
                        <c:forEach items="${requestScope.dixMeilleursScores}" var="score">
                            <tr>
                                <td><c:out value="${score.login}"/></td>
                                <td><c:out value="${score.score}"/></td>
                                <td><c:out value="${score.date}"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="container-game">
                <div class="table-title">
                    <h2>Tenter votre chance !</h2>
                </div>
                <div class="zone-game">
                    <div class=""></div>
                    <h2>Jouer</h2>

                    <a href="HomeController">Commencer une partie</a>

                </div>

            </div>

        </div>

    </div>
</div>
</body>
</html>
