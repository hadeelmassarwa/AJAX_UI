package web;

import lessons.ui.pages.InputTextPage;
import lessons.ui.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTextTest extends OpenBrowser {
    private InputTextPage inputTextPage;

    @Test
    public void testInputText() {
        navigateToInputTextPage();
        fillTextBox();
        clickToChangeButtonName();
        Assert.assertTrue(inputTextPage.getButtonChangedName());
    }

    public void navigateToInputTextPage() {
        inputTextPage = new MainPage().getInputTextPage();
    }

    public void fillTextBox() {
        inputTextPage.fillTextField();
    }

    public void clickToChangeButtonName() {
        inputTextPage.clickOnChangeNameButton();
    }

}
