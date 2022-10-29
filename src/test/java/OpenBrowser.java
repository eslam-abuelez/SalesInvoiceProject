import Menu.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;

public class OpenBrowser {
    public static void main(String[] args) {
        //bridge between driver and browser
        String chromePath = System.getProperty("user.dir")+"\\src\\resources\\browsers\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        //New Object for WebDirver

        WebDriver driver = new ChromeDriver();
        //navigate to the project in github
        driver.navigate().to("https://github.com/eslam-abuelez/SalesInvoiceProject.git");
        // Close webDriver
        //driver.close();
    }
}
