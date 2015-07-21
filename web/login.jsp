<%-- 
    Document   : index
    Created on : 15/07/2015, 08:55:53 AM
    Author     : WIEXME
--%>

<%@page import="test.modelo.entidad.Usuario"%>
<%@page import="test.modelo.usuarioDaoImpl.UsuarioDaoImpl"%>
<%@page import="test.modelo.usuarioDao.UsuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="css/estilos.css">
        <script src="jquery/jquery-1.11.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de inicio</title>
        <script src="facebook.js"></script>
        <script>
            window.onload = function () {
                /* Comprueba el estado del usuario, incluye esta función en todas la páginas donde el usuario
                 deba estar conectado */
                getStateFromUser();
            }
        </script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Test Vocacional</a>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="ocultar?action=volver">Inicio <i class="glyphicon glyphicon-home"></i></a></li>
                    </ul>  
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <form class="navbar-form navbar-right">
                        <table>
                            <tr>
                                <td>
                                    <h3 id="status"></h3>
                                    <strong id="status"></strong>
                                </td>
                                <td>&nbsp;&nbsp;</td>
                                <td><div id="imagen"></div><br></td>
                                <td>&nbsp;&nbsp;</td>
                                <td><button type="button" class="btn btn-danger" onclick="FBBtnLogout()">Cerrar sesión</button></td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </nav><br>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-4"></div>
                <div class="col-xs-12 col-sm-4 col-md-4 well">
                    <form class="form-horizontal" action="insertar" method="get">
                        <input type="hidden" id="idUsuario" name="id">
                        <input type="hidden" name="action" value="insertar">
                        <table class="table table-condensed">
                            <tr>
                                <td><label>Nombre:</label></td>
                                <td><input type="text" class="form-control" title="Ingresar su Nombre Completo" id="nombre" name="nombres" required></td>
                            </tr>
                            <tr>
                                <td><label>Fecha de Nacimiento:</label></td>
                                <td><input type="date" class="form-control" name="nacimiento" title="Ingrese su fecha de Nacimiento" required></td>
                            </tr>
                            <tr>
                                <td><label>Correo:</label></td>
                                <td> <input type="text" class="form-control" id="correo" name="email" title="Ingrese su email" required></td>
                            </tr>
                            <tr>
                                <td><label>G&eacute;nero:</label></td>
                                <td><input type="text" class="form-control" readonly="true" id="genero" name="genero"></td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2"><button type="submit" class="btn btn-primary" title="Guardar los Datos e Iniciar el Test">Iniciar Test</button> </td>
                            </tr>
                        </table>
                    </form>  
                </div>
                <div class="col-xs-12 col-sm-4 col-md-4"></div>   
            </div> 
        </div>
        <footer>
            <div id="sitemap-content" class="tab-content">
                <div class="row-fluid">
                    <div class="col-lg-4">
                        <div class="tab-pane fade active in" id="map-acercade">
                            <div class="row-fluid">
                                <div class="span11">
                                    <div class="tab-pane active" id="maptarapoto">
                                        <img src="recursos/img/logo_upeu_negro.jpg" alt="Generic placeholder image" class="img-responsive" width="250" height="100">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="tab-pane fade active in" id="map-acercade">
                            <div class="row-fluid">
                                <div class="span11">
                                    <div class="tab-pane active" id="maptarapoto">
                                        <iframe width="350" height="220" frameborder="1" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com.pe/maps?f=q&amp;source=s_q&amp;hl=es&amp;geocode=&amp;q=upeu&amp;aq=&amp;sll=-9.243538,-75.019515&amp;sspn=35.39906,59.106445&amp;ie=UTF8&amp;hq=upeu&amp;hnear=&amp;t=m&amp;cid=6993184648769333257&amp;ll=-6.472842,-76.393604&amp;spn=0.018762,0.025663&amp;z=14&amp;iwloc=A&amp;output=embed"></iframe>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="container-fluid">
                            <div class="tab-pane fade active in" id="map-acercade">
                                <div class="row-fluid">
                                    <div class="span11">
                                        <br><br><br>
                                        Una institución de educación superior de la Iglesia Adventista del Séptimo Día  <br>
                                        Jr. Los Mártires 218 Urb. Santa Lucia  <br>
                                        Telf.: (042) 521414 - (042) 525537  <br>
                                        Correo: admisiontarapoto@upeu.edu.pe <br>
                                        Tarapoto - Perú  <br>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</body>
</html>
