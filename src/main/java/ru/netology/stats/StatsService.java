package ru.netology.stats;

public class StatsService {
//1.Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }
//2.Средняя сумма продаж
    public int findAvrSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

//3.Номер месяца, в котором был пик продаж
    public int findMaxSales(int[] sales) {
    int maxMonth = 0;
    int month = 0; // переменная для индекса рассматриваемого месяца в массиве
    for (int sale : sales) {
        // sales[maxMonth] - продажи в месяце maxMonth
        // sale - продажи в рассматриваемом месяце
        if (sale >= sales[maxMonth]) {
            maxMonth = month;
        }
        month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
    }
    return maxMonth + 1;
}

    //4.Номер месяца, в котором было минимум продаж
    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5.Кол-во месяцев, в которых продажи были ниже среднего
    public int monthsMinSales(int[] sales) {
        int months = 0;
        int a = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < a) {
                months++;
            }
        }
        return months;
    }

    //6.Кол-во месяцев, в которых продажи были выше среднего
    public int monthsMaxSales(int[] sales) {
        int months = 0;
        int a = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > a) {
                months++;
            }
        }
        return months;
    }

}
