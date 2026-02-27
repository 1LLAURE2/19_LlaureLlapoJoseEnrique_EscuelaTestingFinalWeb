## AUTOMATIZACION WEB SAUCEDEMO
Este proyecto está diseñado para automatizar pruebas funcionales de la página web SauceDemo, utilizando Serenity BDD y Selenium WebDriver.

### HERRAMIENTAS

+ Lenguaje: Java 17 
+ Framework: Serenity BDD + JUnit 5
+ Automatización Web: Selenium WebDriver 4.18.1
+ Gestión de Dependencias: Maven

### ESCENARIOS
+ **Login**: Validar que el usuario puede iniciar sesión correctamente con credenciales válidas
  + Usuario: standard_user 
  + Contraseña: secret_sauce 
  + Resultado esperado: aparición del header Swag Labs. 
+ **Carrito de compras**:Agregar productos al carrito y validar que se actualiza la cantidad correctamente.
  + Producto agregado: "Sauce Labs Backpack"
  + Resultado esperado: carrito muestra "1" producto.
+ **Ordenamiento de productos**: Validar que los filtros de la página funcionan correctamente para ordenar productos.
  + Orden alfabético A → Z por nombre.
  + Orden ascendente por precio (menor → mayor).

### EJECUCIÓN DE PRUEBAS
1. Desde IntelliJ IDEA: Ejecutar la clase Runner que contiene la anotación @CucumberOptions.
2. Desde la línea de comando Maven:
  ```
  mvn clean verify
  ```

### RESULTADO ESPERADO
Todos los escenarios dentro del archivo .feature debe pasar:
+ Login exitoso
+ Producto agregado al carrito
+ Orden de productos por nombre y precio correcta