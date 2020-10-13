package ui.pages;

import com.codeborne.selenide.Selenide;
import lombok.Getter;
import ui.widget.GoogleSearchWidget;

public class GoogleMainPage {

    private final static String BASE_URL_TEMPLATE = "https://www.google.com/?hl=%s";

    @Getter
    private final GoogleSearchWidget googleSearchWidget;

    public GoogleMainPage() {
        this.googleSearchWidget = new GoogleSearchWidget();
    }

    public GoogleMainPage open(String hl) {
        String url = String.format(BASE_URL_TEMPLATE, hl);
        Selenide.open(url);
        return this;
    }
}
