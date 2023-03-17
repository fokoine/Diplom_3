import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegisterPage {
    public WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    // Позиция поля ввода имени
    private By namePlace = By.xpath("//div[@class='Auth_login__3hAey']/form/fieldset[1]/div/div/input");

    // Позиция ввода email
    private By emailPlace = By.xpath("//div[@class='Auth_login__3hAey']/form/fieldset[2]/div/div/input");

    // Позиция ввода пароля
    private By passPlace = By.xpath("//div[@class='Auth_login__3hAey']/form/fieldset[3]/div/div/input");

    // Позиция кнопки регистрации
    private By regButton = By.xpath("//button[text() = 'Зарегистрироваться']");
    // Текст предупреждения о некорректном пароле
    private By stopMaskPassText = By.xpath("//p[text() = 'Некорректный пароль']");
    // Ссылка на страницу логина
    private By  loginPageLink = By.xpath("//a[@href = '/login']");

    // Ввод данных регистрации
    public void regDataInput(String name, String email, String pass) {
        driver.findElement(namePlace).sendKeys(name);
        driver.findElement(emailPlace).sendKeys(email);
        driver.findElement(passPlace).sendKeys(pass);
    }

    // Нажатие кнопки "Зарегистрироваться"
    public void regButtonClick(){
        driver.findElement(regButton).click();
    }

    public void loginPageLinkClick(){
        driver.findElement(loginPageLink).click();
    }

    public String stopPassText() {
        return driver.findElement(stopMaskPassText).getText();
    }
}
