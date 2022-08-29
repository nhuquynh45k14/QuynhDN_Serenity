package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    static Target SEARCH_FIELD = Target.the("SEARCH_FIELD").locatedBy("//input[@type='text']");


    public static Target ProductName(String nameProduct){
        return Target.the("PRODUCT").locatedBy("//div[text()='" + nameProduct + "']");
    }




}
