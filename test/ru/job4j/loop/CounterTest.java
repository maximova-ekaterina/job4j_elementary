package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void sumByEven() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEventwo() {
        int start = 6;
        int finish = 20;
        int result = Counter.sumByEven(6, 20);
        int expected = 104;
        Assert.assertEquals(expected, result);
    }
}