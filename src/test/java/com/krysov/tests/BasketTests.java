package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BasketTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        holdBrowserOpen = true;
    }

    private SelenideElement
            loginInput = $("[name=login]"),
            passwordInput = $("[name=password]"),
            confirmAuthorizationButton = $(".submit");
    String login = "krysov-95@mail.ru";
    String password = "28s46e37r19IA";

    @Test
    void addToBasket2() {
        open("https://www.34play.me/");
        $(".popup-18__actions").$("[type='submit']").click();
        $("._popup_city--geo-btn").as("Да, верно").click();
        $("[data-action=userLogin]").click();
        loginInput.setValue(login);
        passwordInput.setValue(password);
        confirmAuthorizationButton.click();
        $("._ws", 0).click();
        $(".subnav__list", 0).$(byText("Футболки")).click();
        $("[data-product-id='3199']").click();
        $("[data-total='2']").click();
        $("[data-txt='Положить в корзину']").click();
        $(".cart").click();
        $("._del_row", 1).click();
        sleep(5000);
        $("._btn_.actionAccept").click();
    }
}