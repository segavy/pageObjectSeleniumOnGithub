import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By signUpButton = By.xpath("//a[@class = 'HeaderMenu-link flex-shrink-0 d-inline-block no-underline border color-border-tertiary rounded px-2 py-1']");
    private By signInButton = By.xpath("//a[@class = 'HeaderMenu-link flex-shrink-0 no-underline mr-3']");
    private By emailField = By.xpath("//input[@class = 'form-control border-0 f4-mktg-fluid py-3 px-4 width-full']");
    private By signUpForGithubButton = By.xpath("//button[contains(text(), 'Sign up for GitHub')]");

    public LoginPage clickSignInButton () {
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForGithubButton() {
        driver.findElement(signUpButton);
        return new SignUpPage(driver);
    }

    public StartPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage register(String email) {
        typeEmail(email);
        clickSignUpForGithubButton();
        return new SignUpPage(driver);
    }

}
