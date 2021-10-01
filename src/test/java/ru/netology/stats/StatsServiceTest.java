package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

   //1
    @Test
    void ShouldCalculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    //2
    @Test
    void ShouldfindAvrSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvrSum(sales);

        assertEquals(expected, actual);
    }

    //3
    @Test
    void ShouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSales(sales);

        assertEquals(expected, actual);
    }

    //4
        @Test
        void ShouldFindMinSales() {
            StatsService service = new StatsService();

            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 9;

            int actual = service.findMinSales(sales);

            assertEquals(expected, actual);
}
    //5
    @Test
    void ShouldmonthsMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsMinSales(sales);

        assertEquals(expected, actual);
    }

    //6
    @Test
    void ShouldmonthsMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsMaxSales(sales);

        assertEquals(expected, actual);
    }

}