package starter.feature.steps.ShirtSteps.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.page.ShirtPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class QuantityUpdateTask implements Task {
    public static Performable modifyQuantity() {return instrumented(QuantityUpdateTask.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShirtPage.QUANTITY_PRODUCT.of("1"), isClickable()),
                Click.on(ShirtPage.QUANTITY_PRODUCT.of("1")),
                Click.on(ShirtPage.QUANTITY_PRODUCT.of("2")),
                Click.on(ShirtPage.QUANTITY_PRODUCT.of("3"))
        );
    }
}