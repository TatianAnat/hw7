public class Main {
    public static void main(String[] args) {
        //task1
        byte clienOS = 0;
        if (clienOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task2
        byte clienOSNew = 0;
        int clientDeviceYear = 2013;
        if (clienOSNew == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clienOSNew == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //task3
        int year = 2021;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("введите год больше 1584");
        }
        //task4
        int deliveryDistance = 95; //дистанция до клиента
        int deliveryDays = 0;
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 20) {
                deliveryDays = deliveryDays + 1; }
            if (deliveryDistance > 60) {
                    deliveryDays = deliveryDays + 1;}
            if (deliveryDistance <= 100) {
                    deliveryDays = deliveryDays + 1; }
            System.out.println("Потребуется дней " + deliveryDays);
                }
        else {
            System.out.println("Доставки нет");
            }
        }
    }

