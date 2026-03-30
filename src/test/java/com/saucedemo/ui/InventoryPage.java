package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {
    public static final Target ADD_TO_CART_BACKPACK = Target.the("add to cart backpack").locatedBy("#add-to-cart-sauce-labs-backpack");
    public static final Target ADD_TO_CART_BIKELIGHT = Target.the("add to cart bike light").locatedBy("#add-to-cart-sauce-labs-bike-light");
    public static final Target CART_ICON = Target.the("cart icon").locatedBy(".shopping_cart_link");
}
