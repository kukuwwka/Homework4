package Apples;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner namesc = new Scanner(System.in);
        System.out.println("Введите имя");
        Scanner valuesc = new Scanner(System.in);
        System.out.println("Введите количество яблок");
        String getName = namesc.nextLine();
        int getValue = valuesc.nextInt();

        if (getValue == 0 || getValue > 5 && getValue <= 100) {
            System.out.println(getName + " хранит " + getValue + " яблок");
        }
        if (getValue == 1) {
            System.out.println(getName + " хранит " + getValue + " яблоко");
        }
        if (getValue == 2 || getValue == 3 || getValue == 4) {
            System.out.println(getName + " хранит " + getValue + " яблока");
        }
    }
}
