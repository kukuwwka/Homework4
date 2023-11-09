package SomeGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] count = {1, 2, 3, 4, 8, 1, 9, 0, 5, 3};
        int value = 9;
        int foundItem = Arrays.binarySearch(count, value);
    }
}

/* Алгоритм:
1. Задаём массив;
2. Задаём переменную 9 - сумма двух стоящих рядом значений индексов в массиве;
3. Метод, ищущий два одинаковых числа, стоящих рядом;
4. Метод, вычёркивающий два значения массива из п.3 и п.4, а так же счётик к нему;
5. Цикл, заканчивающий игру, если не осталось похожих значений из п.3 и п.4.
6. Мои полномочия всё
 */