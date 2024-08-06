package Steps;

import Pages.SauceLoginPage;
import io.cucumber.java.en.Given;

import static Runners.RunnerBase.getDriver;

public class SauceLoginSteps {
    SauceLoginPage sauceLoginPage = new SauceLoginPage();
    @Given("realize login no site sauce demo")
    public void realizeLoginNoSiteSauceDemo() {
        getDriver().get("https://sauce-demo.myshopify.com/account/login");
        SauceLoginPage.digitarEmail();
        SauceLoginPage.digitarSenha();
        SauceLoginPage.clicarBtnLogin();
    }
}

