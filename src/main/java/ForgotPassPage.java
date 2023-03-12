import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {
    public WebDriver driver;

    public ForgotPassPage(WebDriver driver){
        this.driver = driver;
    }

    // Позиция ссылки "Войти"
    private By loginLink = By.xpath("//a[@href = '/login']");

    // Нажатие кнопки "Войти"
    public void loginLinkClick(){
        driver.findElement(loginLink).click();
    }
}
