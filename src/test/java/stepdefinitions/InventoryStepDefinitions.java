package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import page.InventoryPage;
import page.SaucePage;
import steps.InventorySteps;
import steps.SauceSteps;

public class InventoryStepDefinitions {
    @Steps
    InventorySteps inventorySteps;
    @Steps
    SauceSteps sauceSteps;
    @Steps
    InventoryPage inventoryPage;

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

    @Cuando("selecciona el filtro {string}")
    public void selecciona_el_filtro(String filtro) {
        inventoryPage.seleccionarFiltro(filtro);
    }

    @Entonces("los productos se muestran ordenados alfabeticamente A-Z")
    public void validar_orden_az() {
        Assert.assertTrue(inventorySteps.estaOrdenadoAZ());
    }

    @Entonces("los productos se muestran ordenados por precio ascendente")
    public void validar_orden_precio() {
        Assert.assertTrue(inventorySteps.estaOrdenadoPrecioAsc());
    }
}