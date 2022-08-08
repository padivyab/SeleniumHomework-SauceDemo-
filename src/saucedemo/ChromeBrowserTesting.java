package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

        ChromeBrowserTesting c=new ChromeBrowserTesting();
        c.chromeTest();

    }

    public void chromeTest()
    {
        String BaseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get(BaseUrl);
        d.manage().window().maximize();
        String title = d.getTitle();
        System.out.println(title);
        d.close();

    }
}
