package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

   @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        // click on the ‘Forgot your password’ link
       clickOnElement(By.xpath("//div[@class = 'orangehrm-login-forgot']/p[text() = 'Forgot your password? ']"));

       //This is from requirement
       String expectedText = "Reset Password";

       // Find the Reset Password text element and get the text
       String actualText = getTextFromElement(By.xpath("//div[@class = 'orangehrm-card-container']/form/h6[text() = 'Reset Password']"));

       // Verify the Reset Password text is displayed
       Assert.assertEquals("Reset Password text is not displayed",expectedText, actualText);

   }

    @After
    public void teardown(){
        closeBrowser();
    }
}
