package promodSirTask;

import java.util.Scanner;

public class CheckElgibleForVote {
    public void Eligibility()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if (age>=18)
        {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }
    public static void main(String[] args) {
        CheckElgibleForVote obj=new CheckElgibleForVote();
        obj.Eligibility();
    }

}
