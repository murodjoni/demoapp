package base;
import java.nio.charset.MalformedInputException;

public class BaseTest {

    @BeforeMethod
    public static void launchApp() throws MalformedInputException {
        AppFactory.launchApp();
    }

    @BeforeSuite
    public static void serverStart(){
        base.AppiumServer.start();
    }
}
