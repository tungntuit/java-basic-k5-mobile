package lession03;

import java.util.Scanner;

public class inputMaxThreeTimes {
    /*
    Exercise 02
        String myPassword = "password123";
        Allow user to input maximum 3 times
  */
    public static void main(String[] args) {
        String myPassword = "password123";
        int maxCount = 3;
        int countInput = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your password: ");
            String myInput = scanner.next();
            if (myInput.equals(myPassword)){
                System.out.println("You're login success");
                break;
            }
            else{
                countInput++;
                System.out.println("The password you input not correct, please try again!!");
            }
        }while (countInput<maxCount);

        if (countInput==maxCount){
            System.out.println("Please try later!!!");
        }

    }
}
