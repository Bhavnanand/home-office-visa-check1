package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
//orkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
//  and 'void clickNextStepButton()'
public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//input")
    List<WebElement> listofstayop;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement WorkTypecontinueButton;

    public void reasonType(String reason) {
        List<WebElement> stayOption = driver.findElements(By.xpath("//div[@class='govuk-radios']//input"));
        for (WebElement stayrsn : stayOption) {
            if (stayrsn.getText().contains(reason)) {
                clickOnElement(stayrsn);
                break;
            }
        }
    }
    public void AfterWorkSelContinue(){
        clickOnElement(WorkTypecontinueButton);
    }
}






