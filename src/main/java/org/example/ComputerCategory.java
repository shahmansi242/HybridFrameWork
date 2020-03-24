package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ComputerCategory extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _dropDown = By.id("products-orderby");
    private String priceHighToLow = "Price: High to Low";




    //Verify user on computer catagories page
    public void verifyUserOnComputerCatagoriesPage()
    {
        assertURL("computers");
    }

    // user click on notebooks
    public void userClickOnNoteBook(){
        sleep(2);
        clickOnElement(_noteBooks);
    }
    //verify that user click on dropdown price high to low
    public void userSelectFromPositionPriceHighToLow(){

        selectFromDropdownByVisibleText(_dropDown,priceHighToLow);
    }
    public void verifyUserShouldBeAbleToSeePriceHighToLow() {
        List<WebElement> myList = driver.findElements(By.className("prices"));

        //myList contains all the web elements
        //if you want to get all elements text into array list
        List<String> all_elements_text = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++) {

            //loading text of each element in to array all_elements_text
            all_elements_text.add(myList.get(i).getText());

            //to print directly
            System.out.println(myList.get(i).getText());

        }
    }

}
