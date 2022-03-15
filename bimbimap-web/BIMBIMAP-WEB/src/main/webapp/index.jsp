<%-- 
    Document   : index
    Created on : 8 mar. 2022, 1:25:28
    Author     : misae
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" >
    <link href="https://fonts.googleapis.com/css2?family=Krub:wght@400;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

    <title>BIMBIMAP</title>
</head>
<body>
    <main>
        
            <div class="pagina-inicio">

                <div class="fondo-img"></div>
                   
                <div class="datos">
                    <div class="contenedor sombra">
                        <h1>BIMBIMAP</h1>
                        <h2>Ingresa tus datos para iniciar sesion</h2>
                        <form method="POST" action="servletAutenticacion" class="formulario">
                            <fieldset>
                                <div class="contenedor-campos">
                                    <div class="campo">
                                        <label for="usuario">Usuario</label>
                                        <input class="input-text" type="text" name="usuario" placeholder="Tu usuario">
                                    </div>
                                    <div class="contenedor-campos">
                                        <div class="campo">
                                            <label for="password">Password</label>
                                            <input class="input-text" type="password" name="password" placeholder="Tu password">
                                        </div>
                                    </div>
                                   
                                    <div class="botones" >
                                        <input type="submit" value="login" class="boton"/>
                                       
                                    </div>
                                     <input type="hidden" name="action" value="login"/>
                                        <div class="registro">
                                            <p>O bien, crea una nueva cuenta</p>
                                            <a class="boton" href="registro-cuenta.jsp">Crear cuenta</a>
                                        </div>
                                </div>
                            </fieldset>

                        </form>
                        <c:if test="${message!=null}">
                            <div style= "margin-top: 20px;">
                                <div class="alert alert-danger text-center mt-4" ><%= request.getAttribute("message") %></div>
                            </div>
                        </c:if> 
                        
                    </div>  
                </div>
          
            </div>
        

    </main>
</body>
</html>