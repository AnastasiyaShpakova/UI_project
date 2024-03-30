# Проект по автоматизации тестирования для маркетплейса «Wildberries»

## Технологии и инструменты

<p  align="center">

<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/icons/Idea.svg"></a>
<a href="https://www.java.com/"><img width="5%" title="Java" src="media/icons/Java.svg"></a>
<a href="https://selenide.org/"><img width="5%" title="Selenide" src="media/icons/Selenide.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/icons/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="Junit5" src="media/icons/Junit5.svg"></a>
<a href="https://selenoid.autotests.cloud/"><img width="5%" title="Selenoid" src="media/icons/Selenoid.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="media/icons/GitHub.svg"></a>
<a href="https://allurereport.org/"><img width="5%" title="Allure Report" src="media/icons/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/icons/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/icons/Jenkins.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/icons/Jira.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/icons/Telegram.svg"></a>
</p>

### Автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.

- Gradle — используется как инструмент автоматизации сборки.
- Jenkins — CI/CD для удаленного запуска тестов.
- Selenoid — для удаленного запуска браузеров в Docker-контейнерах.
- Allure TestOps - как система управления тестированием.
- Telegram Bot — для уведомлений о результатах прохождения тестов.
- По итогу прохождения автотестов генерируется Allure отчет. Содержание отчета:
    - Шаги теста
    - Скриншот страницы на последнем шаге
    - Исходный код страницы в браузере
    - Логи консоли браузера
    - Видео выполнения автотеста

## Список проверок, реализованных в автотестах

- [x] Проверка содержания бокового меню
- [x] Отображение всплывающей подсказки при наведение на кнопку Фотоаппарата
- [x] Проверка содержания заголовка сайта
- [x] Для проверки отображения валюты применены параметризованные тесты
- [x] Соответсвие результатов поиска данным ввода (применены параметризованные тесты)
- [x] Проверка открытия формы входа при нажатии на иконку 'Войти' на главной странице
- [x] Проверка открытия сервисной страницы на вкладке Доставка при нажатии на иконку 'Адрес' на главной странице


## Список проверок, реализованных в ручных тестах

- [x] Проверка атрибутов в карточке товара

## Запуск тестов
### Локальный запуск тестов

Для запуска следует открыть IntelliJ IDEA и выполнить в терминале:
```
gradle clean test
```

или

```
gradle clean test -Denv=local
```

### Удаленный запуск тестов
Тесты можно запустить из терминала IntelliJ IDEA, а выполнены они будут в удаленно запущенном браузере в Docker-контейнере Selenoid:

```
gradle clean test -Denv=remote
```

Параметры, которыми можно управлять:
```
-DbrowserName - наименование браузера. По умолчанию chrome
-DbrowserVersion - номер версии браузера. По умолчанию 100.0
-DbrowserSize - размер окна браузера. По умолчанию 1980x1080
-DremoteUrl - адрес удаленного сервера, на котором будут запускаться тесты
```

### Сборка тестов в  Jenkins

>Для запуска сборки необходимо перейти в раздел `Build with Parameters` и нажать кнопку `Build`
> 
