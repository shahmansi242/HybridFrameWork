package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelryPage jewelryPage = new JewelryPage();
    ProductComparison productComparison = new ProductComparison();
    Catagories catagories = new Catagories();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    ComputerCategory computerCategory = new ComputerCategory();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckoutResult checkOutResult = new CheckoutResult();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    NewsPage newsPage = new NewsPage();
    AddToCart addToCart = new AddToCart();

     // user should able to register successfully
    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePage.clickonregisterbutton();
    }
    @When("user enters all registration details")
    public void userEntersAllRegistrationDetails() {
        registrationPage.verifyUserOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
    }

    @Then("user should able to register successfully")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
    // *******************************************************************************

    // user should be able to compare two different products successfully
    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.verifyUserIsOnHomePage();
    }
    @When("user click on jewelry categories page")
    public void userClickOnJewelryCategoriesPage() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
    }
    @And("user compare two different products")
    public void userCompareTwoDifferentProducts() {
        jewelryPage.chooseProductsToCompare();
    }

    @Then("user should be able to compare two different products successfully")
    public void userShouldBeAbleToCompareTwoDifferentProductsSuccessfully() {
        productComparison.VerifyUserIsOnComparisionPage();

    }
    // **************************************************************************
    // register user should be able to refer a friend successfully
    @Given("user navigate to register page")
    public void userNavigateToRegisterPage() {
        homePage.clickonregisterbutton();
        registrationPage.verifyUserOnRegisterPage();
    }
    @When("register user click on computer categories")
    public void registerUserClickOnComputerCategories() {
        registrationPage.userEnterRegistrationDetails();
        homePage.clickOnComputerCategory();
    }

    @And("user select products to refer a friend")
    public void userSelectProductsToReferAFriend() {
        catagories.userClickOnNoteBook();
        catagories.userClickOnAppleMac();
    }

    @Then("register user should be able to refer a friend successfully")
    public void registerUserShouldBeAbleToReferAFriendSuccessfully() {
        catagories.UserClickOnEmailAFriend();
        emailFriendPage.emailAFriendDetails();
        emailFriendPage.verifyUserSeeSuccessMessageOfEmailAFriend();
    }
    //*********************************************************************************
    // non register user should not be able to refer a product to friend
    @Given("user is at on home page")
    public void userIsAtOnHomePage() {
        homePage.verifyUserIsOnHomePage();
    }

    @When("user navigate to computer categories page")
    public void userNavigateToComputerCategoriesPage() {
        homePage.clickOnComputerCategory();
        productDetailPage.verifyUserOnComputerCatagoriesPage();
    }

    @And("user selected products to refer a friend")
    public void userSelectedProductsToReferAFriend() {
        productDetailPage.userClickOnNoteBook();
        productDetailPage.userClickOnAppleMac();
    }
    @Then("non register user should not be able to refer a product to friend")
    public void nonRegisterUserShouldNotBeAbleToReferAProductToFriend() {
        productDetailPage.UserReferToFriend();
        productDetailPage.verifyUserSeeErrorMessage();
    }
     //*************************************************************************************
     // user should be able to sort product high to low by price
    @Given("user on home page")
    public void userOnHomePage() {
        homePage.verifyUserIsOnHomePage();
    }
    @When("user click on computer categories page")
    public void userClickOnComputerCategoriesPage() {
        homePage.clickOnComputerCategory();
        catagories.verifyUserOnComputerCatagoriesPage();
    }
    @And("user click on product")
    public void userClickOnProduct() {
        computerCategory.userClickOnNoteBook();
    }
    @And("user click on filter sort by high to low")
    public void userClickOnFilterSortByHighToLow() {
        computerCategory.userSelectFromPositionPriceHighToLow();
    }
    @Then("user should be able to sort product high to low by price")
    public void userShouldBeAbleToSortProductHighToLowByPrice() {
        computerCategory.verifyUserShouldBeAbleToSeePriceHighToLow();
    }
     //*******************************************************************************

     // guest user should be able to checkout successfully
    @Given("user ison home page")
    public void userIsonHomePage() {
        homePage.verifyUserIsOnHomePage();
    }

    @When("user navigate to jewellery category page")
    public void userNavigateToJewelleryCategoryPage() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
    }
    @And("user select add to cart product")
    public void userSelectAddToCartProduct() {
        jewelryPage.addToCartProduct();
    }

    @And("user checkout as a guest")
    public void userCheckoutAsAGuest() {
        guestCheckout.checkoutAsGuest();
    }

    @And("user click on shipping address")
    public void userClickOnShippingAddress() {
        shippingAddress.userClickOnShippingAddress();
    }
    @And("user select payment method")
    public void userSelectPaymentMethod() {
        paymentMethod.userFillPaymentMethodDetails();
    }

    @Then("guest user should be able to checkout successfully")
    public void guestUserShouldBeAbleToCheckoutSuccessfully() {
        checkOutResult.verifycheckoutsuccessmessage();
    }
     //************************************************************************
     // user should be able to change currency symbol
    @Given("user is onhome page")
    public void userIsOnhomePage() {
        homePage.verifyUserIsOnHomePage();
    }
    @When("user select currency from dropdown")
    public void userSelectCurrencyFromDropdown() {
        changeCurrency.verifyingCurrencySymbolPresent();
    }
    @Then("user should be able to change currency symbol")
    public void userShouldBeAbleToChangeCurrencySymbol()
    {
        changeCurrency.selectCurrencyFromDropDown();
    }
     //******************************************************************************
     // guest user should be able to add new comment on website
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage.verifyUserIsOnHomePage();
    }

    @When("user click on view news archive")
    public void userClickOnViewNewsArchive() {
        homePage.clickOnViewNewsArchive();
    }
    @And("user click on details")
    public void userClickOnDetails() {
        newsPage.userClickOnDetails();
    }

    @Then("guest user should be able to add new comment on website")
    public void guestUserShouldBeAbleToAddNewCommentOnWebsite() {
        newsPage.verifysuccessmessageofcomment();
    }
     //**************************************************************************
     // user should be able to see add to cart button is present on feature products
    @Given("useris on home page")
    public void userisOnHomePage() {
        homePage.verifyUserIsOnHomePage();
    }

    @Then("user should be able to see add to cart button is present on feature products")
    public void userShouldBeAbleToSeeAddToCartButtonIsPresentOnFeatureProducts() {
        addToCart.verifyAddToCartButton();
    }
}
