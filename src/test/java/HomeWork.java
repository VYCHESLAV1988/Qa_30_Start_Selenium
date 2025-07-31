import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.SocketOption;
import java.util.List;

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
        WebElement html = wd.findElement(By.tagName("html")); //html
        WebElement html1 = wd.findElement(By.cssSelector("html"));
        WebElement body = wd.findElement(By.tagName("body")); //body
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement div =  wd.findElement(By.tagName("div"));  //div
        WebElement div2; wd.findElement(By.cssSelector("div"));
        WebElement h1 = wd.findElement(By.tagName("h1")); //h1
        WebElement h2 = wd.findElement(By.cssSelector("h1"));
        WebElement link = wd.findElement(By.tagName("a")); //a == list
        WebElement Link1 = wd.findElement(By.cssSelector("a"));
        List<WebElement> links = wd.findElements(By.tagName("a"));
        WebElement form = wd.findElement(By.tagName("form"));  //form
        WebElement form1 = wd.findElement(By.cssSelector("form"));
        WebElement email = wd.findElement(By.tagName("input")); //input
        WebElement email1 = wd.findElement(By.cssSelector("input"));
        WebElement password = wd.findElement(By.tagName("input"));
        WebElement password1 = wd.findElement(By.cssSelector("input"));
        WebElement login = wd.findElement(By.tagName("button")); //button
        WebElement login1 = wd.findElement(By.cssSelector("button"));
        WebElement Registration = wd.findElement(By.tagName("button"));
        WebElement Registration1 = wd.findElement(By.cssSelector("button"));
        




    }

    @AfterClass
    public void tearDown(){
         //wd.quit();  // closed  full opened tabs
        wd.close(); // closed one tab
    }

}
