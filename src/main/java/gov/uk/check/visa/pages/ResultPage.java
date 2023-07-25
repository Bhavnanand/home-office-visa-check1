package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

//ResultPage - resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@name='response']")
    WebElement ExpectedResult;

    public String getResultMessage() {
        return getTextFromElement(resultMessage);
    }
}
