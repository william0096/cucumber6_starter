package starter.shoptask;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.UI.ShirtShopPage;

public class SelectShirts {
    public static Performable twiceEach() {
        return Task.where("{0} select twice each of the first three shirts",
                Click.on(ShirtShopPage.FIRST_SHIRT),
                Click.on(ShirtShopPage.SECOND_SHIRT),
                Click.on(ShirtShopPage.CLOSE_CART_FLOAT),
                Click.on(ShirtShopPage.THIRD_SHIRT),
                Click.on(ShirtShopPage.ADD_QUANTITY_FIRTS_SHIRT),
                Click.on(ShirtShopPage.ADD_QUANTITY_SECOND_SHIRT),
                Click.on(ShirtShopPage.ADD_QUANTITY_THIRD_SHIRT)
        );
    }
}
