package ex_14_String;

public class Lab139_String_Functions {
    public static void main(String[] args) {
        String s1="hello"; // it will store in string constant pool
        String s2="hello";
        String s3=new String("hello");//creates object in heap area
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println();


    }
}
