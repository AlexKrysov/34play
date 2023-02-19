package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import com.krysov.pages.*;
import com.krysov.randomData.RandomData;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;

public class TestBase {
    Open34playPage open34play = new Open34playPage();
    AuthorizationPage authorization = new AuthorizationPage();
    ConfirmPage confirmPage = new ConfirmPage();
    CheckPage checkPage = new CheckPage();
    ItemPage itemPage = new ItemPage();
    NavigatioPage navigatioPage = new NavigatioPage();
    RandomData randomData = new RandomData();

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.remote = System.getProperty("selenoidUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        Configuration.baseUrl = "https://www.34play.me/";
        Configuration.timeout = 10000;
        holdBrowserOpen = true;
    }
}
