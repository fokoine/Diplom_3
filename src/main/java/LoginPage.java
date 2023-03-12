import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Позиция ссылки на регистрацию
    private By regLink = By.xpath("//a[@href = '/register']");
    // Позиция ссылки на восстановление пароля
    private By forgotLink = By.xpath("//a[@href = '/forgot-password']");
    // Кнопка входа
    private By enterButton = By.cssSelector("button.button_button__33qZ0.button_button_type_primary__1O7Bx.button_button_size_medium__3zxIa");
    //Поле для ввода логина
    private By enterLoginField = By.xpath("//input[@name='name']");
    // Поле для ввода пароля
     private By enterPasswordField = By.xpath("//input[@name='Пароль']");
    // Заголовок для  проверки логина
    public By loginTitle = By.xpath("//h2[text() = 'Вход']");

    // Нажатие ссылки "Зарегистрироваться" перехода к форме регистрации
    public void regLinkClick(){
        driver.findElement(regLink).click();
    }
    // Нажатие ссылки "Восстановить пароль" перехода к форме регистрации
    public void forgotLinkClick(){
        driver.findElement(forgotLink).click();
    }
    // Заполнение полей логина и пароля
    public void loginFieldsFill(String login, String password){
        driver.findElement(enterLoginField).sendKeys(login);
        driver.findElement(enterPasswordField).sendKeys(password);
    }
    public String getLoginButtonText(){
        return driver.findElement(enterButton).getText();
    }
    // Наэатие кнопки "Войти"
    public void enterButtonClick(){
        driver.findElement(enterButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[text() ='Соберите бургер']")));
    }

}
