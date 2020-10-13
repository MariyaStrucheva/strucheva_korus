package ui.widget;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ui.pages.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchWidget {

    private final static SelenideElement inputQuery = $(By.cssSelector(".gLFyf.gsfi"));

    public GoogleSearchPage searchFor(String text) {
        inputQuery.val(text).pressEnter();
        return page(GoogleSearchPage.class);
    }

    public String getInputQueryAttribute(String attr) {
        return inputQuery.getAttribute(attr);
    }

    public String getInputQueryText() {
        return inputQuery.getValue();
    }

}
