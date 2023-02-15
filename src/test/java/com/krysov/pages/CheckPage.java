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
            personalAccount = $(".account__data-form-wrap.js-account-fio");

    public void checkPersonalAccount() {
        step("Проверка имени и фамилии в личном кабинете", () -> {
            personalAccountButton.click();
            personalAccount.shouldHave(text("Krysov  Alex"));
        });
    }
}
