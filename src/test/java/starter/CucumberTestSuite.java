package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.Data.Product;
import starter.Data.ShippingAddress;
import starter.Page.CartPage;
import starter.Page.CheckOutShippingAddress;
import starter.Page.Perform;
import starter.navigation.NavigateTo;

import static starter.Data.Product.product;

@RunWith(SerenityRunner.class)
public class CucumberTestSuite {
    @CastMember(name = "Quynh")
    Actor Quynh;
    @Test
    public void verifyCart() {
        Quynh.wasAbleTo(NavigateTo.perromartHomePage());
        Quynh.wasAbleTo(Perform.closePopup());
        Quynh.attemptsTo(Perform.searchProduct(Product.searchTerm));
        Quynh.attemptsTo(Perform.clickProduct(product));
        Quynh.attemptsTo(Perform.addToCart());
        Quynh.attemptsTo(Ensure.that(CartPage.productInCart("Bronco Jerky Salmon Dog Treat 70g")).hasText("Bronco Jerky Salmon Dog Treat 70g"));
        Quynh.attemptsTo(Perform.clickCheckout());
    }
    @Test
    public void verifyInformation() {
        Quynh.wasAbleTo(NavigateTo.perromartHomePage());
        Quynh.wasAbleTo(Perform.closePopup());
        Quynh.attemptsTo(Perform.searchProduct(Product.searchTerm));
        Quynh.attemptsTo(Perform.clickProduct(product));
        Quynh.attemptsTo(Perform.addToCart());
        Quynh.attemptsTo(Ensure.that(CartPage.productInCart("Bronco Jerky Salmon Dog Treat 70g")).hasText("Bronco Jerky Salmon Dog Treat 70g"));
        Quynh.attemptsTo(Perform.clickCheckout());
        Quynh.attemptsTo(Perform.addShippingAddress(ShippingAddress.email, ShippingAddress.firstName, ShippingAddress.lastName,
                ShippingAddress.address, ShippingAddress.apartment, ShippingAddress.postalCode, ShippingAddress.phone));
        Quynh.attemptsTo(Ensure.that(CheckOutShippingAddress.CONTACT).hasText(ShippingAddress.email));
        Quynh.attemptsTo(Ensure.that(CheckOutShippingAddress.SHIP_TO).hasText(ShippingAddress.address + ", " + ShippingAddress.apartment + ", Singapore " + ShippingAddress.postalCode));
    }
}
