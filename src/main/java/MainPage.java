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
    By orderCreateButton = By.xpath("//button[text() = 'Оформить заказ']");
    // Позиция заголовка "Соберите бургер" для простой валидации того что открыта главная страница
    By burgerMadeTitle = By.xpath("//h1[text() ='Соберите бургер']");


    // Позиция Вкладки "Соусы"
    private By saucePosition = By.xpath("//span[text() ='Соусы']");
    // Активная вкладка "Соусы"
    By activeSaucePosition
            = By.xpath("//section[@class ='BurgerIngredients_ingredients__1N8v2']/div/div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text() ='Соусы']");
    // Позиция Вкладки "Начинки"
    private By nachinkaPosition = By.xpath("//span[text() ='Начинки']");
    // Активная вкладка "Начинки"
    By activeNachinkaPosition
            = By.xpath("//section[@class ='BurgerIngredients_ingredients__1N8v2']/div/div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text() ='Начинки']");
    // Позиция Вкладки "Булки"
    private By bulkiPosition = By.xpath("//span[text() ='Булки']");
    // Активная вкладка "Булки"
    By activeBulkiPosition
            = By.xpath("//section[@class ='BurgerIngredients_ingredients__1N8v2']/div/div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text() ='Булки']");


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
    public String getOrderCreateButtonAfterLogin() {
        return driver.findElement(orderCreateButton).getText();
    }
}
