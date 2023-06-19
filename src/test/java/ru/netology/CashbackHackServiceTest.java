package ru.netology;

import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CashbackHackServiceTest {

    // Тесты JUnit 4
    @org.junit.Test
    public void testShouldRemainIfAmountLess1000() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 100;
        // проверка фактического и ожидаемого
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testShouldRemainIfAmountEquals0() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 1_000;
        // проверка фактического и ожидаемого
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testShouldNotRemainIfAmountEqual1000() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 0;
        // проверка фактического и ожидаемого
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testShouldNotRemainIfAmountMore1000() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 0;
        // проверка фактического и ожидаемого
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testShouldThrowExceptionIfAmountLess0() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        // выполнение целевых действий
        service.remain(amount);

    }

    // Тесты JUnit Jupiter
    @org.junit.jupiter.api.Test
    @DisplayName("Should remain if amount less than 1000")
    public void shouldRemainIfAmountLess1000Jupiter() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 100;
        // проверка фактического и ожидаемого
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Should remain if amount equals 0")
    public void shouldRemainIfAmountEquals0Jupiter() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 1_000;
        // проверка фактического и ожидаемого
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Should not remain if amount equal to 1000")
    public void shouldNotRemainIfAmountEqual1000Jupiter() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 0;
        // проверка фактического и ожидаемого
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Should not remain if amount more than 1000")
    public void shouldNotRemainIfAmountMore1000Jupiter() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;
        // выполнение целевых действий
        int actual = service.remain(amount);
        int expected = 0;
        // проверка фактического и ожидаемого
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Should throw exception if amount less than 0")
    public void shouldThrowExceptionIfAmountLess0Jupiter() {
        // подготовка тестовых данных
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        // проверка выбрасывания исключения
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.remain(amount);
        });
    }
    }
