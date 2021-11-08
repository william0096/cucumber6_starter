package starter.feature.steps.ShirtSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import org.jetbrains.annotations.NotNull;
import starter.feature.steps.ShirtSteps.question.ShirtQuestion;
import starter.feature.steps.ShirtSteps.question.ThreeShirtsQuestion;
import starter.feature.steps.ShirtSteps.task.FilterTask;
import starter.feature.steps.ShirtSteps.task.FinalizePurchaseTask;
import starter.feature.steps.ShirtSteps.task.QuantityUpdateTask;
import starter.feature.steps.ShirtSteps.task.ThreeShirtsTask;
import starter.util.BaseStep;
import java.awt.*;
import static net.serenitybdd.screenplay.GivenWhenThen.and;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShirtStepDefinitions {
    private final String VALOR = "72.50";

    @Steps
    BaseStep baseStep;
    @When("{actor} filtre la ropa por talla L")
    public void filterClothes(@NotNull Actor actor) {
        actor.attemptsTo(FilterTask.buttonFilter());
    }

    @Then("{actor} mostrará los estilos de camisetas disponibles")
    public void shirtStyles(Actor actor) {
        assertThat("Validación de los productos",
                then(actor).asksFor(ShirtQuestion.validations()),
                is(true));
    }

    @When("{actor} seleccione los primeros tres productos")
    public void  firstThreeProducts(Actor actor) {
        actor.attemptsTo(FilterTask.buttonFilter());
        and(actor).attemptsTo(ThreeShirtsTask.threeProducts());
    }

    @Then("{actor} tendrá {int} productos por cada artículo en carrito")
    public void addToCart(Actor actor ,int cantidad) {
        for (String item: actor.asksFor(ThreeShirtsQuestion.validationsShirtsQuestion())){
            assertThat("porques estoy haciendo mi prueba",
                    item,containsString("Quantity: "+cantidad));
        }
    }

    @When("{actor} modifique cada uno de sus productos")
    public void modifyTheThreeProducts(Actor actor) {
        actor.attemptsTo(FilterTask.buttonFilter());
        and(actor).attemptsTo(ThreeShirtsTask.threeProducts());
        and(actor).attemptsTo(QuantityUpdateTask.modifyQuantity());
    }

    @When("{actor} finalice la compra de sus productos")
    public void completionOfThePurchase(Actor actor) throws AWTException {
        actor.attemptsTo(FilterTask.buttonFilter());
        and(actor).attemptsTo(ThreeShirtsTask.threeProducts());
        and(actor).attemptsTo(QuantityUpdateTask.modifyQuantity());
        and(actor).attemptsTo(FinalizePurchaseTask.searchBy());
    }

    @Then("{actor} mostrará el total que se debe pagar")
    public void totalPayment(Actor actor) {
        assertThat("Validación del total a pagar",
                BaseStep.value,
                is(VALOR));
    }
}