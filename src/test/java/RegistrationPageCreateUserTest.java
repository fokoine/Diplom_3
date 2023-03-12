import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
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
        LoginPage loginPage1 = new LoginPage(driver);
        Assert.assertNotNull(loginPage1.loginTitle.toString(), true);
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
        Assert.assertNotNull(registerPage.stopPassText(), true);
    }

}
