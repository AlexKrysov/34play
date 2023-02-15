package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AuthorizationPage {

    private SelenideElement
            loginInput = $("[name='login']"),
            passwordInput = $("[name='password']"),
            authorizationButton = $(".submit");
    private String login = "krysov-95@mail.ru";
    private String password = "28s46e37r19IA";

    public AuthorizationPage authorization() {
        step("Авторизация", () -> {
            $("[data-action=userLogin]").click();
            loginInput.setValue(login);
            passwordInput.setValue(password);
            authorizationButton.click();
        });
        return this;
    }
}