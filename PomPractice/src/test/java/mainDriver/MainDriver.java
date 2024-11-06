package mainDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainDriver {
    private WebDriver driver;

    public void chromeDriver( ) {
        String path = System.getProperty("user.dir");
       System.setProperty( "webdriver.chrome.driver", path+"util/chromedriver.exe");
    driver = new ChromeDriver();
    }
}


