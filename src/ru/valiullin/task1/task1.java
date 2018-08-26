package ru.valiullin.task1;
import java.util.Scanner; //импорт класса

// TODO Написать программу для поиска минимального из двух чисел.
public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //first version
        System.out.print("Введите количвество цифр ддя проверки: ");
        if(scanner.hasNextInt()){
            int a = scanner.nextInt(); // переменная для размерности массива
            int[] numbers = new int[a];
            System.out.println("Введите целые числа для поиска минимального значения:");
            for (int i = 0;i < numbers.length; i++) {
                System.out.print("Цифра в " + i + "-ом значении: ");
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                } else {
                    System.out.println("Введите целое числовое значение!");
                    return;
                }
            }
            int minNum = numbers[0]; //перенная для сохранения минимального значения
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] < minNum) {
                    minNum = numbers[i];
                }
            }
            System.out.println("Минимальное значение: " + minNum);
        } else {
            System.out.println("Введите число!");
            return;
        }
//------------------------------------------------------------------------
        //Ввод данных с разделителем
/*        String minValue[] = ;
        System.out.print("Введите значения через пробел: ");
        String str = new String(scanner.nextLine());
        str = str.trim(); //обрезаем пробелы
        String arrayStr[] = str.split(" ");
        for (int i = 0; i < arrayStr.length; i++) {
            //arrayStr[i] = arrayStr[i].replaceAll();
            System.out.println(i +" "+ arrayStr[i]);
            if(arrayStr[i] < minValue) {

            }
        }*/
    }
}