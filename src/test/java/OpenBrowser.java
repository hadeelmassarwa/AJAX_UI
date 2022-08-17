import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;


public class OpenBrowser {

    @BeforeMethod
    public void setup() {
        Configuration.browserSize = "1920x1080";
        Selenide.open("http://uitestingplayground.com/");
    }

}