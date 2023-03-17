import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends TestPreloadData{

    @Test
    @DisplayName("Авторизация личный кабинет ссылка")
    public void authHappyFromMainLoginButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        Assert.assertEquals("Оформить заказ", mainPage.getOrderCreateButtonAfterLogin());
    }

    @Test
    @DisplayName("Авторизация основная кнопка ссылка")
    public void authHappyFromMainTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.loginButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        Assert.assertEquals("Оформить заказ", mainPage.getOrderCreateButtonAfterLogin());
    }

    @Test
    @DisplayName("Авторизация переход с регистрации ссылка")
    public void authHappyFromRegTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.regLinkClick();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.loginPageLinkClick();
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        Assert.assertEquals("Оформить заказ", mainPage.getOrderCreateButtonAfterLogin());
    }

    @Test
    @DisplayName("Авторизация переход с восстановления пароля ссылка")
    public void authHappyFromForgotPassTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.forgotLinkClick();
        ForgotPassPage forgotPassPage = new ForgotPassPage(driver);
        forgotPassPage.loginLinkClick();
        loginPage.loginFieldsFill(emailExist, passExist);
        loginPage.enterButtonClick();
        Assert.assertEquals("Оформить заказ", mainPage.getOrderCreateButtonAfterLogin());
    }
}
