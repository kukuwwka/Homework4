package Ternary;

public class Ternary {
    public static String convertNumber(int number) {
        String result;
        {
            result = (number > 0) ? (number % 7 < 4) ? ("positive-m") : ("positive-p") : (number == 0) ? ("zero") : (number % 7 > -4) ? ("negative-m") : ("negative-p");
        }
        return result;
    }
}
