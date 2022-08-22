package lessons.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class InputTextPage extends MainPage {
    private final SelenideElement textBox = $x("//*[@id='newButtonName']");
    private final SelenideElement changeNameButton = $x("//*[@id='updatingButton']");

    public void fillTextField() {
        textBox.sendKeys("Hadeel's Test");
    }


    public void clickOnChangeNameButton() {
        changeNameButton.click();
    }

    public boolean getButtonChangedName() {
        return changeNameButton.getText().contains("Hadeel's Test");
    }
}

