package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIfAllEquals() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 10, 10, 10, 10, 10, 10};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIfAll13ButOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {13, 13, 13, 13, 13, 17, 13};
        long expected = 17;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
