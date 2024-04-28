package base;
import java.nio.charset.MalformedInputException;

public class BaseTest {

    @BeforeTest
    public static void launchApp() throws MalformedInputException {
        AppFactory.launchApp();
    }
}
