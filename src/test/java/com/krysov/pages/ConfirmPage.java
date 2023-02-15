package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ConfirmPage {

    private SelenideElement
    ageButton = $(".popup-18__actions").$("[type='submit']"),
    regionButton =  $("._popup_city--geo-btn").as("Да, верно");

    public void confirmAge() {
        step("Подтверждение региона", () ->
                ageButton.click());
    }

    public void confirmRegion() {
        step("Подтверждение региона", () ->
                regionButton.click());
    }
}
