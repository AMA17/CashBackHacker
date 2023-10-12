package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainSpecifyingAmount () {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainMoreAmount () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainAmount () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);

    }


}
