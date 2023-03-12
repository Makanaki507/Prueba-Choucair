package test.automatization.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static test.automatization.userinterface.ObjetosDemoblaze.VALIDACION;

public class CompraExitosa implements Question<Boolean> {

    private String resultado;
    public CompraExitosa(String resultado) {
        this.resultado = resultado;
    }
    public static CompraExitosa Exitosa(String resultado) {
        return new CompraExitosa(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        actor.attemptsTo(WaitUntil.the(VALIDACION, isPresent()));
        String validarinicio = Text.of(VALIDACION).viewedBy(actor).asString();
        System.out.println("Captura de Variable" + validarinicio);
        if (resultado.contains(validarinicio))
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}
