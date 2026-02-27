# language: es
  Característica: Como QA  quiero automatizar la pagina
  SauceDemo para poder entender y hacer
  una automatizacion web

  @SAUCE
  Escenario: Verificar el logeo correcto en la pagina SauceDemo -OK
    Dado que el usuario abre la pagina de Sauce
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago clic en el boton Login
    Entonces aparece el header Swag_Labs

  @SAUCE
  Escenario: Agregar producto al carrito
    Dado que el usuario hace login con usuario "standard_user" y contraseña "secret_sauce"
    Cuando agrega el producto "Sauce Labs Backpack" al carrito
    Entonces el carrito muestra "1" producto

  @SAUCE @HappyPath
    Escenario: Verificar orden de productos por nombre A-Z
      Dado que el usuario hace login con usuario "standard_user" y contraseña "secret_sauce"
      Cuando selecciona el filtro "Name (A to Z)"
      Entonces los productos se muestran ordenados alfabeticamente A-Z

  @SAUCE @HappyPath
    Escenario: Verificar orden de productos por precio menor a mayor
      Dado que el usuario hace login con usuario "standard_user" y contraseña "secret_sauce"
      Cuando selecciona el filtro "Price (low to high)"
      Entonces los productos se muestran ordenados por precio ascendente