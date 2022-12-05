public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа по теме - циклы");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i ++){
            System.out.println("число " + i);
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i --) {
            System.out.println("число " + i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i ++) {
            if (i % 2 == 0) {
                System.out.println("четное число " + i);
            }
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i --) {
            System.out.println("число " + i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2097; i ++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("число " + i);
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 2; i < 513; i = i * 2) {
            System.out.println("число " + i);
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int savings = 0;
        for (int i = 1; i < 13; i ++) {
            savings = savings + 29000;
            System.out.println("Месяц " + i +" ,сумма накоплений равна " +  savings + " рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i < 13; i ++) {
            total = total + total /100;
            total = total + savings;
            System.out.println("Месяц " + i +" ,сумма накоплений равна " +  total + " рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        int number = 1;
        int previousNumber1 = 0;
        int previousNumber2 = 0;
        System.out.println("Последовательность Фибоначчи");
        for (int i = 1; i < 12; i ++) {
            System.out.println(number);
            previousNumber2 = previousNumber1;
            previousNumber1 = number;
            number = previousNumber1 + previousNumber2;
        }
    }
    public static void task11 () {
        System.out.println("Задача 11");
        float savings = 15_000;
        float total = 0;
        int i = 0;
        while (total < 2_459_000){
            total = total + savings;
            total = total + total /100;
            i ++;
            System.out.println("Месяц " + i +" ,сумма накоплений равна " +  total + " рублей");
        }
    }
    public static void task12 () {
        System.out.println("Задача 12");
        int number = 1;
        while (number < 11){
            System.out.print(number + " ");
            number ++;
        }
        System.out.println();
        for (int i = 10; i > 0; i --){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task13 () {
        System.out.println("Задача 13");
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int mortality = population / 1000 *8;
        for (int i = 1; i < 11; i ++){
            population = population + birthRate - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void task14 () {
        System.out.println("Задача 14");
        long savings = 0;
        float deposit = 15_000;
        int i = 0;
        savings = (long) deposit;
        while (savings < 12_000_000){
            savings = savings + savings / 100 * 7;
            i ++;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + savings + " рублей");
        }
    }
    public static void task15 () {
        System.out.println("Задача 15");
        long savings = 0;
        float deposit = 15_000;
        int i = 0;
        savings = (long) deposit;
        while (savings < 12_000_000){
            savings = savings + savings / 100 * 7;
            i ++;
            if (i % 6 ==0) {
                System.out.println("Месяц " + i + " ,сумма накоплений равна " + savings + " рублей");
            }
        }
        System.out.println("Месяц " + i + " ,сумма накоплений равна " + savings + " рублей");
    }
    public static void task16 () {
        System.out.println("Задача 16");
        long savings = 0;
        float deposit = 15_000;
        int month = 1;
        savings = (long) deposit;
        while (month < 109){
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + " ,сумма накоплений равна " + savings + " рублей");
            }
            savings = savings + savings / 100 * 7;
            month ++;
        }
    }
    public static void task17 () {
        System.out.println("Задача 17");
        int ferstFriday = 2;
        for ( int i = 1; i < 32; i++){
            if (i % 7 == ferstFriday){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task18 () {
        System.out.println("Задача 18");
        int year = 2022;
        int yearTo = year - 200;
        int yearAfter = year + 100;
        for ( int i = 0; i < yearAfter; i += 79){
            if (i > yearTo){
                System.out.println(i);
            }
        }
    }
}