package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigatioPage {

    private SelenideElement
    basket = $(".cart");

    public void stepToBasket() {
        step("Переход в корзину", () -> {
            basket.click();
        });
    }
}
