package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultSearchPage {

    private final SelenideElement
            currencyInCard = $(".product-card-list");

    @Step("Проверка результатов поиска")
    public ResultSearchPage checkSearch(String value) {
        currencyInCard.shouldHave(text(value));
        return this;
    }
}
