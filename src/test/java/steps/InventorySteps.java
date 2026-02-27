package steps;

import net.serenitybdd.annotations.Step;
import page.InventoryPage;
//import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InventorySteps {
    InventoryPage inventoryPage;

    @Step
    public void agregarProductoAlCarrito(String producto) {
        inventoryPage.agregarProducto(producto);
    }

    @Step
    public void validarCantidadCarrito(String cantidadEsperada) {
        /*
        assertThat(inventoryPage.obtenerCantidadCarrito())
                .isEqualTo(cantidadEsperada);
         */
        assertEquals(cantidadEsperada, inventoryPage.obtenerCantidadCarrito());
    }

    public boolean estaOrdenadoAZ() {
        List<String> listaUI = inventoryPage.obtenerNombresProductos();
        List<String> listaOrdenada = new ArrayList<>(listaUI);
        Collections.sort(listaOrdenada);
        return listaUI.equals(listaOrdenada);
    }

    public boolean estaOrdenadoPrecioAsc() {
        List<Double> listaUI = inventoryPage.obtenerPreciosProductos();
        List<Double> listaOrdenada = new ArrayList<>(listaUI);
        Collections.sort(listaOrdenada);
        return listaUI.equals(listaOrdenada);
    }
}
