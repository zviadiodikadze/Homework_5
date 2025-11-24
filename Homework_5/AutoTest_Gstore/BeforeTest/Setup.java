package AutoTest_Gstore.BeforeTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Setup {
    @BeforeTest
    public void beforeTest() {
        Configuration.browserSize = "1920x1080";
        open("https://gstore.ge/");
        //sleep(1000);


    }
    @AfterTest
    public static void afterTest() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

}