package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import page.SaucePage;
import steps.InventorySteps;
import steps.SauceSteps;

public class InventoryStepDefinitions {
    @Steps
    InventorySteps inventorySteps;
    @Steps
    SauceSteps sauceSteps;

    @Dado("que el usuario hace login con usuario {string} y contraseña {string}")
    public void usuarioHaceLogin(String usuario, String password) {
        sauceSteps.abrirSauceDemo();
        sauceSteps.digitoElUsuario(usuario);
        sauceSteps.digitoLaContraseña(password);
        sauceSteps.hagoClicLogin();
    }
    @Cuando("agrega el producto {string} al carrito")
    public void agregaProducto(String producto) {
        inventorySteps.agregarProductoAlCarrito(producto);
    }

    @Entonces("el carrito muestra {string} producto")
    public void validaCarrito(String cantidad) {
        inventorySteps.validarCantidadCarrito(cantidad);
    }
}