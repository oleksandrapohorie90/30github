package oop_january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private final WebDriver driver;

    //represents the UI
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("loginBtn");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);
    }

    public void login(User user) {
        driver.findElement(usernameInput).sendKeys(user.getUsername());
        driver.findElement(passwordInput).sendKeys(user.getPassword());
        driver.findElement(loginButton).click();
    }


}
