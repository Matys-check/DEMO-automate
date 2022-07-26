package matys.tests.apps.pages;

import com.codeborne.selenide.Selenide;
import matys.tests.config.ConfigProvider;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage
{
    private String getPanelLoginPageUrl(){
        System.out.println("Nazwa usera"+ConfigProvider.CONFIG_PROPERTIES.username());
        return ConfigProvider.CONFIG_PROPERTIES.panelLoginPageUrl();
    }
    public LoginPage openLoginPage()
    {
        System.out.println(getPanelLoginPageUrl());
        Selenide.open(getPanelLoginPageUrl());
        return page(LoginPage.class);
    }
}
