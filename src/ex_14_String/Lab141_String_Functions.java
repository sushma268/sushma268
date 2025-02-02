package ex_14_String;

public class Lab141_String_Functions {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="world";

        System.out.println(s1.concat(s2));
        StringBuilder stringBuilder=new StringBuilder("Sonal");
        stringBuilder.append("patel");//same string modification
//stringbuilder  new this will be stored i n heap area
   stringBuilder.append("World");
   stringBuilder.reverse();
        System.out.println(stringBuilder);
        s1="Hello";
         s2="World";
        System.out.println(s1+s2);
        System.out.println(s1);

    }
}
