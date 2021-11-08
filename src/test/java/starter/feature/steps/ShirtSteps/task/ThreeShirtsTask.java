package starter.feature.steps.ShirtSteps.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.page.ShirtPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ThreeShirtsTask implements Task {
    public static Performable threeProducts() {return instrumented(ThreeShirtsTask.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShirtPage.PRODUCT.of("2"), isClickable()),
                Click.on(ShirtPage.PRODUCT.of("2")),
                Click.on(ShirtPage.PRODUCT.of("3")),
                Click.on(ShirtPage.PRODUCT.of("4"))
        );
    }
}