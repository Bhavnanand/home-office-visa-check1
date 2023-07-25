package gov.uk.check.Cucumber.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationForChileSteps(){
    @Given("I am on Homepage of check-Uk -visa")
    public void iAmOnHomepageOfCheckUkVisa() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I Select nationality{string}")
    public void iSelectNationalityChile() {
        new SelectNAtionalityPage().selectNationality("Chile");
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNAtionalityPage().nextStepButtonClick();
    }

    @And("I select reason {string}")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().clickOnVisaPurpose("Work, academic visit or business");
    }

    @And("I select intense to stay for {string}")
    public void iSelectIntenseToStayForLongerThanSixMonths() {
        new DurationOfStayPage().selectLengthOfStay("longer than 6 months");
    }

    @Then("I verify result {string}")
    public void iVerifyResult() {
        new ResultPage().getResultMessage();
    }
}
