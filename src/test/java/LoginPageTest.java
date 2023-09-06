import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.LoginPageSteps;

import static DataObject.LoginPageData.*;
public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    @Test
    @Description("არარეგისტრირებელი მობილურის ნომრით შესვლის მცდელობა")
    @Severity(SeverityLevel.CRITICAL)
    public void UnsuccessfulLoginCheck(){
        loginPageSteps.ClickProfileIcon()
                .goToLoginAccount()
                .loginWithMobile()
                .inputMobile(mobile)
                .inputPassword(password)
                .checkRememberMe()
                .enterLoginButton();
        Assert.assertTrue(true,"გთხოვთ გადაამოწმოთ მომხმარებლის სახელი, პაროლი და სცადოთ თავიდან დაკავშირება.");
    }

    @Test
    @Description("არარეგისტრირებელი მეილით შესვლის მცდელობა")
    public void UnsuccessfulLoginCheck_2(){
        loginPageSteps.ClickProfileIcon()
                .goToLoginAccount()
                .loginWithEmail()
                .inputEmail(email)
                .inputPassword(password)
                .checkRememberMe()
                .enterLoginButton();
        Assert.assertTrue(true,"გთხოვთ გადაამოწმოთ მომხმარებლის სახელი, პაროლი და სცადოთ თავიდან დაკავშირება.");
    }

}
