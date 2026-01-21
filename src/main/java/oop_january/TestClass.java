package oop_january;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    //contains test logic
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        User user = new User("a.pohorielova@gmail.com", "Sunshine12!");
        loginPage.login(user);


    }
}
