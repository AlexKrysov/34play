package com.krysov.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class LoginTests extends TestBase{

    @Tag("Authorization")
    @DisplayName("Проверка входа, после ввода валидного логина и пароля")
    @Test
    void authorizationWithValidData() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        checkPage.checkPersonalAccount();
        navigatioPage.closeWebDriver();
    }

    @Tag("Authorization")
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
        navigatioPage.closeWebDriver();
    }

    @Tag("Authorization")
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
        navigatioPage.closeWebDriver();
    }

    @Tag("Authorization")
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
        navigatioPage.closeWebDriver();
    }
}
