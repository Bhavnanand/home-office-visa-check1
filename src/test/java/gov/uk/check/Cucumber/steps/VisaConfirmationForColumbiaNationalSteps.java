package gov.uk.check.Cucumber.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.SelectNAtionalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationForColumbiaNationalSteps {
    @Given("I am on homepage of check-uk-vis")
    public void iAmOnHomepageOfCheckUkVis() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select nationality  {string}")
    public void iSelectNationalityColumbia() {
        new SelectNAtionalityPage().selectNationality("Colombia");
    }

    @And("I click on continue button")
    public void IClickOnContinueButton() {
        new SelectNAtionalityPage().nextStepButtonClick();
    }

    @And("I select reason{string}")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().clickOnVisaPurpose("Join partner or family for a long stay'");
    }

    @And("I click on option continue")
    public void iClickOnOptionContinue() {
        new ReasonForTravelPage().selectOptionContinue();
    }

    @And("I Select state {string}yes'")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {

    }

    @And("I click on continue button")
    public void iiClickOnContinueButton() {

    }

    @Then("I verify result {string}ll need a visa to join your family or partner in the UK'")
    public void iVerifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
    }
}
