package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ServicesPage {

    private final SelenideElement
            chapterTitle = $(".free-shipping-banner");

    @Step("Проверка названия раздела")
    public ServicesPage checkChapterTitle(String value) {
        chapterTitle.shouldHave(text(value));
        return this;
    }
}
