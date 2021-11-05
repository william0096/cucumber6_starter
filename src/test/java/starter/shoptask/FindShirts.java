package starter.shoptask;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.UI.ShirtShopPage;

public class FindShirts {
    public static Performable sizeL() {
        return Task.where("{0} searches shirts size L",
                Click.on(ShirtShopPage.SIZEL)
        );
    }
}
