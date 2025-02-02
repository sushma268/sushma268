package promodSirTask;


import java.util.Scanner;

public class Task_006_VisaTravel {
    public static void main(String[] args) {
        // take the input from the user for
        //Age (integer),   Visa Status (String or boolean).
        //   Check Eligibility:
        //   If age is 18 or older and visa status is valid, the person can travel.
        // Otherwise, the person cannot travel.
        //  Validation Criteria
        // Age: - Must be a non-negative integer.
        // Should be greater than or equal to 18 to be eligible to travel
        //  Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
        // You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.

        int Age;
        String Visa_Status;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        Age=sc.nextInt();
        System.out.println("Enter your Visa status");
        Visa_Status=sc.next();
        if(Age>0)
        {
            if(Age>=18)
            {
                if(Visa_Status.contains("valid"))
                {
                    System.out.println("You can travel");
                }
                else
                {
                    System.out.println("you can't travel as visa is not valid");
                }
            }else
            {
                System.out.println("you can't travel as your age should be equals and greater than 18");

            }
        }    else
        {
            System.out.println("you can't travel as your age should be greater than 0");


        }

    }}