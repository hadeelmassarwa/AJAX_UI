package lessons.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static final SelenideElement AJAX_PAGE_BUTTON = $x("//*[@id='overview']/div/div[2]/div[1]/h3/a");
    private static final SelenideElement TEXT_INPUT_BUTTON = $x("//*[@id='overview']/div/div[2]/div[4]/h3/a");

    private static final SelenideElement PROGRESS_BAR_BUTTON = $x("//*[@id='overview']/div/div[3]/div[4]/h3/a");

    public AjaxPage getAjaxPage() {
        AJAX_PAGE_BUTTON.click();
        return new AjaxPage();
    }

    public InputTextPage getInputTextPage() {
        TEXT_INPUT_BUTTON.click();
        return new InputTextPage();
    }

    public ProgressBarPage getProgressBarPage() {
        PROGRESS_BAR_BUTTON.click();
        return new ProgressBarPage();
    }

}
