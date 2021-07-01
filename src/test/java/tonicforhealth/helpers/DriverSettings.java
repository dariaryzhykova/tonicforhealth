package tonicforhealth.helpers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import tonicforhealth.config.GeneralConfig;
import tonicforhealth.config.GeneralConfigImpl;

import java.util.HashMap;
import java.util.Map;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = GeneralConfigImpl.config.browser();
        Configuration.browserVersion = GeneralConfigImpl.config.browserVersion();
        Configuration.browserSize = GeneralConfigImpl.config.browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (GeneralConfigImpl.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = GeneralConfigImpl.config.remoteDriverUrl();
        }

        Configuration.browserCapabilities = capabilities;
    }
}
