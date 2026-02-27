package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryPage extends PageObject {
    @FindBy(className = "shopping_cart_badge")
    WebElementFacade badgeCarrito;

    // CASO 3
    @FindBy(className = "product_sort_container")
    WebElementFacade filterDropdown;

    @FindBy(className = "inventory_item_name")
    List<WebElementFacade> productNames;

    @FindBy(className = "inventory_item_price")
    List<WebElementFacade> productPrices;

    // FIN CASO 3

    public void agregarProducto(String nombreProducto) {
        $("//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item']//button")
                .click();
    }

    public String obtenerCantidadCarrito() {
        return badgeCarrito.getText();
    }
    //CASO 3
    public void seleccionarFiltro(String filtro) {
        Select select = new Select(filterDropdown);
        select.selectByVisibleText(filtro);
    }
    public List<String> obtenerNombresProductos() {
        return productNames.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

    public List<Double> obtenerPreciosProductos() {
        return productPrices.stream()
                .map(e -> e.getText().replace("$", ""))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
