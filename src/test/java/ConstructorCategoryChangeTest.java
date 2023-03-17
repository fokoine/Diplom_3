import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ConstructorCategoryChangeTest extends TestPreloadData{

    @Test
    @DisplayName("Проверка смены категори на соусы")
    @Description("Проверяем наличие на странице класса выбраной категории")
    public void changeCategorySauceTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.sauceClickTicket();
        WebElement actual = driver.findElement(mainPage.activeSaucePosition);
        Assert.assertEquals(true, actual.isDisplayed());
    }

    @Test
    @DisplayName("Проверка смены категори на булки")
    @Description("Проверяем наличие на странице класса выбраной категории")
    public void changeCategoryBulkiTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.nachinkaClickTicket();
        mainPage.bulkiClickTicket();
        WebElement actual = driver.findElement(mainPage.activeBulkiPosition);
        Assert.assertEquals(true, actual.isDisplayed());
    }

    @Test
    @DisplayName("Проверка смены категори на начинку")
    @Description("Проверяем наличие на странице класса выбраной категории")
    public void changeCategoryNachinkiTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.nachinkaClickTicket();
        WebElement actual = driver.findElement(mainPage.activeNachinkaPosition);
        Assert.assertEquals(true, actual.isDisplayed());
    }

}
