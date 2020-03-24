package org.example;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {
    private By _registerSuccessMessage = By.className("result");


    String expected = "Your registration completed";

    public void verifyUserSeeRegistrationSuccessMessage(){

       assertTextMessage(_registerSuccessMessage,expected,"Registration not successful...");

    }

}
