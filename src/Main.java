import java.time.LocalDate;

public class Main {

    //These are my old Tasks (updated)
    public static void main(String[] args) {
        System.out.println("Домашнее задание №11");

        //Task 1
        System.out.println("\nЗадание №1:");
        int year = LocalDate.now().getYear(); // Проверял и с другими годами в том числе 100 и 400, работает
        checkYear(year); //Method for Task 1


        //Task 2
        System.out.println("\nЗадание №2:");
        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear(); // Проверял и с другими годами, работает
        checkPhone(clientOS, clientDeviceYear); //Method for Task 2


        //Task 3
        System.out.println("\nЗадание №3:");
        int deliveryDistance = 95;
        checkDistance(deliveryDistance); //Method for Task 3

    }

    //Methods for Task 1
    public static void checkYear(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
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
    public static void checkPhone(int clientOS, int clientDeviceYear) {
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
    public static int checkDistance(int deliveryDistance) {
        int check = 0;
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime++;
            checkDaysCount(deliveryDistance, deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime += 2;
            checkDaysCount(deliveryDistance, deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime += 3;
            checkDaysCount(deliveryDistance, deliveryTime);
        } else {
            checkDaysCount(deliveryDistance, deliveryTime);
        }
        return check;
    }

    public static int checkDaysCount(int deliveryDistance, int deliveryTime) {
        int checkCount = 0;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        return checkCount;
    }


}