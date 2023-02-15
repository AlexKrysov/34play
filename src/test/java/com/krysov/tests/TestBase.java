package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import com.krysov.pages.AuthorizationPage;
import com.krysov.pages.CheckPage;
import com.krysov.pages.ConfirmPage;
import com.krysov.pages.Open34playPage;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.holdBrowserOpen;

public class TestBase {
    Open34playPage open34play = new Open34playPage();
    AuthorizationPage authorization = new AuthorizationPage();
    ConfirmPage confirmPage = new ConfirmPage();
    CheckPage checkPage = new CheckPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        holdBrowserOpen = true;
    }
}
