package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class ItemPage {

    private SelenideElement
            topPanel = $("._ws", 0),
            tshirt = $(".subnav__list", 0).$(byText("Футболки")),
            tshirt3199 = $("[data-product-id='3199']"),
            sizeS = $("[data-total='2']"),
            addToBasket = $("[data-txt='Положить в корзину']"),
            basket = $(".cart"),
            delete = $("._del_row", 1),
            deleteButton = $("._btn_.actionAccept");

    public void setAddToBasket () {
        step("Добавление товара в корзину", () -> {
            topPanel.click();
            tshirt.click();
            tshirt3199.click();
            sizeS.click();
            addToBasket.click();
        });
    }

    public void setDeleteFromBasket () {
        step("Удаление товара из корзины", () -> {
            basket.click();
            delete.click();
            sleep(5000);
            deleteButton.click();
        });
    }
}
