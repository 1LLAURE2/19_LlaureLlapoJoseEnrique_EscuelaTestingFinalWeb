package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.SauceSteps;

public class SauceStepDefinitions {
    @Steps
    SauceSteps sauceSteps;

    @Dado("que el usuario abre la pagina de Sauce")
    public void abrirSauceDemo(){
        sauceSteps.abrirSauceDemo();
    }
    @Cuando("escribo el usuario {string}")
    public void escriboElUsuario(String username){
        sauceSteps.digitoElUsuario(username);
    }

    @Y("escribo la contraseña {string}")
    public void escriboLaContraseña(String password){
        sauceSteps.digitoLaContraseña(password);
    }
    @Y("hago clic en el boton Login")
    public void hagoClicEnLogin(){
        sauceSteps.hagoClicLogin();
    }
    @Entonces("aparece el header Swag_Labs")
    public void apareceHeader(){
        sauceSteps.loginExitoso();
    }

    // CASO 2
    // CASO222


}
