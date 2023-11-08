package SomeGame;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] count = {1, 2, 3, 4, 8, 1, 9, 0, 5, 3};
        int sum = 9;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count.length; j++) {
                if (j != i && (count[i] + count[j]) == sum) {
                    System.out.println();
                }
            }
        }
    }
}
