package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UI.orderUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class fomularioOrdersTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_CUSTOMER, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(INPUT_CUSTOMER),
                Click.on(INPUT_CUSTOMEROPTION),
                Click.on(BTN_SAVE)

        );
    }

    public static Performable fomularioOrders() {
        return instrumented(fomularioOrdersTask.class);
    }
}
