package Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UI.orderUI.MSN_SUCCESSFUL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class orderFailedQuestion implements Question<Boolean> {

    private String Mensaje_fallido;

    public orderFailedQuestion(String mensaje_fallido) {
        Mensaje_fallido = mensaje_fallido;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MSN_SUCCESSFUL, containsText(Mensaje_fallido))
                .forNoMoreThan(30).seconds());
        return true;
    }

    public static Question<Boolean> orderFailedQuestion(String MensajeFallido) {
        return new orderQuestion(MensajeFallido);
    }
}
