package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class SauceLoginPage extends RunCucumberTest {

    @FindBy(id = "customer_email")
    private static WebElement txtEmail;

    @FindBy(id = "customer_password")
    private static WebElement txtsenha;

    @FindBy(css = "#customer_login > div.action_bottom > input")
    private static WebElement btnLogin;

    public SauceLoginPage() {

        PageFactory.initElements(getDriver(),this);
    }

    public static void digitarEmail(){

        digitar(txtEmail, "cursouniversidadeqa@gmail.com");
    }
    public static void digitarSenha(){

        digitar(txtsenha, System.getenv("senha"));
    }
    public static void clicarBtnLogin(){

        clicar(btnLogin);
    }
}