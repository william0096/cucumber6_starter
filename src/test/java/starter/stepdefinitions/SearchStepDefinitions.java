package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import starter.navigation.NavigateTo;
import starter.search.*;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.Alert;

import java.sql.Driver;

public class SearchStepDefinitions {


    @Given("{actor} is shopping T-shirts on the React Shop")
    public void ShoppingTShirtsOnTheReactShop(Actor actor) { actor.wasAbleTo(NavigateTo.theReactShopPage());
    }


    @When("{actor} looks up L size")
    public void heLooksUpLSize(Actor actor) { actor.wasAbleTo(FilterSize.selectSize());
    }

    @Then("{actor} should shop T-shirts L size")
    public void heShouldShopTShirtsLSize(Actor actor) throws InterruptedException {
        actor.wasAbleTo((Performable) SelectTShirts.selectTShirts());
        actor.wasAbleTo(SelectQuantity.selectQuantity());
        //actor.wasAbleTo(BuyTshirts.buyTshirts());
        actor.should(seeThat(TheTarget.textOf(ElementsQuestions.SUBTOTAL),is("$ 72.50")));
        actor.wasAbleTo(BuyTshirts.buyTshirts());
        //Thread.sleep(10000);
        //getDriver().switchTo().alert().wait(3000);
        String alertMessage= getDriver().getTitle();
        //getDriver().switchTo().alert().accept();
        //getDriver().get("https://react-shopping-cart-67954.firebaseapp.com/");
        //String alertMessage= getDriver().switchTo().alert().getText();
        System.out.println("MESSAGE");
        System.out.println(alertMessage);



    }
}



