package com.krysov.tests;

import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase{

    @Test
    void authorizationWithValidData() {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        checkPage.checkPersonalAccount();
    }
}
