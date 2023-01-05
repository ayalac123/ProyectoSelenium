#language: es
#se puede ejecutar aqui por cualquier conflicto que pueda suceder
  @validarFlujosCaso1y2
Característica: Registrar y logearme con un usuario de alta y realizar actividades dentro de la web
  Yo, como usuario
  Quiero, registrarme y logearme a la pagina demoblaze
  Para, agregar un producto al carrito de compras


  @CASO1
  Escenario:
    Dado Que me encuentro en la pagina de demoblaze
    Y ingreso al boton de logeo
    Cuando ingreso mis credenciales para dar mi alta de usuario con user y pass :"brandon10336" , "123123"
    Y me logeo al pagina con el usuario dado de dalta con el user y pass registrados: "brandon10336", "123123"
    Entonces valida la pantalla de ingreso con Welcome :"Welcome"
  

  @CASO2
  Escenario:
    Dado Que me encuentro en la pagina de demoblaze
    Cuando me logeo al pagina con el usuario dado de dalta con el user y pass registrados: "brandon10336", "123123"
    Entonces valida la pantalla de ingreso con Welcome :"Welcome"
    Y agrego al carrito una laptop
    Y valido el carrito con el producto agregado

#PREGUNTA 1
#BRANDON AYALA




