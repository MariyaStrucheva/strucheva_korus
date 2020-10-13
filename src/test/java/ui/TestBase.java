package ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void setUp() {
        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_mac");
        } else if (System.getProperty("os.name").contains("Linux")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_linux");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        }
        Configuration.browser = "chrome";
    }
}
