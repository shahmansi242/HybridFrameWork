package org.example;

import org.openqa.selenium.By;

public class CheckoutResult extends Utils {
    private By _checkoutsuccessmessage = By.xpath("//strong[contains(text(),'processed')]");

    // user verify checkout success message
    public void verifycheckoutsuccessmessage()
    {

        String expected = "Your order has been successfully processed!";
        assertTextMessage(_checkoutsuccessmessage,expected,"Checkout is not successful");

    }

}
