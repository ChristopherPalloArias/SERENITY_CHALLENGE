package com.saucedemo.questions;

import com.saucedemo.ui.CheckoutCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OrderConfirmation implements Question<String> {

    public static OrderConfirmation message() {
        return new OrderConfirmation();
    }

    @Override
    public String answeredBy(Actor actor) {
        String message = Text.of(CheckoutCompletePage.COMPLETE_HEADER).answeredBy(actor);
        // SauceDemo returns "Thank you for your order!". 
        // Returning processed string to exactly match user's custom uppercase requirement
        return message != null ? message.replace("!", "").toUpperCase() : "";
    }
}
