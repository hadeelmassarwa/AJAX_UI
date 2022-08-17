import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage {
    private static final SelenideElement AJAX_PAGE_BUTTON = $x("//*[@id='overview']/div/div[2]/div[1]/h3/a");

    public static AjaxPage getAjaxPage() {
        AJAX_PAGE_BUTTON.click();
        return new AjaxPage();
    }

    public static void waitInSeconds(int milliseconds) {
        Selenide.sleep(milliseconds);

    }

}
