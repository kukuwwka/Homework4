package Apples;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        System.out.println("Введите количество яблок");

        String name = scanner.nextLine();
        int value = scanner.nextInt();


        if (value % 10 == 1 && value % 100 != 11) {
            System.out.println(name + " хранит " + value + " яблоко");
        } else if (value % 10 == 2 || value % 10 == 3 || value % 10 == 4) {
            System.out.println(name + " хранит " + value + " яблока");
        }
        else if (value == 0 || value > 5 && value <= 100) {
            System.out.println(name + " хранит " + value + " яблок");
        }
    }
}

/* Пытался импортировать данные из класса App, но ругается на синтаксис или просто не видит название сканера
   Я ещё покумекаю, на данном этапе пока только там
 */
