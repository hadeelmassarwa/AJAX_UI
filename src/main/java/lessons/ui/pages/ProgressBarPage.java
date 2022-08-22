package lessons.ui.pages;

import com.codeborne.selenide.SelenideElement;
import utils.Util;

import static com.codeborne.selenide.Selenide.$x;

public class ProgressBarPage extends MainPage {
    private final SelenideElement startButton = $x("//*[@id='startButton']");
    private final SelenideElement stopButton = $x("//*[@id='stopButton']");
    private final SelenideElement progressBar = $x("//*[@id='progressBar']");

    public void clickStartButton() {
        startButton.click();
    }

    public int getProgressBarWidth() {
        return Integer.valueOf(progressBar.getText().replace("%", ""));
    }

    public void stopProgressBar(int expectedWidth) {
        int progressBarWidth = getProgressBarWidth();
        while (progressBarWidth < expectedWidth) {
            Util.waitInSeconds(50);
            progressBarWidth = getProgressBarWidth();
        }
        clickStopButton();
    }

    public void clickStopButton() {
        stopButton.click();
    }
}
