package matys.tests.apps.steps.login;

import io.cucumber.java8.En;
import matys.tests.apps.pages.LoginPage;
import matys.tests.config.ConfigProvider;
import matys.tests.utils.ScenarioContext;

public class UserCanLogin  implements En {

    public UserCanLogin(LoginPage loginPage, ScenarioContext scenarioContext){
        Given("Default User credentials",()->{
            scenarioContext.addElement("username", ConfigProvider.CONFIG_PROPERTIES.username());
            scenarioContext.addElement("password", ConfigProvider.CONFIG_PROPERTIES.password());
            System.out.println("Ustawiam kredki");
        });

        When("User logs in with provided credentials", loginPage::openLoginPage);
    }
}
