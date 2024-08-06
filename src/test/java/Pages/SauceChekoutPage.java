package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.pegarTexto;

public class SauceChekoutPage extends RunCucumberTest {

    @FindBy(css = "#minicart > a.checkout")
    private static WebElement btnCheckout;

    @FindBy(css = "div.row > div.six.columns.alpha.description > div > h3 > a")
    private static WebElement titlePedido;

    public SauceChekoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarBtnCheckout(){
        clicar(btnCheckout);
        clicar(btnCheckout);
    }
   public String pegarTituloProduto(){
        return pegarTexto(titlePedido);
    }

}