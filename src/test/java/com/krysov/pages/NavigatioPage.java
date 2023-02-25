package com.krysov.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigatioPage {

    private SelenideElement
            basket = $(".cart"),
            authorizationButton = $(".submit"),
            enterButton = $("[data-action=userLogin]");

    public void stepToBasket() {
        step("Переход в корзину", () -> {
            basket.click();
        });
    }

    public void clickInputButton() {
        step("Клик на кнопку ВОЙТИ", () -> {
            authorizationButton.click();
        });
    }

    public void clickEnterButton() {
        step("Клик на кнопку ВХОД", () -> {
            enterButton.click();
        });
    }
    public void clearBrowser() {
        step("Очистить браузер", () -> {
            Selenide.clearBrowserCookies();;
        });
    }
}
