package lession03;

import java.util.Scanner;

public class calculateMinutes {
    /*
    Exercise 01
        Given input string: "2hrs and 5 minutes"
        Please calculate how many minutes in total
     */
    public static void main(String[] args) {
        String input = "2 hrs and 5 minutes";
        String[] parts = input.split("and");
        String part1 = parts[0];
        String part2 = parts[1];

        String hours = part1.replaceAll("[^0-9]","");
        String minutes = part2.replaceAll("[^0-9]","");

        double result = (Double.parseDouble(hours) * 60) + Double.parseDouble(minutes);

        System.out.printf("Result is: %f", result);
    }
}
