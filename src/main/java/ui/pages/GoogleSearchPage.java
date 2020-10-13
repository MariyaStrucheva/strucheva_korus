package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;
import org.openqa.selenium.By;
import ui.widget.GoogleSearchWidget;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchPage {

    @Getter
    private final GoogleSearchWidget googleSearchWidget;

    public GoogleSearchPage() {
        this.googleSearchWidget = new GoogleSearchWidget();
    }

    public ElementsCollection getResults() {
        return $$(".g");
    }

    public GoogleMainPage returnToMainPage() {
        $(By.id("logo")).click();
        return page(GoogleMainPage.class);
    }
}
