package test.automatization.tasks;

import net.bytebuddy.pool.TypePool;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static test.automatization.userinterface.ObjetosDemoblaze.*;

public class ComprarProductos implements Task {
    public static ComprarProductos Productos() {
        return Tasks.instrumented(ComprarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(GALAXYS, isPresent()));
        actor.attemptsTo(WaitUntil.the(GALAXYS, isVisible()));
        actor.attemptsTo(Click.on(GALAXYS));
        actor.attemptsTo(WaitUntil.the(BOTONADDTOCARTCELL, isPresent()));
        actor.attemptsTo(WaitUntil.the(BOTONADDTOCARTCELL, isVisible()));
        actor.attemptsTo(Click.on(BOTONADDTOCARTCELL));
        actor.attemptsTo(Click.on(HOME));
        actor.attemptsTo(WaitUntil.the(LAPTOP, isClickable()));
        actor.attemptsTo(WaitUntil.the(LAPTOP, isVisible()));
        actor.attemptsTo(Click.on(LAPTOP));
        actor.attemptsTo(WaitUntil.the(BOTONADDTOCARTLAPTOP, isPresent()));
        actor.attemptsTo(WaitUntil.the(BOTONADDTOCARTLAPTOP, isVisible()));
        actor.attemptsTo(Click.on(BOTONADDTOCARTLAPTOP));
        actor.attemptsTo(WaitUntil.the(HOME, isPresent()));
        actor.attemptsTo(WaitUntil.the(HOME, isVisible()));
        actor.attemptsTo(Click.on(HOME));
        actor.attemptsTo(Click.on(CART));
        actor.attemptsTo(Click.on(PLACEORDER));
        actor.attemptsTo(WaitUntil.the(NAME, isClickable()));
        actor.attemptsTo(Enter.theValue("Alvaro").into(NAME));
        actor.attemptsTo(Enter.theValue("Panamá").into(COUNTRY));
        actor.attemptsTo(Enter.theValue("Panamá").into(CITY));
        actor.attemptsTo(Enter.theValue("8515266").into(CREDICARD));
        actor.attemptsTo(Click.on(PURCHARSE));
    }
}
