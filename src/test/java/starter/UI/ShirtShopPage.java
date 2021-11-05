package starter.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShirtShopPage {
    public static Target SIZEL = Target.the("Size L").
            located(By.xpath("/html/body/div/main/div[1]/div[5]/label/span"));
    public static Target FIRST_SHIRT = Target.the("First Shirt").
            located(By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[4]"));
    public static Target SECOND_SHIRT = Target.the("Second Shirt").
            located(By.xpath("//*[@id=\"root\"]/main/div[2]/div[3]/div[4]"));
    public static Target THIRD_SHIRT = Target.the("Third Shirt").
            located(By.xpath("//*[@id=\"root\"]/main/div[2]/div[4]/div[4]"));
    public static Target ADD_QUANTITY_FIRTS_SHIRT = Target.the("Add quantity First Shirt").
            located(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[4]/div/button[2]"));
    public static Target ADD_QUANTITY_SECOND_SHIRT = Target.the("Add quantity Second Shirt").
            located(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/button[2]"));
    public static Target ADD_QUANTITY_THIRD_SHIRT = Target.the("Add quantity Third Shirt").
            located(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div[4]/div/button[2]"));
    public static Target CLOSE_CART_FLOAT = Target.the("Close Cart Float").
            located(By.xpath("//div[@class='float-cart__close-btn']"));
    public static Target BUY_SHIRTS = Target.the("Byu the shirts").
            located(By.xpath("//div[@class='buy-btn']"));
    public static Target VALUE_CORRECT = Target.the("Value shirts correct").
            located(By.xpath("//p[@class='sub-price__val']"));

}
