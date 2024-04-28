import org.openqa.selenium.WebDriver;

public class AppDriver {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static AppDriver instance = null;

    private AppDriver(){
        
    }

    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(){
        driver.set(driver);
        System.out.println("Driver is set");
    }
}