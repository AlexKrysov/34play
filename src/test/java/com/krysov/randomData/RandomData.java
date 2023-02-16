package com.krysov.randomData;

import com.codeborne.selenide.SelenideElement;
import com.krysov.pages.AuthorizationPage;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class RandomData {

    public static Faker faker = new Faker();

    private SelenideElement
            loginInput = $("[name='login']"),
            passwordInput = $("[name='password']"),
            authorizationButton = $(".submit");

    private String login = "krysov-95@mail.ru";
    private String randomLogin = faker.internet().emailAddress();
    private String password = "28s46e37r19IA";
    private String randomPassword = faker.internet().password();

    public void getLogin() {
        step("Ввод валидного логина", () -> {
            loginInput.setValue(login);
        });
    }

    public void getRandomLogin() {
        step("Ввод невалидного логина", () -> {
            loginInput.setValue(randomLogin);
        });
    }

    public void getPassword() {
        step("Ввод валидного пароля", () -> {
            passwordInput.setValue(password);
        });
    }

    public void getRandomPassword() {
        step("Ввод валидного пароля", () -> {
            passwordInput.setValue(randomPassword);
        });
    }
}
