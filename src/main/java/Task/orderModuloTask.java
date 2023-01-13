package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UI.orderUI.*;
import static UI.orderUI.BTN_ADDORDER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class orderModuloTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ORDERS, isPresent()).forNoMoreThan(30).seconds(),
                WaitUntil.the(BTN_ADDORDER, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_ADDORDER));
    }

    public static Performable orderModulo() {
        return instrumented(orderModuloTask.class);
    }
}
