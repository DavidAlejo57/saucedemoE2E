package bdd.step;

import bdd.page.Confirmacion;

public class confirmacionstep {
    public Confirmacion confirmacion() { return new Confirmacion(); }

    public void scrollbtnf() { confirmacion().scrollbtnf(); }
    public void esperabtnf() { confirmacion().esperabtnf(); }
    public void clickbtnf() { confirmacion().clickbtnf(); }
    public void esperaf() { confirmacion().esperaf(); }

    public String verificaF() {
        String t;
        return t = confirmacion().verificaF();
    }


}
