package starter.feature.steps.ShirtSteps.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.page.ShirtPage;

import java.util.List;

public class ThreeShirtsQuestion implements Question<List<String>> {
    private List<String> item;
    public static Question<List<String>> validationsShirtsQuestion() {
        return new ThreeShirtsQuestion();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(ShirtPage.PRODUCT_QUANTITY).viewedBy(actor).resolveAll();
    }
}