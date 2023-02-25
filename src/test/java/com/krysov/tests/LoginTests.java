package com.krysov.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class LoginTests extends TestBase {

    @Tag("Authorization1")
    @DisplayName("Проверка входа, после ввода валидного логина и пароля")
    @Test
    void authorizationWithValidData() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        checkPage.checkPersonalAccount();
        navigatioPage.clearBrowser();
    }

    @Tag("Authorization1")
    @DisplayName("Проверка ввода валидного логина и невалидного пароля")
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
        navigatioPage.clearBrowser();
    }

    @Tag("Authorization1")
    @DisplayName("Проверка ввода невалидного логина и валидного пароля")
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
        navigatioPage.clearBrowser();
    }

    @Tag("Authorization1")
    @DisplayName("Проверка ввода невалидного логина и пароля")
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
        navigatioPage.clearBrowser();
    }

    @Tag("NegativeAuthorization")
    @CsvSource({
            "simple@mail.ru, 123",
            "simple@mail.ru, 1234",
            "simple@mail.ru, 12345",
    })
    @ParameterizedTest(name = "Проверка ввода логина {0} и невалидного пароля: {1}")
    void authorizationWithOwner(String email, String password) {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        navigatioPage.clickEnterButton();
        authorization.authForm(email, password);
        navigatioPage.clickInputButton();
        checkPage.checkMessageIncorrectLoginPassword();
        navigatioPage.clearBrowser();
    }
}
