package starter.feature.steps.ShirtSteps.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.pages.PageObject;
import starter.ui.page.ShirtPage;
import starter.util.BaseStep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizePurchaseTask  extends PageObject implements Task {
    public static Task searchBy()  {
        return  instrumented(FinalizePurchaseTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               MoveMouse.to(ShirtPage.FINISH_PRODUCT).andThen(
                       actions -> {
                           actions.click();
                       }
               )
       );
       BaseStep.value= getDriver().switchTo().alert().getText().substring(23);
   }
}