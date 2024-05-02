public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Упр. № 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println();
        System.out.println("Упр. № 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear <2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        System.out.println();
        System.out.println("Упр. № 3");
        int year = 2023;
        int diffYear = year - 1584;
        int remains = diffYear % 4;
        if (year >= 1584 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584 && year % 100 == 0) {
            System.out.println(year+ " год не является високосным");
        } else if (year >= 1584 && remains != 0){
            System.out.println(year+ " год не является високосным");
        } else if (year < 1584) {
            System.out.println(year+ " год до введен високосного года");
        }

        System.out.println();
        System.out.println("Упр. № 4");
        int deliveryDistance = 104;
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Карта будет доставленна вам в течении " +time+ " суток");
        } else if (deliveryDistance > 20 && 60 >= deliveryDistance) {time += 1;
            System.out.println("Карта будет доставленна вам в течении " +time+ " суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {time += 2;
            System.out.println("Карта будет доставленна вам в течении " +time+ " суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка на растояние " +deliveryDistance+ " невыполняется");
        }

        System.out.println();
        System.out.println("Упр. № 5");
        int monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("Число превышает количество месяцев в году");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println(monthNumber + " месяц относится к зиме");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " месяц относится к весне");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " месяц относится к лету");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " месяц относится к осени");
                    break;
            }
        }
    }
}