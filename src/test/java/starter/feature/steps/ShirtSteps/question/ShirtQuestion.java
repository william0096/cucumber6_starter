package starter.feature.steps.ShirtSteps.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.page.ShirtPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ShirtQuestion  implements Question<Boolean> {

    public static Question<Boolean> validations() {
        return new ShirtQuestion();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(ShirtPage.SPHYNX_SHIRT, isPresent()),
                WaitUntil.the(ShirtPage.SKUUL_SHIRT, isPresent()),
                WaitUntil.the(ShirtPage.WINE_SHIRT, isPresent())
                );
        return  ShirtPage.SPHYNX_SHIRT.resolveFor(actor).isVisible();
    }
}