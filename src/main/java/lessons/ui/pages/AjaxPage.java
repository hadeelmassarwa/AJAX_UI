package lessons.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AjaxPage extends MainPage {

    private static final SelenideElement AJAX_PAGE_TITLE = $x("/html/body/section/div/h3");

    private final SelenideElement button = $x("//*[@id='ajaxButton']");

    private static final SelenideElement AJAX_RESPONSE_TEXT = $x("//*[@id='content']/p");


    public void clickOnAjaxButton() {
        button.click();
    }

    public boolean isAjaxPageTitleDisplayed() {
        return AJAX_PAGE_TITLE.isDisplayed();
    }

    public boolean getAjaxResponse() {
        return AJAX_RESPONSE_TEXT.getText().contains("Data loaded with AJAX get request.");
    }

}
