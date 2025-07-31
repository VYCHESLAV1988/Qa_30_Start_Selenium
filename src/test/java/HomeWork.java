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
        
        //by xpath
        //by id
        //by attribute


        WebElement el14 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Pas')]"));
        //WebElement el15 = wd.findElement(By.xpath("//*[]"));
        WebElement  el20 = wd.findElement(By.xpath("//a[3]"));
        //WebElement el21 = wd.findElement(By.xpath("//"))
    }

    @Test
    public void classWork(){
        //parents
        WebElement el = wd.findElement(By.xpath("//h1/parents::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parents::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));
        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*")); //all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div")); //two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]")); //one options

        //ancestor-or-self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement>list1 = wd.findElements(By.xpath("//h1/following-sibling::*"));
        WebElement el7 = wd.findElement(By.xpath("//h1/following-sibling::a[3]"));
        WebElement el8 = wd.findElement(By.xpath("//h1/following-sibling::a[last()]"));

        //preceding-sibling
        WebElement el9 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::*"));
        WebElement el10 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::a[2]"));



    }

    @AfterClass
    public void tearDown(){
         //wd.quit();  // closed  full opened tabs
        wd.close(); // closed one tab
    }

}
