package starter.search;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    static Target Close_popup = Target.the("close popup").locatedBy("//button[@tabindex='0']");
}
