public class Main {
    public static void main(String[] args) {
        //task1
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }
        //task2
        byte clientOSNew = 0;
        int clientDeviceYear = 2013;
        if (clientOSNew == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке ");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ");
            }
        }
        if (clientOSNew == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        //task3
        int year = 2021;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("введите год больше 1584.");
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
            System.out.println("Доставки нет!");
            }
        //task5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет!");

        }
        }
    }

