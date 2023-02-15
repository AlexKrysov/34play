package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Open34playPage {

    private final String ShopUrl = "https://www.34play.me/";

    public Open34playPage open34play() {
        step("Открыть страницу", () ->
                open(ShopUrl));
        return this;
    }
}
