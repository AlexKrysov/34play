package com.krysov.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase{

    @DisplayName("Проверка входа, после ввода валидного логина и пароля")
    @Test
    void authorizationWithValidData() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        checkPage.checkPersonalAccount();
    }

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
    }

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
    }

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
    }
}
