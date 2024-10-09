import java.time.LocalDate;

public class Main {

    //Methods for Task 1
    public static void leapYear(int year) {
        if (year % 4 == 0) {
            printLeapYear(year);
        } else if (year % 100 == 0) {
            printNotLeapYear(year);
        } else if (year % 400 == 0) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }

    public static void printLeapYear(int year) {
        System.out.println(year + " год является високосным");
    }

    public static void printNotLeapYear(int year) {
        System.out.println(year + " год не является високосным");
    }


    //Methods for Task 2
    public static void yourPhone(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            printVerdictNewIos();
        } else if (clientOS == 0) {
            printVerdictOldIos();
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            printVerdictNewAndroid();
        } else if (clientOS == 1) {
            printVerdictOldAndroid();
        } else {
            System.out.println("Не удалось определить Вашу операционную систему");
        }
    }

    public static void printVerdictNewIos() {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }

    public static void printVerdictOldIos() {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void printVerdictNewAndroid() {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void printVerdictOldAndroid() {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }


    //Methods for Task 3
    public static void checkDistance(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = deliveryTime + 1;
            printDaysCount(deliveryDistance, deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 2;
            printDaysCount(deliveryDistance, deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
            printDaysCount(deliveryDistance, deliveryTime);
        } else {
            printDaysCount(deliveryDistance, deliveryTime);
        }
    }

    public static void printDaysCount(int deliveryDistance, int deliveryTime) {
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }


    //These are my old Tasks (updated)
    public static void main(String[] args) {
        System.out.println("Домашнее задание №11");

        //Task 1
        System.out.println("\nЗадание №1:");
        int year = LocalDate.now().getYear(); // Проверял и с другими годами, работает
        leapYear(year); //Method for Task 1


        //Task 2
        System.out.println("\nЗадание №2:");
        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear(); // Проверял и с другими годами, работает
        yourPhone(clientOS, clientDeviceYear); //Method for Task 2


        //Task 3
        System.out.println("\nЗадание №3:");
        int deliveryDistance = 95;
        checkDistance(deliveryDistance); //Method for Task 3


    }
}