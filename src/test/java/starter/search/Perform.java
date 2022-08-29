package starter.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class Perform {
    public static Performable ClosePopup() {
        return Task.where("{0} click close popup",
                Click.on(HomePage.Close_popup));
    }

    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchPage.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable ClickProduct(String product) {
        return Task.where("{0} click choose product",
                Click.on(SearchPage.ProductName(product))
        );
    }
}
