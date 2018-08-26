package ru.valiullin.task3;


//todo Написать программу для вывода на экран таблицы умножения. Подсказка нужно использовать цикл в цикле
public class task3 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения:");
        for (int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println("Число "+ i +" умножаем на " +j + " равно " + i*j);
            }
            System.out.println("----------------------");
        }
    }
}
