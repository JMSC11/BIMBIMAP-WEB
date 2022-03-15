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
    <title>Nueva cuenta</title>
</head>
<body>
    <main>
        <div class="pagina-inicio">

            <div class="datos">
                <div class="contenedor sombra">
                    <h1>Registra una nueva cuenta en BIMBIMAP</h1>
                    <form class="formulario" action="">
                        <fieldset>
                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Nombre</label>
                                    <input class="input-text" type="text" placeholder="Tu nombre">
                                </div>
                            </div>

                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Apellidos</label>
                                    <input class="input-text" type="text" placeholder="Tus apellidos">
                                </div>
                            </div>

                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Usuario</label>
                                    <input class="input-text" type="text" placeholder="Tu usuario">
                                </div>
                            </div> 

                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Correo electronico</label>
                                    <input class="input-text" type="email" placeholder="Tu email">
                                </div>
                            </div>    

                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Password</label>
                                    <input class="input-text" type="password" placeholder="Tu password">
                                </div>
                            </div>
                            
                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Telefono</label>
                                    <input class="input-text" type="tel" placeholder="Tu telefono">
                                </div>
                            </div> 
                            
                            <div class="botones">    
                                <a class="boton" href="#">Cancelar</a>
                                <a class="boton" href="#">Crear cuenta</a>
                            </div>
                        </fieldset>
                    </form>

                </div>
            </div>
               
            <div class="fondo-registro"> 
                <h2>BIMBIMAP</h2>
                <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-user-plus" width="100" height="100" viewBox="0 0 24 24" stroke-width="1.5" stroke="#f4f1de" fill="none" stroke-linecap="round" stroke-linejoin="round">
                    <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
                    <circle cx="9" cy="7" r="4" />
                    <path d="M3 21v-2a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v2" />
                    <path d="M16 11h6m-3 -3v6" />
                  </svg>
            </div>
      
        </div>
    </main>
    
</body>
</html>