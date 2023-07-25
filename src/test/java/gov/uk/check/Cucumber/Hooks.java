package gov.uk.check.Cucumber;

import gov.uk.check.visa.utility.Utility;
import gov.uk.check.visa.propertyreader.PropertyReader;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {
    @Before
    public  void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
@AfterStep
    public  void tearDown(){
     closeBrowser();
    }
}
