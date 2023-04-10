package swag.lab.test;

import org.testng.annotations.Test;
import swag.lab.test.utility.BeforeAndAfter;
import swag.lab.test.utility.LogInFun;

public class LogIn extends BeforeAndAfter {

    @Test(priority = 1, description = "Standard - Valid User Log In")
    public void validUserLogIn()  {

        LogInFun.logInValidUser(driver, wait);

    }
}
