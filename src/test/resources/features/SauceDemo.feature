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