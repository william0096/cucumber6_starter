package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class SelectTShirts {

    public static Performable selectTShirts(){
        return Task.where("{0} select T-Shirts to buy",
                Click.on(ReactShopping.SELECTTSHIRT1),
                Click.on(ReactShopping.SELECTTSHIRT2),
                Click.on(ReactShopping.SELECTTSHIRT3)
        );
    }
}
