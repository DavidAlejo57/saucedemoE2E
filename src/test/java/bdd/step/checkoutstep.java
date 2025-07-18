package bdd.step;

import bdd.page.Checkout;

public class checkoutstep {
    public Checkout checkout() { return new Checkout(); }

    public void esperanombre() { checkout().esperanombre(); }
    public void inombre() { checkout().inombre(); }
    public void inapellido() { checkout().inapellido(); }
    public void incodigo() { checkout().incodigo(); }
    public void scrollbtnoreden() { checkout().scrollbtnorden(); }
    public void esperaorden() { checkout().esperaorden(); }
    public void clickorden() { checkout().clickorden(); }

}
