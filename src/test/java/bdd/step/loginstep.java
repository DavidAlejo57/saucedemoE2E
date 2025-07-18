package bdd.step;

import bdd.page.Login;

public class loginstep {
    public Login login() { return new Login(); }

    public void stepIniciarNavegador(String url) { login().iniciarNavegador(url); }
    public void esperauser() { login().esperauser(); }
    public void inuser() { login().inuser(); }
    public void inpass() { login().inpass(); }
    public void scrollbtnl() { login().scrollbtnl(); }
    public void esperabtnl() { login().esperabtnl(); }
    public void clickbtnl() { login().clickbtnl(); }

}
