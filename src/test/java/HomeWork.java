import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp(){

        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/login");
        wd.navigate().to("https://telranedu.web.app/login");  //opened tab url + save to taps
    }

    @Test
    public void cssSelectors(){
        //By tagName

        //html

        
        //body
        //div
        //h1
        //href
        //a == list
        //form
        //input
        //button



    }

    @AfterClass
    public void tearDown(){
         //wd.quit();  // closed  full opened tabs
        //wd.close(); // closed one tab
    }

}
