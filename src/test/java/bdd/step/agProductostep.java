package bdd.step;

import bdd.page.AgProducto;

public class agProductostep {
    public AgProducto agProducto() { return new AgProducto(); }

    public void scrollproducto1() { agProducto().scrollproducto1(); }
    public void esperaproducto1() { agProducto().esperaproducto1(); }
    public void agregarproducto1() { agProducto().agregarproducto1(); }
    public void scrollproducto2() { agProducto().scrollproducto2(); }
    public void esperaproducto2() { agProducto().esperaproducto2(); }
    public void agregarproducto2() { agProducto().agregarproducto2(); }
    public void scrollcarrito() { agProducto().scrollcarrito(); }
    public void esperacarroto() { agProducto().esperacarrito(); }
    public void clickcarrito() { agProducto().clickcarrito(); }
}
