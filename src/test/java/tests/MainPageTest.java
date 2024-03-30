package tests;

import data.TestData;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ServicesPage;
import pages.StartPage;

public class MainPageTest extends TestBase{
    StartPage startPage = new StartPage();
    TestData data = new TestData();
    ServicesPage servicesPage = new ServicesPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Проверка содержания заголовка сайта")
    @Feature("Главная страница")
    @Tag("MainPage")
    void checkTitleTest() {
        startPage.openPage();
        startPage.checkTitle(data.title);
    }

    @Test
    @Feature("Главная страница")
    @DisplayName("Отображение всплывающей подсказки при наведении на кнопку Фотоаппарата")
    @Tag("MainPage")
    void checkTooltipTest() {
        startPage.openPage()
                .checkForPhoto(data.searchForPhotoText);
    }

    @Test
    @Feature("Главная страница")
    @DisplayName("Проверка содержания бокового меню")
    @Tag("MainPage")
    void checkBurgerMenuTest() {
        startPage.openPage();
        startPage.clickButtonMenu();
        startPage.checkMenuList(data.menuList);
    }

    @Test
    @DisplayName("Проверка открытия сервисной страницы на вкладке Доставка при нажатии на иконку 'Адрес' на главной странице")
    @Feature("Главная страница")
    @Tag("MainPage")
    void checkChapterTitleTest() {
        startPage.openPage();
        startPage.clickAddress();
        servicesPage.checkChapterTitle(data.delivery);
    }

    @Test
    @DisplayName("Проверка открытия формы входа при нажатии на иконку 'Войти' на главной странице")
    @Feature("Главная страница")
    @Tag("MainPage")
    void checkOpenLoginTest() {
        startPage.openPage();
        startPage.clickLogin();
        loginPage.checkAuthForm(data.authForm);
    }
}
