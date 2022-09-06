package starter.Page;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static Target productInCart(String nameProduct) {
//        return Target.the("PRODUCT IN CART").locatedBy("//div[@class='CartItems_Title__x96Gd' and text()='" + nameProduct + "']");
        return Target.the("PRODUCT IN CART").locatedBy("//div[contains(@class,'CartItems_ProdcutBoxCartImgTitle')]//div[contains(@class,'CartItems_Title')]");
        //span[contains(text(),'Add to cart')]"
        //a[@href='/cart']/div[contains(@class, 'align-items-center position-relative')]");
    }

    public static Target BUTTON_CHECK_OUT = Target.the("check out").locatedBy("//div[@class='CartItems_CartBoxRight__MIMD5']//button[text()='Checkout']");

}
