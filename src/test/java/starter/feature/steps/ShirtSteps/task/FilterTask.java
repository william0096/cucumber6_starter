package starter.feature.steps.ShirtSteps.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.page.ShirtPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class FilterTask implements Task {
    public static Performable buttonFilter() {return instrumented(FilterTask.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShirtPage.FILTER, isClickable()),
                Click.on(ShirtPage.FILTER));
    }
}