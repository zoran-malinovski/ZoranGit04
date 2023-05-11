import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Git04Test01 {

    @Test
    public void Test01(){

        System.out.println("Prv test");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test02(){
        System.out.println("Vtor test");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://banzae.dev/");
    }
}
