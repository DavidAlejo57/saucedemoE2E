package bdd.step;

import bdd.page.Carrito;

public class carritostep {
    public Carrito carrito() { return new Carrito(); }

    public void scrollcheck() { carrito().scrollcheck(); }
    public void esperacheck() { carrito().esperacheck(); }
    public void clickcheck() { carrito().clickcheck(); }

    public String verificaC() {
        String t;
        return t = carrito().verificaC();
    }
}
