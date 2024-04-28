package driver;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class AppFactory {

    static AppiumDriver driver;

    private static void android_launchApp() throws MalformedURLException {
        options.setDeviceName("emulator-5554")
        .setPlatformVersion("14.0")
        .setAppPackage("com.saucelabs.mydemoapp.rn")
        .setAppActivity(".MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        AppDriver.setDriver(driver);
        System.out.println("AndroidDriver is set");
    }

    private static void ios_launchApp(XCUITestOptions options) throws MalformedURLException {
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
        AppDriver.setDriver(driver);
        System.out.println("IOS_Driver is set");
}

    public static void launchApp(){
        if(AppData.platform.contains("android")){
            AppFactory.android_launchApp();
        }else if(AppData.platform.contains("ios")){
            AppFactory.ios_launchApp(null);
        }else
        throw new SkipException("Enter a valid platform value android/ios");
    }
}
