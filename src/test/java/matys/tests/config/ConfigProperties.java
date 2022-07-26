package matys.tests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${test.properties.path}"
})

public interface ConfigProperties extends Config {

//Login
    @Key("username")
    String username();
    @Key("password")
    String password();

    @Key("auth.api.base.url")
    String authApiBaseUrl();

    @Key("panel.login.page.url")
    String panelLoginPageUrl();


}
