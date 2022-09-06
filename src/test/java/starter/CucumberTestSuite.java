package starter;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.Action.Perform;
import starter.Data.Product;
import starter.Data.ShippingAddress;
import starter.Page.CartPage;
import starter.Page.CheckOutShippingAddressPage;
import starter.navigation.NavigateTo;

import static starter.Data.Product.product;

@ExtendWith(SerenityJUnit5Extension.class)
public class CucumberTestSuite {
    @CastMember(name = "quynh")
    Actor quynh;
    @Test
    public void verifyCart() {
        quynh.wasAbleTo(NavigateTo.perromartHomePage());
        quynh.wasAbleTo(Perform.closePopup());
        quynh.attemptsTo(Perform.searchProduct(Product.searchTerm));
        quynh.attemptsTo(Perform.clickProduct(product));
        quynh.attemptsTo(Perform.addToCart());
        quynh.attemptsTo(Ensure.that(CartPage.productInCart("Bronco Jerky Salmon Dog Treat 70g")).hasText("Bronco Jerky Salmon Dog Treat 70g"));
        quynh.attemptsTo(Perform.clickCheckout());
    }
    @Test
    public void verifyInformation() {
        quynh.wasAbleTo(NavigateTo.perromartHomePage());
        quynh.wasAbleTo(Perform.closePopup());
        quynh.attemptsTo(Perform.searchProduct(Product.searchTerm));
        quynh.attemptsTo(Perform.clickProduct(product));
        quynh.attemptsTo(Perform.addToCart());
        quynh.attemptsTo(Ensure.that(CartPage.productInCart("Bronco Jerky Salmon Dog Treat 70g")).hasText("Bronco Jerky Salmon Dog Treat 70g"));
        quynh.attemptsTo(Perform.clickCheckout());
        quynh.attemptsTo(Perform.addShippingAddress(ShippingAddress.email, ShippingAddress.firstName, ShippingAddress.lastName,
                ShippingAddress.address, ShippingAddress.apartment, ShippingAddress.postalCode, ShippingAddress.phone));
        quynh.attemptsTo(Ensure.that(CheckOutShippingAddressPage.CONTACT).hasText(ShippingAddress.email));
        quynh.attemptsTo(Ensure.that(CheckOutShippingAddressPage.SHIP_TO).hasText(ShippingAddress.address + ", " + ShippingAddress.apartment + ", Singapore " + ShippingAddress.postalCode));
    }
}
