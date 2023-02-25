package com.krysov.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class LoginTests extends TestBase {

    @Tag("Authorization")
    @DisplayName("Проверка входа, после ввода валидного логина и пароля")
    @Test
    void authorizationWithValidData() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        checkPage.checkPersonalAccount();
    }

    @Tag("NegativeAuthorization")
    @DisplayName("Проверка ввода валидного логина и невалидного, рандомного пароля")
    @Test
    void authorizationWithRandomLogin() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        navigatioPage.clickEnterButton();
        randomData.getLogin();
        randomData.getRandomPassword();
        navigatioPage.clickInputButton();
        checkPage.checkMessageIncorrectLoginPassword();
    }

    @Tag("NegativeAuthorization")
    @DisplayName("Проверка ввода невалидного, рандомного логина и валидного пароля")
    @Test
    void authorizationWithRandomPassword() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        navigatioPage.clickEnterButton();
        randomData.getRandomLogin();
        randomData.getPassword();
        navigatioPage.clickInputButton();
        checkPage.checkMessageIncorrectLoginPassword();
    }

    @Tag("NegativeAuthorization")
    @DisplayName("Проверка ввода невалидного, рандомного логина и пароля")
    @Test
    void authorizationWithRandomPasswordLogin() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        navigatioPage.clickEnterButton();
        randomData.getRandomLogin();
        randomData.getRandomPassword();
        navigatioPage.clickInputButton();
        checkPage.checkMessageIncorrectLoginPassword();
    }

    @Tag("NegativeAuthorization")
    @CsvSource({
            "qaguru1@mail.ru, 11111",
            "qaguru2@mail.ru, 22222",
            "qaguru3@mail.ru, 33333",
    })
    @ParameterizedTest(name = "Проверка ввода невалидного логина {0} и невалидного пароля: {1}")
    void negativeAuthorization(String email, String password) {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        navigatioPage.clickEnterButton();
        authorization.authForm(email, password);
        navigatioPage.clickInputButton();
        checkPage.checkMessageIncorrectLoginPassword();
    }
}
