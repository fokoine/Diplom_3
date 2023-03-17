import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    public WebDriver driver;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    // Позиция ссылки "Профиль"
    By profileLink = By.xpath("//a[@href = '/account/profile']");
    // Позиция ссылки в лого
    private By logoLink = By.className("AppHeader_header__logo__2D0X2");
    // Позиция ссылки "Выход"
    private By logoutLink = By.xpath("//button[text() = 'Выход']");
    // Позиция ссылки "Конструктор"
    private By constructorLink = By.xpath("//p[text() = 'Конструктор']");

    // Нажатие кнопки "Выход"
    public void logoutLinkClick(){
        driver.findElement(logoutLink).click();
    }
    // Нажатие logo
    public void logoClick(){
        driver.findElement(logoLink).click();
    }
    // Нажатие кнопки "Конструктор"
    public void constructorClick(){
        driver.findElement(constructorLink).click();
    }
    // Получение наличия ссылки
    public String getTextLink() {
        return driver.findElement(profileLink).getText();
    }
}
