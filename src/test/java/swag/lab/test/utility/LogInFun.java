package swag.lab.test.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.page_object.LogInPageObject;
import swag.lab.test.page_object.ProductListingPage;

public class LogInFun {

    public static void logInValidUser(WebDriver driver, WebDriverWait wait){

        driver.findElement(LogInPageObject.userNameField).sendKeys(LogInPageObject.validUser);
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.userPassword);
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productsHeaderText));

    }

    public static void logOutValidUser(WebDriver driver, WebDriverWait wait){

        driver.findElement(LogInPageObject.userNameField).sendKeys(LogInPageObject.validUser);
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.userPassword);
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productsHeaderText));

    }
}
