package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgProducto extends DOM {
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    protected WebElement btnProducto1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
    protected WebElement btnProducto2;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a")
    protected WebElement btnCarrito;

    public void scrollproducto1() { scroll(btnProducto1); }
    public void esperaproducto1() { espera(btnProducto1); }
    public void agregarproducto1() { onclick(btnProducto1); }
    public void scrollproducto2() { scroll(btnProducto2); }
    public void esperaproducto2() { espera(btnProducto2); }
    public void agregarproducto2() { onclick(btnProducto2); }
    public void scrollcarrito() { scroll(btnCarrito); }
    public void esperacarrito() { espera(btnCarrito); }
    public void clickcarrito() { onclick(btnCarrito); }

}
