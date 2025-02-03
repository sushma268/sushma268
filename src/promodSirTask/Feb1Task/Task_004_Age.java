package promodSirTask.Feb1Task;

import java.util.Scanner;

public class Task_004_Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age>0 &&age<=12){
            System.out.println("Person is of :"+age  +"child");
        }
        else if (age>=13 && age<=19) {

            System.out.println("Person is of :"+age  +"age " +"teenager");
        } else if (age>=20 &&age<=64) {
            System.out.println("Person is of :"+age +"age "  +"adult");
        }
        else if (age<=65) {
            System.out.println("Person is of :"+age  +"age " +"Senior Citizen");
        }
        else {
            System.out.println("Please enter valid age");
        }
    }
}
