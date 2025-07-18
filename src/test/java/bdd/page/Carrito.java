package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrito extends DOM {
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/button[2]")
    protected WebElement btnCheckout;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/span")
    protected WebElement txtcarrito;

    public void scrollcheck() { scroll(btnCheckout); }
    public void esperacheck() { espera(btnCheckout); }
    public void clickcheck() { onclick(btnCheckout); }

    public String verificaC() {
        String t;
        return t = getText(txtcarrito);
    }
}
