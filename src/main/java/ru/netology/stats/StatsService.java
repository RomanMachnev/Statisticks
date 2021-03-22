package ru.netology.stats;

public class StatsService {
    public static int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum = sum + purchase;

        }
        return sum;
    }

    public static int calculateAverageSum(int[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    public static int calculateMaxSales(int[] purchases) {
        int max = purchases[0];
        int month = 0;
        int maxMonth = 0;
        for (int purchase : purchases) {
            month++;
            if (max <= purchase) {
                max = purchase;
                maxMonth = month;

            }
        }
        return maxMonth;
    }
    public static int calculateMinSales(int[] purchases) {
        int min = purchases[0];
        int month = 0;
        int minMonth = 0;
        for (int purchase : purchases) {
            month++;
            if (min >= purchase) {
                minMonth = month;
            }
        }
        return minMonth;
    }

    public static int calculateUnderAverage(int[] purchases) {
        int averageSum = calculateAverageSum(purchases);
        int month = 0;
        int underMonth = 0;
        for (int purchase : purchases) {
            if (purchase < averageSum) {
                month++;
                underMonth = month;
            }
        }
        return underMonth;
    }
    public static int calculateOverAverage(int[] purchases) {
        int averageSum = calculateAverageSum(purchases);
        int month = 0;
        int overMonth = 0;
        for (int purchase : purchases) {
            if (purchase > averageSum) {
                month++;
                overMonth = month;
            }
        }
        return overMonth;
    }
}
