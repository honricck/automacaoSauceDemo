package Steps;

import Pages.SauceChekoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static Runners.RunnerBase.getDriver;

public class SauceCheckoutSteps {

    private static final String TITLE_PEDIDO = ("Noir jacket - L / Red");
    SauceChekoutPage sauceChekOutPage = new SauceChekoutPage();

    @And("clico no botão do menu checkout")
    public void clicoNoBotaoDoMenuCheckout() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().navigate().to("https://sauce-demo.myshopify.com/cart");
    }

    @Then("verifico se o titulo do pedido esta correto")
    public void verificoSeOTituloDoPedidoEstaCorreto() {
        Assert.assertEquals(sauceChekOutPage.pegarTituloProduto(), TITLE_PEDIDO);
    }
}

