<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" >
    <link href="https://fonts.googleapis.com/css2?family=Krub:wght@400;700&display=swap" rel="stylesheet">
    <title>Nueva Tarjeta</title>
</head>
<body>
    <main>
        <div class="pagina-inicio">
            <div class="datos">

                <div class="contenedor sombra">
                    <h1>Agrega un nuevo metodo de pago</h1>
                    <form action="" class="formulario">
                        <fieldset>
                            <legend>Ingresa los siguientes datos</legend>
                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Nombre Titular</label>
                                    <input class="input-text" type="text" placeholder="Nombre Titular Tarjeta">
                                </div>
                            </div>
                            
                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Numero Tarjeta</label>
                                    <input class="input-text" type="number" placeholder="Ingresa los digitos de tu tarjeta">
                                </div>
                            </div>
                            
                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>Fecha vigencia</label>
                                    <input class="input-text" type="number" placeholder="MM/YY">
                                </div>
                            </div>
                            
                            <div class="contenedor-campos">
                                <div class="campo">
                                    <label>CVV</label>
                                    <input class="input-text" type="number" placeholder="cvv">
                                </div>
                            </div>
                            <div class="botones">
                                <a href="#" class="boton">Cancelar</a>
                                <a href="#" class="boton">Confirmar</a>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div><!-- Fin Clase contenedor sombra datos -->

            <div class="fondo-registro">
                <h2>BIMBIMAP</h2>
                <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-credit-card" width="100" height="100" viewBox="0 0 24 24" stroke-width="1.5" stroke="#f4f1de" fill="none" stroke-linecap="round" stroke-linejoin="round">
                    <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
                    <rect x="3" y="5" width="18" height="14" rx="3" />
                    <line x1="3" y1="10" x2="21" y2="10" />
                    <line x1="7" y1="15" x2="7.01" y2="15" />
                    <line x1="11" y1="15" x2="13" y2="15" />
                  </svg>
            </div>
        </div>
        
    </main>
</body>
</html>