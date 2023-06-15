package ru.netology;

/*
 * Подробнее: кешбек начисляется за каждую потраченную полную тысячу рублей,
 * поэтому, если вы покупаете что-то на 900 рублей, сервис должен посоветовать
 * вам докупить ещё чего-нибудь на 100 рублей.
 */
public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
