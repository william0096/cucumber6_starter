package starter.feature.shared;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;
import starter.navigation.OpenBrowser;

public class SharedStepDefinition {

    @Given("que {actor} comprador frecuente de camisas online")
    public void frequentBuyer(@NotNull Actor actor) {
        actor.attemptsTo(Open.browserOn().the(OpenBrowser.class));
    }
}