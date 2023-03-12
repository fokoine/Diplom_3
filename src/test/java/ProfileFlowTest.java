import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileFlowTest extends TestPreloadData{

    @Test
    @DisplayName("Переход в личный кабинет")
    @Description("Проверка перехода в личный кабинет после авторизации")
    public void openProfileAfterAuthTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        mainPage.profileButtonClick();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href = '/account/profile']")));
        ProfilePage profilePage = new ProfilePage(driver);
        String actual = profilePage.getTextLink();
        Assert.assertEquals(actual, "Профиль");
    }

    @Test
    @DisplayName("Переход на главный экран")
    @Description("Проверка перехода на главный экран из личного кабинета по нажатию на лого")
    public void backToMainPageByLogoFromProfileTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        mainPage.profileButtonClick();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href = '/account/profile']")));
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.logoClick();
        String actual = mainPage.burgerMailTitle();
        Assert.assertEquals(actual, "Соберите бургер");
    }

    @Test
    @DisplayName("Переход к конструктору по клику")
    @Description("Открытие конструктора, он же главная страница, по клику на конструктор в хедера")
    public void toConstructLinkTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        mainPage.profileButtonClick();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href = '/account/profile']")));
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.constructorClick();
        String actual = mainPage.burgerMailTitle();
        Assert.assertEquals(actual, "Соберите бургер");
    }

    @Test
    @DisplayName("Выход из пользователя кнопка проверка")
    @Description("Проверка кнопки разлогина в профиле")
    public void logoutLinkTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        mainPage.profileButtonClick();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href = '/account/profile']")));
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.logoutLinkClick();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Войти']")));
        String actual = loginPage.getLoginButtonText();
        Assert.assertEquals(actual, "Войти");
    }
}
