public class Main {
    public static void main(String[] args) {
        //Task 1
        byte clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не могу определить вашу ОС");
        }

        //Task 2
        short clientDeviceYear = 2015;
        System.out.println("");
        if (clientOs == 0 && clientDeviceYear > 2015 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите приложение");
        }

        //Task 3
        System.out.println("");
        short year = 2021;
        if (year % 4 == 0 && year >= 1584) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");
        }

        //Task 4
        System.out.println("");
        short deliveryDistance = 95;
        if(deliveryDistance <= 20) {
            byte days = 1;
            System.out.println("Доставка в пределах 20 км занимает дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            byte days = 2;
            System.out.println("Доставка в пределах от 20 км до 60 км км занимает дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            byte days = 3;
            System.out.println("Доставка в пределах 60 км до 100 км занимает дней: " + days);
        } else {
            System.out.println("Доставка в пределах 100 км нет");
        }

        //Task 5
        System.out.println("");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }

    }
}