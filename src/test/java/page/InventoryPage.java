package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageObject {
    @FindBy(className = "shopping_cart_badge")
    WebElementFacade badgeCarrito;

    public void agregarProducto(String nombreProducto) {
        $("//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item']//button")
                .click();
    }

    public String obtenerCantidadCarrito() {
        return badgeCarrito.getText();
    }
}
