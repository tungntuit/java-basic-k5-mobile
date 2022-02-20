package lession03;

import java.util.Scanner;

public class checkingURL {
    /*
    Exercise 04
        String url = "https://google.com";
        Check http OR https; domain name, .com OR .net
 */
    public static void main(String[] args) {
//        String myStr = "100 minutes";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your site: ");
        String myStr = scanner.next();
        String[] urlSplited = myStr.split("://");

        if (urlSplited[0].contains("https") && urlSplited[1].contains(".com")){
            System.out.println("This is a 'https' and '.com'");
        }
        else if (urlSplited[0].contains("http") && urlSplited[1].contains((".net"))){
            System.out.println("This is a 'http' and '.net");
        }

        else if (urlSplited[1].contains(".com")){
            System.out.println("This is a domain .com");
        }

        else if (urlSplited[1].contains(".net")){
            System.out.println("This is a domain .net");
        }

        else
        {
            System.out.println("Please input domain again!");
        }
    }
}

