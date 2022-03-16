package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {






    @Test
    public void loginSuccess(){
        //open login form
       // WebElement loginItem = wd.findElement(By.xpath("//*[text()=' Log in ']")) ;
      //  loginItem.click();
        //fill email
      //  WebElement emailInput = wd.findElement(By.cssSelector("input#email"));
      //  emailInput.click();
      //  emailInput.clear();
       // emailInput.sendKeys("ula@gmail.co");

        //fill password
       // WebElement passwordInput = wd.findElement(By.cssSelector("input#password"));
      //  passwordInput.click();
       // passwordInput.clear();
       // passwordInput.sendKeys("Ula12345$");

        //click button Yalla
      //  wd.findElement(By.cssSelector("[type='submit']")).click();

        //click button ok
       // wd.findElement(By.xpath("//*[text()='Ok']")).click();

        //Assert
      //  Assert.assertTrue(wd.findElements(By.xpath("//a[text()=' Logout ']")).size()>0);
    }
    @Test
    public void loginSuccessNew(){
        //open login form
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("ula@gmail.co","Ula12345$");
        app.getHelperUser().submitYalla();
        app.getHelperUser().submitOk();

       Assert.assertTrue(app.getHelperUser().isLoginSuccess());




    }
}
