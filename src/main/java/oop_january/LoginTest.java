package oop_january;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    void login_withValidCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open("https://test");
        User user = new User("a.pohorielova@gmail.com", "Sunshine12!");
        loginPage.login(user);
        Assertions.assertTrue(driver.getCurrentUrl().contains("test"));
    }
}
