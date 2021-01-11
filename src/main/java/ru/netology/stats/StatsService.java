package ru.netology.stats;

public class StatsService {
    public int calculateSum (int [] sales) {
    int sum = 0;
    for (int sale: sales) {
        sum += sale;
    }
    return (sum);
}

    public int calculateAverage (int [] sales) {
        int calculateSum = calculateSum (sales);
        return (calculateSum / sales.length);
        }

    public int calculateMonthIndexWithMaxSales (int [] sales) {

        int max = sales [0];
        for (int sale: sales) {
            if (max < sale) {
                max = sale;
            }
        }

        int monthIndex = 0;
        int monthWithMax = 0;
        for (int sale: sales) {
            monthIndex += 1;
            if (sale == max) {
                monthWithMax = monthIndex;
            }
        }
        return (monthWithMax);
    }

    public int calculateMonthIndexWithMinSales (int [] sales) {

        int min = sales [0];
        for (int sale: sales) {
            if (min > sale) {
                min = sale;
            }
        }

        int monthIndex = 0;
        int monthWithMin = 0;
        for (int sale: sales) {
            monthIndex += 1;
            if (sale == min) {
                monthWithMin = monthIndex;
            }
        }
        return (monthWithMin);
    }

    public int calculateMonthCountUnderAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int sale: sales) {
            if (sale < average) {
                count+=1;
            }
        }
        return (count);
    }

    public int calculateMonthCountOverAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int sale: sales) {
            if (sale > average) {
                count+=1;
            }
        }
        return (count);
    }
}
