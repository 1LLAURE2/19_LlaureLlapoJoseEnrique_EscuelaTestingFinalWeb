package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

@DefaultUrl("https://www.saucedemo.com/")
public class SaucePage extends PageObject {
    @FindBy(id = "user-name")
    WebElementFacade txtUser;

    @FindBy(id = "password")
    WebElementFacade txtPassword;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    public void ingresarUsuario(String username){
        txtUser.type(username);
    }
    public void ingresarPassword(String password){
        txtPassword.type(password);
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void logueoExitoso(){
        WebElementFacade header = $(".app_logo");
        header.waitUntilVisible();
        assertTrue(header.isDisplayed());
    }
}
