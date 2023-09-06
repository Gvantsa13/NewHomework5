package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {

    @BeforeMethod (description = "გვერდის გამართვა და გახსნა")
    public void setUp() {
        open("https://www.nido.ge/");
        Configuration.browserSize = "1920x1080";
    }

    @AfterMethod(description = "ქეშის გასუფთავება და გვერდის დახურვა")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
