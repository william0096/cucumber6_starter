package starter.ui.page;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShirtPage {
    private ShirtPage() {
    }
    public static final Target FILTER = Target.the("filter Sh")
            .located(By.cssSelector("div:nth-of-type(5) > label > .checkmark"));
    public static final Target SPHYNX_SHIRT = Target.the("Cat Shirt")
            .located(ByAngular.cssContainingText("div:nth-of-type(2) > .shelf-item__title"
                    , "Sphynx Tie Dye Wine T-Shirt"));
    public static final Target SKUUL_SHIRT = Target.the("Cat Shirt")
            .located(ByAngular.cssContainingText("div:nth-of-type(3) > .shelf-item__title"
                    , "Skuul"));
    public static final Target WINE_SHIRT = Target.the("Cat Shirt")
            .located(ByAngular.cssContainingText("div:nth-of-type(4) > .shelf-item__title"
                    , "Wine Skul T-Shirt"));
    public static final Target FINISH_PRODUCT= Target.the("Finish Product")
            .locatedBy(".buy-btn");
    public static final Target QUANTITY_PRODUCT = Target.the("Quantity first product")
            .locatedBy("css: div:nth-of-type({0}) > .shelf-item__price > div > button:nth-of-type(2)");
    public static final Target PRODUCT = Target.the("third_product")
            .locatedBy(".shelf-container > div:nth-of-type({0})");
    public static final Target PRODUCT_QUANTITY = Target.the("First Quantity Product")
            .locatedBy("css: .shelf-item__details .desc");


}