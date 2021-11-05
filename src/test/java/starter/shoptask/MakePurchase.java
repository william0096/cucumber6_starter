package starter.shoptask;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.UI.ShirtShopPage;

public class MakePurchase {
    public static Performable inTheShop() {
        return Task.where("{0} make purchase",
                Click.on(ShirtShopPage.BUY_SHIRTS)
        );
    }
}
