package bdd.stepdefinition;

import bdd.step.*;
import bdd.webdriver.DOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CompStepDefinition {

    private final agProductostep agProductostep = new agProductostep();
    private final carritostep carritostep = new carritostep();
    private final checkoutstep checkoutstep = new checkoutstep();
    private final confirmacionstep confirmacionstep = new confirmacionstep();
    private final loginstep loginstep = new loginstep();
    private final DOM dom = new DOM();

    @Given("Login {string}")
    public void login(String url) {
        loginstep.stepIniciarNavegador(url);

        loginstep.esperauser();
        loginstep.inuser();
        loginstep.inpass();
        loginstep.scrollbtnl();
        loginstep.esperabtnl();
        loginstep.clickbtnl();

    }

    @When("Agregar dos productos al carrito")
    public void agregarDosProductosAlCarrito() {
        agProductostep.scrollproducto1();
        agProductostep.esperaproducto1();
        agProductostep.agregarproducto1();
        agProductostep.scrollproducto2();
        agProductostep.esperaproducto2();
        agProductostep.agregarproducto2();
        agProductostep.scrollcarrito();
        agProductostep.esperacarroto();
        agProductostep.clickcarrito();
    }

    @And("Visializar el carrito {string}")
    public void visializarElCarrito(String text) {
        String t = carritostep.verificaC();
        Assertions.assertEquals(t, text);
        carritostep.scrollcheck();
        carritostep.esperacheck();
        carritostep.clickcheck();
    }

    @And("Completar el formulario de compra")
    public void completarElFormularioDeCompra() {
        checkoutstep.esperanombre();
        checkoutstep.inombre();
        checkoutstep.inapellido();
        checkoutstep.incodigo();
        checkoutstep.scrollbtnoreden();
        checkoutstep.esperaorden();
        checkoutstep.clickorden();
    }

    @Then("Finalizar la compra hasta la confirmación {string}")
    public void finalizarLaCompraHastaLaConfirmación(String text) {
        confirmacionstep.scrollbtnf();
        confirmacionstep.esperabtnf();
        confirmacionstep.clickbtnf();
        confirmacionstep.esperaf();
        String t = confirmacionstep.verificaF();
        System.out.println(t+"esto es");
        Assertions.assertEquals(t,text);
        dom.quitDriver();
    }
}
