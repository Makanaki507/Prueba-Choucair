package test.automatization.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static test.automatization.userinterface.ObjetosDemoblaze.*;

public class IniciarSesion implements Task {
    public static IniciarSesion Sesion() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN));
        actor.attemptsTo(WaitUntil.the(USERNAME, isClickable()));
        actor.attemptsTo(Enter.theValue("acamano").into(USERNAME));
        actor.attemptsTo(Enter.theValue("12345").into(PASSWORD));
        actor.attemptsTo(Click.on(BOTONLOGIN));
    }
}
