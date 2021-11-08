package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class FilterSize {
    public static Performable selectSize(){
        return Task.where("{0} filter by L size",
                Click.on(ReactShopping.SELECTSIZE)
        );
    }
}
