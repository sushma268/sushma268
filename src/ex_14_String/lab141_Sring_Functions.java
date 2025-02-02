package ex_14_String;

public class lab141_Sring_Functions {
    public static void main(String[] args) {
        String name="Sonal";
        System.out.println(name.length());
        //chatAt();
        System.out.println(name.charAt(3));
        System.out.println( name.concat("Patel"));
        System.out.println( name.contains("om"));
        System.out.println(name.equals("Sonal"));
        System.out.println( name.equalsIgnoreCase("sonal"));
        String s1="madam";
        System.out.println( name.indexOf("m"));
        System.out.println(name.replace('n','N'));
         String name4="Sonal Harish";
         String[] split=name4.split("");
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[1]);
        String name5="promod@live.com@123";
        System.out.println(name5.split("@"));
        String anotherPalindrome="nigara.o roar again!";
        String roar= anotherPalindrome.substring(13,15);//0 to n-1
        String burger="hamburger";

        System.out.println( burger.substring(4,7));
  //h=0 a=1 m=2 b=3 u=4 r=5 g=6 e=7 r=8
         name="sushma";
        System.out.println(((String) name).startsWith("s"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.trim());
        System.out.println( name.compareTo("Sonal"));//ascii value checking
        System.out.println( name.compareToIgnoreCase("sonal"));


    }
}
