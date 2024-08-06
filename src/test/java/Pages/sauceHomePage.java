package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;

public class sauceHomePage extends RunCucumberTest {

    @FindBy(css = "#logo > a")
    private static WebElement btnSimple;

    @FindBy(id = "product-2")
    private static WebElement jacket2;

    public sauceHomePage() {

            PageFactory.initElements(getDriver(), this);}

        public void clicarBtnSimple() {
            clicar(btnSimple);
        }

        public void clicarjacket2(){
            clicar(jacket2);
        }
}