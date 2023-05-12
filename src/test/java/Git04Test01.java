import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Git04Test01 {

    @Test(priority = 3)
    public void Test01(){

        System.out.println("Prv test");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void Test02(){
        System.out.println("Vtor test");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://banzae.dev/");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void Test03(){
        System.out.println("Test 03 - promena");
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://banzae.dev/#contact");
        driver.manage().window().maximize();
    }

    @Test
    public void Test04(){
        System.out.println("nova granka");
        Assert.assertEquals(1,2);
    }
}
