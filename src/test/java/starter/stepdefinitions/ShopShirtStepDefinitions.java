package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import starter.UI.ShirtShopPage;
import starter.navigation.NavigateTo;
import starter.shoptask.FindShirts;
import starter.shoptask.MakePurchase;
import starter.shoptask.SelectShirts;
import net.serenitybdd.screenplay.ensure.Ensure;


public class ShopShirtStepDefinitions {

    @Given("{actor} is searching shirts on the shirt shop")
    public void searchingShirts(Actor actor) {
        actor.wasAbleTo(NavigateTo.theShoppingPage());
    }

    @When("{actor} finds them he selects two of each and make purchase")
    public void selectShirts(Actor actor) {
        actor.attemptsTo(
                FindShirts.sizeL(),
                SelectShirts.twiceEach(),
                MakePurchase.inTheShop()
        );
    }

    @Then("{actor} should see that the value of the six shirts is correct")
    public void should_see_information_about(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ShirtShopPage.VALUE_CORRECT).hasText("$ 72.50")
        );
    }
}
