package starter.search;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class BuyTshirts {

    public static Performable buyTshirts() {
        return Task.where("{0} buy Selected T-Shirts",
                Click.on(ReactShopping.CHECKOUT)

        );
    }

}