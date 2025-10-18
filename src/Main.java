import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        byte age = scanner.nextByte();
        if (age >= 18) {
            System.out.println("человеку 18 или больше лет.");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }
        {
            System.out.println("задача 1 второй способ");
        }
        System.out.println("Сколько вам лет?");
        byte age2 = scanner.nextByte();
        boolean age3 = age2 >= 18;
        if (age3) {
            System.out.println("человеку 18 или больше лет.");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }
        System.out.println("задача 2 ");
        System.out.println("Введите температуру воздуха");
        byte airTemperature = scanner.nextByte();
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("задача 3 ");
        System.out.println("Введите скорость транспорта");
        byte vehicleSpeed = scanner.nextByte();
        if (vehicleSpeed <= 60) {
            System.out.println("Если скорость " + vehicleSpeed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость  " + vehicleSpeed + ", то придется заплатить штраф");
        }
        System.out.println("задача 4 ");
        System.out.println("Введите возраст человека");
        byte agePerson = scanner.nextByte();
        if (agePerson <= 6 && agePerson >= 2) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        } else if (agePerson <= 17 && agePerson >= 7) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        } else if (agePerson <= 24 && agePerson >= 18) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу");
        }
        System.out.println("задача 5 ");
        System.out.println("Введите возраст ребенка");
        byte childAge = scanner.nextByte();
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
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
