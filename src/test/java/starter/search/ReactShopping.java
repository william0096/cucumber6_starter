package starter.search;

import net.serenitybdd.screenplay.targets.Target;


public class ReactShopping {

    public static Target SELECTSIZE = Target.the("size selection").locatedBy("//span[(text()='L')]");
    public static Target SELECTTSHIRT1 = Target.the("t-shit selection").locatedBy("//div[@data-sku='10686354557628304']//div[@class='shelf-item__buy-btn']");
    public static Target SELECTTSHIRT2 = Target.the("t-shit selection").locatedBy("//div[@data-sku='11033926921508488']//div[@class='shelf-item__buy-btn']");
    public static Target SELECTTSHIRT3 = Target.the("t-shit selection").locatedBy("//div[@data-sku='39876704341265610']//div[@class='shelf-item__buy-btn']");
    public static Target SELECTQUANTITY1 = Target.the("t-shit selection").locatedBy("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[4]/div/button[2]");
    public static Target SELECTQUANTITY2 = Target.the("t-shit selection").locatedBy("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[4]/div/button[2]");
    public static Target SELECTQUANTITY3 = Target.the("t-shit selection").locatedBy("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[4]/div/button[2]");
    public static Target CHECKOUT = Target.the("t-shit selection").locatedBy("//div[contains(text(),'Checkout')]");

}