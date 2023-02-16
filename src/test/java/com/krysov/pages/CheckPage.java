package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement
            personalAccountButton = $(".row1").$(byText("Личный кабинет")),
            personalAccount = $(".account__data-form-wrap.js-account-fio"),
            tshirtTrailhead = $(".cnt"),
            totalSum = $(".sum._rub_.total", 0);

    public void checkPersonalAccount() {
        step("Проверка имени и фамилии в личном кабинете", () -> {
            personalAccountButton.click();
            personalAccount.shouldHave(text("Krysov  Alex"));
        });
    }

    public void checkItem() {
        step("Проверка наличия товара в корзине", () -> {
            tshirtTrailhead.shouldHave(text("Футболка trailhead"));
        });
    }
    public void checkTotalSum() {
        step("Проверка общей суммы", () -> {
            totalSum.shouldHave(text("3 999 "));
        });
    }
}
