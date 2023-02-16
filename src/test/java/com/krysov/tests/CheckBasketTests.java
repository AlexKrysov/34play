package com.krysov.tests;

import org.junit.jupiter.api.Test;

public class CheckBasketTests extends TestBase{

    @Test
    void checkingItemsInBasket () {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        itemPage.setAddToBasket();
        checkPage.checkItem();
        checkPage.checkTotalSum();
        itemPage.setDeleteFromBasket();
    }
}
