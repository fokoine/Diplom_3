import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    // Позиция кнопки "Личный кабинет"
    private By profileButton = By.xpath("//a[@href = '/account']");
    // Позиция кнопки "Войти в аккаунт"
    private By loginButton = By.xpath("//button[text() = 'Войти в аккаунт']");
    // Позиция кнопки "Оформить заказ" - видно только после авторизации
    private By orderCreateButton = By.xpath("//button[text() = 'Оформить заказ']");
    // Позиция заголовка "Соберите бургер"
    private By burgerMadeTitle = By.xpath("//h1[text() ='Соберите бургер']");


    // Позиция Вкладки "Соусы"
    private By saucePosition = By.xpath("//span[text() ='Соусы']");
    // Позиция Вкладки "Начинки"
    private By nachinkaPosition = By.xpath("//span[text() ='Начинки']");
    // Позиция Вкладки "Булки"
    private By bulkiPosition = By.xpath("//span[text() ='Булки']");
    // Позиция соуса на экране после переключения вкладок
    public By sauseOneOf = By.xpath("//p[text() = 'Соус с шипами Антарианского плоскоходца']");
    // Позиция начинок на экране после переключения вкладок
    public By nachinkaOneOf = By.xpath("//p[text() = 'Мясо бессмертных моллюсков Protostomia']");
    // Позиция начинок на экране после переключения вкладок
    public By bulkaOneOf = By.xpath("//p[text() = 'Флюоресцентная булка R2-D3']");
    // Нажатие вкладки "Соусы"
    public void sauceClickTicket(){
        driver.findElement(saucePosition).click();
        }
    // Нажатие вкладки "Начинки"
    public void nachinkaClickTicket(){
        driver.findElement(nachinkaPosition).click();
    }
    // Нажатие вкладки "Булки"
    public void bulkiClickTicket(){
        driver.findElement(bulkiPosition).click();
    }


    // Нажатие кнопки "Личный кабинет"
    public void profileButtonClick(){
        driver.findElement(profileButton).click();
    }
    // Нажатие на кнопку аторизоваться
    public void loginButtonClick(){
        driver.findElement(loginButton).click();
    }
    // Для проверок заголовок с главной
    public String burgerMailTitle() {
        return driver.findElement(burgerMadeTitle).getText();
    }
}
