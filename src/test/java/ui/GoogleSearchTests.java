package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.GoogleMainPage;
import ui.pages.GoogleSearchPage;

import static com.codeborne.selenide.Condition.text;

public class GoogleSearchTests extends TestBase {

    @Test
    public void testGoogleSearch() {
        GoogleMainPage googlePage = new GoogleMainPage().open("ru");

        // 1. Поиск по: Названию, ФИО
        GoogleSearchPage searchPage = googlePage.getGoogleSearchWidget()
                .searchFor("Александр Сергеевич Пушкин википедия");
        searchPage.getResults().get(0).shouldHave(text("Пушкин, Александр Сергеевич — Википедия"));

        // 2. При наведении мыши на поле ввода выводится соответствующая всплывающая подсказка
        // Данное поведение определяется атрибутом title: http://htmlbook.ru/html/attr/title
        Assert.assertEquals(searchPage.getGoogleSearchWidget().getInputQueryAttribute("title"), "Поиск",
                "Подсказка для поля ввода");

        // 3. После нажатия на лого в верхней левой части отображается пустая область результатов.
        searchPage.returnToMainPage();
        Assert.assertEquals(searchPage.getResults().size(), 0, "Количество результатов поиска");
        Assert.assertEquals(googlePage.getGoogleSearchWidget().getInputQueryText(), "", "Значение в строке поиска");
    }
}
