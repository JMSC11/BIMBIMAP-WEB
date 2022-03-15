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
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Krub:wght@400;700&display=swap" rel="stylesheet">
    <title>Portal del cliente</title>
</head>
<body>
    <header class="portada">
        <div class="contenido-portada">
            <div class="icono">
                <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-user-circle" width="100" height="100" viewBox="0 0 24 24" stroke-width="1.5" stroke="#e07a5f" fill="none" stroke-linecap="round" stroke-linejoin="round">
                    <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
                    <circle cx="12" cy="12" r="9" />
                    <circle cx="12" cy="10" r="3" />
                    <path d="M6.168 18.849a4 4 0 0 1 3.832 -2.849h4a4 4 0 0 1 3.834 2.855" />
                  </svg>
                  
                  <c:if test="${message!=null}">
                    <div>  Usuario: <%= request.getAttribute("message") %></div>
                  </c:if> 
            </div>
            <div class="bienvenida">
                <h1>¡Bienvenido a BIMBIMAP!</h1>
            </div>
        </div>
    </header>
    <div class="nav-bg"> 
        <nav class="navegacionPrincipal" >
            <a href="#">Ordenar Pedido</a>
            <a href="#">Ver Pedidos</a>
            <a href="#">Editar Informacion</a>
        </nav>
    </div>
    
    <main class="portal ">
        <div class="bg-img contenedor">
            <div class="about">
                <h2>Acerca de Nosotros</h2>
                <p>En bimbimap buscamos la comodidad del cliente al facilitar la forma de pedir comida a domicilio, dando más que un servicio una experiencia de compra.</p>
                <p>Nuestros incios partieron de la nececidad de obtener un servicio de calidad y eficiencia al momento de hacer pedidos a domicilio, dando paso a que un grupo de desarrolladores creara una forma inovadora y atractiva para los clientes al momento de realizar sus compras.</p>
                <p>Bimbimap pone a dispocisión la calidad y constancia del trabajo, basados en la responsabilidad y empatia con los usuarios.</p>
            </div>
            

        </div>
        <div class="logout contenedor sombra">
            <h3>¡Siempre es un placer atenderte!</h3> 
            <p>¡Hasta la proxima!</p>
            <div class="botones" >
                <a class="boton" href="#">Cerrar Sesion</a> 
            </div>
        </div>
        

</body>
</html>