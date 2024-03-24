package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartPage {

    private final SelenideElement
            currency = $(".profile-menu__currency");
    private final SelenideElement setCurrency = $(".popup__content");
    private final SelenideElement search = $("#searchInput");
    private final SelenideElement buttonMenu = $("[data-wba-header-name = Catalog]");
    private final SelenideElement menuList = $(".menu-burger__main-list");
    private final SelenideElement title = $(".header__top");
    private final SelenideElement currencyInCard = $(".product-card__wrapper");
    private final SelenideElement searchForPhoto = $("#searchByImageContainer");
    private final SelenideElement pointLogin = $("[data-wba-header-name=Login]");
    private final SelenideElement banners = $(".swiper-container");
    private final SelenideElement iconAddress = $("[data-wba-header-name=Pick_up_points]");

    @Step("Открыть страницу")
    public StartPage openPage() {
        open("/");
        banners.should(exist);
        return this;
    }

    @Step("Ввести в поле поиска слово {value}")
    public StartPage inputSearch(String value) {
        search.setValue(value).pressEnter();
        return this;
    }

    @Step("Выбрать валюту")
    public StartPage setCurrency(String value) {
        pointLogin.hover();
        currency.click();
        setCurrency.$(byText(value)).click();
        return this;
    }

    @Step("Проверка отображаемой валюты")
    public StartPage checkCurrency(String value) {
        currencyInCard.shouldHave(text(value));
        return this;
    }

    @Step("Проверка текста в заголовке страницы")
    public StartPage checkTitle(String value) {
        title.shouldHave(text(value));
        return this;
    }

    @Step("Проверка всплывающего текста, при наведении на значок фотоаппарата")
    public StartPage checkForPhoto(String value) {
        searchForPhoto.hover().shouldHave(text(value));
        return this;
    }

    @Step("Нажать на кнопку 'Бургер-меню'")
    public StartPage clickButtonMenu() {
        buttonMenu.click();
        return this;
    }

    @Step("Проверка разделов в боковом меню")
    public StartPage checkMenuList(String value) {
        menuList.shouldHave(text(value));
        return this;
    }

    @Step("Нажать на кнопку 'Адрес'")
    public StartPage clickAddress() {
        iconAddress.click();
        return this;
    }

    @Step("Нажать на кнопку 'Войти'")
    public StartPage clickLogin() {
        pointLogin.click();
        return this;
    }

}
