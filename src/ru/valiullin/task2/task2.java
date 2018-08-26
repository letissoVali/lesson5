package ru.valiullin.task2;
import java.util.Scanner; //импорт класса

//TODO Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода наберите exit.");
        System.out.print("Введите целое число для проверки: ");
        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(number > 0) {
                    System.out.println("Число "+ number + " положительное.");
                } else if (number == 0) {
                    System.out.println("Число "+ number + " нулевое");
                } else {
                    System.out.println("Число "+ number + " отрицательное.");
                }
                if(number%2 == 0) {
                    System.out.println("Число "+ number + " четное.");
                } else {
                    System.out.println("Число "+ number + " не четное.");
                }
                System.out.print("Введите целое число для проверки: ");
                if(scanner.hasNext("exit")) {
                    System.out.println("На выход!");
                    break;
                }
            } else {
                System.out.print("Введите целое числовое значение! ");
                //scanner.next();
            }
        }
    }
}
