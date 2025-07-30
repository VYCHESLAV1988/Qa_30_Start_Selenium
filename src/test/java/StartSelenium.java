import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @Test
    public void test() {
        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/"); //open url tab done save to history temps
        wd.navigate().to("https://telranedu.web.app/"); // open url tab and save history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close(); // closed one tab
        //wd.quit(); // closed  full opened tabs

    }


}
