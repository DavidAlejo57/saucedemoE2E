package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmacion extends DOM {
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div[9]/button[2]")
    protected WebElement btnfinalizar;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/h2")
    protected WebElement txtconfirma;


    public void scrollbtnf() { scroll(btnfinalizar); }
    public void esperabtnf() { espera(btnfinalizar); }
    public void clickbtnf() { onclick(btnfinalizar); }

    public String verificaF() {
        String t;
        return t = getText(txtconfirma);
    }

    public void esperaf() { espera(txtconfirma); }
}
