package guru_qa.tests.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${start}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browser_vertion")
    @DefaultValue("100")
    String getBrowserVertion();

    @Key("remoteUrl")
    String getRemoteURL();
}
