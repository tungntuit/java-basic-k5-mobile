package lession02;

import java.util.Scanner;

public class findingPairNumber {
    public static void main(String[] args) {
        int [] myIntArr = {1,2,3,4,5,6};
        boolean isNotFound = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nInput your number: ");
        int inputNumber = sc.nextInt();
        System.out.println("Length of array is: "+myIntArr.length);
        for (int i=0; i < myIntArr.length - 1 ; i++) {
            for (int j = i+1; j < myIntArr.length; j++) {
                if (myIntArr[i] + myIntArr [j] == inputNumber)
                {
                System.out.printf("(%d, %d)\n", i, j);
                isNotFound = false;
            }
        }
    }
        if (isNotFound)
        {
            System.out.println("There are no pair in here");
        }
    }
}
