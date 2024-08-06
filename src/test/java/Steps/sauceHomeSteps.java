package Steps;

import Pages.sauceHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class sauceHomeSteps {
     Pages.sauceHomePage sauceHomePage = new sauceHomePage();

    @And("estou na tela inicial")
    public void estouNaTelaInicial() {
        sauceHomePage.clicarBtnSimple();
    }

    @When("seleciono a blusa noir jacket")
    public void selecionoABlusaNoirJacket() {
        sauceHomePage.clicarjacket2();
    }
}

