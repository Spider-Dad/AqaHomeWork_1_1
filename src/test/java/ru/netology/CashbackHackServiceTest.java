package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testShouldRemainIfAmountLess1000() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 100;
        // проверка фактического и ожидаемого
        assertEquals(actual, expected);
    }

    @Test
    public void testShouldRemainIfAmountEquals0() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 1_000;
        // проверка фактического и ожидаемого
        assertEquals(actual, expected);
    }

    @Test
    public void testShouldNotRemainIfAmountEqual1000() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 0;
        // проверка фактического и ожидаемого
        assertEquals(actual, expected);
    }

    @Test
    public void testShouldNotRemainIfAmountMore1000() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 0;
        // проверка фактического и ожидаемого
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testShouldThrowExceptionIfAmountLess0() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        // выполнение целевых действий
        service.remain(amount);
    }

}