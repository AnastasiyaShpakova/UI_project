package tests;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.ResultSearchPage;
import pages.StartPage;

public class SearchTest extends TestBase {

    StartPage startPage = new StartPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @ValueSource(strings = {"Платье", "Шорты", "Крем"})
    @Feature("Страница поиска")
    @DisplayName("Соответствие результатов поиска введенным данным")
    @ParameterizedTest
    @Tag("SearchPage")
    void checkVisibleTest(String word) {
        startPage.openPage();
        startPage.inputSearch(word);
        resultSearchPage.checkSearch(word);

    }

}
