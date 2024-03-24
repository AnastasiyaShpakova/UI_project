package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement
            authForm = $("#spaAuthForm");
    @Step("Проверка содежания формы авторизации")
    public LoginPage checkAuthForm(String value) {
        authForm.shouldHave(text(value));
        return this;
    }
}
