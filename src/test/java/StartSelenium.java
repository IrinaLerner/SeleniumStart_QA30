import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;


    @BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
       // wd.navigate().forward();



    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("active"));
        wd.findElement(By.className("login_login__3EHKB"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));

        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("br"));
        wd.findElement(By.tagName("button"));
        wd.findElement(By.tagName("script"));

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector(".container"));


        wd.findElement(By.linkText("home"));
        wd.findElement(By.linkText("about"));
        wd.findElement(By.linkText("login"));

        wd.findElement(By.partialLinkText("ho"));
        wd.findElement(By.partialLinkText("abo"));
        wd.findElement(By.partialLinkText("log"));

        wd.findElement(By.cssSelector("[href^='/login']"));//start
        wd.findElement(By.cssSelector("[href$='/lin']"));//end
        wd.findElement(By.cssSelector("[href*='/ogi']"));//contains
        wd.findElement(By.cssSelector("[href='/lo']"));
        wd.findElement(By.cssSelector("[href]"));





    }
    @Test
    public void testName2(){

    }

    @AfterMethod
    public void postCondition(){
       // wd.close();
        wd.quit();


    }
}
