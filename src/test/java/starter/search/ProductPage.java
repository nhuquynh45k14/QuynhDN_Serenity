package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target ProductName(String nameProduct){
        return Target.the("PRODUCT").locatedBy("//div[text()='" + nameProduct + "']");
    }

}
