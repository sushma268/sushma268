package promodSirTask;

import java.util.Scanner;

public class Task_005_BonusCalculation {
    public static void main(String[] args) {
        //take the salary and Year info from the User.
        //Implement Bonus Calculation Logic:
        //Define the bonus structure based on salary and years of experience.
        //If years of experience is less than 1 year: No bonus.
        // If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
        // If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
        // If years of experience is greater than 6 years: Bonus is 15% of the salary.
        double bonus;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Salary");
        int salary=sc.nextInt();
        System.out.println("Enter Years of Experience");
        int exp=sc.nextInt();

        if(exp<1)
        {
            System.out.println("No bonus");
        } else if (exp>=1 && exp<=3) {
            bonus=salary*0.05;
            System.out.println("Bonus is :"+bonus);

        } else if (exp>=4 && exp<=6) {
            bonus=salary*0.1;
            System.out.println("Bonus is :"+bonus);
        }
        else if(exp>=6){
            bonus=salary*0.15;
            System.out.println("Bonus is :"+bonus);
        }
        else {
            System.out.println("Enter valid salary and year of exp");

        }
    }
}
