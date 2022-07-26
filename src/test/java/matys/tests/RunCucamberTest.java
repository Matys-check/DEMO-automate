package matys.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feautres"},
        plugin = "io.gameta.allure.cucumber6jvm.AllureCucumber6Jvm")

public class RunCucamberTest
{
    @BeforeClass
    public static void beforeClass(){
        SelenideLogger.addListener(
                "allureSelenide",
                new AllureSelenide()
                    .screenshots(true)
                    .savePageSource(false)
        );
        Configuration.browserSize ="1920x1080";
    }

    @AfterClass
    public static void afterClass(){
        SelenideLogger.removeAllListeners();
        WebDriverRunner.closeWebDriver();
    }
}
