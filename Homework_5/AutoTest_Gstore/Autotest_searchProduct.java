package AutoTest_Gstore;

import AutoTest_Gstore.BeforeTest.Setup;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Autotest_searchProduct extends Setup {
    @Test
    public void AutoTest_GStore3() {
      $(byClassName("s")).setValue("ლეპტოპები").sendKeys(Keys.ENTER);
      $(byClassName("orderby")).selectOption("ფასი: კლებადობით");
      $(byClassName("product-image-link")).click();



        sleep(3000);
    }
}
