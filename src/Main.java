import java.time.LocalDate;

public class Main {
    //Task1
    public static void checkAndPrintYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    //Task2
    public static void checkValidSoftware(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Аndroid по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    //Task3
    public static int checkDeliveryDistance(int deliveryDistance) {
        int deliveryDays=0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            deliveryDays = 2;
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            deliveryDays = 3;
        }

        return deliveryDays;
    }
        //deliveryDays+=deliveryDays;
        /*for (int i = 20; i <= 100; i+=40) {
            deliveryDays+=deliveryDays;
            //int deliveryInterval = 20;
            //deliveryInterval+=40;
            deliveryDays=deliveryDistance/i+1;
        }*/




    public static void main(String[] args) {
        int year = 2022;
        checkAndPrintYear(year);

        int clientOS = 0, clientDeviceYear = 2020;
        //int currentClientOS=1, currentClientDeviceYear=2017;
        checkValidSoftware(clientOS, clientDeviceYear);

        int deliveryDistance = 95;
        int currentDeliveryDistance = checkDeliveryDistance(deliveryDistance);
        System.out.println("Потребуется дней "+ currentDeliveryDistance);

    }
}
