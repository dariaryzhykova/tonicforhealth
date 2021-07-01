package tonicforhealth.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import tonicforhealth.config.GeneralConfigImpl;
import tonicforhealth.helpers.AllureAttachments;
import tonicforhealth.helpers.DriverSettings;
import tonicforhealth.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        Configuration.timeout = 8000;
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
//        AllureAttachments.attachNetwork(); // todo
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (GeneralConfigImpl.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
    }
}
