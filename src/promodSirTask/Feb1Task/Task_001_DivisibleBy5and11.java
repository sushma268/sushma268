package promodSirTask.Feb1Task;

import java.util.Scanner;

public class Task_001_DivisibleBy5and11 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int num = sc.nextInt();

            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println("the " + num + " is divisible by both 5 and 11");
            } else {
                System.out.println("the " + num + " is not divisible by both 5 and 11");
            }

        }
    }

