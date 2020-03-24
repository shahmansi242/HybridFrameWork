package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstName = "mansi";
    private String lastName = "shah";
    private  static String timestamp = timeStamp();

    public  void  verifyUserOnRegisterPage(){
        assertURL("register");
    }
    public void userEnterRegistrationDetails(){
        sleep(2);
        sendText(_firstName,firstName);
        sendText(_lastName,lastName);
        sendText(_email,"mshah6135+"+timestamp+ "@gmail.com");
        sendText(_password,"Shah123");
        sendText(_confirmPassword,"Shah123");
        clickOnElement(_registerButton);

    }

}
