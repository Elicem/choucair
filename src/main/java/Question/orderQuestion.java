package Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UI.orderUI.MSN_SUCCESSFUL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class orderQuestion implements Question<Boolean> {
    private String Mensaje_exitoso;

    public orderQuestion(String mensaje_exitoso) {
        Mensaje_exitoso = mensaje_exitoso;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MSN_SUCCESSFUL, containsText(Mensaje_exitoso))
                .forNoMoreThan(30).seconds());
        return true;
    }

    public static Question<Boolean> orderQuestion(String MensajeExitoso) {
        return new orderQuestion(MensajeExitoso);
    }
}
