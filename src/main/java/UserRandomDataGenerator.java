import org.apache.commons.lang3.RandomStringUtils;

public class UserRandomDataGenerator {

    public String randomEmail;
    public String randomPassword;
    public String incorrectRandomPassword;
    public String randomUsername;

    public UserRandomDataGenerator() {
        this.randomEmail = RandomStringUtils.randomAlphabetic(8);
        this.randomPassword = RandomStringUtils.randomAlphabetic(8);
        this.incorrectRandomPassword = RandomStringUtils.randomAlphabetic(5);
        this.randomUsername = RandomStringUtils.randomAlphabetic(8);
    }
}