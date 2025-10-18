import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        byte refund = scanner.nextByte();
        if (refund >= 18) {
            System.out.println("человеку 18 или больше лет.");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }
        {
            System.out.println("задача 1 второй способ");
        }
        System.out.println("Сколько вам лет?");
        byte refund2 = scanner.nextByte();
        boolean refund3 = refund2 >= 18;
        if (refund3) {
            System.out.println("человеку 18 или больше лет.");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }
        System.out.println("задача 2 ");
        System.out.println("Введите температуру воздуха");
        byte airTemperature = scanner.nextByte();
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }
        if (airTemperature > 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("задача 3 ");
        System.out.println("Введите скорость транспорта");
        byte vehicleSpeed = scanner.nextByte();
        if (vehicleSpeed < 60) {
            System.out.println("Если скорость " + vehicleSpeed + ", то можно ездить спокойно");
        }
        if (vehicleSpeed > 60) {
            System.out.println("Если скорость  " + vehicleSpeed + ", то придется заплатить штраф");
        }
        System.out.println("задача 4 ");
        System.out.println("Введите возраст человека");
        byte agePerson = scanner.nextByte();
        if (agePerson <= 6 && agePerson >= 2) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        }
        if (agePerson <= 24 && agePerson >= 18) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу");
        }
        System.out.println("задача 5 ");
        System.out.println("Введите возраст ребенка");
        byte childAge = scanner.nextByte();
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge < 14 && childAge >= 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождении взрослого");
        }
        System.out.println("задача 6 ");
        System.out.println("Введите количество пассажиров");
        byte numberPassengers = scanner.nextByte();
        if (numberPassengers < 102 && numberPassengers >= 60) {
            System.out.println("В вагоне есть места стоя");
        } else if (numberPassengers < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("Свободных мест нет");
        }
        System.out.println("задача 7 ");
        System.out.println("Введите первое число");
        int one = scanner.nextInt();
        System.out.println("Введите второе число");
        int two = scanner.nextInt();
        System.out.println("Введите третье число");
        int three = scanner.nextInt();
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }
        scanner.close();
    }
}
