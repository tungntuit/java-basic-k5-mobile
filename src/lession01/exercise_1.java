package lession01;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        /*
        1. Count how many even and add number in an integer array
         */

        int countEven = 0;
        int countOdd = 0;
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please input number of item: ");
            n = scanner.nextInt();
        }while(n<=0);

        int[] myArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Please input value of item " + (i+1) + ": ");
            myArr[i]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (myArr[i] % 2 == 0) {
                countEven++;
            } else countOdd++;
        }
        System.out.print("Number of even number: " + countEven);
        System.out.print("\nNumber of even number: " + countOdd);

        /*
        2. Find max number from an array
         */
        int max= myArr[0];
        for (int indexElement = 0; indexElement < n; indexElement++) {
            if (myArr[indexElement] > max){
                max = myArr[indexElement];
            }
        }
        System.out.println("\nThe number largest from an array is: " + max);

        /*
        3. Average value
        */
        int sumMyArr = 0;
        int averageValue = 0;
        for (int indexElement = 0; indexElement < n; indexElement++) {
            sumMyArr+=myArr[indexElement];
            averageValue = sumMyArr / 2;
        }
        System.out.println("\nAverage value is: " + averageValue);

        /*
        4. Sort min -> max
        */
        int temp = myArr[0];
        for (int i = 0; i < myArr.length-1; i++) {
            for (int j = i+1; j < myArr.length; j++) {
                if (myArr[i] > myArr[j]){
                    temp=myArr[j];
                    myArr[j]=myArr[i];
                    myArr[i]=temp;
                }
            }
        }

        for (int indexElement: myArr){
            System.out.println("Sort min to max: "+ indexElement);
        }

        /*
        5. 3! = 1 * 2 * 3
        */
    }
}
