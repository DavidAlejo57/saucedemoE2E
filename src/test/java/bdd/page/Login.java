package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends DOM {
    private static String username = "standard_user";
    private static String password = "secret_sauce";

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input")
    protected WebElement inputuser;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input")
    protected WebElement inputpass;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/form/input")
    protected WebElement btnlogin;

    public void iniciarNavegador(String url) { inciarNavegador(url); }
    public void esperauser() { espera(inputuser); }
    public void inuser() { type(inputuser, username); }
    public void inpass() { type(inputpass, password); }
    public void scrollbtnl() { scroll(btnlogin); }
    public void esperabtnl() { espera(btnlogin); }
    public void clickbtnl() { onclick(btnlogin); }
}
