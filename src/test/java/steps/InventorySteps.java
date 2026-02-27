package steps;

import net.serenitybdd.annotations.Step;
import page.InventoryPage;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class InventorySteps {
    InventoryPage inventoryPage;

    @Step
    public void agregarProductoAlCarrito(String producto) {
        inventoryPage.agregarProducto(producto);
    }

    @Step
    public void validarCantidadCarrito(String cantidadEsperada) {
        assertEquals(cantidadEsperada, inventoryPage.obtenerCantidadCarrito());
    }
}
