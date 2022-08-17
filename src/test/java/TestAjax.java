import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAjax extends OpenBrowser {
    private AjaxPage ajaxPage;

    @Test
    public void test() {
        getAjaxPage();
        clickOnAjaxButton();
        MainPage.waitInSeconds(20000);
        Assert.assertEquals(ajaxPage.getAjaxResponse(), true);
    }

    public void getAjaxPage() {
        ajaxPage = MainPage.getAjaxPage();
        boolean isAjaxPageTitleDisplayed = ajaxPage.isAjaxPageTitleDisplayed();
        Assert.assertEquals(isAjaxPageTitleDisplayed, true);
    }

    public void clickOnAjaxButton() {
        ajaxPage.clickOnAjaxButton();
    }

}