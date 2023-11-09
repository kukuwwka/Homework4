package Ternary;

public class Ternary {
//    public static void main(String[] args) {
//        int number = 123;
//        String convertedNumber = Ternary.convertNumber(number);
//        System.out.println(convertedNumber);
//    }
// проверка
    public static String convertNumber(int number) {
        String result;
        result = (number > 0) ? (number % 7 < 4) ? ("positive-m") : ("positive-p") : (number == 0) ? ("zero") : (number % 7 > -4) ? ("negative-m") : ("negative-p");
        return result;
    }
}
