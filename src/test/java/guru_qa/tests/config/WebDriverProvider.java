package guru_qa.tests.config;

import com.codeborne.selenide.Configuration;
import guru_qa.tests.TestBase;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebDriverProvider extends TestBase {
    private WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        createWebDriver();
    }

    private void createWebDriver() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVertion();
        Configuration.remote = config.getRemoteURL();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }
}
