package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.example.BrowserSelector.loadProp;

public class ChangeCurrency extends Utils {
    SoftAssert softAssert = new SoftAssert();
    private By _currencyDropDrownMenuField = By.id("customerCurrency");
    public void selectCurrencyFromDropDown(){
        selectFromDropdownByVisibleText(_currencyDropDrownMenuField,loadProp.getProperty("changeToCurrency"));
    }

    public void verifyingCurrencySymbolPresent()
    {
        String selectedCurrencyName = dropDownGetSelectedText(_currencyDropDrownMenuField);
        String currencySymbol =getCurrencySymbolFromCurrencyName(selectedCurrencyName);
        System.out.println("Currently selected currency symbol is : "+currencySymbol);
        List<WebElement> listOfPriceElements = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement element : listOfPriceElements )
        {
            softAssert.assertTrue(element.getText().contains(currencySymbol),"This price does not have selected currency symbol '"+currencySymbol+"' :"+element.getText());
        }
        softAssert.assertAll();
    }

    public String getCurrencySymbolFromCurrencyName(String currencyName)
    {
        switch (currencyName){
            case "US Dollar":
                return "$";
            case "Euro":
                return "Ђ";
            default:
                return "Invalid Currency name";
        }
    }




}
