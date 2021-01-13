package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private StatsService service = new StatsService();

    @Test
    void shoudCalculateSum() {
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateAverage() {
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateMonthIndexWithMaxSales() {
        int expected = 8;
        int actual = service.calculateMonthIndexWithMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateMonthIndexWithMinSales() {
        int expected = 9;
        int actual = service.calculateMonthIndexWithMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateMonthCountUnderAverage() {
        int expected = 5;
        int actual = service.calculateMonthCountUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateMonthCountOverAverage() {
        int expected = 5;
        int actual = service.calculateMonthCountOverAverage(sales);
        assertEquals(expected, actual);
    }
}