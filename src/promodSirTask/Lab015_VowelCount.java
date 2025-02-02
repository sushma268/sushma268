package promodSirTask;

import java.util.Scanner;

public class Lab015_VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String x = sc.next();

        int x_len = x.length();
        int count_vowel=0;
        int count_cons=0;
        String s = "";
        String s1 = "";
//String sname="sushma";
        for(int i=0; i<x_len; i++){
            if(x.charAt(i)=='A'  || x.charAt(i)=='E' || x.charAt(i)=='I' || x.charAt(i)=='O' || x.charAt(i)=='U' ||
                    x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u'){



                      count_vowel++;
                s=s+x.charAt(i);

            }
            else{
                count_cons++;
                s1=s1+x.charAt(i);
            }
        }
        System.out.println("Count of vowels in "+x+" is "+count_vowel);
        System.out.println(s);
        System.out.println("Count of consonents in "+x+" is "+count_cons);
        System.out.println(s1);
        //System.out.println(x.indexOf(i));
    }
}
