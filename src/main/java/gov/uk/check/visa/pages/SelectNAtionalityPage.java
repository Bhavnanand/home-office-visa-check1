package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
//SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
//  and 'void clickNextStepButton()'

public class SelectNAtionalityPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalitydropdown;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectNationality(String nationality){
        clickOnElement(nationalitydropdown);
       selectByVisibleTextFromDropDown(nationalitydropdown,nationality);
    }
    public  void nextStepButtonClick(){
        clickOnElement(nextStepButton);
    }
}