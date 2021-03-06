<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="FR">
<head>
    <title>Calcul Mental - Page de connexion</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">

</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="${pageContext.request.contextPath}/images/py.jpg" alt="IMG">
            </div>
            <form class="login100-form validate-form" method="post" action="LoginController">
                <span class="login100-form-title">Connexion</span>
                <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                    <input class="input100" type="text" name="id" placeholder="Identifiant">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
<i class="fa fa-envelope" aria-hidden="true"></i>
</span>
                </div>
                <div class="wrap-input100 validate-input" data-validate="Password is required">
                    <input class="input100" type="password" name="mdp" placeholder="Mot de passe">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
<i class="fa fa-lock" aria-hidden="true"></i>
</span>
                </div>
                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">
                        Login
                    </button>
                </div>

                <div class="container-login100-text">
                    <div class="text-center p-t-12">

                        <a class="txt2" href="#">
                            Mot de passe oublié ?
                        </a>
                    </div>
                    <div class="text-center p-t-136">
                        <a class="txt2" href="/Crea-user">
                            Crée son compte
                            <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                        </a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
