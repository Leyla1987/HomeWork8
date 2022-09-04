public class Main {

    public static void main (String[] args){

        //Задание 1
    int year = 2024;
    int clientOS = 1;
    int diliveryDistance = 60;
    int days = calculateDiliveryTime(diliveryDistance);
    printMessageDiliveryDays(days);
    printMessageVersionRecomendation(clientOS, year);
    printMessageLeapYear(isLeap(year), year);
    }
    public static boolean isLeap(int year){
        return  (year % 4 == 0 && year % 100 !=0 || year % 400 ==0);
    }
    public static void printMessageLeapYear(boolean isLeap, int year) {
        if(isLeap) {
            System.out.printf("%s год является высокосным", year);
        }else {
            System.out.printf("%s год не является высокосным", year);
        }

        //Задание 2

    }
    public static  void printMessageVersionRecomendation(int clientOS, int year){
        if (clientOS != 0 && clientOS != 1 || year < 2000) {
            throw new IllegalAccessException("Переданы неверные параметры");
        }
        String message = ("Установите обычную версию приложения для Android");
        if (clientOS == 0)message =  message.replace("Android", "IOS");
        if(year<2015) message = message.replace("обычную", "лайт");
        System.out.println(message);
    }

    //Задание 3

public static int calculateDiliveryTime (int distance) {
        if ( distance > 10 && distance < 20) {
            return 1;
        } else if (distance >= 20 && distance <60) {
            return 2;
        } else if (distance >= 60 && distance <100) {
            return 3;
        } else {
            throw new IllegalAccessException("Доставка на это расстояние не доступна");
            }
        }
        public static void printMessageDiliveryDays(int days){
            System.out.printf("%s дней потребуется для доставки", days);
        }
}

