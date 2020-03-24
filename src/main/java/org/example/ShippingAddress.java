package org.example;

import org.openqa.selenium.By;

public class ShippingAddress extends Utils {
    private By _continue = By.xpath("//input[@onclick='ShippingMethod.save()']");


    //user confirm shipping address and method
    public void userClickOnShippingAddress()
    {
        clickOnElement(_continue);
    }

}
