import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{
    // Page URL:

    private final String USER_NAME = "admin";
    private final String PASSWORD = "Admin@123";

    @FindBy(xpath = "//input[@name='username']")
    private WebElement Username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement Password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submit_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(){
        this.Username.sendKeys(USER_NAME);
    }

    public void enterpassword(){
        this.Password.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

}
