package ru.valiullin.task4;
import java.util.Scanner; //импорт класса

//todo Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый член арифметической прогрессии: ");
        double firstArifMem = 0;
        if(scanner.hasNextDouble()){
            firstArifMem = scanner.nextDouble();
            //System.out.println(firstArifMem);
        } else {
            System.out.println("Введите число!");
        }
        System.out.print("Введите количество шагов (целое число) арифметической прогрессии: ");
        int stepArifProg = 0; //Почему можно не инициализировать переменную?
        if(scanner.hasNextInt()) {
            stepArifProg = scanner.nextInt();
            //System.out.println(stepArifProg);
        } else {
            System.out.println("Введите шаговое число!");
            return;
        }
        System.out.print("Введите разность арифметической прогрессии: ");
        double arifProgDiff = 0;
        if(scanner.hasNextDouble()) {
            arifProgDiff = scanner.nextDouble();
            //System.out.println(arifProgDiff);
        } else {
            System.out.println("Введите число!");
        }
        for(int i = 0; i < stepArifProg; i++) {
            System.out.println(firstArifMem);
            firstArifMem = firstArifMem + arifProgDiff;
        }

        //с геометрической прогрессией будет то же самое, нужно будет изменить разность ариф. прог. на знаменатель геом.
        // прог. с изменением типа на double. В цикле формула будет firstMem = firstfMem * progDenom;

    }
}
