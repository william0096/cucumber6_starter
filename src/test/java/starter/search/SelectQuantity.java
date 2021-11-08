package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectQuantity {

    public static Performable selectQuantity(){
        return Task.where("{0} select Quantity to buy",
                Click.on(ReactShopping.SELECTQUANTITY1),
                Click.on(ReactShopping.SELECTQUANTITY2),
                Click.on(ReactShopping.SELECTQUANTITY3)
        );
    }
}
