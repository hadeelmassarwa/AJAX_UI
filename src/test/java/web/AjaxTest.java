package web;

import lessons.ui.pages.AjaxPage;
import lessons.ui.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Util;

public class AjaxTest extends OpenBrowser {
    private AjaxPage ajaxPage;

    @Test
    public void test() {
        navigateToAjaxPage();
        clickOnAjaxButton();
        Util.waitInSeconds(20000);
        Assert.assertTrue(ajaxPage.getAjaxResponse());
    }

    public void navigateToAjaxPage() {
        ajaxPage = new MainPage().getAjaxPage();
        boolean isAjaxPageTitleDisplayed = ajaxPage.isAjaxPageTitleDisplayed();
        Assert.assertTrue(isAjaxPageTitleDisplayed);
    }

    public void clickOnAjaxButton() {
        ajaxPage.clickOnAjaxButton();
    }

}