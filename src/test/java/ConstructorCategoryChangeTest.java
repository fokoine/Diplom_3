import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ConstructorCategoryChangeTest extends TestPreloadData{

    @Test
    @DisplayName("Проверка смены категори на соусы")
    public void changeCategorySauceTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.sauceClickTicket();
        WebElement actual = driver.findElement(mainPage.sauseOneOf);
        Assert.assertEquals(true, actual.isDisplayed());
    }

    @Test
    @DisplayName("Проверка смены категори на булки")
    public void changeCategoryBulkiTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.nachinkaClickTicket();
        mainPage.bulkiClickTicket();
        WebElement actual = driver.findElement(mainPage.bulkaOneOf);
        Assert.assertEquals(true, actual.isDisplayed());
    }

    @Test
    @DisplayName("Проверка смены категори на начинку")
    public void changeCategoryNachinkiTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.nachinkaClickTicket();
        WebElement actual = driver.findElement(mainPage.nachinkaOneOf);
        Assert.assertEquals(true, actual.isDisplayed());
    }

}
