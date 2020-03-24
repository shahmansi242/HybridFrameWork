package org.example;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    private By _email = By.id("BillingNewAddress_Email");
    private By _dropdown = By.id("BillingNewAddress_CountryId");
    String _country = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private By _postcode = By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
    private By _phoneNumber = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");

    String firstName = loadProp.getProperty("firstName");
    String lastName = loadProp.getProperty("lastName");
    String email = loadProp.getProperty("email");
    String city = loadProp.getProperty("city");
    String address = loadProp.getProperty ("address");
    String postcode = loadProp.getProperty("postcode");
    String phoneNumber = loadProp.getProperty("phoneNumber");



    //verify user is on checkout as guest
    public void checkoutAsGuest(){

        clickOnElement(_checkoutguest);
        sendText(_firstname,firstName);
        sendText(_lastname,lastName);
        sendText(_email,email);
        selectFromDropdownByValue(_dropdown,"233");
        sendText(_city,city);
        sendText(_address,address);
        sendText(_postcode,postcode);
        sendText(_phoneNumber,phoneNumber);
        clickOnElement(_continue);

    }



}

