package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    void calculateSumSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateSum(purchases);
        int expected = 180;
        assertEquals( expected, actual);
        //    Сумма всех продаж
    }
    @Test
    void AverageSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateAverageSum(purchases);
        int expected = 15;
        assertEquals(expected, actual);
//        Средняя сумма продаж в месяц
    }

    @Test
    void MaxSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateMaxSales(purchases);
        int expected = 8;
        assertEquals(expected, actual);
//        Номер месяца, в котором был пик продаж

    }

    @Test
    void MinSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateMinSales(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void UnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateUnderAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void OverAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateOverAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}