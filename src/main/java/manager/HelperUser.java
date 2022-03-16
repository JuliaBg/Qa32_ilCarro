package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//*[text()=' Log in ']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.cssSelector("input#email"),email);

        type(By.cssSelector("input#password"),password);
    }

    public void submitYalla() {
        click(By.cssSelector("[type='submit']"));
    }

    public void submitOk() {
        click(By.xpath("//*[text()='Ok']"));
    }

    public boolean isLoginSuccess() {
        return isElementPresent(By.xpath("//a[text()=' Logout ']"));
    }
}
