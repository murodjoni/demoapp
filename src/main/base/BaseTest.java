package base;
import java.nio.charset.MalformedInputException;

import io.appium.java_client.AppiumDriver;

public class BaseTest {

    @BeforeMethod
    public static void launchApp() throws MalformedInputException {
        AppFactory.launchApp();
        base.AppiumServer.start();
    }

    @AfterMethod
    public static void closeApp() throws MalformedInputException {
        AppiumDriver.getCurrentDriver().quit();
        base.AppiumServer.stop();
    }

    @BeforeSuite
    public static void serverStart(){
        base.AppiumServer.start();
    }
    @AfterSuite
    public static void serverStop(){
        base.AppiumServer.stop();
    }
}

