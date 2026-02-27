package steps;

import net.serenitybdd.annotations.Step;
import page.SaucePage;

public class SauceSteps {
    SaucePage saucePage;

    @Step
    public void abrirSauceDemo(){
        saucePage.open();
    }

    @Step
    public void digitoElUsuario(String username){
        saucePage.ingresarUsuario(username);
    }

    @Step
    public void digitoLaContraseña(String password){
        saucePage.ingresarPassword(password);
    }

    @Step
    public void hagoClicLogin(){
        saucePage.clickLogin();
    }

    @Step
    public void loginExitoso(){
        saucePage.logueoExitoso();
    }
}
