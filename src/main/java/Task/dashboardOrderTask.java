package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UI.orderUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class dashboardOrderTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DASHBOARD, isPresent()).forNoMoreThan(30).seconds(),
                WaitUntil.the(BTN_MOREINFO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_MOREINFO));
    }

    public static Performable dashboardOrder() {
        return instrumented(dashboardOrderTask.class);
    }
}

