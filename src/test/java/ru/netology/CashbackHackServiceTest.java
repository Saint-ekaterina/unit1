package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldHowMuchBuyIfPurchaseLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchBuyIfPurchase0() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1_000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchBuyIfPurchase1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1_000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchBuyIfPurchaseMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1_300;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
