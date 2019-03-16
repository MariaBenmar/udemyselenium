import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Lenovo on 16.03.2019.
 */
public class MainClass {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","D:\\Courses\\drivers\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://e.mail.ru/messages/inbox");
    }
}
