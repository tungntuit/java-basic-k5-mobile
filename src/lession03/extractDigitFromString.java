package lession03;

import java.util.Scanner;

public class extractDigitFromString {
/*
    Exercise 03
    String myStr = "100 minutes";
    NOT using REGEX, extract digit character from that String
    Expected output: "100".
    EX: "12345nabc678" -> "12345678"
 */
    public static void main(String[] args) {
//        String myStr = "100 minutes";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your string: ");
        String myStr = scanner.next();
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}
