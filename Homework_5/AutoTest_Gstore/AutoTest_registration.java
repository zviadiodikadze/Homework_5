package AutoTest_Gstore;

import AutoTest_Gstore.BeforeTest.Setup;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class AutoTest_registration extends Setup {
    @Test
    public void AutoTest_GStore2() {
        $(byText("შესვლა")).click();
        $(byText("Create an Account")).click();
        // $(byText("რეგისტრაცია")).click();
        $(byId("reg_username")).setValue("ზვიადი ოდიკაძე");
        $(byId("reg_email")).setValue("zviadiodikadze@gmail.com");
        $(byId("reg_password")).setValue("123456");
        sleep(2000);
    }


}

