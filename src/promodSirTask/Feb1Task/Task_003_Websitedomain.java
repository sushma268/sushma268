package promodSirTask.Feb1Task;

import java.util.Scanner;

public class Task_003_Websitedomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the site input");
        String URL = sc.next();
        if (URL.contains(".com")) {
            System.out.println("The website is: Commercial website");
        } else if (URL.contains(".org")) {
            System.out.println("The website is: non profit organization");

        } else if (URL.contains(".edu")) {
            System.out.println("The website is: educational website");

        }
        else if (URL.contains(".gov")) {
            System.out.println("The website is: government website");

        }
        else if (URL.contains(".net")) {
            System.out.println("The website is: Network related website");

        }
        else if (URL.contains(".info")) {
            System.out.println("The website is: Informational website");

        }
        else if (URL.contains(".xyz")) {
            System.out.println("The website is: unknown or other type of website");

        }
        else {
            System.out.println("not a valid website");
        }

    }
}
