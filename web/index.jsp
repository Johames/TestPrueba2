<%-- 
    Document   : login
    Created on : 15/07/2015, 08:58:45 AM
    Author     : WIEXME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="css/estilos.css">
        <script src="jquery/jquery-1.11.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login con Facebook</title>
        <script src="facebook.js"></script>
        <script>
            window.onload = function () {
                /* Función que comprueba el estado del usuario, si el usuario ya está conectado será redireccionado
                 a la página de inicio login.jsp */
                FBLogin();
            }
        </script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-4"></div>
                <div class="col-xs-12 col-sm-4 col-md-4 well">
                    <h4 id="status"></h4>
                    <button type="button" class="btn btn-primary" onclick="FBBtnLogin()">Iniciar sesión</button>
                </div>
                <div class="col-xs-12 col-sm-4 col-md-4"></div>
            </div>
        </div>
    </body>
</html>
