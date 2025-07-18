package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends DOM {
    private static String nombre = "David";
    private static String apellido = "Caicedo";
    private static String codigo = "120990";

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[1]/input")
    protected WebElement inputnom;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[2]/input")
    protected WebElement inputape;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[3]/input")
    protected WebElement inputcodi;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/form/div[2]/input")
    protected WebElement btnorden;

    public void esperanombre() { espera(inputnom); }
    public void inombre() { type(inputnom, nombre); }
    public void inapellido() { type(inputape, apellido); }
    public void incodigo() { type(inputcodi, codigo); }
    public void scrollbtnorden() { scroll(btnorden); }
    public void esperaorden() { espera(btnorden); }
    public void clickorden() { onclick(btnorden); }
}
