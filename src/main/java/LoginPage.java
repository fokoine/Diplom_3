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
    By enterButton = By.xpath("//form[@class='Auth_form__3qKeq mb-20']/button");
    //Поле для ввода логина
    private By enterLoginField = By.xpath("//input[@name='name']");
    // Поле для ввода пароля
     private By enterPasswordField = By.xpath("//input[@name='Пароль']");
    // Заголовок для  проверки логина
    By loginTitle = By.xpath("//h2[text() = 'Вход']");

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
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[text() ='Соберите бургер']")));
    }

}
