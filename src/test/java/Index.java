import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C://Tools/21.index.html");
    }

    @Test
    public void cssLocators(){
        //by tagName
       WebElement el = wd.findElement(By.tagName("button"));
       WebElement input = wd.findElement(By.tagName("input"));
       List<WebElement> list = wd.findElements(By.tagName("input"));

       //by class find Elements  .container
        WebElement div = wd.findElement(By.className("container"));
        WebElement div1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement>list1 = wd.findElements(By.className("nav-item"));
        List<WebElement>list2 = wd.findElements(By.cssSelector(".nav-item"));

        //by id find Elements #
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute find Elements [] attribute and value == [placeholder='value'] only for ccsSelector
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement a3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));

        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement inputS1 = wd.findElement(By.name("surename"));

        //By.linkText / By.partialLinkText
        WebElement a = wd.findElement(By.linkText("Item 3"));
        WebElement a2 = wd.findElement(By.partialLinkText("m 2"));

    }



}
