package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.OrderConfirmation;
import com.saucedemo.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutStepDefinitions {

    @Given("that a standard user logs into SauceDemo")
    public void standardUserLogsIntoSauceDemo() {
        theActorCalled("Customer").wasAbleTo(
                Open.url("https://www.saucedemo.com/"),
                Login.withCredentials("standard_user", "secret_sauce")
        );
    }

    @When("the user adds two products to the cart")
    public void userAddsTwoProductsToCart() {
        theActorInTheSpotlight().attemptsTo(
                AddProducts.toCart()
        );
    }

    @When("navigates to the cart to checkout")
    public void navigatesToCartToCheckout() {
        theActorInTheSpotlight().attemptsTo(
                GoToCart.andCheckout()
        );
    }

    @When("fills out the checkout form with personal data")
    public void fillsOutCheckoutForm() {
        theActorInTheSpotlight().attemptsTo(
                FillCheckoutForm.withData("John", "Doe", "12345")
        );
    }

    @When("finishes the purchase")
    public void finishesThePurchase() {
        theActorInTheSpotlight().attemptsTo(
                FinishPurchase.now()
        );
    }

    @Then("the user should see the exact confirmation message {string}")
    public void userShouldSeeConfirmationMessage(String expectedMessage) {
        theActorInTheSpotlight().should(
                seeThat("the confirmation message", OrderConfirmation.message(), equalTo(expectedMessage))
        );
    }
}
