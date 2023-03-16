import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPreloadData {
    public WebDriver driver;

    // Готовый пользователь
    public String emailExist = "primer@primer.ru";
    public String passExist = "123456";

    @Before
    public void StartUp() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://stellarburgers.nomoreparties.site/");
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/account']")));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
