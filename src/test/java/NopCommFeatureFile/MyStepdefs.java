package NopCommFeatureFile;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    EmailAFriend emailAFriend = new EmailAFriend();
    ShoppingCart shoppingCart = new ShoppingCart();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("^User is on Registration Page$")
    public void userIsOnRegistrationPage() {
        homePage.clickOnRegister();
    }

    @When("^User enter all mandatory fields details$")
    public void userEnterAllMandatoryFieldsDetails() {
        registerPage.userEnterRegistrationDetails();
    }




    @And("^click on HomePage$")
    public void clickOnHomePage() {

        registrationResultPage.clickOnHomePage();
    }

    @And("^click on one of the feature product$")
    public void clickOnOneOfTheFeatureProduct() {
        homePage.clickOnOneOfFeaturedProduct();
        buildYourOwnComputer.toVerifyUserShouldBeOnBuildYourOwnComputerPage();
        buildYourOwnComputer.selectProcessorSoftware();
    }

    @And("^click email a friend$")
    public void clickEmailAFriend() {
        buildYourOwnComputer.toClickOnEmailAFriend();
    }

    @And("^enter friends email and personal message$")
    public void enterFriendsEmailAndPersonalMessage() {
        emailAFriend.EnterFriendsEmail();
        emailAFriend.EnterPersonalMessage();
    }

    @And("^click send$")
    public void clickSend() {
        emailAFriend.ClickOnSendEmail();
    }




    @And("^enter Friends email address$")
    public void enterFriendsEmailAddress() {
        emailAFriend.EnterFriendsEmail();
    }

    @And("^enter your email address$")
    public void enterYourEmailAddress() {
        emailAFriend.enterYourEmailAddress();
    }

    @And("^enter personal message$")
    public void enterPersonalMessage() {
        emailAFriend.EnterPersonalMessage();
    }

    @When("^click on send email$")
    public void clickOnSendEmail() {
        emailAFriend.ClickOnSendEmail();
    }

    @Then("^user should see failure message$")
    public void userShouldSeeFailureMessage() {
        emailAFriend.toVerifyFailureMessageShouldComeSuccessfully();
    }

    @And("^select processor and software$")
    public void selectProcessorAndSoftware() {
        buildYourOwnComputer.selectProcessorSoftware();
    }

    @And("^click on Add to cart$")
    public void clickOnAddToCart() {
        buildYourOwnComputer.clickOnAddToCart();
    }

    @And("^click on shopping cart after build a computer$")
    public void clickOnShoppingCartAfterBuildAComputer() {
        buildYourOwnComputer.clickOnShoppingCartAfterBuildComputer();
    }

    @And("^select agreed terms and condition$")
    public void selectAgreedTermsAndCondition() {
        shoppingCart.selectAgreedTermsAndCondition();
    }

    @And("^click on checkout$")
    public void clickOnCheckout() {
        shoppingCart.clickOnCheckout();
    }

    @And("^fill all mandatory fields on checkout page and click on continue$")
    public void fillAllMandatoryFieldsOnCheckoutPageAndClickOnContinue() {
        checkoutPage.fillAllMandatoryFieldsOnCheckoutPage();
        checkoutPage.clickOnContinueAfterFillBillingAddressDetails();
    }

    @And("^select shipping method and click on continue$")
    public void selectShippingMethodAndClickOnContinue() {
        checkoutPage.shippingBy2ndDayAir();
        checkoutPage.clickOnContinueAfterShippingMethod();
    }

    @And("^select payment by credit card and click on continue$")
    public void selectPaymentByCreditCardAndClickOnContinue() {
        checkoutPage.selectPaymentByCreditCard();
        checkoutPage.clickOnContinueAfterPaymentMethod();
    }

    @When("^select mast card and enter all card details and click on continue$")
    public void selectMastCardAndEnterAllCardDetailsAndClickOnContinue() {
        checkoutPage.selectMastCard();
        checkoutPage.enterCardDetails();
        checkoutPage.clickOnContinueAfterMasterCard();
    }

    @Then("^click on confirm after payment$")
    public void clickOnConfirmAfterPayment() {
        checkoutPage.clickOnConfirmAfterMasterCard();
    }

    @And("^click on checkout as Guest$")
    public void clickOnCheckoutAsGuest() {
        shoppingCart.clickOnCheckoutAsGuest();
    }

    @And("^fill all mandatory fields on checkout page as guest and click on continue$")
    public void fillAllMandatoryFieldsOnCheckoutPageAsGuestAndClickOnContinue() {
        checkoutPage.fillAllMandatoryFieldsOnCheckoutPageAsGuestUser();
        checkoutPage.clickOnContinueAfterFillBillingAddressDetails();
    }

    @And("^User should see message Your Registration Completed$")
    public void userShouldSeeMessageYourRegistrationCompleted() {
        registrationResultPage.toVerifyUserIsSuccessfullyRegister();
    }

    @Then("^User should see the message Your Email Sent$")
    public void userShouldSeeTheMessageYourEmailSent() {
        emailAFriend.toVerifyMessageSentSuccessfully();
    }
}
