package org.example;

import org.openqa.selenium.By;

public class ProductComparison extends Utils{

    // comparison expected and actual
    public void VerifyUserIsOnComparisionPage(){
        assertURL("compareproducts");

    }
}


