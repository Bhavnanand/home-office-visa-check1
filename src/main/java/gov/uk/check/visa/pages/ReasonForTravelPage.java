package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
//ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
//  and  'void clickNextStepButton()'
public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    WebElement options;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement optionContinue;

    public void clickOnVisaPurpose(String reason) {
        List<WebElement> listOption = driver.findElements(By.xpath("//div[@class='gem-c-radio govuk-radios__item']"));

        for (WebElement rsnElement : listOption) {
            if (rsnElement.getText().contains(reason)) {
                clickOnElement(rsnElement);
                break;
            }
        }
    }

    public void selectOptionContinue() {
        clickOnElement(optionContinue);


    }
}
