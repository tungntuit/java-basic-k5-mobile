package lession02;
import java.util.Scanner;

public class sortStarDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("\n\nInput your height: ");
        height = sc.nextInt();
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
