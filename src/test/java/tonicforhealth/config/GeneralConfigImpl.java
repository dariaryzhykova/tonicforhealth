package tonicforhealth.config;

import org.aeonbits.owner.ConfigFactory;

public class GeneralConfigImpl {
    public static GeneralConfig config = ConfigFactory.create(GeneralConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
