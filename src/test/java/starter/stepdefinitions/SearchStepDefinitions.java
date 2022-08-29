package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;
import starter.search.Perform;

public class SearchStepDefinitions {

    @Given("{actor} open HomePage")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePerromartHomePage());
        actor.wasAbleTo(Perform.ClosePopup());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                Perform.about(term)
        );
    }

    @When("{actor} click chosen product {string}")
    public void quynhClickChosenProduct(Actor actor,String term) {
        actor.attemptsTo(
                Perform.ClickProduct(term)
        );
    }

//    @Then("{actor} should see information about {string}")
//    public void should_see_information_about(Actor actor, String term) {
//        actor.attemptsTo(
//                Ensure.that(WikipediaArticle.HEADING).hasText(term)
//        );
//    }
}
