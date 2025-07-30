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
        WebElement body = wd.findElement(By.tagName("body")); //body
        WebElement div =  wd.findElement(By.tagName("div"));  //div
        WebElement h1 = wd.findElement(By.tagName("h1")); //h1
        WebElement link = wd.findElement(By.tagName("a")); //a == list
        List<WebElement> links = wd.findElements(By.tagName("a"));
        WebElement form = wd.findElement(By.tagName("form"));  //form
        WebElement email = wd.findElement(By.tagName("input")); //input
        WebElement password = wd.findElement(By.tagName("input"));
        WebElement login = wd.findElement(By.tagName("button")); //button
        WebElement Registration = wd.findElement(By.tagName("button"));
        




    }

    @AfterClass
    public void tearDown(){
         //wd.quit();  // closed  full opened tabs
        wd.close(); // closed one tab
    }

}
