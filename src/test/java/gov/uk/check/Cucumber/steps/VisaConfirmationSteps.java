package gov.uk.check.Cucumber.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNAtionalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationSteps {
    @Given("I am on Homepage of check- uk- visa")
    public void iAmOnHomepageOfCheckUkVisa() {
    }

    @When("I click on start Button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a nationality {string}")
    public void iSelectANationality(String nationality) {
       new  SelectNAtionalityPage().selectNationality("Australia");
    }

    @And("I click on next step Button")
    public void iClickOnNextStepButton() {
        new SelectNAtionalityPage().nextStepButtonClick();
    }

    @And("I select reason tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().clickOnVisaPurpose("Tourism");
    }
    @And("I click on continue Button")
    public void iClickOnContinueButton() {
        new ReasonForTravelPage().selectOptionContinue();
    }

    @Then("I got result {string}")
    public void iGotResult() {
        String actual =new ResultPage().getResultMessage();
        System.out.println(actual);
    }
    }

