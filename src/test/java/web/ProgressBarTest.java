package web;

import lessons.ui.pages.MainPage;
import lessons.ui.pages.ProgressBarPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends OpenBrowser {
    private ProgressBarPage progressBarPage;
    final static int EXPECTED_WIDTH = 75;

    @Test
    public void testProgressBar() {
        navigateToProgressBarPage();
        clickOnStartButton();
        progressBarLoaded();
        Assert.assertTrue(progressBarPage.getProgressBarWidth() >= EXPECTED_WIDTH && progressBarPage.getProgressBarWidth() <= EXPECTED_WIDTH);
    }

    public void navigateToProgressBarPage() {
        progressBarPage = new MainPage().getProgressBarPage();
    }

    public void clickOnStartButton() {
        progressBarPage.clickStartButton();
    }

    public void progressBarLoaded() {
        progressBarPage.stopProgressBar(EXPECTED_WIDTH);
    }

}
