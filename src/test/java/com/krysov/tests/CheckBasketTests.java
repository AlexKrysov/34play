package com.krysov.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Basket")
public class CheckBasketTests extends TestBase{

//    @Tag("Basket")
    @DisplayName("Проверка наличия товара в корзине, после добавления")
    @Test
    void checkingItemsInBasket () {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        itemPage.setAddToBasket();
        navigatioPage.stepToBasket();
        checkPage.checkItem();
        itemPage.setDeleteFromBasket();
    }
    @DisplayName("Проверка общей суммы товаров в корзине, после добавления")
    @Test
    void checkingTotalSumInBasket () {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        itemPage.setAddToBasket();
        navigatioPage.stepToBasket();
        checkPage.checkTotalSum();
        itemPage.setDeleteFromBasket();
    }
    @DisplayName("Проверка отсутсвия товаров в корзине, после удаления позиций")
    @Test
    void checkingEmptyBasketAfterDeletion () {
        open34play.open34play();
        confirmPage.confirmAge();
        confirmPage.confirmRegion();
        authorization.authorization();
        itemPage.setAddToBasket();
        navigatioPage.stepToBasket();
        checkPage.checkItem();
        itemPage.setDeleteFromBasket();
        checkPage.checkEmptyBasket();
    }
}
