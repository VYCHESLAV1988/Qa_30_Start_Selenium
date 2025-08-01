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
    public void setUp() {

        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/login");
        wd.navigate().to("https://telranedu.web.app/login");  //opened tab url + save to taps
    }

    @Test
    public void cssSelectors() {
        //By tagName
        WebElement html = wd.findElement(By.tagName("html")); //html
        WebElement html1 = wd.findElement(By.cssSelector("html"));
        WebElement body = wd.findElement(By.tagName("body")); //body
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement div = wd.findElement(By.tagName("div"));  //div
        WebElement div1;
        wd.findElement(By.cssSelector("div"));
        WebElement h = wd.findElement(By.tagName("h1")); //h1
        WebElement h1 = wd.findElement(By.cssSelector("h1"));
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
        WebElement html2 = wd.findElement(By.xpath("//html"));
        WebElement body2 = wd.findElement(By.xpath("//body"));
        WebElement div2 = wd.findElement(By.xpath("//div"));
        WebElement h2 = wd.findElement(By.xpath("//h1"));
        WebElement a2 = wd.findElement(By.xpath("//a"));
        WebElement form2 = wd.findElement(By.xpath("//form"));
        WebElement email2 = wd.findElement(By.xpath("//input"));
        WebElement password2 = wd.findElement(By.xpath("//input[2]")); //new var for index xpath
        WebElement button2 = wd.findElement(By.xpath("//button"));
        WebElement button3 = wd.findElement(By.xpath("//button[2]"));

        //by class
        WebElement div3 = wd.findElement(By.className("container"));
        WebElement div4 = wd.findElement(By.cssSelector(".container"));
        WebElement div5 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement div6 = wd.findElement(By.xpath("//div"));

        List<WebElement> list1 = wd.findElements(By.className("nav-item"));
        List<WebElement> list2 = wd.findElements(By.cssSelector(".nav-item"));
        List<WebElement> list3 = wd.findElements(By.xpath("//*[@class='nav-item']"));
        List<WebElement> list4 = wd.findElements(By.xpath("//nav-item"));

        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        WebElement root2 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement ele0 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement ele1 = wd.findElement(By.xpath("//*[@href='/home']")); //formula //[@href='value'];
        WebElement ele2 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement ele3 = wd.findElement(By.xpath("//*[@href='/about']"));
        WebElement ele4 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement ele5 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement ele6 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement ele7 = wd.findElement(By.xpath("//*[@placeholder='Password']"));
        WebElement ele8 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement ele9 = wd.findElement(By.name("password"));
        WebElement ele10 = wd.findElement(By.xpath("//*[@name='password']"));
        //start by attribute text ^=  //starts-with
        WebElement ele11 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement ele12 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]")); //var 1
        WebElement ele13 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]")); //var 2 formula == //* all elements class
        //countenance by attribute text *= //contains
        WebElement ele14 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement ele15 = wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));
        WebElement ele16 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));
        //end by attribute text $=
        WebElement ele17 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement ele18 = wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));
        WebElement ele19 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));
        WebElement ele20 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]")); //Pas
        WebElement ele21 = wd.findElement(By.xpath("//*[contains(@placeholder,'sw')]")); //sw
        WebElement ele22 = wd.findElement(By.xpath("//*[contains(@placeholder,'ord')]")); //ord
        //=======END HW2==============
        //WebElement el20 = wd.findElement(By.xpath("//a[3]"));
        //WebElement el21 = wd.findElement(By.xpath("//"))
    }
    

    @Test
    public void classWork() {
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
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::*"));
        WebElement el7 = wd.findElement(By.xpath("//h1/following-sibling::a[3]"));
        WebElement el8 = wd.findElement(By.xpath("//h1/following-sibling::a[last()]"));

        //preceding-sibling
        WebElement el9 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::*"));
        WebElement el10 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::a[2]"));


    }

    @AfterClass
    public void tearDown() {
        //wd.quit();  // closed  full opened tabs
        wd.close(); // closed one tab
    }

}
