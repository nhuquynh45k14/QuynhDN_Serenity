package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;
import starter.navigation.PerroMartHomePage;

public class ClosePopup {

    public static Performable ClosePopup() {
        return Task.where("{0} click close popup",
                click.on(HomePage.Close_popup));
    }
}
