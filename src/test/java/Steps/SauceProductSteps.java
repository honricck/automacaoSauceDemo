package Steps;

import Pages.SauceLoginPage;
import Pages.SauceProductPage;
import Pages.sauceHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Runners.RunnerBase.getDriver;

public class SauceProductSteps {
     SauceProductPage sauceProductPage = new SauceProductPage();

    @And("escolho o tamanho {string}")
    public void escolhoOTamanho(String texto) {
        sauceProductPage.comboBoxTamanho(texto);
    }

    @And("escolho a cor {string}")
    public void escolhoACor(String texto) {
        sauceProductPage.comboBoxCor(texto);
    }

    @And("clico no botão adicionar ao carrinho")
    public void clicoNoBotaoAdicionarAoCarrinho() {
        sauceProductPage.btnAddToCart();
    }
}

