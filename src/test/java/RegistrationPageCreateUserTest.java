import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPageCreateUserTest extends TestPreloadData{

    @Test
    @DisplayName("Успешная регистрация")
    @Description("Регистрация, переход с главной по кнопке личного кабинета, а затем по кнопке зарегистрироваться")
    public void registrationHappyFlow() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.regLinkClick();
        RegisterPage registerPage = new RegisterPage(driver);
        UserRandomDataGenerator userData = new UserRandomDataGenerator();
        registerPage.regDataInput(userData.randomUsername, userData.randomEmail + "@email.ru", userData.randomPassword);
        registerPage.regButtonClick();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(loginPage.loginTitle));
        Assert.assertEquals("Войти", loginPage.getLoginButtonText());
    }

    @Test
    @DisplayName("Неуспешная регистрация с некоррктным паролем")
    @Description("Регистрация, переход с главной по кнопке личного кабинета, а затем по кнопке зарегистрироваться")
    public void registrationUnhappyFlow() {
        MainPage mainPage = new MainPage(driver);
        mainPage.profileButtonClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.regLinkClick();
        RegisterPage registerPage = new RegisterPage(driver);
        UserRandomDataGenerator userData = new UserRandomDataGenerator();
        registerPage.regDataInput(userData.randomUsername, userData.randomEmail + "@email.ru", userData.incorrectRandomPassword);
        registerPage.regButtonClick();
        Assert.assertEquals("Некорректный пароль", registerPage.stopPassText());
    }

}
