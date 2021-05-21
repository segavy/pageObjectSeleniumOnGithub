import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameField = By.xpath("//input[@name = 'login']");
    private By passwordField = By.xpath("//input[@name = 'password']");
    private By signInButton = By.xpath("//input[@class = 'btn btn-primary btn-block']");
    private By createAnAccount = By.xpath("//p[@class = 'login-callout mt-3']/a");
    private By incorrectCredentials = By.xpath("//div[@class = 'container-lg px-2']");



}
