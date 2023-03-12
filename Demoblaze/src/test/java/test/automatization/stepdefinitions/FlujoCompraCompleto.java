package test.automatization.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import test.automatization.questions.CompraExitosa;
import test.automatization.tasks.ComprarProductos;
import test.automatization.tasks.IniciarSesion;
import test.automatization.userinterface.PageDemoblaze;

public class FlujoCompraCompleto {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Alvaro");

    private PageDemoblaze pageDemoblaze = new PageDemoblaze();


    @Dado("^que el usuario se loguea en la pagina demoblaze$")
    public void queElUsuarioSeLogueaEnLaPaginaDemoblaze() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(pageDemoblaze));
        actor.attemptsTo(IniciarSesion.Sesion());
    }

    @Cuando("^agrega productos al carrito$")
    public void agregaProductosAlCarrito() {
        actor.attemptsTo(ComprarProductos.Productos());
    }

    @Entonces("^realiza la compra de los productos (.*)$")
    public void realizaLaCompraDeLosProductos(String resultado) {
        actor.should(GivenWhenThen.seeThat(CompraExitosa.Exitosa(resultado)));
    }
}
