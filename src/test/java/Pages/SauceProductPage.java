package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.selecionarComboBox;

public class SauceProductPage extends RunCucumberTest {

    @FindBy(id = "product-select-option-0")
    private static WebElement comboBoxTamanho;

    @FindBy(id = "product-select-option-1")
    private static WebElement comboBoxCor;

    @FindBy(id = "add")
    private static WebElement btnAddToCart;

    public SauceProductPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void comboBoxTamanho(String texto ){
        selecionarComboBox(comboBoxTamanho, texto);

    }
    public void comboBoxCor(String texto){
        selecionarComboBox(comboBoxCor, texto);
    }
    public void btnAddToCart(){
        clicar(btnAddToCart);
    }
}