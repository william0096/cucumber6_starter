package starter.search;

import net.serenitybdd.screenplay.targets.Target;


public class ReactShopping {

    public static Target SELECTSIZE = Target.the("size filter").locatedBy("//span[(text()='L')]");
    public static Target SELECTTSHIRT1 = Target.the("first t-shirt selection").locatedBy("//div[@class='shelf-item'][1]");
    public static Target SELECTTSHIRT2 = Target.the("second t-shirt selection").locatedBy("//div[@class='shelf-item'][2]");
    public static Target SELECTTSHIRT3 = Target.the("third t-shirt selection").locatedBy("//div[@class='shelf-item'][3]");
    public static Target SELECTQUANTITY1 = Target.the("first t-shirt quantity selection").locatedBy("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[4]/div/button[2]");
    public static Target SELECTQUANTITY2 = Target.the("second t-shirt quantity selection").locatedBy("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[4]/div/button[2]");
    public static Target SELECTQUANTITY3 = Target.the("third t-shirt quantity selection").locatedBy("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[4]/div/button[2]");
    public static Target CHECKOUT = Target.the("t-shirt checkout").locatedBy("//div[contains(text(),'Checkout')]");

}