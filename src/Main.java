public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задание 1");

        int amountPurpose = 2_459_000;
        int invest = 15_000;
        float sumInvest = 0;
        int month = 0;
        float monthPercent = 0.01f;

        while (sumInvest <= amountPurpose) {
            month = month + 1;
            sumInvest += invest + sumInvest * monthPercent;

            System.out.println();
            System.out.printf("Месяц %d, сумма накоплений равна %.2f ", month, sumInvest);

        }
    }


    public static void task2() {
        System.out.println("Задание 2");

        int numbers = 1;
        while (numbers <= 10) {
            numbers++;
            System.out.printf(numbers + " ");
        }
        System.out.println();

        for (int n = 10; n > 0; n--) {
            System.out.printf(n + " ");

        }
    }

    public static void task3() {
        System.out.println("Задание 3");

        int populationCity = 12_000_000;
        double birthPopulation = (double) 17 / 1000;
        double deathPopulation = (double) 8 / 1000;

        for (int year = 1; year < 11; year++) {
            populationCity = (int) (populationCity + (populationCity * birthPopulation) - (populationCity * deathPopulation));

            System.out.printf("Год %d, численность населения составляет %d %n", year, populationCity);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        int totalAmount = 12_000_000;
        int initialAmount = 15_000;
        int month = 0;
        double monthPercent = 0.07f;


        while (initialAmount <= totalAmount) {
            initialAmount += initialAmount * monthPercent;
            month++;


            System.out.println();
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей ", month, initialAmount);
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        int totalAmount = 12_000_000;
        int initialAmount = 15_000;
        int month = 0;
        double monthPercent = 0.07f;

        while (initialAmount <= totalAmount) {
            initialAmount += initialAmount * monthPercent;

            month++;
            if (month % 6 == 0) {


                System.out.println();
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей ", month, initialAmount);
            }
        }
    }


    public static void task6() {
        System.out.println("Задание 6");

        int totalAmount = 12_000_000;
        int initialAmount = 15_000;
        int month = 0;
        double monthPercent = 0.07f;
        int monthsSave = 9 * 12;

        while (month <= monthsSave) {
            initialAmount += initialAmount * monthPercent;
            month++;

            if (month % 6 == 0) {

                System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n ", month, initialAmount);
            }
        }
    }

    public static void task7() {
        System.out.println("Задание 7");

        int friday = 7;
        int month = 31;
        while (friday <= month) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", friday);
            friday += 7;

        }
    }

    public static void task8() {
        System.out.println("Задание 8");

        int nowYear = 2023;
        int startYear = nowYear - 200;
        int endYear = nowYear + 100;


        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {

                System.out.println(year);
            }
        }
    }
}